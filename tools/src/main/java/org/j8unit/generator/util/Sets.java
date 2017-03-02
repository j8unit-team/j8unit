package org.j8unit.generator.util;

import static java.util.Arrays.asList;
import java.util.Collection;
import java.util.HashSet;
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
        return new HashSet<>(asList(values));
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
        return merge(origin, asList(additionals));
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
    public static final <T> Set<T> merge(final Set<? extends T> origin, final Collection<? extends T> additionals) {
        final Set<T> set = new HashSet<>(origin);
        set.addAll(additionals);
        return set;
    }

    /**
     * Returns a new {@linkplain Set set} which contains all elements of the {@code origin} set but without the elements
     * given by {@code subtractionals}.
     *
     * @param origin
     *            the set to reduce
     * @param subtractionals
     *            the elements to remove
     * @return the reduced set
     */
    @SafeVarargs
    public static final <T> Set<T> reduce(final Set<? extends T> origin, final T... subtractionals) {
        return reduce(origin, asList(subtractionals));
    }

    /**
     * Returns a new {@linkplain Set set} which contains all elements of the {@code origin} set but without the elements
     * given by {@code subtractionals}.
     *
     * @param origin
     *            the set to reduce
     * @param subtractionals
     *            the elements to remove
     * @return the reduced set
     */
    public static final <T> Set<T> reduce(final Set<? extends T> origin, final Collection<? extends T> subtractionals) {
        final Set<T> set = new HashSet<>(origin);
        set.removeAll(subtractionals);
        return set;
    }

}
