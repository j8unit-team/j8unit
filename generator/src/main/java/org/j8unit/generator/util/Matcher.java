package org.j8unit.generator.util;

import static java.util.Objects.requireNonNull;
import java.util.function.Predicate;

/**
 * Comfort extension of {@link Predicate} specifying an aliasing {@code default} {@linkplain #matches(Object) matching
 * method} and an additional {@code default} {@linkplain #mismatches(Object) mismatching method}.
 *
 * @param <T>
 *            the type of the input to the mismatcher
 */
@FunctionalInterface
public abstract interface Matcher<T>
extends Predicate<T> {

    /**
     * <p>
     * Predicate method matching any instance of type {@code T} that fits to the specific matcher requirements.
     * </p>
     *
     * @param t
     *            the input argument
     * @return {@code true} iff the given argument fits to the specific matcher requirements
     */
    public default boolean matches(final T t) {
        return this.test(t);
    }

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
