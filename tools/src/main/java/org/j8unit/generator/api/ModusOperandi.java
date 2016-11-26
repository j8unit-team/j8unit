package org.j8unit.generator.api;

import static java.lang.String.format;
import static java.util.Collections.singletonList;
import static java.util.Objects.nonNull;
import static java.util.Objects.requireNonNull;
import static org.j8unit.generator.GeneratorTokens.SUT_FACTORY;
import static org.j8unit.generator.GeneratorTokens.indent;
import static org.j8unit.generator.analysis.AccessScope.CLASS;
import static org.j8unit.generator.analysis.AccessScope.INSTANCE;
import static org.j8unit.generator.analysis.TypeNatures.GENERIC;
import static org.j8unit.generator.analysis.TypeNatures.NON_GENERIC;
import static org.j8unit.generator.analysis.TypeNatures.RAW;
import static org.j8unit.generator.api.GlobalGeneratorConstants.SUT;
import static org.j8unit.generator.util.BiFunctions.curryFirst;
import static org.j8unit.generator.util.Java.diamond;
import static org.j8unit.generator.util.Lists.convert;
import static org.j8unit.generator.util.Sets.join;
import static org.j8unit.generator.util.Sets.reduce;
import static org.j8unit.generator.util.TypeAnalysis.calculateNearestMatchingParents;
import static org.j8unit.generator.util.TypeAnalysis.redundantTypes;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.J8UnitTest;
import org.j8unit.generator.analysis.AccessScope;
import org.j8unit.generator.analysis.TypeNatures;
import org.j8unit.generator.api.control.GeneratorUseControler;
import org.j8unit.generator.api.render.OriginRenderer;
import org.j8unit.generator.api.render.TargetRenderer;
import org.j8unit.generator.util.Mismatcher;

/**
 * <table border="1">
 * <tr>
 * <th colspan="2" rowspan="2"></th>
 * <th colspan="3">{@link TypeNatures}</th>
 * </tr>
 * <tr>
 * <th>{@link TypeNatures#NON_GENERIC}</th>
 * <th>{@link TypeNatures#GENERIC}</th>
 * <th>{@link TypeNatures#RAW}</th>
 * </tr>
 * <tr>
 * <th rowspan="2">{@link AccessScope}</th>
 * <th>{@link AccessScope#INSTANCE}</th>
 * <td>{@link #NON_GENERIC_INSTANCE}</td>
 * <td>{@link #GENERIC_INSTANCE}</td>
 * <td>{@link #RAW_INSTANCE}</td>
 * </tr>
 * <tr>
 * <th>{@link AccessScope#CLASS}</th>
 * <td>{@link #NON_GENERIC_CLASS}</td>
 * <td>{@link #GENERIC_CLASS}</td>
 * <td>{@link #RAW_CLASS}</td>
 * </tr>
 * </table>
 */
