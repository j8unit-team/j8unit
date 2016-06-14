package org.j8unit.generator.api.control;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.j8unit.generator.analysis.AccessLevel;
import org.j8unit.generator.api.GeneratorSetup;

/**
 * <p>
 * This interface specifies the incorporation of the origin entities dealt with by a
 * {@linkplain org.j8unit.generator.api.J8UnitGenerator j8unit generator}. In detail, it provides some methods to
 * determine whether or not to use (resp. to skip) types, fields, constructors, and methods.
 * </p>
 */
@FunctionalInterface
public abstract interface GeneratorUseControler {

    /**
     * Returns the current access level, used to filter these components to be considered when generating some target
     * code.
     *
     * @return the current access level
     */
    public abstract AccessLevel getAccessLevel();

    /**
     * <p>
     * Returns {@code true} if the given origin {@link Class type} is intended to be considered when
     * {@linkplain Generator#generateSourceFile(Class, GeneratorSetup, GeneratorSetup) generating test-code}; returns
     * {@code false} otherwise.
     * </p>
     *
     * @implSpec The default implementation refers to {@link AccessLevel#matches(Class)} using {@link #getAccessLevel()
     *           the current access level}.
     *
     * @param type
     *            the queried origin type
     * @return {@code true} iff the the given origin type is intended to be considered when generating test-code
     */
    public default boolean useType(final Class<?> type) {
        return (type != null) && this.getAccessLevel().matches(type);
    }

    /**
     * <p>
     * Returns {@code true} if the given origin {@link Class type} is <em>not</em> intended to be considered when
     * {@linkplain Generator#generateSourceFile(Class, GeneratorSetup, GeneratorSetup) generating test-code}; returns
     * {@code false} otherwise.
     * </p>
     *
     * @implSpec The default implementation simply returns the negation of {@link #useType(Class)}
     *
     * @param type
     *            the queried origin type
     * @return {@code true} iff the the given origin type is <em>not</em> intended to be considered when generating
     *         test-code
     */
    public default boolean skipType(final Class<?> type) {
        return !this.useType(type);
    }

    /**
     * <p>
     * Returns {@code true} if the given origin {@link Field field} is intended to be considered when
     * {@linkplain Generator#generateSourceFile(Class, GeneratorSetup, GeneratorSetup) generating test-code}; returns
     * {@code false} otherwise.
     * </p>
     *
     * @implSpec The default implementation refers to {@link AccessLevel#matches(Field)} using {@link #getAccessLevel()
     *           the current access level}.
     *
     * @param field
     *            the queried origin field
     * @return {@code true} iff the the given origin field is intended to be considered when generating test-code
     */
    public default boolean useField(final Field field) {
        return (field != null) && this.getAccessLevel().matches(field);
    }

    /**
     * <p>
     * Returns {@code true} if the given origin {@link Field field} is <em>not</em> intended to be considered when
     * {@linkplain Generator#generateSourceFile(Class, GeneratorSetup, GeneratorSetup) generating test-code}; returns
     * {@code false} otherwise.
     * </p>
     *
     * @implSpec The default implementation simply returns the negation of {@link #useField(Field)}
     *
     * @param field
     *            the queried origin field
     * @return {@code true} iff the the given origin field is <em>not</em> intended to be considered when generating
     *         test-code
     */
    public default boolean skipField(final Field field) {
        return !this.useField(field);
    }

    /**
     * <p>
     * Returns {@code true} if the given origin {@link Constructor constructor} is intended to be considered when
     * {@linkplain Generator#generateSourceFile(Class, GeneratorSetup, GeneratorSetup) generating test-code}; returns
     * {@code false} otherwise.
     * </p>
     *
     * @implSpec The default implementation refers to {@link AccessLevel#matches(java.lang.reflect.Member)} using
     *           {@link #getAccessLevel() the current access level}.
     *
     * @param constructor
     *            the queried origin constructor
     * @return {@code true} iff the the given origin constructor is intended to be considered when generating test-code
     */
    public default boolean useConstructor(final Constructor<?> constructor) {
        return (constructor != null) && this.getAccessLevel().matches(constructor);
    }

    /**
     * <p>
     * Returns {@code true} if the given origin {@link Constructor constructor} is <em>not</em> intended to be
     * considered when {@linkplain Generator#generateSourceFile(Class, GeneratorSetup, GeneratorSetup) generating
     * test-code}; returns {@code false} otherwise.
     * </p>
     *
     * @implSpec The default implementation simply returns the negation of {@link #useConstructor(Constructor)}
     *
     * @param constructor
     *            the queried origin constructor
     * @return {@code true} iff the the given origin constructor is <em>not</em> intended to be considered when
     *         generating test-code
     */
    public default boolean skipConstructor(final Constructor<?> constructor) {
        return !this.useConstructor(constructor);
    }

    /**
     * <p>
     * Returns {@code true} if the given origin {@link Method method} is intended to be considered when
     * {@linkplain Generator#generateSourceFile(Class, GeneratorSetup, GeneratorSetup) generating test-code}; returns
     * {@code false} otherwise.
     * </p>
     *
     * @implSpec The default implementation refers to {@link AccessLevel#matches(java.lang.reflect.Member)} using
     *           {@link #getAccessLevel() the current access level}.
     *
     * @param method
     *            the queried origin method
     * @return {@code true} iff the the given origin method is intended to be considered when generating test-code
     */
    public default boolean useMethod(final Method method) {
        return (method != null) && this.getAccessLevel().matches(method);
    }

    /**
     * <p>
     * Returns {@code true} if the given origin {@link Method method} is <em>not</em> intended to be considered when
     * {@linkplain Generator#generateSourceFile(Class, GeneratorSetup, GeneratorSetup) generating test-code}; returns
     * {@code false} otherwise.
     * </p>
     *
     * @implSpec The default implementation simply returns the negation of {@link #useMethod(Method)}
     *
     * @param method
     *            the queried origin method
     * @return {@code true} iff the the given origin method is <em>not</em> intended to be considered when generating
     *         test-code
     */
    public default boolean skipMethod(final Method method) {
        return !this.useMethod(method);
    }

}
