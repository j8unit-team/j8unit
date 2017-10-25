package org.j8unit.generator.util;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Stream.concat;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * <p>
 * Utility enum (aka. helper class) providing fancy {@link List} stuff.
 * </p>
 */
public enum Lists {
    ;

    /**
     * Joins two given lists.
     *
     * @param x
     *            the first list
     * @param y
     *            the second list
     * @return the joined list
     */
    public static final <T> List<T> join(final List<T> x, final List<T> y) {
        return concat(x.stream(), y.stream()).collect(toList());
    }

    /**
     * Prepends an element to the given list.
     *
     * @param element
     *            the element to prepend
     * @param list
     *            the list
     * @return the joined list
     */
    public static final <T> List<T> join(final T element, final List<T> list) {
        return concat(Stream.of(element), list.stream()).collect(toList());
    }

    /**
     * Prepends an element to the given further elements.
     *
     * @param element
     *            the element to prepend
     * @param elements
     *            the further elements
     * @return the joined list
     */
    @SafeVarargs
    public static final <T> List<T> join(final T element, final T... elements) {
        return concat(Stream.of(element), stream(elements)).collect(toList());
    }

    /**
     * Similar to {@link List#replaceAll(java.util.function.UnaryOperator)} but with type conversion.
     *
     * @param origin
     *            the origin elements
     * @param mapper
     *            a non-interfering, stateless function to apply to each element
     * @return the resulting list
     */
    public static final <T, R> List<R> convert(final Collection<T> origin, final Function<? super T, ? extends R> mapper) {
        return origin.stream().map(mapper).collect(toList());
    }

    /**
     * Similar to {@link #convert(Collection, Function)} but works with array-based elements.
     *
     * @param origin
     *            the origin elements
     * @param mapper
     *            a non-interfering, stateless function to apply to each element
     * @return the resulting list
     */
    public static final <T, R> List<R> convert(final T[] origin, final Function<? super T, ? extends R> mapper) {
        return stream(origin).map(mapper).collect(toList());
    }

}
