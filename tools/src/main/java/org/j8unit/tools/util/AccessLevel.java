package org.j8unit.tools.util;

import static java.util.Objects.requireNonNull;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

/**
 * <p>
 * Enumeration of the Java access levels. In addition to the obvious {@link #PUBLIC public}, {@link #PROTECTED
 * protected}, and {@link #PRIVATE private} access there is an explicit element representing the modifier-less
 * {@link #PACKAGE_PRIVATE package private} case.
 * </p>
 *
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html">The Java&trade; Tutorials:
 *      Controlling Access to Members of a Class</a>
 */
public enum AccessLevel {

    /**
     * <p>
     * Enumeration constant representing {@code public} access.
     * </p>
     */
    PUBLIC(Lookup.PUBLIC) {

        /**
         * <p>
         * Returns {@code true} if the {@code modifier} represents a {@code public} element. Returns {@code false}
         * otherwise.
         * </p>
         *
         * @see Modifier#isPublic(int)
         *
         * @return {@code true} if the given {@code modifier} represents a {@code public} element; {@code false}
         *         otherwise
         */
        @Override
        public boolean matches(final int modifier) {
            return Modifier.isPublic(modifier);
        }

    },

    /**
     * <p>
     * Enumeration constant representing {@code protected} access.
     * </p>
     */
    PROTECTED(Lookup.PROTECTED) {

        /**
         * <p>
         * Returns {@code true} if the {@code modifier} represents a {@code protected} element. Returns {@code false}
         * otherwise.
         * </p>
         *
         * @see Modifier#isProtected(int)
         *
         * @return {@code true} if the given {@code modifier} represents a {@code protected} element; {@code false}
         *         otherwise
         */
        @Override
        public boolean matches(final int modifier) {
            return Modifier.isProtected(modifier);
        }

    },

    /**
     * <p>
     * Enumeration constant representing {@code private} access.
     * </p>
     */
    PRIVATE(Lookup.PRIVATE) {

        /**
         * <p>
         * Returns {@code true} if the {@code modifier} represents a {@code private} element. Returns {@code false}
         * otherwise.
         * </p>
         *
         * @see Modifier#isPrivate(int)
         *
         * @return {@code true} if the given {@code modifier} represents a {@code private} element; {@code false}
         *         otherwise
         */
        @Override
        public boolean matches(final int modifier) {
            return Modifier.isPrivate(modifier);
        }

    },

    /**
     * <p>
     * Enumeration constant representing <em>package private</em> access (aka. default access).
     * </p>
     */
    PACKAGE_PRIVATE(Lookup.PACKAGE) {

        /**
         * <p>
         * Returns {@code true} if the {@code modifier} represents a <em>package private</em> element. Returns
         * {@code false} otherwise.
         * </p>
         *
         * @return {@code true} if the given {@code modifier} represents a <em>package private</em> element;
         *         {@code false} otherwise
         */
        @Override
        public boolean matches(final int modifier) {
            return !PUBLIC.matches(modifier) && !PROTECTED.matches(modifier) && !AccessLevel.PRIVATE.matches(modifier);
        }

    };

    // TODO: What can we do with the modifier information? Most probably, there are fancy ideas out there ...
    @SuppressWarnings("unused")
    private final int modifier;

    /**
     * @param modifier
     *            a single-bit mask representing the access level
     */
    private AccessLevel(final int modifier) {
        this.modifier = modifier;
    }

    /**
     * <p>
     * Predicate-method matching any {@code modifier} that fits to {@code this} specific access level.
     * </p>
     *
     * @see #PUBLIC
     * @see #PROTECTED
     * @see #PRIVATE
     * @see #PACKAGE_PRIVATE
     *
     * @param modifier
     *            the modifier to use for matching query
     * @return {@code true} if the given {@code modifier} fits to {@code this} specific access level; {@code false}
     *         otherwise
     */
    public abstract boolean matches(int modifier);

    /**
     * <p>
     * Predicate-method matching any {@code modifier} that does not hold {@link #matches(int)}.
     * </p>
     *
     * @see #matches(int)
     *
     * @param modifier
     *            the modifier to use for mismatching query
     * @return {@code true} if the given {@code modifier} does not hold {@link #matches(int)}; {@code false} otherwise
     */
    public final boolean mismatches(final int modifier) {
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
     * @return {@code true} if the {@code entity}'s modifiers hold {@link #matches(int)}; {@code false} otherwise
     */
    public final boolean matches(final Class<?> entity) {
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
     * @return {@code true} if the {@code entity}'s modifiers hold {@link #mismatches(int)}; {@code false} otherwise
     */
    public final boolean mismatches(final Class<?> entity) {
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
     * @return {@code true} if the {@code member}'s modifiers hold {@link #matches(int)}; {@code false} otherwise
     */
    public final boolean matches(final Member member) {
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
     * @param clazz
     *            the member to use for mismatching query
     * @return {@code true} if the {@code member}'s modifiers hold {@link #mismatches(int)}; {@code false} otherwise
     */
    public final boolean mismatches(final Member member) {
        requireNonNull(member);
        return this.mismatches(member.getModifiers());
    }

}
