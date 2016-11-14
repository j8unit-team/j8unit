package org.j8unit.generator.util;

import static java.util.Objects.requireNonNull;

/**
 * Comfort extension of {@link Matcher} specifying an additional {@code default} {@linkplain #mismatches(Object)
 * mismatching method}.
 *
 * @param <T>
 *            the type of the input to the mismatcher
 */
public abstract interface Mismatcher<T>
extends Matcher<T> {

    /**
     * <p>
     * Predicate method matching any instance of type {@code T} that does not hold {@link #matches(Object)}.
     * </p>
     *
     * @see #matches(Object)
     *
     * @param t
     *            the input argument
     * @return {@code true} iff the given modifier does not hold {@link #matches(Object)}
     */
    public default boolean mismatches(final T t) {
        requireNonNull(t);
        return !this.matches(t);
    }

}
