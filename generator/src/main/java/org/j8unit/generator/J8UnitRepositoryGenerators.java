package org.j8unit.generator;

import static java.lang.String.format;
import static java.lang.String.join;
import static java.util.function.UnaryOperator.identity;
import static java.util.stream.Collectors.toMap;
import static org.j8unit.generator.GeneratorTokens.ASSERT_TRUE;
import static org.j8unit.generator.GeneratorTokens.IGNORE_MESSAGE;
import static org.j8unit.generator.GeneratorTokens.SUT_FACTORY;
import static org.j8unit.generator.GeneratorTokens.VERSION_REPO_INITIAL;
import static org.j8unit.generator.GeneratorTokens.VERSION_REPO_UPDATE;
import static org.j8unit.generator.GeneratorTokens.indent;
import static org.j8unit.generator.analysis.AccessScope.CLASS;
import static org.j8unit.generator.analysis.AccessScope.INSTANCE;
import static org.j8unit.generator.api.GeneratorMarkers.Position.BEGIN;
import static org.j8unit.generator.api.GeneratorMarkers.Position.END;
import static org.j8unit.generator.api.GeneratorMarkers.Position.MANUAL;
import static org.j8unit.generator.api.GlobalGeneratorConstants.SUT;
import static org.j8unit.generator.api.LoggingMessagesKeys.MERGE_METHODS;
import static org.j8unit.generator.api.LoggingMessagesKeys.METHODS_UNDER_TEST;
import static org.j8unit.generator.util.Iterators.replaceAll;
import static org.j8unit.generator.util.Java.ENUMERATION_DELIMITER;
import static org.j8unit.generator.util.Lists.convert;
import static org.j8unit.generator.util.Suppliers.runtimed;
import static org.j8unit.generator.util.TypeAnalysis.calculateNearestDeclaringParents;
import static org.j8unit.generator.util.TypeAnalysis.classHierarchy;
import static org.j8unit.generator.util.TypeAnalysis.getDeclaredMethod;
import static org.j8unit.generator.util.TypeAnalysis.getMethod;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import org.j8unit.generator.analysis.AccessScope;
import org.j8unit.generator.api.J8UnitCodeGenerator;
import org.j8unit.generator.api.ModusOperandi;
import org.j8unit.generator.api.control.GeneratorUseControler;
import org.j8unit.generator.api.render.OriginRenderer;
import org.j8unit.generator.api.render.TargetRenderer;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public enum J8UnitRepositoryGenerators
implements J8UnitCodeGenerator {

    INSTANCE_TESTS(INSTANCE) {

        private final StringBuilder javadoc(final Class<?> type, final OriginRenderer renderer, final TargetRenderer complementary, final int depth) {
            // data preparations
            final String indt = indent(depth);
            final String originTypeUnderTest = renderer.originCanonicalNameOf(type);
            final String complementaryTarget = complementary.targetJavadocNameOf(type);
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation
            out.append(format("%s/**%n", indt));
            out.append(format("%s * <p>%n", indt));
            out.append(format("%s * Reusable j8unit test interface containing the instance relevant aspects%n", indt));
            out.append(format("%s * &ndash;&nbsp;i.&thinsp;e., test methods targeting the non-{@code static} behaviour&nbsp;&ndash;%n", indt));
            out.append(format("%s * of the hereby targeted type-under-test {@link %s %s}.%n", indt, originTypeUnderTest, type.toGenericString()));
            out.append(format("%s * </p>%n", indt));
            out.append(format("%s *%n", indt));
            out.append(format("%s * <p>%n", indt));
            out.append(format("%s * j8unit strongly encourages you to not only test the instances behaviour but also to test the type%n", indt));
            out.append(format("%s * constraints. For this purpose, j8unit also provides a complementary test interface containing the%n", indt));
            out.append(format("%s * class/type relevant aspects (see {@link %s}).%n", indt, complementaryTarget));
            out.append(format("%s * </p>%n", indt));
            out.append(format("%s *%n", indt));
            out.append(format("%s * @param %s the type of the subject-under-test%n", indt, SUT));
            out.append(format("%s * @since %s%n", indt, VERSION_REPO_INITIAL));
            out.append(format("%s */%n", indt));
            // finish
            return out;
        }

        @Override
        public final <Renderer extends OriginRenderer & TargetRenderer> String generateTestContent(final Class<?> type, final GeneratorUseControler control,
                                                                                                   final Renderer renderer, final TargetRenderer complementary,
                                                                                                   final int depth) {
            // data preparations
            final String indt = indent(depth);
            final ModusOperandi modusOperandi = this.modusOperandi(type);
            final String optionalModifiers = join(" ", this.optionalModifiers(depth));
            final String j8unitName = renderer.targetSimpleNameOf(type);
            final String j8unitGenerics = modusOperandi.getTestInterfaceGenericStatement(renderer, type);
            final List<String> j8unitSuperTypes = modusOperandi.getTestInterfaceSuperTypesDefinitions(type, control, renderer);
            final String j8unitSuperTypesStatement = join(format("%s%n%s", ENUMERATION_DELIMITER, indent(depth + 2)), j8unitSuperTypes);
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation: JavaDoc
            out.append(this.javadoc(type, renderer, complementary, depth));
            // content creation: @SuppressWarnings(...)
            out.append(modusOperandi.renderEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), this::modusOperandi), depth, renderer));
            // content creation: @FunctionalInterface
            out.append(format("%s@%s%n", indt, renderer.originCanonicalNameOf(FunctionalInterface.class)));
            // content creation: @Category(J8UnitRepository.class)
            out.append(format("%s@%s(%s)%n", indt, renderer.originCanonicalNameOf(Category.class), renderer.originCanonicalClassOf(J8UnitRepository.class)));
            // content creation: J8Unit Test Interface Declaration
            out.append(format("%spublic %s abstract interface %s%s%n", indt, optionalModifiers, j8unitName, j8unitGenerics));
            out.append(format("%sextends %s%n", indt, j8unitSuperTypesStatement));
            out.append(format("%s{%n", indt));
            out.append(format("%n"));
            // content creation: Begin Marker
            out.append(format("%s%s// %s%n", indt, indent(), this.marker(BEGIN, modusOperandi, type)));
            out.append(format("%n"));
            // content creation: Custom Content
            out.append(modusOperandi.customTestInterfaceBody(depth + 1, renderer));
            // content creation: All Methods Under Test
            for (final Entry<Method, Map<Class<?>, Set<Class<?>>>> mut : this.exploreMethodsUnderTest(type, control).entrySet()) {
                out.append(this.testMethodJavadoc(mut.getKey(), renderer, depth + 1));
                out.append(this.testMethodContent(mut, renderer, depth + 1));
                out.append(format("%n"));
            }
            // content creation: All Merging Methods (to prevent ambiguity by multiple inheritance)
            for (final Entry<Method, Map<Class<?>, Set<Class<?>>>> merged : this.exploreMergeMethods(type, control).entrySet()) {
                out.append(this.mergeMethodJavadoc(merged, renderer, depth + 1));
                out.append(this.mergeMethodContent(merged, renderer, depth + 1));
                out.append(format("%n"));
            }
            // content creation: End Marker
            out.append(format("%s%s// %s%n", indt, indent(), this.marker(MANUAL, modusOperandi, type)));
            out.append(format("%n"));
            out.append(format("%s%s// %s%n", indt, indent(), this.marker(END, modusOperandi, type)));
            out.append(format("%n"));
            // content creation: Enveloped Types
            for (final Class<?> enveloped : this.exploreEnvelopedTypes(type, control)) {
                out.append(this.generateTestContent(enveloped, control, renderer, complementary, depth + 1));
                out.append(format("%n"));
            }
            out.append(format("%s}%n", indt));
            // finalize content
            return out.toString();
        }

        private final Map<Method, Map<Class<?>, Set<Class<?>>>> exploreMethodsUnderTest(final Class<?> type, final GeneratorUseControler control) {
            // query all declared, relevant methods
            final Stream<Method> methods = Arrays.stream(type.getDeclaredMethods())
                                                 // must be usable
                                                 .filter(control::useMethod)
                                                 // must match this access-scope
                                                 .filter(this.modusOperandi(type)::matches)
                                                 // must be non-synthetic
                                                 .filter(m -> !m.isSynthetic()).peek(m -> assertFalse(m.isBridge()));
            // overridden methods are identified by the declaring parent nodes
            final UnaryOperator<Method> keyMapper = identity();
            final Function<Method, Map<Class<?>, Set<Class<?>>>> valueMapper = m -> calculateNearestDeclaringParents(type, m, control::useType);
            final Map<Method, Map<Class<?>, Set<Class<?>>>> result = methods.collect(toMap(keyMapper, valueMapper));
            // finish
            this.logger().info(METHODS_UNDER_TEST, type, this.modusOperandi(type), result.keySet());
            return result;
        }

        private final <Renderer extends OriginRenderer & TargetRenderer> StringBuilder testMethodContent(final Entry<? extends Method, ? extends Map<Class<?>, ? extends Set<Class<?>>>> method,
                                                                                                         final Renderer renderer, final int depth) {
            // data preparations
            final String indt = indent(depth);
            final String j8unitName = renderer.targetSimpleNameOf(method.getKey());
            final String override = format("%s@%s%n", indt, renderer.originCanonicalNameOf(Override.class));
            final String optionalOverride = method.getValue().isEmpty() ? "" : override;
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation
            out.append(format("%s@%s(\"%s\")%n", indt, renderer.originCanonicalNameOf(Ignore.class), IGNORE_MESSAGE));
            out.append(optionalOverride);
            out.append(format("%s@%s%n", indt, renderer.originCanonicalNameOf(Test.class)));
            out.append(format("%s@%s(%s)%n", indt, renderer.originCanonicalNameOf(Category.class), renderer.originCanonicalClassOf(Draft.class)));
            out.append(format("%spublic default void %s() throws %s {%n", indt, j8unitName, renderer.originCanonicalNameOf(Exception.class)));
            out.append(format("%s%s// query fresh subject-under-test%n", indt, indent()));
            out.append(format("%s%sfinal %s sut = this.%s();%n", indt, indent(), SUT, SUT_FACTORY));
            out.append(format("%s%sassert sut != null;%n", indt, indent()));
            out.append(format("%s}%n", indt));
            // finish
            return out;
        }

        private final Map<Method, Map<Class<?>, Set<Class<?>>>> exploreMergeMethods(final Class<?> type, final GeneratorUseControler control) {
            // query all inherited, relevant methods (that is, methods that are not specified by this {@code type})
            // (Note: {@link Class#getMethods()} returns only public methods; but, this is OK because there is
            // no merging problem for non-public methods; non-public methods cannot be inherited multiple times)
            final Stream<Method> methods = Arrays.stream(type.getMethods())
                                                 // must be usable
                                                 .filter(control::useMethod)
                                                 // must match this access-scope
                                                 .filter(this.modusOperandi(type)::matches)
                                                 // must be non-synthetic (except bridge methods)
                                                 .filter(m -> !m.isSynthetic() || m.isBridge())
                                                 // keep in mind inherited methods might be overridden by closer
                                                 // parent nodes; thus, map to the closest declaration
                                                 .map(m -> getMethod(type, m)).peek(o -> assertTrue(o.isPresent())).map(Optional::get).distinct()
                                                 // must be not declared by current {@code type} (except bridge methods)
                                                 .filter(m -> !getDeclaredMethod(type, m).isPresent() || m.isBridge());
            // overridden methods are identified by the declaring parent nodes
            final UnaryOperator<Method> keyMapper = identity();
            final Function<Method, Map<Class<?>, Set<Class<?>>>> valueMapper = m -> calculateNearestDeclaringParents(type, m, control::useType);
            final Map<Method, Map<Class<?>, Set<Class<?>>>> result = methods.collect(toMap(keyMapper, valueMapper));
            // however, only ambiguously inherited methods must be considered
            result.values().removeIf(origins -> origins.size() < 2);
            // finish
            this.logger().info(MERGE_METHODS, type, this.modusOperandi(type), result.keySet());
            return result;
        }

        private final StringBuilder mergeMethodJavadoc(final Entry<? extends Method, ? extends Map<Class<?>, Set<Class<?>>>> merged,
                                                       final OriginRenderer renderer, final int depth) {
            // data preparations
            final String indt = indent(depth);
            final Method method = merged.getKey();
            final Set<Entry<Class<?>, Set<Class<?>>>> origins = merged.getValue().entrySet();
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation
            out.append(format("%s/**%n", indt));
            out.append(format("%s * <p>%n", indt));
            out.append(format("%s * The method-under-test covered by this test method is inherited duplicatedly within the declaring%n", indt));
            out.append(format("%s * class-under-test:</p>%n", indt));
            out.append(format("%s * <ul>%n", indt));
            for (final Entry<Class<?>, Set<Class<?>>> origin : origins) {
                out.append(format("%s * <li>%s</li>%n", indt, this.mergeMethodJavadocOriginLinks(method, origin, renderer)));
            }
            out.append(format("%s * </ul>%n", indt));
            out.append(format("%s *%n", indt));
            out.append(format("%s * <p>%n", indt));
            out.append(format("%s * In result, there are duplicated according test methods within the parent test classes.%n", indt));
            out.append(format("%s * To solve this compiler-error situation, this method must be overridden.%n", indt));
            out.append(format("%s * Dont't worry, there will be meaningful test methods soon and, thus, overriding becomes unnecessary.%n", indt));
            out.append(format("%s * </p>%n", indt));
            out.append(format("%s *%n", indt));
            out.append(format("%s * @since %s%n", indt, VERSION_REPO_INITIAL));
            out.append(format("%s */%n", indt));
            // finish
            return out;
        }

        private final String mergeMethodJavadocOriginLinks(final Method method, final Entry<Class<?>, Set<Class<?>>> origin, final OriginRenderer renderer) {
            final Class<?> grandParent = origin.getKey();
            final String javadocName = renderer.javadocNameOf(grandParent, method);
            final Set<Class<?>> viaParents = origin.getValue();
            assert viaParents.size() > 0;
            if (viaParents.contains(grandParent)) {
                assert viaParents.size() == 1 : "According to a specific method, grandparent is immediate parent node - but there is another via node!";
                return format("{@link %s %s}", javadocName, grandParent);
            } else {
                final List<String> vias = convert(viaParents, p -> format("{@link %s %s}", renderer.originCanonicalNameOf(p), renderer.originSimpleNameOf(p)));
                return format("{@link %s %s} (via parent node(s) %s)", javadocName, grandParent, join(", ", vias));
            }
        }

        private final <Renderer extends OriginRenderer & TargetRenderer> StringBuilder mergeMethodContent(final Entry<? extends Method, ? extends Map<Class<?>, Set<Class<?>>>> merged,
                                                                                                          final Renderer renderer, final int depth) {
            // data preparations
            final String indt = indent(depth);
            final String methodName = renderer.targetSimpleNameOf(merged.getKey());
            final Set<Entry<Class<?>, Set<Class<?>>>> origins = merged.getValue().entrySet();
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation
            out.append(format("%s@%s(\"%s\")%n", indt, renderer.originCanonicalNameOf(Ignore.class), IGNORE_MESSAGE));
            out.append(format("%s@%s%n", indt, renderer.originCanonicalNameOf(Override.class)));
            out.append(format("%s@%s%n", indt, renderer.originCanonicalNameOf(Test.class)));
            out.append(format("%s@%s(%s)%n", indt, renderer.originCanonicalNameOf(Category.class), renderer.originCanonicalClassOf(Draft.class)));
            out.append(format("%spublic default void %s() throws %s {%n", indt, methodName, renderer.originCanonicalNameOf(Exception.class)));
            for (final Entry<Class<?>, Set<Class<?>>> origin : origins) {
                final Set<Class<?>> viaParents = origin.getValue();
                for (final Class<?> viaParent : viaParents) {
                    out.append(format("%s%s%s.super.%s();%n", indt, indent(), renderer.targetCanonicalNameOf(viaParent), methodName));
                }
            }
            out.append(format("%s}%n", indt));
            // finish
            return out;
        }

    },

    TYPE_TESTS(CLASS) {

        private static final String VERIFY_METHOD_NAME = "verifyGenericType";

        private final StringBuilder javadoc(final Class<?> type, final OriginRenderer renderer, final TargetRenderer complementaryBehaviour, final int depth) {
            // data preparations
            final String indt = indent(depth);
            final String originTypeUnderTest = renderer.originCanonicalNameOf(type);
            final String complementaryTarget = complementaryBehaviour.targetJavadocNameOf(type);
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation
            out.append(format("%s/**%n", indt));
            out.append(format("%s * <p>%n", indt));
            out.append(format("%s * Reusable j8unit test interface containing the type relevant aspects%n", indt));
            out.append(format("%s * &ndash;&nbsp;i.&thinsp;e., runtime constraints and further type specific requirements&nbsp;&ndash;%n", indt));
            out.append(format("%s * of the hereby targeted type-under-test {@link %s %s}.%n", indt, originTypeUnderTest, type.toGenericString()));
            out.append(format("%s *%n", indt));
            out.append(format("%s * (In addition, the runtime type of this j8unit test interface's generic type is verified by %n", indt));
            out.append(format("%s * {@link #%s()}).%n", indt, VERIFY_METHOD_NAME));
            out.append(format("%s * </p>%n", indt));
            out.append(format("%s *%n", indt));
            out.append(format("%s * <p>%n", indt));
            out.append(format("%s * The complementary j8unit test interface containing the instance relevant aspects is%n", indt));
            out.append(format("%s * {@link %s}.%n", indt, complementaryTarget));
            out.append(format("%s * </p>%n", indt));
            out.append(format("%s *%n", indt));
            out.append(format("%s * <p>%n", indt));
            out.append(format("%s * <strong>What? Testing the class/the type itself? What is it good for?</strong>%n", indt));
            out.append(format("%s * </p>%n", indt));
            out.append(format("%s *%n", indt));
            out.append(format("%s * <p>%n", indt));
            out.append(format("%s * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!%n", indt));
            out.append(format("%s *%n", indt));
            out.append(format("%s * For example, all sub-types of {@link %s} should provide a%n", indt, renderer.javadocNameOf(Throwable.class)));
            out.append(format("%s * zero-argument and a {@link %s}-argument constructor.%n", indt, renderer.javadocNameOf(String.class)));
            out.append(format("%s * Obviously, this is a class-specific behaviour.%n", indt));
            out.append(format("%s * In general, all constraints referring to the provision of specific constructors (and its%n", indt));
            out.append(format("%s * individual requirements) should be covered by according test methods. (Note, this is not limited%n", indt));
            out.append(format("%s * to constructors only; Just think of factory methods and further.)%n", indt));
            out.append(format("%s *%n", indt));
            out.append(format("%s * For another example, <a href=\"https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1\"><q>by%n", indt));
            out.append(format("%s * virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an annotation%n", indt));
            out.append(format("%s * type declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q>%n", indt));
            out.append(format("%s * (JLS, Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!%n", indt));
            out.append(format("%s * </p>%n", indt));
            out.append(format("%s *%n", indt));
            out.append(format("%s * @param %s the class' type of the subject-under-test%n", indt, SUT));
            out.append(format("%s * @since %s%n", indt, VERSION_REPO_INITIAL));
            out.append(format("%s */%n", indt));
            // finish
            return out;
        }

        @Override
        public final <Renderer extends OriginRenderer & TargetRenderer> String generateTestContent(final Class<?> type, final GeneratorUseControler control,
                                                                                                   final Renderer renderer, final TargetRenderer complementary,
                                                                                                   final int depth) {
            // data preparations
            final String indt = indent(depth);
            final ModusOperandi modusOperandi = this.modusOperandi(type);
            final String optionalModifiers = join(" ", this.optionalModifiers(depth));
            final String j8unitName = renderer.targetSimpleNameOf(type);
            final String j8unitGenerics = modusOperandi.getTestInterfaceGenericStatement(renderer, type);
            final List<String> j8unitSuperTypes = modusOperandi.getTestInterfaceSuperTypesDefinitions(type, control, renderer);
            final String j8unitSuperTypesStatement = join(format("%s%n%s", ENUMERATION_DELIMITER, indent(depth + 2)), j8unitSuperTypes);
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation
            // 1. JavaDoc
            out.append(this.javadoc(type, renderer, complementary, depth));
            // 2. @SuppressWarnings(...)
            out.append(modusOperandi.renderEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), this::modusOperandi), depth, renderer));
            // 3. @FunctionalInterface
            out.append(format("%s@%s%n", indt, renderer.originCanonicalNameOf(FunctionalInterface.class)));
            // 4. @Category(J8UnitRepository.class)
            out.append(format("%s@%s(%s)%n", indt, renderer.originCanonicalNameOf(Category.class), renderer.originCanonicalClassOf(J8UnitRepository.class)));
            // 5. J8Unit Test Interface Declaration
            out.append(format("%spublic %s abstract interface %s%s%n", indt, optionalModifiers, j8unitName, j8unitGenerics));
            out.append(format("%sextends %s%n", indt, j8unitSuperTypesStatement));
            out.append(format("%s{%n", indt));
            out.append(format("%n"));
            // content creation: Begin Marker
            out.append(format("%s%s// %s%n", indt, indent(), this.marker(BEGIN, modusOperandi, type)));
            out.append(format("%n"));
            out.append(modusOperandi.customTestInterfaceBody(depth + 1, renderer));
            out.append(this.verifyGenericTypeContent(type, depth + 1, renderer));
            out.append(format("%n"));
            // content creation: End Marker
            out.append(format("%s%s// %s%n", indt, indent(), this.marker(MANUAL, modusOperandi, type)));
            out.append(format("%n"));
            out.append(format("%s%s// %s%n", indt, indent(), this.marker(END, modusOperandi, type)));
            out.append(format("%n"));
            // content creation: Enveloped Types
            for (final Class<?> enveloped : this.exploreEnvelopedTypes(type, control)) {
                out.append(this.generateTestContent(enveloped, control, renderer, complementary, depth + 1));
                out.append(format("%n"));
            }
            out.append(format("%s}%n", indt));
            // finalize content
            return out.toString();
        }

        private final StringBuilder verifyGenericTypeContent(final Class<?> type, final int depth, final OriginRenderer renderer) {
            // data preparations
            final String indt = indent(depth);
            final Method mut = runtimed(() -> Class.class.getMethod("isAssignableFrom", Class.class));
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation
            out.append(format("%s/**%n", indt));
            out.append(format("%s * @see %s %s (the hereby targeted method-under-test)%n", indt, renderer.javadocNameOf(mut), mut.toGenericString()));
            out.append(format("%s *%n", indt));
            out.append(format("%s * @since %s%n", indt, VERSION_REPO_UPDATE));
            out.append(format("%s */%n", indt));
            out.append(format("%s@%s%n", indt, renderer.originCanonicalNameOf(Test.class)));
            out.append(format("%spublic default void %s() throws %s {%n", indt, VERIFY_METHOD_NAME, renderer.originCanonicalNameOf(Exception.class)));
            out.append(format("%s%s// create new instance%n", indt, indent()));
            out.append(format("%s%s%s<%s> sut = %s();%n", indt, indent(), renderer.originCanonicalNameOf(Class.class), SUT, SUT_FACTORY));
            out.append(format("%s%s// assert assignability%n", indt, indent()));
            out.append(format("%s%s%s(\"This j8unit test interface is used with a generic type that is illegaly not assignable to %s!\", %s.%s(sut));%n", indt,
                              indent(), renderer.originCanonicalNameOf(Assert.class, ASSERT_TRUE), renderer.originCanonicalClassOf(type),
                              renderer.originCanonicalClassOf(type), mut.getName()));
            out.append(format("%s}%n", indt));
            // finish
            return out;
        }

    };

    private final AccessScope accessScope;

    protected final ModusOperandi modusOperandi(final Class<?> type) {
        return ModusOperandi.valueOf(this.accessScope, type);
    }

    private J8UnitRepositoryGenerators(final AccessScope accessScope) {
        this.accessScope = accessScope;
    }

    @Override
    public final String toString() {
        return format("%s::%s", this.getDeclaringClass().getName(), this.name());
    }

    protected final StringBuilder testMethodJavadoc(final Executable executable, final OriginRenderer renderer, final int depth) {
        // data preparations
        final String indt = indent(depth);
        final String utType = executable.getClass().getSimpleName().toLowerCase();
        final String javadocName = renderer.javadocNameOf(executable);
        // content storage
        final StringBuilder out = new StringBuilder();
        // content creation
        out.append(format("%s/**%n", indt));
        out.append(format("%s * <p>%n", indt));
        out.append(format("%s * Test method for the hereby targeted %s-under-test {@link %s %s}.%n", indt, utType, javadocName, executable.toGenericString()));
        out.append(format("%s *%n", indt));
        out.append(format("%s * Up to now, there is no real implementation of this test method. But with your help%n", indt));
        out.append(format("%s * at <a href=\"http://www.j8unit.org\">http://www.j8unit.org</a> this marker method will%n", indt));
        out.append(format("%s * be replaced by meaningful test methods soon.%n", indt));
        out.append(format("%s * </p>%n", indt));
        out.append(format("%s *%n", indt));
        out.append(format("%s * @since %s%n", indt, VERSION_REPO_INITIAL));
        out.append(format("%s */%n", indt));
        // finish
        return out;
    }

}
