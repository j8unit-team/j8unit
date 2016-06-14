package org.j8unit.generator.util;

import static java.util.Objects.requireNonNull;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;

public enum Arrays {
    ;

    /**
     * <p>
     * Returns the base component type of any {@linkplain Class Java type} (that is, the base component type of any
     * multi-dimensional array type; resp. the type itself of any non-array type).
     * </p>
     *
     * <p>
     * In order to discover the base component type, this method recursively calls {@link Class#getComponentType()} as
     * often as the temporary current type is still an array. Finally, it returns the explored component type.
     * </p>
     *
     * <p>
     * If the input type is not an array, that type will be returned immediately. Thus, in opposite to
     * {@link Class#getComponentType()} this method does not return {@code null}.
     * </p>
     *
     * @param type
     *            some Java type to analyse
     * @return the base component type of the given Java type
     *
     * @see #arrayAnalysisOf(Class)
     */
    public static final Class<?> baseComponentTypeOf(final Class<?> type) {
        requireNonNull(type);
        return arrayAnalysisOf(type).getKey();
    }

    /**
     * <p>
     * Returns the array dimension of the given {@linkplain Class Java type}.
     *
     * If the given type is not an array type, {@code 0} will be returned.
     * </p>
     *
     * @param type
     *            some Java type to analyse
     * @return the array dimension of the given Java type
     *
     * @see #arrayAnalysisOf(Class)
     */
    public static final int arrayDimensionOf(final Class<?> type) {
        requireNonNull(type);
        return arrayAnalysisOf(type).getValue();
    }

    /**
     * <p>
     * Returns the base component type of any {@linkplain Class Java type} plus its array dimension.
     * </p>
     *
     * <p>
     * In order to discover the base component type, this method recursively calls {@link Class#getComponentType()} as
     * often as the temporary current type is still an array. Finally, it returns the explored component type.
     * </p>
     *
     * <p>
     * If the input type is not an array, that type and an array dimension of {@code 0} will be returned immediately.
     * </p>
     *
     * @param type
     *            some Java type to analyse
     * @return the base component type of the given Java type
     */
    public static final Entry<Class<?>, Integer> arrayAnalysisOf(Class<?> type) {
        requireNonNull(type);
        Class<?> base = type;
        int dimension = 0;
        for (type = type.getComponentType(); type != null; type = type.getComponentType()) {
            base = type;
            dimension++;
        }
        return new SimpleImmutableEntry<>(base, dimension);
    }

}
