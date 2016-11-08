package org.j8unit.generator.analysis;

import static java.util.Arrays.stream;
import static java.util.Collections.unmodifiableSet;
import static java.util.Objects.requireNonNull;
import static org.j8unit.generator.util.Sets.asSet;
import static org.j8unit.generator.util.TypeAnalysis.calculateNearestMatchingParents;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import org.j8unit.generator.api.CustomWarnings;
import org.j8unit.generator.util.Mismatcher;

/**
 * <p>
 * Enumeration of the nature of Java types; Actually, there are three.
 *
 * Java types can be {@linkplain #NON_GENERIC pure} (simple types without type arguments), they can be
 * {@linkplain #GENERIC generic} (types with type argument(s)), or they can be {@linkplain #RAW raw} (generic types but
 * without the according type argument(s)). (<em>Note, the RAW type nature is inherited by sub-types!</em>)
 * <p>
 *
 * <p>
 * This helper enumeration does provide further j8unit specific content:
 * </p>
 * <ul>
 * <li>{@link #getWarnings()}</li>
 * </ul>
 *
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/generics/types.html">The Java&trade; Tutorials: Generic
 *      Types</a>
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/generics/rawTypes.html">The Java&trade; Tutorials: Raw
 *      Types</a>
 */
public enum TypeNatures
implements Mismatcher<Class<?>>, CustomWarnings {

    /**
     * Enumeration constant representing non-generic (pure) types.
     */
    NON_GENERIC {

        @Override
        public boolean matches(final Class<?> type) {
            requireNonNull(type);
            return (type.getTypeParameters().length == 0) && RAW.mismatches(type);
        }

    },

    /**
     * Enumeration constant representing generic types that do have according type arguments.
     *
     * @see <a href="https://docs.oracle.com/javase/tutorial/java/generics/types.html">The Java&trade; Tutorials:
     *      Generic Types</a>
     */
    GENERIC {

        @Override
        public boolean matches(final Class<?> type) {
            requireNonNull(type);
            return (type.getTypeParameters().length != 0) && RAW.mismatches(type);
        }

    },

    /**
     * Enumeration constant representing raw types, i.&thinsp;e., generic classes or interfaces but without type
     * arguments.
     *
     * Note, any sub-type of a {@code RAW} type is considered to be {@code RAW} as well.
     *
     * @see <a href="https://docs.oracle.com/javase/tutorial/java/generics/rawTypes.html">The Java&trade; Tutorials: Raw
     *      Types</a>
     */
    RAW("rawtypes") {

        @Override
        public boolean matches(final Class<?> type) {
            requireNonNull(type);
            for (final Entry<Class<?>, ? extends Type> parent : calculateNearestMatchingParents(type, Objects::nonNull).entrySet()) {
                // Case A) parent type's parameters are not considered
                if ((parent.getKey().getTypeParameters().length != 0) && !(parent.getValue() instanceof ParameterizedType)) {
                    return true;
                }
                // Case B) RAW type nature is inherited
                if (this.matches(parent.getKey())) {
                    return true;
                }
            }
            return false;
        }

    };

    private final Set<String> warnings;

    private TypeNatures(final String... warnings) {
        this.warnings = unmodifiableSet(asSet(warnings));
    }

    @Override
    public Set<String> getWarnings() {
        return this.warnings;
    }

    /**
     * Returns the {@link TypeNatures} {@code enum} constant according to the query Java {@code type}.
     *
     * @param type
     *            the query Java type
     * @return the {@code TypeNatures} {@code enum} constant according to the query Java {@code type}
     */
    public static final TypeNatures natureOf(final Class<?> type) {
        requireNonNull(type);
        final Optional<TypeNatures> nature = stream(values()).filter(n -> n.matches(type)).findFirst();
        assert nature.isPresent() : "A class cannot have a type nature different to non-generic, generic, or raw!";
        return nature.get();
    }

}
