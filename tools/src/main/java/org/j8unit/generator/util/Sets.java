package org.j8unit.generator.util;

import static java.util.Arrays.asList;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Stream.concat;
import static java.util.stream.StreamSupport.stream;
import java.util.Collection;
import java.util.Set;

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
     * Merges a given set and the given {@code additionals} elements into a new set.
     *
     * @param origin
     *            the set to merge
     * @param additionals
     *            the further elements
     * @return a merged set
     */
    @SafeVarargs
    public static final <T> Set<T> merge(final Set<? extends T> origin, final T... additionals) {
        return concat(origin.stream(), stream(additionals)).collect(toSet());
    }

    /**
     * Merges a given set and the given {@code additionals} elements into a new set.
     *
     * @param origin
     *            the set to merge
     * @param additionals
     *            the further elements
     * @return a merged set
     */
    public static final <T> Set<T> merge(final Set<? extends T> origin, final Iterable<? extends T> additionals) {
        return concat(origin.stream(), stream(additionals.spliterator(), false)).collect(toSet());
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
