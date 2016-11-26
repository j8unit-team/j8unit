package org.j8unit.generator.util;

import static java.util.Arrays.asList;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Stream.concat;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * <p>
 * Utility enum (aka. helper class) providing fancy {@link Set} stuff.
 * </p>
 */
public enum Sets {
    ;

    /**
     * Helper method to create a set using the given values. (Remember, a set does not contain equal elements twice.
     * Thus, the size of the returned set may be smaller than the number of given values.)
     *
     * @param values
     *            the set's values
     * @return the set (uniquely) containing the given values
     */
    @SafeVarargs
    public static final <T> Set<T> asSet(final T... values) {
        return stream(values).collect(toSet());
    }

    /**
     * Merges two given sets into a new one.
     *
     * @param x
     *            the first set to merge
     * @param y
     *            the second set to merge
     * @param <T>
     *            the type of the sets' elements
     * @return the merged set
     */
    public static final <T> Set<T> merge(final Set<? extends T> x, final Set<? extends T> y) {
        return concat(x.stream(), y.stream()).collect(toSet());
    }

    /**
     * Helper method to join some existing warnings with further warnings.
     *
     * @param origin
     *            the existing warnings
     * @param additionals
     *            the further warnings
     * @return a joined set of the given warnings
     */
    @SafeVarargs
    public static final <T> Set<T> join(final Set<? extends T> origin, final T... additionals) {
        return concat(origin.stream(), Stream.of(additionals)).collect(toSet());
    }

    /**
     * Helper method to join some existing warnings with further warnings.
     *
     * @param origin
     *            the existing warnings
     * @param additionals
     *            the further warnings
     * @return a joined set of the given warnings
     */
    public static final <T> Set<T> join(final Set<? extends T> origin, final Iterable<? extends T> additionals) {
        return concat(origin.stream(), StreamSupport.stream(additionals.spliterator(), false)).collect(toSet());
    }

    /**
     * Helper method to join some existing warnings with further warnings.
     *
     * @param origin
     *            the existing warnings
     * @param additionals
     *            the further warnings
     * @return a joined set of the given warnings
     */
    public static final <T> Set<T> join(final Set<? extends T> origin, final Collection<? extends T> additionals) {
        return concat(origin.stream(), additionals.stream()).collect(toSet());
    }

    /**
     * TODO: JavDoc
     */
    @SafeVarargs
    public static final <T> Set<T> reduce(final Set<? extends T> origin, final T... subtractionals) {
        return reduce(origin, asList(subtractionals));
    }

    /**
     * TODO: JavDoc
     */
    public static final <T> Set<T> reduce(final Set<? extends T> origin, final Collection<? extends T> subtractionals) {
        return origin.stream().filter(e -> !subtractionals.contains(e)).collect(toSet());
    }

}
