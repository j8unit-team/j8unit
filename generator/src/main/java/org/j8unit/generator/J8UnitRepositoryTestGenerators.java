package org.j8unit.generator;

import static java.lang.String.format;
import static java.lang.String.join;
import static java.lang.reflect.Modifier.isAbstract;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toSet;
import static org.j8unit.generator.GeneratorTokens.IGNORE_MESSAGE;
import static org.j8unit.generator.GeneratorTokens.SUT_FACTORY;
import static org.j8unit.generator.GeneratorTokens.SUT_FACTORY_FACTORY;
import static org.j8unit.generator.GeneratorTokens.TEST_PARAMETERS_OF;
import static org.j8unit.generator.GeneratorTokens.TEST_PARAMETERS_OF_ENUM_CLASS;
import static org.j8unit.generator.GeneratorTokens.indent;
import static org.j8unit.generator.J8UnitRepositoryGenerators.INSTANCE_TESTS;
import static org.j8unit.generator.analysis.AccessScope.CLASS;
import static org.j8unit.generator.analysis.AccessScope.INSTANCE;
import static org.j8unit.generator.api.GeneratorMarkers.Position.BEGIN;
import static org.j8unit.generator.api.GeneratorMarkers.Position.END;
import static org.j8unit.generator.api.GeneratorMarkers.Position.MANUAL;
import static org.j8unit.generator.api.LoggingMessagesKeys.METHODS_UNDER_TEST;
import static org.j8unit.generator.api.LoggingMessagesKeys.SKIP_SYNTHETIC_METHOD;
import static org.j8unit.generator.util.Iterators.replaceAll;
import static org.j8unit.generator.util.Java.diamond;
import static org.j8unit.generator.util.OptionalString.ofEmptyable;
import static org.j8unit.generator.util.Optionals.optionalise;
import static org.j8unit.generator.util.Strings.csv;
import static org.j8unit.generator.util.TypeAnalysis.classHierarchy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.generator.analysis.AccessScope;
import org.j8unit.generator.api.J8UnitCodeGenerator;
import org.j8unit.generator.api.ModusOperandi;
import org.j8unit.generator.api.control.GeneratorUseControler;
import org.j8unit.generator.api.render.OriginRenderer;
import org.j8unit.generator.api.render.TargetRenderer;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.util.TestParametersUtil;
import org.junit.Assert;
import org.junit.AssumptionViolatedException;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

