package org.j8unit.tools;

import static java.lang.String.format;
import static java.lang.String.join;
import static java.util.Arrays.asList;
import static java.util.Collections.nCopies;
import static java.util.Objects.requireNonNull;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toSet;
import static org.j8unit.tools.Generator.Target.REUSABLE_TESTS;
import static org.j8unit.tools.Generator.Target.SPECIFIC_TEST;
import static org.j8unit.tools.generator.AccessScope.CLASS;
import static org.j8unit.tools.generator.AccessScope.INSTANCE;
import static org.j8unit.tools.generator.GeneratorTokens.IGNORE_STATEMENT;
import static org.j8unit.tools.generator.GeneratorTokens.NL;
import static org.j8unit.tools.generator.GeneratorTokens.SPACE;
import static org.j8unit.tools.generator.GeneratorTokens.indent;
import static org.j8unit.tools.util.NamingUtilities.JAVA_LANG;
import static org.j8unit.tools.util.NamingUtilities.canonicalClassOf;
import static org.j8unit.tools.util.NamingUtilities.canonicalNameOf;
import static org.j8unit.tools.util.NamingUtilities.canonicalNameWithTypeParameterNamesOf;
import static org.j8unit.tools.util.NamingUtilities.javadocNameOf;
import static org.j8unit.tools.util.NamingUtilities.listOfTypeParameterDefinitionsOf;
import static org.j8unit.tools.util.NamingUtilities.namesOfTypeParametersOf;
import static org.j8unit.tools.util.NamingUtilities.simpleCanonicalClassOf;
import static org.j8unit.tools.util.NamingUtilities.simpleCanonicalNameOf;
import static org.j8unit.tools.util.NamingUtilities.toVarArgAwareString;
import static org.j8unit.tools.util.OptionalString.ofEmptyable;
import static org.j8unit.tools.util.TypeAnalysis.calculateNearestParents;
import static org.j8unit.tools.util.TypeAnalysis.getNearestMergingClass;
import static org.j8unit.tools.util.TypeAnalysis.specifiesSuchPublicMethod;
import static org.j8unit.tools.util.TypeKind.TOP_LEVEL;
import static org.j8unit.tools.util.Utilities.NOOP;
import static org.j8unit.tools.util.Utilities.bcsv;
import static org.j8unit.tools.util.Utilities.csv;
import static org.j8unit.tools.util.Utilities.optionalise;
import static org.j8unit.tools.util.Utilities.runtimed;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.logging.Logger;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.tools.generator.AccessScope;
import org.j8unit.tools.generator.CustomContentSource;
import org.j8unit.tools.generator.GeneratorCustoms;
import org.j8unit.tools.generator.ModusOperandi;
import org.j8unit.tools.util.Utilities;
import org.junit.AssumptionViolatedException;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

