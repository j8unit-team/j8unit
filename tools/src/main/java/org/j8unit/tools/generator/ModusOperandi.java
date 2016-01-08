package org.j8unit.tools.generator;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import static org.j8unit.tools.generator.AccessScope.CLASS;
import static org.j8unit.tools.generator.AccessScope.INSTANCE;
import static org.j8unit.tools.generator.GeneratorTokens.NL;
import static org.j8unit.tools.generator.GeneratorTokens.SPACE;
import static org.j8unit.tools.generator.GeneratorTokens.indent;
import static org.j8unit.tools.generator.TypeArgumentness.GENERIC;
import static org.j8unit.tools.generator.TypeArgumentness.NON_GENERIC;
import static org.j8unit.tools.generator.TypeArgumentness.RAW;
import static org.j8unit.tools.util.NamingUtilities.createTypeParametersUsage;
import static org.j8unit.tools.util.NamingUtilities.simpleCanonicalNameOf;
import static org.j8unit.tools.util.OptionalString.ofEmptyable;
import static org.j8unit.tools.util.TypeAnalysis.calculateNearestParents;
import static org.j8unit.tools.util.Utilities.NOOP;
import static org.j8unit.tools.util.Utilities.implode;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import org.j8unit.tools.GeneratorSetup;

public enum ModusOperandi
    implements CustomContentSource {

        NON_GENERIC_INSTANCE(NON_GENERIC, INSTANCE) {

            @Override
            public Function<Entry<Class<?>, ? extends Type>, String> getTestClassSuperTypesMapper(final Class<?> clazz, final GeneratorSetup setup) {
                requireNonNull(clazz);
                requireNonNull(setup);
                return e -> setup.canonicalTestNameOf(e.getKey(), clazz) + "<SUT"
                            + ofEmptyable(createTypeParametersUsage(e.getValue())).prepend(", ").orElse("") + ">";
            }

        },

        GENERIC_INSTANCE(GENERIC, INSTANCE) {

            @Override
            public Function<Entry<Class<?>, ? extends Type>, String> getTestClassSuperTypesMapper(final Class<?> clazz, final GeneratorSetup setup) {
                requireNonNull(clazz);
                requireNonNull(setup);
                return NON_GENERIC_INSTANCE.getTestClassSuperTypesMapper(clazz, setup);
            }

        },

        RAW_INSTANCE(RAW, INSTANCE) {

            @Override
            public List<String> getWarnings() {
                return singletonList("rawtypes");
            }

            @Override
            public Function<Entry<Class<?>, ? extends Type>, String> getTestClassSuperTypesMapper(final Class<?> clazz, final GeneratorSetup setup) {
                requireNonNull(clazz);
                requireNonNull(setup);
                return e -> setup.canonicalTestNameOf(e.getKey(), clazz);
            }

            @Override
            public String customTestInterfaceBody(final int enclosingLevel) {
                final String indent = indent(enclosingLevel);
                final StringBuilder out = new StringBuilder();
                out.append(indent + "// The definition of the SUT factory method must be repeated" + NL);
                out.append(indent + "// because of the \"rawtypes\" nature of this J8Unit test interface" + NL);
                out.append(indent + "// (caused by the \"rawtypes\" nature of the class-under-test)." + NL);
                out.append(indent + "@" + simpleCanonicalNameOf(Override.class) + NL);
                out.append(indent + "public abstract SUT createNewSUT();" + NL);
                out.append(NL);
                return out.toString();
            }

        },

        NON_GENERIC_CLASS(NON_GENERIC, CLASS) {

            @Override
            public Function<Entry<Class<?>, ? extends Type>, String> getTestClassSuperTypesMapper(final Class<?> clazz, final GeneratorSetup setup) {
                requireNonNull(clazz);
                requireNonNull(setup);
                return e -> setup.canonicalTestNameOf(e.getKey(), clazz) + "<SUT>";
            }

        },

        GENERIC_CLASS(GENERIC, CLASS) {

            @Override
            public List<String> getWarnings() {
                return singletonList("rawtypes");
            }

            @Override
            public Function<Entry<Class<?>, ? extends Type>, String> getTestClassSuperTypesMapper(final Class<?> clazz, final GeneratorSetup setup) {
                return NON_GENERIC_CLASS.getTestClassSuperTypesMapper(clazz, setup);
            }

        },

        RAW_CLASS(RAW, CLASS) {

            @Override
            public List<String> getWarnings() {
                return GENERIC_CLASS.getWarnings();
            }

            @Override
            public Function<Entry<Class<?>, ? extends Type>, String> getTestClassSuperTypesMapper(final Class<?> clazz, final GeneratorSetup setup) {
                requireNonNull(clazz);
                requireNonNull(setup);
                return GENERIC_CLASS.getTestClassSuperTypesMapper(clazz, setup);
            }

        };

    private final AccessScope accessScope;

    private final TypeArgumentness typeArgumentness;

    private ModusOperandi(final TypeArgumentness typeArgumentness, final AccessScope accessScope) {
        this.typeArgumentness = requireNonNull(typeArgumentness);
        this.accessScope = requireNonNull(accessScope);
    }

    public static final ModusOperandi valueOf(final AccessScope accessScope, final Class<?> clazz) {
        requireNonNull(accessScope);
        requireNonNull(clazz);
        final TypeArgumentness typeArgumentness = TypeArgumentness.valueOf(clazz);
        final Optional<ModusOperandi> modusOperandi = Arrays.stream(ModusOperandi.values()) //
                                                            .filter(mo -> mo.accessScope.equals(accessScope)) //
                                                            .filter(mo -> mo.typeArgumentness.equals(typeArgumentness)) //
                                                            .findFirst();
        assert modusOperandi.isPresent();
        return modusOperandi.get();
    }

    public List<String> getWarnings() {
        return emptyList();
    }

    public abstract Function<Entry<Class<?>, ? extends Type>, String> getTestClassSuperTypesMapper(final Class<?> clazz, final GeneratorSetup setup);

    public List<String> getTestClassSuperTypes(final Class<?> clazz, final GeneratorSetup setup) {
        requireNonNull(clazz);
        requireNonNull(setup);
        final Map<Class<?>, ? extends Type> parents = calculateNearestParents(clazz, setup::useClass, NOOP);
        if (parents.isEmpty()) {
            return singletonList(simpleCanonicalNameOf(this.accessScope.getBaseJ8UnitBaseTestClass()) + "<SUT>");
        } else {
            final Function<Entry<Class<?>, ? extends Type>, String> mapper = this.getTestClassSuperTypesMapper(clazz, setup);
            return parents.entrySet().stream().map(mapper).collect(toList());
        }
    }

    public String getTestClassExtendStatement(final Class<?> clazz, final GeneratorSetup setup) {
        return this.getTestClassSuperTypes(clazz, setup).stream().collect(joining("," + NL + SPACE + SPACE));
    }

    @Override
    public String customTestInterfaceHead(final int enclosingLevel) {
        return implode(this.getWarnings(), "\"", "\"", ", ", indent(enclosingLevel) + "@" + simpleCanonicalNameOf(SuppressWarnings.class) + "(", ")" + NL);
    }

}