public enum J8UnitRepositoryTestGenerators
implements J8UnitCodeGenerator {

    INSTANCE_TEST_EXECUTION(INSTANCE) {

        private final StringBuilder javadoc(final Class<?> type, final OriginRenderer renderer, final TargetRenderer complementary, final int depth) {
            // data preparations
            final String indt = indent(depth);
            final String originTypeUnderTest = renderer.originCanonicalNameOf(type);
            final String j8unitTestInterface = complementary.targetJavadocNameOf(type);
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation
            out.append(format("%s/**%n", indt));
            out.append(format("%s * Specific JUnit test class to proof the instance relevant aspects of type {@link %s}%n", indt, originTypeUnderTest));
            out.append(format("%s * (by simply reusing the J8Unit test interface {@link %s}).%n", indt, j8unitTestInterface));
            out.append(format("%s */%n", indt));
            // finish
            return out;
        }

        @Override
        public final <Renderer extends OriginRenderer & TargetRenderer> String generateTestContent(final Class<?> type, final GeneratorUseControler control,
                                                                                                   final Renderer renderer, final TargetRenderer complementary,
                                                                                                   final int depth) {
            if (type.isEnum()) {
                // Case [1]: Enum Type
                final @SuppressWarnings("unchecked") Class<? extends Enum<?>> enumm = (Class<? extends Enum<?>>) type;
                final StringBuilder sutCreation = this.enumSUTCreation(enumm, depth + 1, renderer);
                return this.asParameterizedJ8UnitTest(enumm, control, renderer, complementary, depth, sutCreation).toString();
            }
            final Set<? extends Field> instances = Arrays.stream(type.getDeclaredFields()) //
                                                         .filter(f -> type.isAssignableFrom(f.getType())) //
                                                         .filter(control::useField) //
                                                         .filter(f -> Modifier.isStatic(f.getModifiers())) //
                                                         .collect(toSet());
            if (!instances.isEmpty()) {
                // Case [2]: Reuse Existing, Accessible Instances
                final StringBuilder sutCreation = this.fieldsSUTCreation(type, instances, depth + 1, renderer);
                return this.asParameterizedJ8UnitTest(type, control, renderer, complementary, depth, sutCreation).toString();
            } else if (isAbstract(type.getModifiers())) {
                // Case [3]: Skip Abstract Types
                final String msg = format("Due to the abstract modifier of this type-under-test [%s], j8unit does not support a generic way to provide instances.",
                                          type.getCanonicalName());
                final StringBuilder sutCreation = this.failingSUTCreation(type, msg, depth + 1, renderer);
                return this.asJ8UnitTest(type, control, renderer, complementary, depth, sutCreation).toString();
            } else {
                final Optional<Constructor<?>> candidate = optionalise(type::getDeclaredConstructor);
                final Optional<Constructor<?>> constructor = candidate.filter(control::useConstructor);
                if (constructor.isPresent()) {
                    // Case [4]: Refer to Default Constructor
                    final StringBuilder sutCreation = this.constructorSUTFactoryCreation(type, depth + 1, renderer);
                    return this.asFactoryBasedJ8UnitTest(type, control, renderer, complementary, depth, sutCreation).toString();
                } else {
                    // Case [5]: Skip
                    final String msg = format("Due to the absence of a default constructor of this non-abstract type-under-test [%s], j8unit does not support a generic way to provide instances.",
                                              type.getCanonicalName());
                    final StringBuilder sutCreation = this.failingSUTCreation(type, msg, depth + 1, renderer);
                    return this.asJ8UnitTest(type, control, renderer, complementary, depth, sutCreation).toString();
                }
            }
        }

        private final <Renderer extends OriginRenderer & TargetRenderer> StringBuilder asJ8UnitTest(final Class<?> type, final GeneratorUseControler control,
                                                                                                    final Renderer renderer, final TargetRenderer complementary,
                                                                                                    final int depth, final StringBuilder sutCreation) {
            // data preparations
            final String indt = indent(depth);
            final ModusOperandi modusOperandi = this.modusOperandi(type);
            final String optionalModifiers = join(" ", this.optionalModifiers(depth));
            final String j8unitName = renderer.targetSimpleNameOf(type);
            final String j8unitGenerics = diamond(renderer.listOfTypeParameterDefinitionsOf(type));
            final String testClassInterfaceType = complementary.targetCanonicalNameOf(type);
            final String testClassInterfaceGenerics = diamond(renderer.originCanonicalNameOf(type, renderer::listOfTypeParameterNamesOf)
                                                              + ofEmptyable(csv(renderer.listOfTypeParameterNamesOf(type))).prepend(", ").orEmpty());
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation: JavaDoc
            out.append(this.javadoc(type, renderer, complementary, depth));
            // content creation: @SuppressWarnings(...)
            out.append(modusOperandi.renderEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), this::modusOperandi), depth, renderer));
            // content creation: @RunWith(J8Unit4.class)
            out.append(format("%s@%s(%s)%n", indt, renderer.originCanonicalNameOf(RunWith.class), renderer.originCanonicalClassOf(J8Unit4.class)));
            // content creation: J8Unit Test Interface Declaration
            out.append(format("%spublic %s class %s%s%n", indt, optionalModifiers, j8unitName, j8unitGenerics));
            out.append(format("%simplements %s%s%n", indt, testClassInterfaceType, testClassInterfaceGenerics));
            out.append(format("%s{%n", indt));
            out.append(format("%n"));
            // content creation: Begin Marker
            out.append(format("%s%s// %s%n", indt, indent(), this.marker(BEGIN, modusOperandi, type)));
            out.append(format("%n"));
            // content creation: Custom Body Content
            // out.append(modusOperandi.customTestInterfaceBody(depth + 1));
            // content creation: SUT Creation
            out.append(sutCreation);
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
            return out;
        }

        private final <Renderer extends OriginRenderer & TargetRenderer> StringBuilder asParameterizedJ8UnitTest(final Class<?> type,
                                                                                                                 final GeneratorUseControler control,
                                                                                                                 final Renderer renderer,
                                                                                                                 final TargetRenderer complementary,
                                                                                                                 final int depth,
                                                                                                                 final StringBuilder sutCreation) {
            // data preparations
            final String indt = indent(depth);
            final ModusOperandi modusOperandi = this.modusOperandi(type);
            final String optionalModifiers = join(" ", this.optionalModifiers(depth));
            final String j8unitName = renderer.targetSimpleNameOf(type);
            final String j8unitGenerics = diamond(renderer.listOfTypeParameterDefinitionsOf(type));
            final String testClassInterfaceType = complementary.targetCanonicalNameOf(type);
            final String testClassInterfaceGenerics = diamond(renderer.originCanonicalNameOf(type, renderer::listOfTypeParameterNamesOf)
                                                              + ofEmptyable(csv(renderer.listOfTypeParameterNamesOf(type))).prepend(", ").orEmpty());
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation: JavaDoc
            out.append(this.javadoc(type, renderer, complementary, depth));
            // content creation: @SuppressWarnings(...)
            out.append(modusOperandi.renderEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), this::modusOperandi), depth, renderer));
            // content creation: @RunWith(J8Unit4.class)
            out.append(format("%s@%s(%s)%n", indt, renderer.originCanonicalNameOf(RunWith.class), renderer.originCanonicalClassOf(J8Parameterized.class)));
            out.append(format("%s@%s(%s)%n", indt, renderer.originCanonicalNameOf(UseParametersRunnerFactory.class),
                              renderer.originCanonicalClassOf(J8BlockJUnit4ClassRunnerWithParametersFactory.class)));
            // content creation: J8Unit Test Interface Declaration
            out.append(format("%spublic %s class %s%s%n", indt, optionalModifiers, j8unitName, j8unitGenerics));
            out.append(format("%simplements %s%s%n", indt, testClassInterfaceType, testClassInterfaceGenerics));
            out.append(format("%s{%n", indt));
            out.append(format("%n"));
            // content creation: Begin Marker
            out.append(format("%s%s// %s%n", indt, indent(), this.marker(BEGIN, modusOperandi, type)));
            out.append(format("%n"));
            // content creation: Custom Body Content
            // out.append(modusOperandi.customTestInterfaceBody(depth + 1));
            // content creation: SUT Creation
            out.append(sutCreation);
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
            return out;
        }

        private final StringBuilder sutForJ8UnitTest(final Class<?> type, final int depth, final OriginRenderer renderer) {
            // data preparations
            final String indt = indent(depth);
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation: Current JUnit SUT
            out.append(format("%s@%s(0)%n", indt, renderer.originCanonicalNameOf(Parameter.class)));
            out.append(format("%spublic %s sut;%n", indt, renderer.originCanonicalNameOf(type, renderer::listOfTypeParameterNamesOf)));
            out.append(format("%n"));
            // content creation: J8Unit SUT Factory
            out.append(format("%s@%s%n", indt, renderer.originCanonicalNameOf(Override.class)));
            out.append(format("%spublic %s %s() {%n", indt, renderer.originCanonicalNameOf(type, renderer::listOfTypeParameterNamesOf), SUT_FACTORY));
            out.append(format("%s%sreturn this.sut;%n", indt, indent()));
            out.append(format("%s}%n", indt));
            out.append(format("%n"));
            // finalize content
            return out;
        }

        private final StringBuilder enumSUTCreation(final Class<? extends Enum<?>> type, final int depth, final OriginRenderer renderer) {
            // data preparations
            final String indt = indent(depth);
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation: JUnit Test Data Iteration
            out.append(format("%s@%s(name = \"{index}: {0}\")%n", indt, renderer.originCanonicalNameOf(Parameters.class)));
            out.append(format("%spublic static %s<? extends %s> sutData() {%n", indt, renderer.originCanonicalNameOf(Iterable.class),
                              renderer.originCanonicalNameOf(type, renderer::listOfTypeParameterWildcardsOf)));
            out.append(format("%s%sreturn %s(%s);%n", indt, indent(), renderer.originCanonicalNameOf(TestParametersUtil.class, TEST_PARAMETERS_OF_ENUM_CLASS),
                              renderer.originCanonicalClassOf(type)));
            out.append(format("%s}%n", indt));
            out.append(format("%n"));
            // content creation: SUT provision
            out.append(this.sutForJ8UnitTest(type, depth, renderer));
            // finalize content
            return out;
        }

        private final StringBuilder fieldsSUTCreation(final Class<?> type, final Set<? extends Field> instances, final int depth,
                                                      final OriginRenderer renderer) {
            // data preparations
            final String indt = indent(depth);
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation: JUnit Test Data Iteration
            out.append(format("%s@%s(name = \"{index}: {0}\")%n", indt, renderer.originCanonicalNameOf(Parameters.class)));
            out.append(format("%spublic static %s<? extends %s> sutData() {%n", indt, renderer.originCanonicalNameOf(Iterable.class),
                              renderer.originCanonicalNameOf(type, renderer::listOfTypeParameterWildcardsOf)));
            final String data = instances.stream() //
                                         .map(f -> renderer.originCanonicalNameOf(type) + "." + f.getName()) //
                                         .collect(joining(format(", //%n%s%s", indt, indent(1 + 6))));
            out.append(format("%s%sreturn %s(%s);%n", indt, indent(), renderer.originCanonicalNameOf(TestParametersUtil.class, TEST_PARAMETERS_OF), data));
            out.append(format("%s}%n", indt));
            out.append(format("%n"));
            // content creation: SUT provision
            out.append(this.sutForJ8UnitTest(type, depth, renderer));
            // finalize content
            return out;
        }

        private final StringBuilder failingSUTCreation(final Class<?> type, final String message, final int depth, final OriginRenderer renderer) {
            // data preparations
            final String indt = indent(depth);
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation: J8Unit SUT Factory
            out.append(format("%s@%s%n", indt, renderer.originCanonicalNameOf(Override.class)));
            out.append(format("%spublic %s %s() {%n", indt, renderer.originCanonicalNameOf(type, renderer::listOfTypeParameterNamesOf), SUT_FACTORY));
            out.append(format("%s%sthrow new %s(\"%s\");%n", indt, indent(), renderer.originCanonicalNameOf(AssumptionViolatedException.class), message));
            out.append(format("%s}%n", indt));
            out.append(format("%n"));
            // finalize content
            return out;
        }

        private final <Renderer extends OriginRenderer & TargetRenderer> StringBuilder asFactoryBasedJ8UnitTest(final Class<?> type,
                                                                                                                final GeneratorUseControler control,
                                                                                                                final Renderer renderer,
                                                                                                                final TargetRenderer complementary,
                                                                                                                final int depth,
                                                                                                                final StringBuilder sutCreation) {
            // data preparations
            final String indt = indent(depth);
            final ModusOperandi modusOperandi = this.modusOperandi(type);
            final String optionalModifiers = join(" ", this.optionalModifiers(depth));
            final String j8unitName = renderer.targetSimpleNameOf(type);
            final String j8unitGenerics = diamond(renderer.listOfTypeParameterDefinitionsOf(type));
            final String testClassInterfaceType = complementary.targetCanonicalNameOf(type);
            final String testClassInterfaceGenerics = diamond(renderer.originCanonicalNameOf(type, renderer::listOfTypeParameterNamesOf)
                                                              + ofEmptyable(csv(renderer.listOfTypeParameterNamesOf(type))).prepend(", ").orEmpty());
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation: @SuppressWarnings(...)
            out.append(modusOperandi.renderEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), this::modusOperandi), depth, renderer));
            // content creation: @RunWith(J8Parameterized.class)
            out.append(format("%s@%s(%s)%n", indt, renderer.originCanonicalNameOf(RunWith.class), renderer.originCanonicalClassOf(J8Parameterized.class)));
            // content creation: @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
            out.append(format("%s@%s(%s)%n", indt, renderer.originCanonicalNameOf(UseParametersRunnerFactory.class),
                              renderer.originCanonicalClassOf(J8BlockJUnit4ClassRunnerWithParametersFactory.class)));
            // content creation: J8Unit Test Interface Declaration
            out.append(format("%spublic %s class %s%s%n", indt, optionalModifiers, j8unitName, j8unitGenerics));
            out.append(format("%simplements %s, %s%s%n", indt, modusOperandi.getTestClassBaseTypeDefinition(renderer, FactoryBasedJ8UnitTest.class, type),
                              testClassInterfaceType, testClassInterfaceGenerics));
            out.append(format("%s{%n", indt));
            out.append(format("%n"));
            // content creation: Begin Marker
            out.append(format("%s%s// %s%n", indt, indent(), this.marker(BEGIN, modusOperandi, type)));
            out.append(format("%n"));
            // content creation: Custom Body Content
            out.append(modusOperandi.specificTestInterfaceBody(type, depth + 1, renderer));
            // content creation: Test Data Creation
            out.append(sutCreation);
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
            return out;
        }

        private final StringBuilder sutForFactoryBasedJ8UnitTest(final Class<?> type, final int depth, final OriginRenderer renderer) {
            // data preparations
            final String indt = indent(depth);
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation: Current JUnit SUT
            out.append(format("%s@%s(0)%n", indt, renderer.originCanonicalNameOf(Parameter.class)));
            out.append(format("%spublic %s<%s> sutFactory;%n", indt, renderer.originCanonicalNameOf(Callable.class),
                              renderer.originCanonicalNameOf(type, renderer::listOfTypeParameterNamesOf)));
            out.append(format("%n"));
            // content creation: J8Unit SUT Factory
            out.append(format("%s@%s%n", indt, renderer.originCanonicalNameOf(Override.class)));
            out.append(format("%spublic %s<%s> %s() {%n", indt, renderer.originCanonicalNameOf(Callable.class),
                              renderer.originCanonicalNameOf(type, renderer::listOfTypeParameterNamesOf), SUT_FACTORY_FACTORY));
            out.append(format("%s%sreturn this.sutFactory;%n", indt, indent()));
            out.append(format("%s}%n", indt));
            out.append(format("%n"));
            // finalize content
            return out;
        }

        private final StringBuilder constructorSUTFactoryCreation(final Class<?> type, final int depth, final OriginRenderer renderer) {
            // data preparations
            final String indt = indent(depth);
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation: JUnit Test Data Iteration
            out.append(format("%s@%s(name = \"{index}: {0}\")%n", indt, renderer.originCanonicalNameOf(Parameters.class)));
            out.append(format("%spublic static %s<? extends %s<%s>> sutData() {%n", indt, renderer.originCanonicalNameOf(Iterable.class),
                              renderer.originCanonicalNameOf(Callable.class), renderer.originCanonicalNameOf(type, renderer::listOfTypeParameterWildcardsOf)));
            out.append(format("%s%sreturn %s(%s::new);%n", indt, indent(), renderer.originCanonicalNameOf(TestParametersUtil.class, TEST_PARAMETERS_OF),
                              renderer.originCanonicalNameOf(type)));
            out.append(format("%s}%n", indt));
            out.append(format("%n"));
            // content creation: SUT provision
            out.append(this.sutForFactoryBasedJ8UnitTest(type, depth, renderer));
            // finalize content
            return out;
        }

    },

    TYPE_TEST_EXECUTION(CLASS) {

        private final StringBuilder javadoc(final Class<?> type, final OriginRenderer renderer, final TargetRenderer complementary, final int depth) {
            // data preparations
            final String indt = indent(depth);
            final String originTypeUnderTest = renderer.originCanonicalNameOf(type);
            final String j8unitTestInterface = complementary.targetJavadocNameOf(type);
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation
            out.append(format("%s/**%n", indt));
            out.append(format("%s * Specific JUnit test class to proof the type relevant aspects of type {@link %s}%n", indt, originTypeUnderTest));
            out.append(format("%s * (by simply reusing the J8Unit test interface {@link %s}).%n", indt, j8unitTestInterface));
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
            final String j8unitBlueprintStatement = complementary.targetCanonicalNameOf(type) + diamond(renderer.originCanonicalNameOf(type));
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation: JavaDoc
            out.append(this.javadoc(type, renderer, complementary, depth));
            // content creation: @SuppressWarnings(...)
            out.append(modusOperandi.renderEffectiveWarnings(replaceAll(classHierarchy(type.getEnclosingClass()), this::modusOperandi), depth, renderer));
            // content creation: @RunWith(J8Unit4.class)
            out.append(format("%s@%s(%s)%n", indt, renderer.originCanonicalNameOf(RunWith.class), renderer.originCanonicalClassOf(J8Unit4.class)));
            // content creation: J8Unit Test Class Declaration
            out.append(format("%spublic %s class %s%n", indt, optionalModifiers, j8unitName));
            out.append(format("%simplements %s {%n", indt, j8unitBlueprintStatement));
            out.append(format("%n"));
            // content creation: Begin Marker
            out.append(format("%s%s// %s%n", indt, indent(), this.marker(BEGIN, modusOperandi, type)));
            out.append(format("%n"));
            out.append(this.generateSUTFactoryMethod(type, renderer, depth + 1));
            out.append(format("%n"));
            // content creation: All Constructors Under Test
            for (final Constructor<?> constructor : this.exploreConstructorsUnderTest(type, control)) {
                out.append(INSTANCE_TESTS.testMethodJavadoc(constructor, renderer, depth + 1));
                out.append(this.testMethodContent(constructor, renderer, depth + 1));
                out.append(format("%n"));
            }
            // content creation: All Methods Under Test
            for (final Method method : this.exploreMethodsUnderTest(type, control)) {
                out.append(INSTANCE_TESTS.testMethodJavadoc(method, renderer, depth + 1));
                out.append(this.testMethodContent(method, renderer, depth + 1));
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

        private final StringBuilder generateSUTFactoryMethod(final Class<?> type, final OriginRenderer renderer, final int depth) {
            // data preparations
            final String indt = indent(depth);
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation
            out.append(format("%s@%s%n", indt, renderer.originCanonicalNameOf(Override.class)));
            out.append(format("%spublic %s<%s> %s() {%n", indt, renderer.originCanonicalNameOf(Class.class), renderer.originCanonicalNameOf(type),
                              SUT_FACTORY));
            out.append(format("%s%sreturn %s;%n", indt, indent(), renderer.originCanonicalClassOf(type)));
            out.append(format("%s}%n", indt));
            // finish
            return out;
        }

        private final Set<? extends Constructor<?>> exploreConstructorsUnderTest(final Class<?> type, final GeneratorUseControler control) {
            // query all declared, relevant constructors
            final Set<Constructor<?>> constructors = Arrays.stream(type.getDeclaredConstructors()) //
                                                           // must be usable
                                                           .filter(control::useConstructor) //
                                                           // must match this access-scope
                                                           .filter(this.modusOperandi(type)::matches) //
                                                           // must be non-synthetic
                                                           .peek(m -> {
                                                               if (m.isSynthetic()) {
                                                                   this.logger().warning(SKIP_SYNTHETIC_METHOD, type, m);
                                                               }
                                                           }) //
                                                           .filter(m -> !m.isSynthetic()) //
                                                           .collect(toSet());
            // finish
            this.logger().info(METHODS_UNDER_TEST, type, this.modusOperandi(type), constructors);
            return constructors;
        }

        private final <Renderer extends OriginRenderer & TargetRenderer> StringBuilder testMethodContent(final Constructor<?> constructor,
                                                                                                         final Renderer renderer, final int depth) {
            // data preparations
            final String indt = indent(depth);
            final String j8unitName = renderer.targetSimpleNameOf(constructor);
            final String typeName = renderer.originCanonicalNameOf(constructor.getDeclaringClass());
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation
            if (isAbstract(constructor.getDeclaringClass().getModifiers())) {
                final String ABSTRACT_MESSAGE = "Cannot construct an abstract class!";
                out.append(format("%s@%s(\"%s\")%n", indt, renderer.originCanonicalNameOf(Ignore.class), ABSTRACT_MESSAGE));
                out.append(format("%s@%s%n", indt, renderer.originCanonicalNameOf(Test.class)));
                out.append(format("%s@%s(%s)%n", indt, renderer.originCanonicalNameOf(Category.class), renderer.originCanonicalClassOf(Draft.class)));
                out.append(format("%spublic void %s() throws %s {%n", indt, j8unitName, renderer.originCanonicalNameOf(Exception.class)));
                out.append(format("%s%s%s(\"%s\");%n", indt, indent(), renderer.originCanonicalNameOf(Assert.class, "fail"), ABSTRACT_MESSAGE));
                out.append(format("%s}%n", indt));
            } else {
                out.append(format("%s@%s(\"%s\")%n", indt, renderer.originCanonicalNameOf(Ignore.class), IGNORE_MESSAGE));
                out.append(format("%s@%s%n", indt, renderer.originCanonicalNameOf(Test.class)));
                out.append(format("%s@%s(%s)%n", indt, renderer.originCanonicalNameOf(Category.class), renderer.originCanonicalClassOf(Draft.class)));
                out.append(format("%spublic void %s() throws %s {%n", indt, j8unitName, renderer.originCanonicalNameOf(Exception.class)));
                out.append(format("%s%s// create new instance%n", indt, indent()));
                out.append(format("%s%s@%s(\"unused\")%n", indt, indent(), renderer.originCanonicalNameOf(SuppressWarnings.class)));
                if (constructor.getParameterCount() == 0) {
                    out.append(format("%s%s%s sut = new %s();", indt, indent(), typeName, typeName));
                } else {
                    out.append(format("%s%s%s sut = null; // = new %s;%n", indt, indent(), typeName, renderer.javadocNameOf(constructor).split("#")[1]));
                }
                out.append(format("%s}%n", indt));
            }
            // finish
            return out;
        }

        private final Set<? extends Method> exploreMethodsUnderTest(final Class<?> type, final GeneratorUseControler control) {
            // query all declared, relevant methods
            final Set<Method> methods = Arrays.stream(type.getDeclaredMethods()) //
                                              .filter(control::useMethod) //
                                              .filter(this.modusOperandi(type)::matches) //
                                              .peek(m -> {
                                                  if (m.isSynthetic()) {
                                                      this.logger().warning(SKIP_SYNTHETIC_METHOD, type, m);
                                                  }
                                              }) //
                                              .filter(m -> !m.isSynthetic()) //
                                              .collect(toSet());
            this.logger().info(METHODS_UNDER_TEST, type, this.modusOperandi(type), methods);
            return methods;
        }

        private final <Renderer extends OriginRenderer & TargetRenderer> StringBuilder testMethodContent(final Method method, final Renderer renderer,
                                                                                                         final int depth) {
            // data preparations
            final String indt = indent(depth);
            final String j8unitName = renderer.targetSimpleNameOf(method);
            // content storage
            final StringBuilder out = new StringBuilder();
            // content creation
            out.append(format("%s@%s(\"%s\")%n", indt, renderer.originCanonicalNameOf(Ignore.class), IGNORE_MESSAGE));
            out.append(format("%s@%s%n", indt, renderer.originCanonicalNameOf(Test.class)));
            out.append(format("%s@%s(%s)%n", indt, renderer.originCanonicalNameOf(Category.class), renderer.originCanonicalClassOf(Draft.class)));
            out.append(format("%spublic void %s() throws %s {%n", indt, j8unitName, renderer.originCanonicalNameOf(Exception.class)));
            out.append(format("%s%s// write some test for {@link %s}%n", indt, indent(), renderer.javadocNameOf(method)));
            out.append(format("%s}%n", indt));
            // finish
            return out;
        }

    };

    private final AccessScope accessScope;

    protected final ModusOperandi modusOperandi(final Class<?> type) {
        return ModusOperandi.valueOf(this.accessScope, type);
    }

    private J8UnitRepositoryTestGenerators(final AccessScope accessScope) {
        this.accessScope = accessScope;
    }

    @Override
    public final String toString() {
        return format("%s::%s", this.getDeclaringClass().getName(), this.name());
    }

}
