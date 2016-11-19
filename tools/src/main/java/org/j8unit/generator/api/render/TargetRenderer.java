package org.j8unit.generator.api.render;

import static java.util.Objects.nonNull;
import static java.util.Objects.requireNonNull;
import static org.j8unit.generator.analysis.TypePosition.TOP_LEVEL;
import static org.j8unit.generator.util.Java.CLASS_SUFFIX;
import static org.j8unit.generator.util.Java.JAVA_NAMESPACE_DELIMITER;
import static org.j8unit.generator.util.OptionalString.ofOptional;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Optional;
import org.j8unit.generator.util.Java;

/**
 * Definition of a behaviour for rendering the target packages and names of given origin types.
 */
public abstract interface TargetRenderer {

    /**
     * <p>
     * Returns the target name of the given origin {@linkplain Package package}.
     *
     * In case the targeted package is the java's default package an {@linkplain Optional#empty() empty Optional
     * instance} must be returned. In any other case the resulting {@link Optional} must be not empty and must not
     * contain an empty {@link String}.
     * </p>
     *
     * @param pakkage
     *            the origin package
     * @return the canonical name of the given package's target package
     */
    public abstract Optional<String> targetPackageFor(final Package pakkage);

    /**
     * <p>
     * Returns the target package name of the given origin {@linkplain Class type}.
     * </p>
     *
     * @implSpec The default implementation refers to {@link #targetPackageFor(Package)} using
     *           {@linkplain Class#getPackage() the package} of the given {@code type}.
     *
     * @param type
     *            the origin type
     * @return the canonical name of the given type's target package
     */
    public default Optional<String> targetPackageFor(final Class<?> type) {
        requireNonNull(type);
        return this.targetPackageFor(type.getPackage());
    }

    /**
     * <p>
     * Returns the target canonical name of the given origin {@link Class type}.
     * </p>
     *
     * @implSpec The default implementation just refers to {@link #targetPackageFor(Class)} and
     *           {@link #targetBasicNameOf(Class)}.
     *
     * @implSpec The default implementation does not support {@link Class#isPrimitive() primitive} or
     *           {@link Class#isArray() array} types. Instead, it throws an according {@link IllegalArgumentException}.
     *
     * @implNote Any specific implementation is free to return the {@link #targetBasicNameOf(Class) base name} in case
     *           the definition of the package can be omitted.
     *
     * @param type
     *            the origin type
     * @return the target canonical name of the given {@code type}
     * @throws IllegalArgumentException
     *             if the given {@code type} is primitive or array type
     */
    public default String targetCanonicalNameOf(final Class<?> type)
    throws IllegalArgumentException {
        requireNonNull(type);
        if (type.isArray()) {
            throw new IllegalArgumentException("Array types cannot be mapped to an according canonical test class name!");
        } else if (type.isPrimitive()) {
            throw new IllegalArgumentException("Primitive types cannot be mapped to an according canonical test class name!");
        } else {
            return ofOptional(this.targetPackageFor(type)).append(JAVA_NAMESPACE_DELIMITER).orEmpty() + this.targetBasicNameOf(type);
        }
    }

    /**
     * <p>
     * Returns the target canonical class name of the given origin {@link Class type}'s class.
     * </p>
     *
     * @implSpec The default implementation refers to {@link #targetCanonicalNameOf(Class)} and appends
     *           {@link Java#CLASS_SUFFIX}.
     *
     * @see #targetBasicClassOf(Class)
     * @see #targetSimpleClassOf(Class)
     *
     * @param type
     *            the origin type
     * @return the target canonical class name of the given {@code type}
     */
    public default String targetCanonicalClassOf(final Class<?> type) {
        requireNonNull(type);
        return this.targetCanonicalNameOf(type) + CLASS_SUFFIX;
    }

    /**
     * <p>
     * Returns the target basic name of the given origin {@link Class type}. For any
     * {@linkplain org.j8unit.generator.analysis.TypePosition#TOP_LEVEL top level} type this is the
     * {@linkplain #targetSimpleNameOf(Class) target simple name}; For any enveloped type this is the target simple name
     * preceded by the target basic name of the immediately enclosing type and the
     * {@linkplain Java#JAVA_NAMESPACE_DELIMITER java name-space delimiter}.
     * </p>
     *
     * @implSpec The default implementation provides exactly the behaviour as described above.
     *
     * @param type
     *            the origin type
     * @return the target basic name of the given {@code type}
     */
    public default String targetBasicNameOf(final Class<?> type) {
        requireNonNull(type);
        if (TOP_LEVEL.matches(type)) {
            return this.targetSimpleNameOf(type);
        } else {
            assert nonNull(type.getEnclosingClass());
            return this.targetBasicNameOf(type.getEnclosingClass()) + JAVA_NAMESPACE_DELIMITER + this.targetSimpleNameOf(type);
        }
    }

    /**
     * <p>
     * Returns the target basic class name of the given {@link Class type}. This is the {@link #targetBasicNameOf(Class)
     * type's target basic name} followed by {@value Java#CLASS_SUFFIX}.
     * </p>
     *
     * @implSpec The default implementation refers to {@link #targetBasicNameOf(Class)} and appends
     *           {@link Java#CLASS_SUFFIX}.
     *
     * @param type
     *            the origin type
     * @return the target basic class name of the given {@code type}
     */
    public default String targetBasicClassOf(final Class<?> type) {
        requireNonNull(type);
        return targetBasicNameOf(type) + CLASS_SUFFIX;
    }

    /**
     * <p>
     * Returns the target simple name of the given origin {@link Class type}.
     * </p>
     *
     * @param type
     *            the origin type
     * @return the target simple name of the given {@code type}
     */
    public abstract String targetSimpleNameOf(final Class<?> type);

    /**
     * <p>
     * Returns the target simple class name of the given {@link Class type}. This is the
     * {@link #targetSimpleNameOf(Class) type's target simple name} followed by {@value Java#CLASS_SUFFIX}.
     * </p>
     *
     * @implSpec The default implementation refers to {@link #targetSimpleNameOf(Class)} and appends
     *           {@link Java#CLASS_SUFFIX}.
     *
     * @param type
     *            the origin type
     * @return the target simple class name of the given {@code type}
     */
    public default String targetSimpleClassOf(final Class<?> type) {
        requireNonNull(type);
        return targetSimpleNameOf(type) + CLASS_SUFFIX;
    }

    /**
     * <p>
     * Returns the target simple name of the given origin {@link Constructor constructor}.
     * </p>
     *
     * @param constructor
     *            the origin constructor
     * @return the target simple name of the given {@code constructor}
     */
    public abstract String targetSimpleNameOf(final Constructor<?> constructor);

    /**
     * <p>
     * Returns the target simple name of the given origin {@link Method method}.
     * </p>
     *
     * @param method
     *            the origin method
     * @return the target simple name of the given {@code method}
     */
    public abstract String targetSimpleNameOf(final Method method);

    public default String targetJavadocNameOf(final Class<?> entity) {
        requireNonNull(entity);
        return this.targetCanonicalNameOf(entity);
    }

}