public enum Generator
    implements GeneratorLogMessages,CustomContentSource {

        INSTANCE_REPOSITORY(INSTANCE, REUSABLE_TESTS, "Tests") {

            @Override
            protected String imports(final Class<?> clazz) {
                // content storage
                final StringBuilder sb = new StringBuilder();
                // content creation
                sb.append("import static " + org.junit.Assert.class.getName() + ".*;" + NL);
                sb.append("import " + org.j8unit.repository.RepositoryTests.class.getPackage().getName() + ".*;" + NL);
                sb.append("import " + org.j8unit.repository.categories.J8UnitRepository.class.getPackage().getName() + ".*;" + NL);
                sb.append("import " + org.junit.Test.class.getPackage().getName() + ".*;" + NL);
                sb.append("import " + org.junit.experimental.categories.Category.class.getName() + ";" + NL);
                sb.append(this.allInOneCustomImports(clazz));
                sb.append(NL);
                // finalize content
                return sb.toString();
            }

            private String javadoc(final Class<?> clazz, final GeneratorSetup setup, final GeneratorSetup complementarySetup, final int enclosingLevel) {
                // required preparations
                final String indent = indent(enclosingLevel);
                // content storage
                final StringBuilder sb = new StringBuilder();
                // content creation
                sb.append(indent + "/**" + NL);
                sb.append(indent + " * <p>" + NL);
                sb.append(indent + " * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test" + NL);
                sb.append(indent + " * methods targeting the non-{@code static} methods) of {@linkplain " + canonicalNameOf(clazz) + NL);
                sb.append(indent + " * " + clazz + "}." + NL);
                sb.append(indent + " * The complementary j8unit test interface containing the class relevant aspects is " + NL);
                sb.append(indent + " * {@link " + complementarySetup.canonicalTestNameOf(clazz, clazz) + "}." + NL);
                sb.append(indent + " * </p>" + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * @see " + canonicalNameOf(clazz) + " " + clazz + " (the hereby targeted class-under-test class)" + NL);
                sb.append(indent + " * @see " + complementarySetup.canonicalTestNameOf(clazz, clazz) + " " + NL);
                sb.append(indent + " *      " + complementarySetup.canonicalTestNameOf(clazz, clazz) + NL);
                sb.append(indent + " *      (the complementary j8unit test interface containing the class relevant test methods)" + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * @param SUT the type of the subject-under-test" + NL);
                sb.append(indent + " * @since 0.9.0" + NL);
                sb.append(indent + " */" + NL);
                // finalize content
                return sb.toString();
            }

            @Override
            protected String testClassContent(final Class<?> clazz, final GeneratorSetup setup, final GeneratorSetup complementarySetup,
                                              final int enclosingLevel) {
                // required preparations
                final ModusOperandi modusOperandi = this.accessScope.modusOperandiFor(clazz);
                final String optionalStatic = enclosingLevel > 0 ? "static " : "";
                final String footer = enclosingLevel > 0 ? NL : "";
                final String testClassName = setup.verySimpleCanonicalTestNameOf(clazz);
                final String testClassGenerics = this.accessScope.getSutStatement(clazz);
                final String testClassSuperTypes = modusOperandi.getTestClassExtendStatement(clazz, setup);
                final String indent = indent(enclosingLevel);
                // content storage
                final StringBuilder sb = new StringBuilder();
                // content creation
                sb.append(this.javadoc(clazz, setup, complementarySetup, enclosingLevel));
                sb.append(this.allInOneCustomTestInterfaceHead(clazz, enclosingLevel));
                sb.append(indent + "@" + simpleCanonicalNameOf(FunctionalInterface.class) + NL);
                sb.append(indent + "@" + simpleCanonicalNameOf(Category.class) + "(" + simpleCanonicalClassOf(J8UnitRepository.class) + ")" + NL);
                sb.append(indent + "public " + optionalStatic + "abstract interface " + testClassName + testClassGenerics + NL);
                sb.append(indent + "extends " + testClassSuperTypes + NL);
                sb.append(indent + "{" + NL);
                sb.append(NL);
                sb.append(this.allInOneCustomTestInterfaceBody(clazz, enclosingLevel + 1));
                for (final Entry<? extends Method, ? extends Set<Class<?>>> method : this.calculateMethodsUnderTest(clazz, setup).entrySet()) {
                    sb.append(this.testMethodContent(clazz, method, setup, enclosingLevel + 1));
                }
                for (final Entry<? extends Method, ? extends Set<Class<?>>> method : this.calculateMergeMethods(clazz, setup).entrySet()) {
                    sb.append(this.mergeMethodContent(clazz, method, setup, enclosingLevel + 1));
                }
                for (final Class<?> enveloped : this.calculateEnvelopedClasses(clazz, setup)) {
                    sb.append(this.testClassContent(enveloped, setup, complementarySetup, enclosingLevel + 1));
                }
                sb.append(indent + "}" + NL);
                sb.append(footer);
                // finalize content
                return sb.toString();
            }

            private Map<? extends Method, ? extends Set<Class<?>>> calculateMethodsUnderTest(final Class<?> clazz, final GeneratorSetup setup) {
                // query all declared, relevant methods
                final Set<Method> candidates = Arrays.stream(clazz.getDeclaredMethods()) //
                                                     .filter(setup::useMethod) //
                                                     .filter(this.accessScope::matches) //
                                                     .filter(m -> !m.isSynthetic()) //
                                                     .collect(toSet());
                LOG.info(format(J8UNIT_TESTINTERFACE_AIMED_METHODS, clazz, this.accessScope, candidates));
                // add optional inheritance nodes
                final Map<Class<?>, ? extends Type> parents = calculateNearestParents(clazz, setup::useClass, NOOP);
                final Map<Method, Set<Class<?>>> methods = new HashMap<>();
                for (final Method method : candidates) {
                    final Set<Class<?>> nodes = parents.keySet().stream() //
                                                       .map(s -> getNearestMergingClass(s, method)) //
                                                       .flatMap(Utilities::toStream) //
                                                       .collect(toSet());
                    assert !methods.containsKey(method);
                    methods.put(method, nodes);
                }
                return methods;
            }

            private String javadoc(final Method method, final GeneratorSetup setup, final int enclosingLevel) {
                // required preparations
                final String indent = indent(enclosingLevel);
                // content storage
                final StringBuilder sb = new StringBuilder();
                // content creation
                sb.append(indent + "/**" + NL);
                sb.append(indent + " * <p>" + NL);
                sb.append(indent + " * Test method for {@link " + javadocNameOf(method) + " " + toVarArgAwareString(method) + "}." + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * Up to now, there is no real implementation of this test method. But with your help" + NL);
                sb.append(indent + " * at <a href=\"http://www.j8unit.org\">http://www.j8unit.org</a> this marker method will" + NL);
                sb.append(indent + " * be replaced by meaningful test methods soon." + NL);
                sb.append(indent + " * </p>" + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * @see " + javadocNameOf(method) + " " + method + " (the hereby targeted method-under-test)" + NL);
                sb.append(indent + " */" + NL);
                // finalize content
                return sb.toString();
            }

            private String testMethodContent(final Class<?> clazz, final Entry<? extends Method, ? extends Set<Class<?>>> methodData,
                                             final GeneratorSetup setup, final int enclosingLevel) {
                // required preparations
                final Method method = methodData.getKey();
                final Set<Class<?>> superNodes = methodData.getValue();
                final String testMethodName = setup.getSimpleTestMethodName(method);
                final String indent = indent(enclosingLevel);
                // content storage
                final StringBuilder sb = new StringBuilder();
                // content creation
                sb.append(this.javadoc(method, setup, enclosingLevel));
                sb.append(indent + "@" + simpleCanonicalNameOf(Ignore.class) + "(\"" + IGNORE_STATEMENT + "\")" + NL);
                sb.append(superNodes.isEmpty() ? "" : indent + "@" + simpleCanonicalNameOf(Override.class) + NL);
                sb.append(indent + "@" + simpleCanonicalNameOf(Test.class) + NL);
                sb.append(indent + "@" + simpleCanonicalNameOf(Category.class) + "(" + simpleCanonicalClassOf(Draft.class) + ")" + NL);
                sb.append(indent + "public default void " + testMethodName + "() throws Exception {" + NL);
                sb.append(indent + SPACE + "// query fresh subject-under-test" + NL);
                sb.append(indent + SPACE + "SUT sut = this.createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                // finalize content
                return sb.toString();
            }

            // TODO: Superclass with protected method and Interface with similar public ...
            private Map<? extends Method, ? extends Set<Class<?>>> calculateMergeMethods(final Class<?> clazz, final GeneratorSetup setup) {
                // collect public membership-matching methods that are not specified by its merging class
                // (Note: Class#getMethods() returns only public methods but this is OK because there is no merging
                // problem for non-public methods)
                final Set<Method> duplicatedCandidates = Arrays.stream(clazz.getMethods()) //
                                                               .filter(setup::useMethod) //
                                                               .filter(this.accessScope::matches) //
                                                               // keep in mind the method might be overwritten, so map
                                                               // it to the most specific method ...
                                                               .map(m -> runtimed(() -> clazz.getMethod(m.getName(), m.getParameterTypes()))) //
                                                               // ... us only if it is a candidate
                                                               .filter(m -> !specifiesSuchPublicMethod(getNearestMergingClass(clazz, m).get(), m)) //
                                                               .collect(toSet());
                LOG.info(format(J8UNIT_TESTINTERFACE_MERGE_METHOD_CANDIDATES, clazz, this.accessScope, duplicatedCandidates));
                final Map<Class<?>, ? extends Type> parents = calculateNearestParents(clazz, setup::useClass, NOOP);
                final Map<Method, Set<Class<?>>> duplicated = new HashMap<>();
                for (final Method method : duplicatedCandidates) {
                    final Set<Class<?>> nodes = parents.keySet().stream() //
                                                       .map(s -> getNearestMergingClass(s, method)) //
                                                       .flatMap(Utilities::toStream) //
                                                       .collect(toSet());
                    if (nodes.size() < 2) {
                        continue;
                    }
                    duplicated.put(method, nodes);
                }
                return duplicated;
            }

            private String javadoc(final Entry<? extends Method, ? extends Set<Class<?>>> methodData, final GeneratorSetup setup, final int enclosingLevel) {
                // required preparations
                final Method method = methodData.getKey();
                final Set<Class<?>> superNodes = methodData.getValue();
                final String indent = indent(enclosingLevel);
                // content storage
                final StringBuilder sb = new StringBuilder();
                // content creation
                sb.append(indent + " * <p>" + NL);
                sb.append(indent + " * The method-under-test covered by this test method is inherited duplicatedly within the declaring" + NL);
                sb.append(indent + " * class-under-test:</p>" + NL);
                sb.append(indent + " * <ul>" + NL);
                superNodes.forEach(c -> sb.append(indent + " * <li>{@linkplain " + javadocNameOf(c, method) + " " + c + "}</li>" + NL));
                sb.append(indent + " * </ul>" + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * <p>" + NL);
                sb.append(indent + " * In result, there are duplicated according test methods within the parent test classes." + NL);
                sb.append(indent + " * To solve this situation, this method must be overridden. Dont't worry, there will be" + NL);
                sb.append(indent + " * meaningful test methods soon and, thus, overriding becomes unnecessary." + NL);
                sb.append(indent + " * </p>" + NL);
                sb.append(indent + " */" + NL);
                // finalize content
                return sb.toString();
            }

            private String mergeMethodContent(final Class<?> clazz, final Entry<? extends Method, ? extends Set<Class<?>>> methodData,
                                              final GeneratorSetup setup, final int enclosingLevel) {
                // required preparations
                final Method method = methodData.getKey();
                final String testMethodName = setup.getSimpleTestMethodName(method);
                final String indent = indent(enclosingLevel);
                // content storage
                final StringBuilder sb = new StringBuilder();
                // content creation
                sb.append(indent + "/**" + NL);
                sb.append(this.javadoc(methodData, setup, enclosingLevel));
                sb.append(indent + "@" + simpleCanonicalNameOf(Ignore.class) + "(\"" + IGNORE_STATEMENT + "\")" + NL);
                sb.append(indent + "@" + simpleCanonicalNameOf(Override.class) + NL);
                sb.append(indent + "@" + simpleCanonicalNameOf(Test.class) + NL);
                sb.append(indent + "@" + simpleCanonicalNameOf(Category.class) + "(" + simpleCanonicalClassOf(Draft.class) + ")" + NL);
                sb.append(indent + "public default void " + testMethodName + "() throws Exception {" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                // finalize content
                return sb.toString();
            }

        },

        CLASS_REPOSITORY(CLASS, REUSABLE_TESTS, "ClassTests") {

            @Override
            protected String imports(final Class<?> clazz) {
                // content storage
                final StringBuilder sb = new StringBuilder();
                // content creation
                sb.append("import static " + org.junit.Assert.class.getName() + ".*;" + NL);
                sb.append("import " + org.j8unit.repository.RepositoryTests.class.getPackage().getName() + ".*;" + NL);
                sb.append("import " + org.j8unit.repository.categories.J8UnitRepository.class.getPackage().getName() + ".*;" + NL);
                sb.append("import " + org.junit.Test.class.getPackage().getName() + ".*;" + NL);
                sb.append("import " + org.junit.experimental.categories.Category.class.getName() + ";" + NL);
                sb.append(this.allInOneCustomImports(clazz));
                sb.append(NL);
                // finalize content
                return sb.toString();
            }

            private String javadoc(final Class<?> clazz, final GeneratorSetup setup, final GeneratorSetup complementarySetup, final int enclosingLevel) {
                // required preparations
                final String indent = indent(enclosingLevel);
                // content storage
                final StringBuilder sb = new StringBuilder();
                // content creation
                sb.append(indent + "/**" + NL);
                sb.append(indent + " * <p>" + NL);
                sb.append(indent + " * Reusable j8unit test interface for {@linkplain " + canonicalNameOf(clazz) + " " + clazz + "}," + NL);
                sb.append(indent + " * containing all type relevant aspects (e.&thinsp;g., runtime constraints and further type specific" + NL);
                sb.append(indent + " * requirements). (In addition, the runtime type of this j8unit test interface's generic type is verified" + NL);
                sb.append(indent + " * by {@link #verifyGenericType()})." + NL);
                sb.append(indent + " * </p>" + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * <p>" + NL);
                sb.append(indent + " * j8unit strongly encourages you to not only test the instances behaviour but also to test the type" + NL);
                sb.append(indent + " * constraints. For this purpose, j8unit provides this reusable test interface covering type relevant" + NL);
                sb.append(indent + " * aspects as well as a complementarySetup test interface containing the instance relevant aspects (see" + NL);
                sb.append(indent + " * {@link " + complementarySetup.canonicalTestNameOf(clazz, clazz) + "})." + NL);
                sb.append(indent + " * </p>" + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * <p>" + NL);
                sb.append(indent + " * <strong>What? Testing the class itself? What is it good for?</strong>" + NL);
                sb.append(indent + " * </p>" + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * <p>" + NL);
                sb.append(indent + " * Classes may have its own requirements and/or constraints; and all of these needs to be tested too." + NL);
                sb.append(indent + " * For example, <a href=\"https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1\"><q>by" + NL);
                sb.append(indent + " * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type" + NL);
                sb.append(indent + " * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>)." + NL);
                sb.append(indent + " * Thus, {@link " + setup.canonicalTestNameOf(Annotation.class, clazz) + "} provides corresponding, reusable" + NL);
                sb.append(indent + " * test methods:" + NL);
                sb.append(indent + " * {@link " + setup.canonicalTestNameOf(Annotation.class, clazz) + "#declaredMethodsCannotHaveFormalParameters()}," + NL);
                sb.append(indent + " * {@link " + setup.canonicalTestNameOf(Annotation.class, clazz) + "#declaredMethodsCannotHaveTypeParameters()}, and" + NL);
                sb.append(indent + " * {@link " + setup.canonicalTestNameOf(Annotation.class, clazz) + "#declaredMethodsCannotHaveThrowsClause()}." + NL);
                sb.append(indent + " * </p>" + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * <p>" + NL);
                sb.append(indent + " * The complementary j8unit test interface containing the instance relevant aspects is {@link " + NL);
                sb.append(indent + " * " + complementarySetup.canonicalTestNameOf(clazz, clazz) + "}." + NL);
                sb.append(indent + " * </p>" + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * @see " + canonicalNameOf(clazz) + " " + clazz + " (the hereby targeted class-under-test class)" + NL);
                sb.append(indent + " * @see " + complementarySetup.canonicalTestNameOf(clazz, clazz) + " " + NL);
                sb.append(indent + " *      " + complementarySetup.canonicalTestNameOf(clazz, clazz) + NL);
                sb.append(indent + " *      (The complementary j8unit test interface containing the instance relevant test methods)" + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * @param SUT the class' type of the subject-under-test" + NL);
                sb.append(indent + " * @since 0.9.0" + NL);
                sb.append(indent + " */" + NL);
                // finalize content
                return sb.toString();
            }

            @Override
            protected String testClassContent(final Class<?> clazz, final GeneratorSetup setup, final GeneratorSetup complementarySetup,
                                              final int enclosingLevel) {
                // required preparations
                final ModusOperandi modusOperandi = this.accessScope.modusOperandiFor(clazz);
                final String optionalStatic = enclosingLevel > 0 ? "static " : "";
                final String footer = enclosingLevel > 0 ? NL : "";
                final String testClassName = setup.verySimpleCanonicalTestNameOf(clazz);
                final String testClassGenerics = this.accessScope.getSutStatement(clazz);
                final String testClassSuperTypes = modusOperandi.getTestClassExtendStatement(clazz, setup);
                final String indent = indent(enclosingLevel);
                // content storage
                final StringBuilder sb = new StringBuilder();
                // content creation
                sb.append(this.javadoc(clazz, setup, complementarySetup, enclosingLevel));
                sb.append(this.allInOneCustomTestInterfaceHead(clazz, enclosingLevel));
                sb.append(indent + "@" + simpleCanonicalNameOf(FunctionalInterface.class) + NL);
                sb.append(indent + "@" + simpleCanonicalNameOf(Category.class) + "(" + simpleCanonicalClassOf(J8UnitRepository.class) + ")" + NL);
                sb.append(indent + "public " + optionalStatic + "abstract interface " + testClassName + testClassGenerics + NL);
                sb.append(indent + "extends " + testClassSuperTypes + NL);
                sb.append(indent + "{" + NL);
                sb.append(NL);
                sb.append(this.allInOneCustomTestInterfaceBody(clazz, enclosingLevel + 1));
                sb.append(this.verifyGenericTypeContent(clazz, enclosingLevel + 1));
                for (final Class<?> enveloped : this.calculateEnvelopedClasses(clazz, setup)) {
                    sb.append(this.testClassContent(enveloped, setup, complementarySetup, enclosingLevel + 1));
                }
                sb.append(indent + "}" + NL);
                sb.append(footer);
                // finalize content
                return sb.toString();
            }

            private Object verifyGenericTypeContent(final Class<?> clazz, final int enclosingLevel) {
                // required preparations
                final Method mut = runtimed(() -> Class.class.getMethod("isAssignableFrom", Class.class));
                final String indent = indent(enclosingLevel);
                // content storage
                final StringBuilder sb = new StringBuilder();
                // content creation
                sb.append(indent + "/**" + NL);
                sb.append(indent + " * @see " + javadocNameOf(mut) + " " + mut + " (the hereby targeted method-under-test)" + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * @since 0.9.2" + NL);
                sb.append(indent + " */" + NL);
                sb.append(indent + "@" + simpleCanonicalNameOf(BeforeClass.class) + NL);
                sb.append(indent + "public default void verifyGenericType() throws " + simpleCanonicalNameOf(Exception.class) + " {" + NL);
                sb.append(indent + SPACE + "// create new instance" + NL);
                sb.append(indent + SPACE + simpleCanonicalNameOf(Class.class) + "<SUT> sut = createNewSUT();" + NL);
                sb.append(indent + SPACE + "// assert assignability" + NL);
                sb.append(indent + SPACE + "assertTrue(\"This j8unit test interface is used with a generic type that is illegaly not assignable to ");
                sb.append(canonicalClassOf(clazz) + "!\", " + canonicalClassOf(clazz) + "." + mut.getName() + "(sut));" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                // finalize content
                return sb.toString();
            }

        },

        INSTANCE_TEST(INSTANCE, SPECIFIC_TEST, "Test") {

            @Override
            @SuppressWarnings("unchecked")
            protected String testClassContent(final Class<?> clazz, final GeneratorSetup setup, final GeneratorSetup complementarySetup,
                                              final int enclosingLevel) {
                if (clazz.isEnum()) {
                    final Class<? extends Enum<?>> eClazz = (Class<? extends Enum<?>>) clazz;
                    final String body = this.enumClassTestData(eClazz, enclosingLevel + 1);
                    return this.parameterisedJ8UnitTest(eClazz, setup, complementarySetup, enclosingLevel, body);
                } else {
                    {
                        /*
                         * [1] Inspect any existing, accessible instances:
                         */
                        final Set<? extends Field> instances = Arrays.stream(clazz.getDeclaredFields()) //
                                                                     .filter(f -> clazz.isAssignableFrom(f.getType())) //
                                                                     .filter(setup::useField) //
                                                                     .filter(f -> Modifier.isStatic(f.getModifiers())) //
                                                                     .collect(toSet());
                        if (!instances.isEmpty()) {
                            final String body = this.fieldBasedTestData(clazz, instances, enclosingLevel + 1);
                            return this.parameterisedJ8UnitTest(clazz, setup, complementarySetup, enclosingLevel, body);
                        }
                    }
                    {
                        /*
                         * [2] Skip abstract types:
                         */
                        if (Modifier.isAbstract(clazz.getModifiers())) {
                            final String body = this.todoBasedTestData(clazz,
                                                                       enclosingLevel + 1, "Due to the abstract modifier of this type-under-test ["
                                                                                           + clazz.getCanonicalName()
                                                                                           + "], j8unit does not support a generic way to provide instances.");
                            return this.j8UnitTest(clazz, setup, complementarySetup, enclosingLevel, body);
                        }
                    }
                    {
                        /*
                         * [3] Try default constructor:
                         *
                         * (Must be done after (!) step [2]!)
                         */
                        final Optional<Constructor<?>> candidate = optionalise(clazz::getDeclaredConstructor, NOOP);
                        final Optional<Constructor<?>> constructor = candidate.filter(setup::useConstructor);
                        if (constructor.isPresent()) {
                            final String body = this.constructorBasedTestData(clazz, constructor.get(), enclosingLevel + 1);
                            return this.parameterisedFactoryBasedJ8UnitTest(clazz, setup, complementarySetup, enclosingLevel, body);
                        }
                    }
                    {
                        /*
                         * [Default] Skip:
                         */
                        final String body = this.todoBasedTestData(clazz, enclosingLevel + 1,
                                                                   "Due to the absence of a default constructor of this non-abstract type-under-test ["
                                                                                              + clazz.getCanonicalName()
                                                                                              + "], j8unit does not support a generic way to provide instances.");
                        return this.j8UnitTest(clazz, setup, complementarySetup, enclosingLevel, body);
                    }
                }
            }

            private String parameterisedJ8UnitTest(final Class<?> clazz, final GeneratorSetup setup, final GeneratorSetup complementarySetup,
                                                   final int enclosingLevel, final String body) {
                // required preparations
                final String optionalStatic = enclosingLevel > 0 ? "static " : "";
                final String footer = enclosingLevel > 0 ? NL : "";
                final String testClassName = setup.verySimpleCanonicalTestNameOf(clazz);
                final String testClassGenerics = bcsv(namesOfTypeParametersOf(clazz));
                final String testClassInterfaceType = complementarySetup.canonicalTestNameOf(clazz);
                final String testClassInterfaceGenerics = bcsv(canonicalNameWithTypeParameterNamesOf(clazz)
                                                               + ofEmptyable(csv(namesOfTypeParametersOf(clazz))).prepend(", ").orElse(""));
                final String indent = indent(enclosingLevel);
                // content storage
                final StringBuilder sb = new StringBuilder();
                // content creation
                sb.append(this.allInOneCustomTestInterfaceHead(clazz, enclosingLevel));
                sb.append(indent + "@" + simpleCanonicalNameOf(RunWith.class) + "(" + simpleCanonicalClassOf(J8Parameterized.class) + ")" + NL);
                sb.append(indent + "@" + simpleCanonicalNameOf(UseParametersRunnerFactory.class) + "("
                          + simpleCanonicalClassOf(J8BlockJUnit4ClassRunnerWithParametersFactory.class) + ")" + NL);
                sb.append(indent + "public " + optionalStatic + "class " + testClassName + testClassGenerics + NL);
                sb.append(indent + "implements " + testClassInterfaceType + testClassInterfaceGenerics + " {" + NL);
                sb.append(NL);
                sb.append(this.allInOneCustomTestInterfaceBody(clazz, enclosingLevel + 1));
                sb.append(body);
                for (final Class<?> enveloped : this.calculateEnvelopedClasses(clazz, setup)) {
                    sb.append(this.testClassContent(enveloped, setup, complementarySetup, enclosingLevel + 1));
                }
                sb.append(indent + "}" + NL);
                sb.append(footer);
                // finalize content
                return sb.toString();
            }

            private String parameterisedFactoryBasedJ8UnitTest(final Class<?> clazz, final GeneratorSetup setup, final GeneratorSetup complementarySetup,
                                                               final int enclosingLevel, final String body) {
                // required preparations
                final String optionalStatic = enclosingLevel > 0 ? "static " : "";
                final String footer = enclosingLevel > 0 ? NL : "";
                final String testClassName = setup.verySimpleCanonicalTestNameOf(clazz);
                final String testClassGenerics = bcsv(namesOfTypeParametersOf(clazz));
                final String testClassInterfaceType = complementarySetup.canonicalTestNameOf(clazz);
                final String testClassInterfaceGenerics = bcsv(canonicalNameWithTypeParameterNamesOf(clazz)
                                                               + ofEmptyable(csv(namesOfTypeParametersOf(clazz))).prepend(", ").orElse(""));
                final String indent = indent(enclosingLevel);
                // content storage
                final StringBuilder sb = new StringBuilder();
                // content creation
                sb.append(this.allInOneCustomTestInterfaceHead(clazz, enclosingLevel));
                sb.append(indent + "@" + simpleCanonicalNameOf(RunWith.class) + "(" + simpleCanonicalClassOf(J8Parameterized.class) + ")" + NL);
                sb.append(indent + "@" + simpleCanonicalNameOf(UseParametersRunnerFactory.class) + "("
                          + simpleCanonicalClassOf(J8BlockJUnit4ClassRunnerWithParametersFactory.class) + ")" + NL);
                sb.append(indent + "public " + optionalStatic + "class " + testClassName + testClassGenerics + NL);
                sb.append(indent + "implements " + simpleCanonicalNameOf(FactoryBasedJ8UnitTest.class) + "<" + canonicalNameWithTypeParameterNamesOf(clazz)
                          + ">, " + testClassInterfaceType + testClassInterfaceGenerics + " {" + NL);
                sb.append(NL);
                sb.append(this.allInOneCustomTestInterfaceBody(clazz, enclosingLevel + 1));
                sb.append(body);
                for (final Class<?> enveloped : this.calculateEnvelopedClasses(clazz, setup)) {
                    sb.append(this.testClassContent(enveloped, setup, complementarySetup, enclosingLevel + 1));
                }
                sb.append(indent + "}" + NL);
                sb.append(footer);
                // finalize content
                return sb.toString();
            }

            private String j8UnitTest(final Class<?> clazz, final GeneratorSetup setup, final GeneratorSetup complementarySetup, final int enclosingLevel,
                                      final String body) {
                // required preparations
                final String optionalStatic = enclosingLevel > 0 ? "static " : "";
                final String footer = enclosingLevel > 0 ? NL : "";
                final String testClassName = setup.verySimpleCanonicalTestNameOf(clazz);
                final String testClassGenerics = bcsv(listOfTypeParameterDefinitionsOf(clazz));
                final String testClassInterfaceType = complementarySetup.canonicalTestNameOf(clazz);
                final String testClassInterfaceGenerics = bcsv(canonicalNameWithTypeParameterNamesOf(clazz)
                                                               + ofEmptyable(csv(namesOfTypeParametersOf(clazz))).prepend(", ").orElse(""));
                final String indent = indent(enclosingLevel);
                // content storage
                final StringBuilder sb = new StringBuilder();
                // content creation
                sb.append(this.allInOneCustomTestInterfaceHead(clazz, enclosingLevel));
                sb.append(indent + "@" + simpleCanonicalNameOf(RunWith.class) + "(" + simpleCanonicalClassOf(J8Unit4.class) + ")" + NL);
                sb.append(indent + "public " + optionalStatic + "class " + testClassName + testClassGenerics + NL);
                sb.append(indent + "implements " + testClassInterfaceType + testClassInterfaceGenerics + " {" + NL);
                sb.append(NL);
                sb.append(this.allInOneCustomTestInterfaceBody(clazz, enclosingLevel + 1));
                sb.append(body);
                for (final Class<?> enveloped : this.calculateEnvelopedClasses(clazz, setup)) {
                    sb.append(this.testClassContent(enveloped, setup, complementarySetup, enclosingLevel + 1));
                }
                sb.append(indent + "}" + NL);
                sb.append(footer);
                // finalize content
                return sb.toString();
            }

            private String enumClassTestData(final Class<? extends Enum<?>> clazz, final int enclosingLevel) {
                // required preparations
                final String indent = indent(enclosingLevel);
                // content storage
                final StringBuilder sb = new StringBuilder();
                // content creation
                sb.append(indent + "@" + simpleCanonicalNameOf(Parameters.class) + "(name = \"{index}: {0}\")" + NL);
                sb.append(indent + "public static " + simpleCanonicalNameOf(Iterable.class) + "<" + simpleCanonicalNameOf(Object[].class) + "> sutData() {"
                          + NL);
                sb.append(indent + SPACE + "return testParametersOfEnumClass(" + canonicalClassOf(clazz) + ");" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                sb.append(indent + "@" + simpleCanonicalNameOf(Parameter.class) + "(0)" + NL);
                sb.append(indent + "public " + canonicalNameWithTypeParameterNamesOf(clazz) + " sut;" + NL);
                sb.append(NL);
                sb.append(indent + "@" + simpleCanonicalNameOf(Override.class) + "" + NL);
                sb.append(indent + "public " + canonicalNameWithTypeParameterNamesOf(clazz) + " createNewSUT() {" + NL);
                sb.append(indent + SPACE + "return this.sut;" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                // finalize content
                return sb.toString();
            }

            private String fieldBasedTestData(final Class<?> clazz, final Set<? extends Field> instances, final int enclosingLevel) {
                // required preparations
                final String indent = indent(enclosingLevel);
                // content storage
                final StringBuilder sb = new StringBuilder();
                // content creation
                sb.append(indent + "@" + simpleCanonicalNameOf(Parameters.class) + "(name = \"{index}: {0}\")" + NL);
                sb.append(indent + "public static " + simpleCanonicalNameOf(Iterable.class) + "<" + simpleCanonicalNameOf(Object[].class) + "> sutData() {"
                          + NL);
                final String data = instances.stream().map(f -> canonicalNameOf(clazz) + "." + f.getName())
                                             .collect(joining(", //" + NL + indent + join("", nCopies(1 + 6, SPACE))));
                sb.append(indent + SPACE + "return testParametersOf(" + data + ");" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                sb.append(indent + "@" + simpleCanonicalNameOf(Parameter.class) + "(0)" + NL);
                sb.append(indent + "public " + canonicalNameWithTypeParameterNamesOf(clazz) + " sut;" + NL);
                sb.append(NL);
                sb.append(indent + "@" + simpleCanonicalNameOf(Override.class) + "" + NL);
                sb.append(indent + "public " + canonicalNameWithTypeParameterNamesOf(clazz) + " createNewSUT() {" + NL);
                sb.append(indent + SPACE + "return this.sut;" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                // finalize content
                return sb.toString();
            }

            private String constructorBasedTestData(final Class<?> clazz, final Constructor<?> constructor, final int enclosingLevel) {
                // required preparations
                final String indent = indent(enclosingLevel);
                // content storage
                final StringBuilder sb = new StringBuilder();
                // content creation
                sb.append(indent + "@" + simpleCanonicalNameOf(Parameters.class) + "(name = \"{index}: {0}\")" + NL);
                sb.append(indent + "public static " + simpleCanonicalNameOf(Iterable.class) + "<" + simpleCanonicalNameOf(Object[].class) + "> sutData() {"
                          + NL);
                sb.append(indent + SPACE + "return testParametersOf(" + canonicalNameOf(clazz) + "::new);" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                sb.append(indent + "@" + simpleCanonicalNameOf(Parameter.class) + "(0)" + NL);
                sb.append(indent + SPACE + "public " + simpleCanonicalNameOf(Callable.class) + "<" + canonicalNameWithTypeParameterNamesOf(clazz)
                          + "> sutFactory;" + NL);
                sb.append(NL);
                sb.append(indent + "@" + simpleCanonicalNameOf(Override.class) + "" + NL);
                sb.append(indent + SPACE + "public " + simpleCanonicalNameOf(Callable.class) + "<" + canonicalNameWithTypeParameterNamesOf(clazz)
                          + "> getSUTFactory() {" + NL);
                sb.append(indent + SPACE + SPACE + "return this.sutFactory;" + NL);
                sb.append(indent + SPACE + "}" + NL);
                sb.append(NL);
                // finalize content
                return sb.toString();
            }

            private String todoBasedTestData(final Class<?> clazz, final int enclosingLevel, final String message) {
                // required preparations
                final String indent = indent(enclosingLevel);
                // content storage
                final StringBuilder sb = new StringBuilder();
                // content creation
                sb.append(indent + "@" + simpleCanonicalNameOf(Override.class) + "" + NL);
                sb.append(indent + "public " + canonicalNameWithTypeParameterNamesOf(clazz) + " createNewSUT() {" + NL);
                sb.append(indent + SPACE + "throw new " + simpleCanonicalNameOf(AssumptionViolatedException.class) + "(\"" + message + "\");" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                // finalize content
                return sb.toString();
            }

        },

        CLASS_TEST(CLASS, SPECIFIC_TEST, "ClassTest") {

            @Override
            protected String testClassContent(final Class<?> clazz, final GeneratorSetup setup, final GeneratorSetup complementarySetup,
                                              final int enclosingLevel) {
                final String indent = indent(enclosingLevel);
                final String nested = enclosingLevel > 0 ? "static " : "";
                final String testClassName = setup.verySimpleCanonicalTestNameOf(clazz);
                final String testClassSuper2 = complementarySetup.canonicalTestNameOf(clazz, JAVA_LANG) + "<" + canonicalNameOf(clazz) + ">";
                // content storage
                final StringBuilder sb = new StringBuilder();
                // content creation
                sb.append(indent + "@RunWith(J8Unit4.class)" + NL);
                sb.append(this.allInOneCustomTestInterfaceHead(clazz, enclosingLevel));
                sb.append(indent + "public " + nested + "class " + testClassName + NL);
                sb.append(indent + "implements " + testClassSuper2 + " {" + NL);
                sb.append(this.allInOneCustomTestInterfaceBody(clazz, enclosingLevel + 1));
                sb.append(NL);
                sb.append(indent + SPACE + "@Override" + NL);
                sb.append(indent + SPACE + "public Class<" + canonicalNameOf(clazz) + "> createNewSUT() {" + NL);
                sb.append(indent + SPACE + SPACE + "return " + canonicalClassOf(clazz) + ";" + NL);
                sb.append(indent + SPACE + "}" + NL);
                sb.append(NL);
                // query all declared, relevant constructors
                final Set<Constructor<?>> constructors = Arrays.stream(clazz.getDeclaredConstructors()) //
                                                               .filter(setup::useConstructor) //
                                                               .filter(this.accessScope::matches) //
                                                               .peek(m -> {
                    if (m.isSynthetic()) {
                        LOG.warning(format(SKIP_TYPE_METHODS, clazz, m));
                    }
                }) //
                                                               .filter(m -> !m.isSynthetic()) //
                                                               .collect(toSet());
                LOG.info(format(J8UNIT_TESTINTERFACE_AIMED_METHODS, clazz, this.accessScope, constructors));
                for (final Constructor<?> constructor : constructors) {
                    // collect all declaring super nodes
                    final String testMethodName = setup.getSimpleTestMethodName(constructor);
                    sb.append(indent + SPACE + "/**" + NL);
                    sb.append(indent + SPACE + " * <p>" + NL);
                    sb.append(indent + SPACE + " * Test method for {@link " + javadocNameOf(constructor) + " " + toVarArgAwareString(constructor) + "}." + NL);
                    sb.append(indent + SPACE + " *" + NL);
                    sb.append(indent + SPACE + " * Up to now, there is no real implementation of this test method. But with your help" + NL);
                    sb.append(indent + SPACE + " * at <a href=\"http://www.j8unit.org\">http://www.j8unit.org</a> this marker method will" + NL);
                    sb.append(indent + SPACE + " * be replaced by meaningful test methods soon." + NL);
                    sb.append(indent + SPACE + " * </p>" + NL);
                    sb.append(indent + SPACE + " *" + NL);
                    sb.append(indent + SPACE + " * @see " + javadocNameOf(constructor) + " " + constructor + " (the hereby targeted constructor-under-test)"
                              + NL);
                    sb.append(indent + SPACE + " */" + NL);
                    // append test method content
                    sb.append(indent + SPACE + "@" + simpleCanonicalNameOf(Ignore.class) + "(\"" + IGNORE_STATEMENT + "\")" + NL);
                    sb.append(indent + SPACE + "@" + simpleCanonicalNameOf(Test.class) + NL);
                    sb.append(indent + SPACE + "@" + simpleCanonicalNameOf(Category.class) + "(" + simpleCanonicalClassOf(Draft.class) + ")" + NL);
                    sb.append(indent + SPACE + "public void " + testMethodName + "() throws Exception {" + NL);
                    sb.append(indent + SPACE + SPACE + "// create new instance" + NL);
                    sb.append(indent + SPACE + SPACE + "@SuppressWarnings(\"unused\")" + NL);
                    sb.append(indent + SPACE + SPACE + canonicalNameOf(clazz) + " sut = null; // = new " + javadocNameOf(constructor).split("#")[1] + ";" + NL);
                    sb.append(indent + SPACE + "}" + NL);
                    sb.append(NL);
                }

                // query all declared, relevant methods
                final Set<Method> methods = Arrays.stream(clazz.getDeclaredMethods()) //
                                                  .filter(setup::useMethod) //
                                                  .filter(this.accessScope::matches) //
                                                  .peek(m -> {
                    if (m.isSynthetic()) {
                        LOG.warning(format(SKIP_TYPE_METHODS, clazz, m));
                    }
                }) //
                                                  .filter(m -> !m.isSynthetic()) //
                                                  .collect(toSet());
                LOG.info(format(J8UNIT_TESTINTERFACE_AIMED_METHODS, clazz, this.accessScope, methods));
                for (final Method method : methods) {
                    // collect all declaring super nodes
                    final String testMethodName = setup.getSimpleTestMethodName(method);
                    sb.append(indent + SPACE + "/**" + NL);
                    sb.append(indent + SPACE + " * <p>" + NL);
                    sb.append(indent + SPACE + " * Test method for {@link " + javadocNameOf(method) + " " + toVarArgAwareString(method) + "}." + NL);
                    sb.append(indent + SPACE + " *" + NL);
                    sb.append(indent + SPACE + " * Up to now, there is no real implementation of this test method. But with your help" + NL);
                    sb.append(indent + SPACE + " * at <a href=\"http://www.j8unit.org\">http://www.j8unit.org</a> this marker method will" + NL);
                    sb.append(indent + SPACE + " * be replaced by meaningful test methods soon." + NL);
                    sb.append(indent + SPACE + " * </p>" + NL);
                    sb.append(indent + SPACE + " *" + NL);
                    sb.append(indent + SPACE + " * @see " + javadocNameOf(method) + " " + method + " (the hereby targeted method-under-test)" + NL);
                    sb.append(indent + SPACE + " */" + NL);
                    // append test method content
                    sb.append(indent + SPACE + "@" + simpleCanonicalNameOf(Ignore.class) + "(\"" + IGNORE_STATEMENT + "\")" + NL);
                    sb.append(indent + SPACE + "@" + simpleCanonicalNameOf(Test.class) + NL);
                    sb.append(indent + SPACE + "@" + simpleCanonicalNameOf(Category.class) + "(" + simpleCanonicalClassOf(Draft.class) + ")" + NL);
                    sb.append(indent + SPACE + "public void " + testMethodName + "() throws Exception {" + NL);
                    sb.append(indent + SPACE + SPACE + "// write some test for {@link " + javadocNameOf(method) + "}" + NL);
                    sb.append(indent + SPACE + "}" + NL);
                    sb.append(NL);
                }
                // collect sub-classes
                for (final Class<?> subClass : this.calculateEnvelopedClasses(clazz, setup)) {
                    sb.append(this.testClassContent(subClass, setup, complementarySetup, enclosingLevel + 1));
                    sb.append(NL);
                }
                sb.append(indent + "}" + NL);
                // finalize content
                return sb.toString();
            }

        },

        PACKAGE_INFO(null, null, null) {

            @Override
            protected String generateSourceFileName(final Class<?> clazz, final GeneratorSetup setup) {
                return "package-info.java";
            }

            @Override
            public String generateSourceCode(final Class<?> clazz, final GeneratorSetup setup, final GeneratorSetup complementarySetup) {
                final Package pakkage = requireNonNull(clazz).getPackage();
                final StringBuilder sb = new StringBuilder();
                sb.append("/**" + NL);
                sb.append(" * <p>" + NL);
                sb.append(" * This package contains all the <strong>reusable tests</strong> targeting the behaviour of the types of package" + NL);
                sb.append(" * {@code " + canonicalNameOf(pakkage) + "}." + NL);
                sb.append(" * </p>" + NL);
                sb.append(" *" + NL);
                sb.append(" * <p>" + NL);
                sb.append(" * According to <a href=\"https://docs.oracle.com/javase/specs/jls/se8/html/jls-6.html#jls-6.1\">The Java Language" + NL);
                sb.append(" * Specification (Java SE 8 Edition), Section.&nbsp;6.1</a>, some package's &quot;[&hellip;] first identifier [&hellip;]" + NL);
                sb.append(" * should not be the identifier {@code java} [&hellip;]&quot;. Thus, this test class collection is limited to accessible" + NL);
                sb.append(" * classes (i.&thinsp;e., top-level, <a href=\"http://docs.oracle.com/javase/tutorial/java/javaOO/nested.html\">nested," + NL);
                sb.append(" * inner</a>) and accessible methods&nbsp;&ndash; simply because it cannot place test classes in the class-under-test's" + NL);
                sb.append(" * {@code java.*} package (which otherwise would allow access to {@code protected}, resp. <em>package-private</em>" + NL);
                sb.append(" * elements)." + NL);
                sb.append(" * </p>" + NL);
                sb.append(" *" + NL);
                sb.append(" * @since 0.9.0" + NL);
                sb.append(" * @author <a href=\"mailto:stefan@gasterstädt.de\">Stefan Gasterst&auml;dt</a>" + NL);
                sb.append(" * @author <a href=\"mailto:sascha.zak@zak-digital.de\">Sascha Zak</a>" + NL);
                sb.append(" */" + NL);
                sb.append(this.packageDeclaration(clazz, setup));
                // finalize content
                return sb.toString();
            }

            @Override
            protected String testClassContent(final Class<?> clazz, final GeneratorSetup setup, final GeneratorSetup complementarySetup,
                                              final int enclosingLevel) {
                return "";
            }

        };

    public static enum Target {

        REUSABLE_TESTS,

        SPECIFIC_TEST;

    }

    private static final Logger LOG = getLogger(Generator.class.getName());

    protected final AccessScope accessScope;

    protected final Target target;

    private final String defaultSuffix;

    public String getDefaultSuffix() {
        return this.defaultSuffix;
    }

    private Generator(final AccessScope accessScope, final Target target, final String defaultSuffix) {
        this.accessScope = accessScope;
        this.target = target;
        this.defaultSuffix = defaultSuffix;
    }

    protected String generateSourceFileName(final Class<?> clazz, final GeneratorSetup setup) {
        return setup.simpleCanonicalTestNameOf(clazz) + ".java";
    }

    public void generateSourceFile(final Class<?> clazz, final GeneratorSetup setup, final GeneratorSetup complementarySetup) {
        if (TOP_LEVEL.mismatches(requireNonNull(clazz))) {
            // defer enveloped type
            LOG.fine(format(DEFER_TYPE, clazz));
        } else if (requireNonNull(setup).skipClass(clazz)) {
            // skip type by current setup
            LOG.warning(format(SKIP_TYPE, clazz));
        } else {
            LOG.info(format(HANDLE_TYPE, clazz));
            try {
                final Path folder = setup.folderForClass(clazz);
                // create target folder (unless existing)
                folder.toFile().mkdirs();
                final File file = folder.resolve(this.generateSourceFileName(clazz, setup)).toFile();
                if (!file.exists() || setup.isOverwriteMode()) {
                    // generate test class' content
                    final String content = this.generateSourceCode(clazz, setup, complementarySetup);
                    // create test class
                    LOG.info(format(CREATE_FILE, clazz));
                    file.createNewFile();
                    try (final Writer writer = new FileWriter(file)) {
                        writer.write(content);
                    }
                } else {
                    LOG.info(format(SKIP_FILE, clazz));
                }
            } catch (final IOException io) {
                LOG.log(SEVERE, format(ABORT_FILE, clazz), io);
            }
            LOG.info(format(FINISH_TYPE, clazz));
        }
    }

    @SuppressWarnings("unused")
    public static void main(final String[] args)
    throws Exception {
        final List<String> LANG_ONLY = asList("java.lang");
        final List<String> BASIC_JAVA = asList("java.lang", "java.io", "java.util");
        final List<String> FULL_JAVA = asList("java", "javax", "org");
        for (final String pakkage : FULL_JAVA) {
            LOG.info(format(START_MAIN, pakkage));
            final GeneratorSetup j8InstanceRepository = GeneratorSetup.forJavaPackage(pakkage) //
                                                                      .intoTargetFolder("tmp/src/main/java") //
                                                                      .asSubPackageOf("org.j8unit.repository") //
                                                                      .useTestClassPrefix("") //
                                                                      .upperCaseTestClassInfix(false) //
                                                                      .useTestClassSuffix(INSTANCE_REPOSITORY.defaultSuffix) //
                                                                      .useTestConstructorPrefix("create_") //
                                                                      .upperCaseTestConstructorInfix(false) //
                                                                      .useTestConstructorSuffix("") //
                                                                      .useTestMethodPrefix("test_") //
                                                                      .upperCaseTestMethodInfix(false) //
                                                                      .useTestMethodSuffix("") //
                                                                      .overwriteExistingFiles() //
                                                                      .build();
            final GeneratorSetup j8ClassRepository = GeneratorSetup.similarTo(j8InstanceRepository) //
                                                                   .useTestClassSuffix(CLASS_REPOSITORY.defaultSuffix) //
                                                                   .build();
            for (final Class<?> clazz : j8InstanceRepository.listAllTypes()) {
                INSTANCE_REPOSITORY.generateSourceFile(clazz, j8InstanceRepository, j8ClassRepository);
            }
            for (final Class<?> clazz : j8ClassRepository.listAllTypes()) {
                CLASS_REPOSITORY.generateSourceFile(clazz, j8ClassRepository, j8InstanceRepository);
            }
            final GeneratorSetup j8InstanceTest = GeneratorSetup.similarTo(j8InstanceRepository) //
                                                                .intoTargetFolder("tmp/src/test/java") //
                                                                .useTestClassSuffix(INSTANCE_TEST.defaultSuffix) //
                                                                .build();
            for (final Class<?> clazz : j8InstanceTest.listAllTypes()) {
                INSTANCE_TEST.generateSourceFile(clazz, j8InstanceTest, j8InstanceRepository);
            }
            final GeneratorSetup j8ClassTest = GeneratorSetup.similarTo(j8InstanceTest) //
                                                             .useTestClassSuffix(CLASS_TEST.defaultSuffix) //
                                                             .build();
            for (final Class<?> clazz : j8ClassTest.listAllTypes()) {
                CLASS_TEST.generateSourceFile(clazz, j8ClassTest, j8ClassRepository);
            }
            final GeneratorSetup j8PackageInfo = GeneratorSetup.similarTo(j8InstanceRepository) //
                                                               .skipExistingFiles() //
                                                               .build();
            for (final Class<?> clazz : j8PackageInfo.listAllTypes()) {
                PACKAGE_INFO.generateSourceFile(clazz, j8PackageInfo, null);
            }
            LOG.info(format(FINISH_MAIN, pakkage));
        }
    }

    public String generateSourceCode(final Class<?> clazz, final GeneratorSetup setup, final GeneratorSetup complementarySetup) {
        // content storage
        final StringBuilder sb = new StringBuilder();
        // content creation
        sb.append(this.packageDeclaration(clazz, setup));
        sb.append(this.imports(clazz));
        sb.append(this.testClassContent(clazz, setup, complementarySetup, 0));
        // finalize content
        return sb.toString();
    }

    protected String packageDeclaration(final Class<?> clazz, final GeneratorSetup setup) {
        final StringBuilder sb = new StringBuilder();
        sb.append("package " + setup.packageForClass(clazz) + ";" + NL);
        sb.append(NL);
        // finalize content
        return sb.toString();
    }

    protected String imports(final Class<?> clazz) {
        final StringBuilder sb = new StringBuilder();
        sb.append("import static " + org.j8unit.FactoryBasedJ8UnitTest.class.getName() + ".*;" + NL);
        sb.append("import static " + org.j8unit.util.TestParametersUtil.class.getName() + ".*;" + NL);
        sb.append("import static " + org.junit.Assert.class.getName() + ".*;" + NL);
        sb.append("import static " + org.junit.Assume.class.getName() + ".*;" + NL);
        sb.append("import static " + java.lang.reflect.Modifier.class.getName() + ".*;" + NL);
        sb.append("import " + java.lang.annotation.Annotation.class.getName() + ";" + NL);
        sb.append("import " + java.util.concurrent.Callable.class.getName() + ";" + NL);
        sb.append("import " + java.lang.reflect.Constructor.class.getName() + ";" + NL);
        sb.append("import " + java.lang.reflect.Method.class.getName() + ";" + NL);
        sb.append("import " + java.lang.reflect.Modifier.class.getName() + ";" + NL);
        sb.append("import " + org.j8unit.FactoryBasedJ8UnitTest.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + org.j8unit.runners.J8Unit4.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + org.j8unit.repository.RepositoryTests.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + org.j8unit.repository.categories.J8UnitRepository.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + org.junit.Test.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + org.junit.runner.RunWith.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + org.junit.runners.JUnit4.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + org.junit.runners.Parameterized.class.getName() + ".Parameter;" + NL);
        sb.append("import " + org.junit.runners.Parameterized.class.getName() + ".Parameters;" + NL);
        sb.append("import " + org.junit.runners.Parameterized.class.getName() + ".UseParametersRunnerFactory;" + NL);
        sb.append("import " + org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParametersFactory.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + org.junit.experimental.categories.Category.class.getName() + ";" + NL);
        sb.append(this.allInOneCustomImports(clazz));
        sb.append(NL);
        // finalize content
        return sb.toString();
    }

    protected abstract String testClassContent(final Class<?> clazz, final GeneratorSetup setup, final GeneratorSetup complementarySetup,
                                               final int enclosingLevel);

    protected final Set<Class<?>> calculateEnvelopedClasses(final Class<?> clazz, final GeneratorSetup setup) {
        final Set<Class<?>> collect = Arrays.stream(clazz.getDeclaredClasses()) //
                                            .filter(setup::useClass) //
                                            .collect(toSet());
        LOG.info(format(ENVELOPED_TYPES, clazz, collect));
        return collect;
    }

    public String allInOneCustomImports(final Class<?> clazz) {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.customImports());
        sb.append(this.customImports(clazz));
        final ModusOperandi modusOperandi = this.accessScope.modusOperandiFor(clazz);
        sb.append(modusOperandi.customImports());
        sb.append(modusOperandi.customImports(clazz));
        // finalize content
        return sb.toString();
    }

    public String allInOneCustomTestInterfaceHead(final Class<?> clazz, final int enclosingLevel) {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.customTestInterfaceHead(enclosingLevel));
        sb.append(this.customTestInterfaceHead(clazz, enclosingLevel));
        final ModusOperandi modusOperandi = this.accessScope.modusOperandiFor(clazz);
        sb.append(modusOperandi.customTestInterfaceHead(enclosingLevel));
        sb.append(modusOperandi.customTestInterfaceHead(clazz, enclosingLevel));
        // finalize content
        return sb.toString();
    }

    public String allInOneCustomTestInterfaceBody(final Class<?> clazz, final int enclosingLevel) {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.customTestInterfaceBody(enclosingLevel + 1));
        sb.append(this.customTestInterfaceBody(clazz, enclosingLevel + 1));
        final ModusOperandi modusOperandi = this.accessScope.modusOperandiFor(clazz);
        sb.append(modusOperandi.customTestInterfaceBody(enclosingLevel + 1));
        sb.append(modusOperandi.customTestInterfaceBody(clazz, enclosingLevel + 1));
        // finalize content
        return sb.toString();
    }

    @Override
    public String customTestInterfaceBody(final Class<?> clazz, final int enclosingLevel) {
        return GeneratorCustoms.valueOf(this, clazz).customContentData(enclosingLevel);
    }

    @Override
    public String customImports(final Class<?> clazz) {
        return GeneratorCustoms.valueOf(this, clazz).customImports();
    }

}