public enum ModusOperandi
implements CustomWarnings, CustomContent, ExtendedTestInterfaceStatements, BasicTestClassStatements, Mismatcher<Member> {

    /**
     * This is the {@linkplain J8UnitCodeGenerator generator}'s modus operandi when
     * {@linkplain J8UnitCodeGenerator#generateSourceFile(Class, GeneratorUseControler, OriginRenderer, TargetRenderer)
     * generating test-code} considering <em>{@linkplain AccessScope#INSTANCE instance} based members</em> of
     * <em>{@linkplain TypeNatures#NON_GENERIC non-generic (pure)} envelope types.</em>.
     */
    NON_GENERIC_INSTANCE(NON_GENERIC, INSTANCE),

    /**
     * This is the {@linkplain J8UnitCodeGenerator generator}'s modus operandi when
     * {@linkplain J8UnitCodeGenerator#generateSourceFile(Class, GeneratorUseControler, OriginRenderer, TargetRenderer)
     * generating test-code} considering <em>{@linkplain AccessScope#INSTANCE instance} based members</em> of
     * <em>{@linkplain TypeNatures#GENERIC generic} envelope types.</em>.
     */
    GENERIC_INSTANCE(GENERIC, INSTANCE),

    /**
     * This is the {@linkplain J8UnitCodeGenerator generator}'s modus operandi when
     * {@linkplain J8UnitCodeGenerator#generateSourceFile(Class, GeneratorUseControler, OriginRenderer, TargetRenderer)
     * generating test-code} considering <em>{@linkplain AccessScope#INSTANCE instance} based members</em> of
     * <em>{@linkplain TypeNatures#RAW raw} envelope types.</em>.
     */
    RAW_INSTANCE(RAW, INSTANCE) {

        @Override
        public final String customTestInterfaceBody(final int depth, final OriginRenderer renderer) {
            requireNonNull(renderer);
            final String indent = indent(depth);
            final StringBuilder out = new StringBuilder();
            out.append(format("%s// The definition of the %s factory method must be repeated%n", indent, SUT));
            out.append(format("%s// because of the \"rawtypes\" nature of this j8unit test interface%n", indent));
            out.append(format("%s// (caused by the \"rawtypes\" nature of the type-under-test).%n", indent));
            out.append(format("%s@%s%n", indent, renderer.originCanonicalNameOf(Override.class)));
            out.append(format("%spublic abstract %s %s();%n", indent, SUT, SUT_FACTORY));
            out.append(format("%n"));
            return out.toString();
        }

        // TODO: Is used in conjunction with {@link FactoryBasedJ8UnitTest}. Thus, it cannot be used generalised. Do we
        // have a problem?
        @Override
        public final String specificTestInterfaceBody(final Class<?> type, final int depth, final OriginRenderer renderer) {
            requireNonNull(type);
            requireNonNull(renderer);
            final String indent = indent(depth);
            final StringBuilder out = new StringBuilder();
            final String string = renderer.originCanonicalNameOf(type, renderer::listOfTypeParameterNamesOf);
            out.append(format("%s// The definition of the %s factory method must be repeated%n", indent, SUT));
            out.append(format("%s// because of the \"rawtypes\" nature of the implemented j8unit%n", indent));
            out.append(format("%s// test interface (caused by the \"rawtypes\" nature of the type-under-test).%n", indent));
            out.append(format("%s@%s%n", indent, renderer.originCanonicalNameOf(Override.class)));
            out.append(format("%spublic %s %s() {%n", indent, string, SUT_FACTORY));
            out.append(format("%s%sfinal %s sut = %s.super.%s();%n", indent, indent(), renderer.originCanonicalNameOf(Object.class),
                              renderer.originCanonicalNameOf(FactoryBasedJ8UnitTest.class), SUT_FACTORY));
            out.append(format("%s%sassert sut != null;%n", indent, indent()));
            out.append(format("%s%sassert sut instanceof %s;%n", indent, indent(), string));
            out.append(format("%s%sreturn (%s) sut;%n", indent, indent(), string));
            out.append(format("%s}%n", indent));
            out.append(format("%n"));
            return out.toString();
        }

        @Override
        public final <Renderer extends OriginRenderer & TargetRenderer> String getTestInterfaceSuperTypeDefinition(final Renderer renderer,
                                                                                                                   final Entry<? extends Class<?>, ? extends Type> superType) {
            requireNonNull(renderer);
            requireNonNull(superType);
            return renderer.targetCanonicalNameOf(superType.getKey());
        }

        @Override
        public final String getTestClassBaseTypeDefinition(final OriginRenderer renderer, final @SuppressWarnings("rawtypes") Class<? extends J8UnitTest> base,
                                                           final Class<?> type) {
            requireNonNull(renderer);
            requireNonNull(base);
            requireNonNull(type);
            return renderer.originCanonicalNameOf(base);
        }

    },

    /**
     * This is the {@linkplain J8UnitCodeGenerator generator}'s modus operandi when
     * {@linkplain J8UnitCodeGenerator#generateSourceFile(Class, GeneratorUseControler, OriginRenderer, TargetRenderer)
     * generating test-code} considering <em>{@linkplain AccessScope#CLASS class} based members (incl.
     * {@link Constructor constructors})</em> of <em>{@linkplain TypeNatures#NON_GENERIC non-generic (pure)} envelope
     * types.</em>.
     */
    NON_GENERIC_CLASS(NON_GENERIC, CLASS),

    /**
     * This is the {@linkplain J8UnitCodeGenerator generator}'s modus operandi when
     * {@linkplain J8UnitCodeGenerator#generateSourceFile(Class, GeneratorUseControler, OriginRenderer, TargetRenderer)
     * generating test-code} considering <em>{@linkplain AccessScope#CLASS class} based members (incl.
     * {@link Constructor constructors})</em> of <em>{@linkplain TypeNatures#GENERIC generic} envelope types.</em>.
     */
    GENERIC_CLASS(GENERIC, CLASS) {

        @Override
        public final Set<String> getWarnings() {
            return join(super.getWarnings(), RAW.getWarnings());
        }

    },

    /**
     * This is the {@linkplain J8UnitCodeGenerator generator}'s modus operandi when
     * {@linkplain J8UnitCodeGenerator#generateSourceFile(Class, GeneratorUseControler, OriginRenderer, TargetRenderer)
     * generating test-code} considering <em>{@linkplain AccessScope#CLASS class} based members (incl.
     * {@link Constructor constructors})</em> of <em>{@linkplain TypeNatures#RAW raw} envelope types.</em>.
     */
    RAW_CLASS(RAW, CLASS) {

        @Override
        public final Set<String> getWarnings() {
            return reduce(super.getWarnings(), RAW.getWarnings());
        }

    };

    private final TypeNatures typeNatures;

    public final TypeNatures getTypeNatures() {
        return this.typeNatures;
    }

    private final AccessScope accessScope;

    public final AccessScope getAccessScope() {
        return this.accessScope;
    }

    @Override
    public boolean matches(final Member member) {
        return this.accessScope.matches(member);
    }

    private ModusOperandi(final TypeNatures typeNatures, final AccessScope accessScope) {
        assert nonNull(typeNatures);
        assert nonNull(accessScope);
        this.typeNatures = typeNatures;
        this.accessScope = accessScope;
    }

    public static final ModusOperandi valueOf(final AccessScope accessScope, final Class<?> clazz) {
        requireNonNull(accessScope);
        requireNonNull(clazz);
        final CustomWarnings typeArgumentness = TypeNatures.natureOf(clazz);
        assert nonNull(typeArgumentness);
        final Optional<ModusOperandi> modusOperandi = Arrays.stream(ModusOperandi.values()) //
                                                            .filter(mo -> mo.typeNatures.equals(typeArgumentness)) //
                                                            .filter(mo -> mo.accessScope.equals(accessScope)) //
                                                            .findFirst();
        assert modusOperandi.isPresent();
        return modusOperandi.get();
    }

    @Override
    public Set<String> getWarnings() {
        return this.typeNatures.getWarnings();
    }

    @Override
    public String getTestInterfaceGenericStatement(final OriginRenderer renderer, final Class<?> type) {
        requireNonNull(renderer);
        requireNonNull(type);
        return this.accessScope.getTestInterfaceGenericStatement(renderer, type);
    }

    @Override
    public <Renderer extends OriginRenderer & TargetRenderer> String getTestInterfaceSuperTypeDefinition(final Renderer renderer,
                                                                                                         final Entry<? extends Class<?>, ? extends Type> superType) {
        requireNonNull(renderer);
        requireNonNull(superType);
        return this.accessScope.getTestInterfaceSuperTypeDefinition(renderer, superType);
    }

    @Override
    public final <Renderer extends OriginRenderer & TargetRenderer> List<String> getTestInterfaceSuperTypesDefinitions(final Class<?> type,
                                                                                                                       final GeneratorUseControler control,
                                                                                                                       final Renderer renderer) {
        requireNonNull(type);
        requireNonNull(control);
        requireNonNull(renderer);
        final Map<Class<?>, ? extends Type> parents = calculateNearestMatchingParents(type, control::useType);
        // TODO: Skip removing redundant types? In result (that is the current situation), the j8unit tests are smaller
        // -- but they do not represent the complete extends/implements declaration of the type-under-test.
        parents.keySet().removeAll(redundantTypes(parents.keySet()));
        if (parents.isEmpty()) {
            return singletonList(renderer.originCanonicalNameOf(this.accessScope.getBaseJ8UnitInterfaceType()) + diamond(SUT));
        } else {
            return convert(parents.entrySet(), curryFirst(this::getTestInterfaceSuperTypeDefinition, renderer));
        }
    }

    @Override
    public String getTestClassBaseTypeDefinition(final OriginRenderer renderer, final @SuppressWarnings("rawtypes") Class<? extends J8UnitTest> base,
                                                 final Class<?> type) {
        requireNonNull(base);
        requireNonNull(renderer);
        requireNonNull(type);
        return this.accessScope.getTestClassBaseTypeDefinition(renderer, base, type);
    }

}
