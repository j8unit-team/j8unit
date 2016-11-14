package org.j8unit.generator.util;

/**
 * <p>
 * Synonymous to {@link java.util.function.Predicate}, this is the base interface interface of any matcher.
 * </p>
 *
 * @param <T>
 *            the type of the input to the matcher
 */
public abstract interface Matcher<T> {

    /**
     * <p>
     * Predicate method matching any instance of type {@code T} that fits to the specific matcher requirements.
     * </p>
     *
     * @param t
     *            the input argument
     * @return {@code true} iff the given argument fits to the specific matcher requirements
     */
    public abstract boolean matches(final T t);

}
