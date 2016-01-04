package org.j8unit.tools.generator;

import static java.util.Collections.emptyList;
import static java.util.Objects.requireNonNull;
import static org.j8unit.tools.NamingUtilities.canonicalNameOf;
import static org.j8unit.tools.NamingUtilities.canonicalNameWithTypeParameterNamesOf;
import static org.j8unit.tools.NamingUtilities.listOfTypeParameterDefinitionsOf;
import static org.j8unit.tools.util.OptionalString.ofEmptyable;
import static org.j8unit.tools.util.Utilities.csv;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.List;
import java.util.Map.Entry;
import org.j8unit.J8UnitTest;
import org.j8unit.repository.RepositoryClassTests;
import org.j8unit.repository.RepositoryTests;

/**
 * <p>
 * Based on the existing Java's access scopes, this enumeration provides according generator support.
 * </p>
 *
 * <dl>
 * <dt>Access Scope?</dt>
 * <dd>Type members ({@linkplain java.lang.reflect.Field fields}, {@linkplain java.lang.reflect.Constructor
 * constructors}, and {@linkplain java.lang.reflect.Method methods}) can be accessed either {@linkplain #CLASS via the
 * declaring class} or {@linkplain #INSTANCE via instances}.</dd>
 * </dl>
 *
 * <p>
 * Note, although constructors are not static they are not accessed via instances. Thus by the intention of testing,
 * constructors belong to its declaring class. In result, {@link AccessScope#matches(Member) matches(Member)} of
 * {@link #INSTANCE} will return {@code false} for any constructor; respectively {@link AccessScope#matches(Member)
 * matches(Member)} of {@link #CLASS} will return {@code true} immediately.
 * </p>
 *
 * @author Stefan Gasterst&auml;dt (SGA)
 */
public enum AccessScope {

    /**
     * Enumeration constant representing access to type members via instances.
     */
    INSTANCE {

        @Override
        public boolean matches(final Member member) {
            requireNonNull(member);
            return !(member instanceof Constructor) && !Modifier.isStatic(member.getModifiers());
        }

        @Override
        public Entry<String, ? extends List<String>> inspectSutSuperType(final Class<?> clazz) {
            requireNonNull(clazz);
            return new SimpleImmutableEntry<>(canonicalNameWithTypeParameterNamesOf(clazz), listOfTypeParameterDefinitionsOf(clazz));
        }

        @Override
        @SuppressWarnings("rawtypes")
        public Class<? extends RepositoryTests> getBaseJ8UnitBaseTestClass() {
            return RepositoryTests.class;
        }

    },

    /**
     * Enumeration constant representing access to type members via the declaring class.
     */
    CLASS {

        @Override
        public boolean matches(final Member member) {
            requireNonNull(member);
            return (member instanceof Constructor) || Modifier.isStatic(member.getModifiers());
        }

        @Override
        public Entry<String, List<String>> inspectSutSuperType(final Class<?> clazz) {
            requireNonNull(clazz);
            return new SimpleImmutableEntry<>(canonicalNameOf(clazz), emptyList());
        }

        @Override
        @SuppressWarnings("rawtypes")
        public Class<? extends RepositoryClassTests> getBaseJ8UnitBaseTestClass() {
            return RepositoryClassTests.class;
        }

    };

    /**
     * Predicate method matching any {@link Member member} that fits to the specific membership scope.
     *
     * @see #CLASS
     * @see #INSTANCE
     *
     * @param modifier
     *            the modifier to use for mismatching query
     * @return {@code true} if the given modifier does not hold {@link #matches(int)}; {@code false} otherwise
     */
    public abstract boolean matches(final Member member);

    /**
     * Predicate method matching any modifier that does not hold {@link #matches(int)}.
     *
     * @see #matches(Member)
     *
     * @param modifier
     *            the modifier to use for mismatching query
     * @return {@code true} if the given modifier does not hold {@link #matches(int)}; {@code false} otherwise
     */
    public final boolean mismatches(final Member member) {
        requireNonNull(member);
        return !this.matches(member);
    }

    public abstract Entry<String, ? extends List<String>> inspectSutSuperType(final Class<?> clazz);

    public String getSutStatement(final Class<?> clazz) {
        final Entry<String, ? extends List<String>> sut = this.inspectSutSuperType(clazz);
        return "<SUT extends " + sut.getKey() + ofEmptyable(csv(sut.getValue())).prepend(", ").orElse("") + ">";
    }

    @SuppressWarnings("rawtypes")
    public abstract Class<? extends J8UnitTest> getBaseJ8UnitBaseTestClass();

    public ModusOperandi modusOperandiFor(final Class<?> clazz) {
        requireNonNull(clazz);
        return ModusOperandi.valueOf(this, clazz);
    }

}
