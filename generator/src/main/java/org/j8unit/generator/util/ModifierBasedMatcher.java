package org.j8unit.generator.util;

import static java.util.Objects.requireNonNull;
import java.lang.reflect.Member;
import java.util.function.IntPredicate;

/**
 * <p>
 * Base interface of any modifier based matching predicates. Beside the definition of the main {@link #matches(int)}
 * method, this interface specifies various derived comfort matching and mismatching methods:
 * </p>
 *
 * <table>
 * <tr>
 * <th></th>
 * <th>matches</th>
 * <th>mismatches</th>
 * </tr>
 * <tr>
 * <th>{@link Class}</th>
 * <td>{@link #matches(Class)}</td>
 * <td>{@link #mismatches(Class)}</td>
 * </tr>
 * <tr>
 * <th>{@link java.lang.reflect.Constructor}</th>
 * <td>{@link #matches(Member)}</td>
 * <td>{@link #mismatches(Member)}</td>
 * </tr>
 * <tr>
 * <th>{@link java.lang.reflect.Method}</th>
 * <td>{@link #matches(Member)}</td>
 * <td>{@link #mismatches(Member)}</td>
 * </tr>
 * <tr>
 * <th>{@link java.lang.reflect.Field}</th>
 * <td>{@link #matches(Member)}</td>
 * <td>{@link #mismatches(Member)}</td>
 * </tr>
 * </table>
 */
@FunctionalInterface
public abstract interface ModifierBasedMatcher
extends IntPredicate {

    /**
     * <p>
     * Predicate-method matching any {@code modifier} that fits a specific condition.
     * </p>
     *
     * @param modifier
     *            the modifier to use for matching query
     * @return {@code true} iff the given {@code modifier} fits a specific condition
     */
    public default boolean matches(final int modifier) {
        return test(modifier);
    }

    /**
     * <p>
     * Predicate-method matching any {@code modifier} that does not hold {@link #matches(int)}.
     * </p>
     *
     * @see #matches(int)
     *
     * @param modifier
     *            the modifier to use for mismatching query
     * @return {@code true} iff the given {@code modifier} does not hold {@link #matches(int)}
     */
    public default boolean mismatches(final int modifier) {
        return !this.matches(modifier);
    }

    /**
     * <p>
     * Predicate-method matching any {@link Class entity} that &ndash;&nbsp;using its {@linkplain Class#getModifiers()
     * modifiers}&nbsp;&ndash; holds {@link #matches(int)}.
     * </p>
     *
     * @see #matches(int)
     *
     * @param entity
     *            the entity to use for matching query
     * @return {@code true} iff the {@code entity}'s modifiers hold {@link #matches(int)}
     */
    public default boolean matches(final Class<?> entity) {
        requireNonNull(entity);
        return this.matches(entity.getModifiers());
    }

    /**
     * <p>
     * Predicate-method matching any {@link Class entity} that &ndash;&nbsp;using its {@linkplain Class#getModifiers()
     * modifiers}&nbsp;&ndash; holds {@link #mismatches(int)}.
     * </p>
     *
     * @see #mismatches(int)
     *
     * @param entity
     *            the entity to use for mismatching query
     * @return {@code true} iff the {@code entity}'s modifiers hold {@link #mismatches(int)}
     */
    public default boolean mismatches(final Class<?> entity) {
        requireNonNull(entity);
        return this.mismatches(entity.getModifiers());
    }

    /**
     * <p>
     * Predicate-method matching any {@link Member member} that &ndash;&nbsp;using its {@linkplain Member#getModifiers()
     * modifiers}&nbsp;&ndash; holds {@link #matches(int)}.
     * </p>
     *
     * @see #matches(int)
     *
     * @param member
     *            the member to use for matching query
     * @return {@code true} iff the {@code member}'s modifiers hold {@link #matches(int)}
     */
    public default boolean matches(final Member member) {
        requireNonNull(member);
        return this.matches(member.getModifiers());
    }

    /**
     * <p>
     * Predicate-method matching any {@link Member member} that &ndash;&nbsp;using its {@linkplain Member#getModifiers()
     * modifiers}&nbsp;&ndash; holds {@link #mismatches(int)}.
     * </p>
     *
     * @see #mismatches(int)
     *
     * @param member
     *            the member to use for mismatching query
     * @return {@code true} iff the {@code member}'s modifiers hold {@link #mismatches(int)}
     */
    public default boolean mismatches(final Member member) {
        requireNonNull(member);
        return this.mismatches(member.getModifiers());
    }

}
