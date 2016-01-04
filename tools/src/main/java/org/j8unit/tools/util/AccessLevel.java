package org.j8unit.tools.util;

import static java.util.Objects.requireNonNull;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

/**
 * Enumeration of the Java access levels. Beside the obvious {@link #PUBLIC public}, {@link #PROTECTED protected}, and
 * {@link #PRIVATE private} there is an explicit element representing the modifier-less {@link #PACKAGE_PRIVATE package
 * private} case.
 *
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html"> The Java&trade; Tutorials:
 *      Controlling Access to Members of a Class</a>
 *
 * @author Stefan Gasterst&auml;dt (SGA)
 */
public enum AccessLevel {

    /**
     * Enumeration constant representing {@code public} access.
     */
    PUBLIC {

        /**
         * Returns {@code true} if the modifier represents a {@code public} element. Returns {@code false} otherwise.
         *
         * @see Modifier#isPublic(int)
         *
         * @return {@code true} if the given modifier represents a {@code public} element; {@code false} otherwise
         */
        @Override
        public boolean matches(final int modifier) {
            return Modifier.isPublic(modifier);
        }

    },

    /**
     * Enumeration constant representing {@code protected} access.
     */
    PROTECTED {

        /**
         * Returns {@code true} if the modifier represents a {@code protected} element. Returns {@code false} otherwise.
         *
         * @see Modifier#isProtected(int)
         *
         * @return {@code true} if the given modifier represents a {@code protected} element; {@code false} otherwise
         */
        @Override
        public boolean matches(final int modifier) {
            return Modifier.isProtected(modifier);
        }

    },

    /**
     * Enumeration constant representing {@code private} access.
     */
    PRIVATE {

        /**
         * Returns {@code true} if the modifier represents a {@code private} element. Returns {@code false} otherwise.
         *
         * @see Modifier#isPrivate(int)
         *
         * @return {@code true} if the given modifier represents a {@code private} element; {@code false} otherwise
         */
        @Override
        public boolean matches(final int modifier) {
            return Modifier.isPrivate(modifier);
        }

    },

    /**
     * Enumeration constant representing <em>package private</em> access.
     */
    PACKAGE_PRIVATE {

        /**
         * Returns {@code true} if the modifier represents a <em>package private</em> element. Returns {@code false}
         * otherwise.
         *
         * @return {@code true} if the given modifier represents a <em>package private</em> element; {@code false}
         *         otherwise
         */
        @Override
        public boolean matches(final int modifier) {
            return !PUBLIC.matches(modifier) && !PROTECTED.matches(modifier) && !AccessLevel.PRIVATE.matches(modifier);
        }

    };

    /**
     * Predicate method matching any modifier that fits to the specific access level.
     *
     * @see #PUBLIC
     * @see #PROTECTED
     * @see #PRIVATE
     * @see #PACKAGE_PRIVATE
     *
     * @param modifier
     *            the modifier to use for matching query
     * @return {@code true} if the given modifier fits to the specific access level; {@code false} otherwise
     */
    public abstract boolean matches(int modifier);

    /**
     * Predicate method matching any modifier that does not hold {@link #matches(int)}.
     *
     * @see #matches(int)
     *
     * @param modifier
     *            the modifier to use for mismatching query
     * @return {@code true} if the given modifier does not hold {@link #matches(int)}; {@code false} otherwise
     */
    public final boolean mismatches(final int modifier) {
        return !this.matches(modifier);
    }

    /**
     * Predicate method matching any {@linkplain Class class} that (using its {@linkplain Class#getModifiers()
     * modifiers}) holds {@link #matches(int)}.
     *
     * @see #matches(int)
     *
     * @param clazz
     *            the class to use for matching query
     * @return {@code true} if the class' {@linkplain Class#getModifiers() modifiers} hold {@link #matches(int)};
     *         {@code false} otherwise
     */
    public final boolean matches(final Class<?> clazz) {
        requireNonNull(clazz);
        return this.matches(clazz.getModifiers());
    }

    /**
     * Predicate method matching any {@linkplain Class class} that (using its {@linkplain Class#getModifiers()
     * modifiers}) holds {@link #mismatches(int)}.
     *
     * @see #mismatches(int)
     *
     * @param clazz
     *            the class to use for mismatching query
     * @return {@code true} if the class' {@linkplain Class#getModifiers() modifiers} hold {@link #mismatches(int)};
     *         {@code false} otherwise
     */
    public final boolean mismatches(final Class<?> clazz) {
        requireNonNull(clazz);
        return this.mismatches(clazz.getModifiers());
    }

    /**
     * Predicate method matching any {@linkplain Member member} that (using its {@linkplain Class#getModifiers()
     * modifiers}) holds {@link #matches(int)}.
     *
     * @see #matches(int)
     *
     * @param member
     *            the member to use for matching query
     * @return {@code true} if the member's {@linkplain Member#getModifiers() modifiers} hold {@link #matches(int)};
     *         {@code false} otherwise
     */
    public final boolean matches(final Member member) {
        requireNonNull(member);
        return this.matches(member.getModifiers());
    }

    /**
     * Predicate method matching any {@linkplain Member member} that (using its {@linkplain Member#getModifiers()
     * modifiers} ) holds {@link #mismatches(int)}.
     *
     * @see #mismatches(int)
     *
     * @param clazz
     *            the member to use for mismatching query
     * @return {@code true} if the member's {@linkplain Member#getModifiers() modifiers} hold {@link #mismatches(int)};
     *         {@code false} otherwise
     */
    public final boolean mismatches(final Member member) {
        requireNonNull(member);
        return this.mismatches(member.getModifiers());
    }

}
