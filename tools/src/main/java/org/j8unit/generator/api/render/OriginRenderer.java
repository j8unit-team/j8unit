package org.j8unit.generator.api.render;

import static java.util.Arrays.stream;
import static java.util.Collections.emptyList;
import static java.util.Collections.nCopies;
import static java.util.Objects.nonNull;
import static java.util.Objects.requireNonNull;
import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.toList;
import static org.j8unit.generator.analysis.TypePosition.TOP_LEVEL;
import static org.j8unit.generator.util.Java.CLASS_SUFFIX;
import static org.j8unit.generator.util.Java.EXTENDS;
import static org.j8unit.generator.util.Java.JAVA_NAMESPACE_DELIMITER;
import static org.j8unit.generator.util.Java.WILDCARD_TOKEN;
import static org.j8unit.generator.util.Java.diamond;
import static org.j8unit.generator.util.Java.toVarArg;
import static org.j8unit.generator.util.Lists.convert;
import static org.j8unit.generator.util.OptionalString.ofEmptyable;
import static org.j8unit.generator.util.Strings.csv;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.j8unit.generator.util.Strings;

/**
 * Definition of a behaviour for rendering the origin packages and names of given types.
 */
public abstract interface OriginRenderer {

    /**
     * <p>
     * Returns the name of the given origin {@linkplain Package package}.
     *
     * Since types located within the default package do not provide package information, its execution of
     * {@link Class#getPackage()} returns {@code null}. Hence, {@code null} must be seen as a meaningful package
     * information and, thus, this method must support {@code null} by returning an {@linkplain Optional#empty() empty
     * Optional instance}.
     * </p>
     *
     * @implSpec The default implementation refers to {@link Package#getName()}.
     *
     * @param pakkage
     *            the origin package
     * @return the canonical name of the given package
     */
    public default Optional<String> originPackageFor(final Package pakkage) {
        return ofNullable(pakkage).map(Package::getName);
    }

    /**
     * <p>
     * Returns the package name of the given origin {@linkplain Class type}.
     * </p>
     *
     * @apiNote The result of primitive types and array classes is intended to be {@linkplain Optional#empty() empty}.
     *
     * @implSpec The default implementation refers to {@link #originPackageFor(Package)} using
     *           {@linkplain Class#getPackage() the package} of the given {@code type}.
     *
     * @param type
     *            the origin type
     * @return the canonical name of the given type's package
     */
    public default Optional<String> originPackageFor(final Class<?> type) {
        requireNonNull(type);
        return this.originPackageFor(type.getPackage());
    }

    /**
     * <p>
     * Maps {@linkplain GenericDeclaration#getTypeParameters() each parameter} of the given {@link GenericDeclaration
     * entity} to the unbound wildcard representation ({@value org.j8unit.generator.util.Java#WILDCARD_TOKEN})) and
     * returns a {@linkplain List list} of these values.
     * </p>
     *
     * <p>
     * In case the given {@code entity} declares no type parameter at all, the returned list will be empty.
     * </p>
     *
     * @implSpec The default implementation already provides the aforementioned behaviour.
     *
     * @param entity
     *            the given entity (that potentially declares type parameters)
     * @return a list of the {@code entity}'s parameters, each mapped to the unbound representation
     */
    public default List<String> listOfTypeParameterWildcardsOf(final GenericDeclaration entity) {
        requireNonNull(entity);
        return nCopies(entity.getTypeParameters().length, WILDCARD_TOKEN);
    }

    /**
     * <p>
     * Maps {@linkplain GenericDeclaration#getTypeParameters() each parameter} of the given {@link GenericDeclaration
     * entity} to {@linkplain TypeVariable#getName() its name} and returns a {@linkplain List list} of these values.
     * </p>
     *
     * <p>
     * In case the given {@code entity} declares no type parameter at all, the returned list will be empty.
     * </p>
     *
     * @implSpec The default implementation already provides the aforementioned behaviour.
     *
     * @param entity
     *            the given entity (that potentially declares type parameters)
     * @return a list of the {@code entity}'s parameters, each mapped to its name
     */
    public default List<String> listOfTypeParameterNamesOf(final GenericDeclaration entity) {
        requireNonNull(entity);
        return stream(entity.getTypeParameters()).map(TypeVariable::getName).collect(toList());
    }

    /**
     * <p>
     * Maps each variable of the given {@link Type type} to its name declaration and returns a {@linkplain List list} of
     * these values.
     *
     * More detailed, this method should return the result of
     * {@link #listOfTypeArgumentDefinitionsOf(ParameterizedType)} for any {@linkplain ParameterizedType parameterised
     * type} and should return the result of {@link #listOfTypeParameterNamesOf(GenericDeclaration)} for any
     * {@linkplain Class class} type.
     *
     * The result of any other {@code type} is undefined and may cause an {@link Exception}.
     * </p>
     *
     * <p>
     * In case the given {@code type} declares no type argument/parameter at all, the returned list will be empty.
     * <p>
     *
     * @implSpec The default implementation already provides the aforementioned behaviour (and returns an empty list if
     *           the specific type is unknown).
     *
     * @param type
     *            the given type (that potentially declares type variables)
     * @return a list of the {@code type}'s variables, each mapped to its name
     */
    public default List<String> listOfTypeVariableNamesOf(final Type type)
    throws UnsupportedOperationException {
        requireNonNull(type);
        if (type instanceof ParameterizedType) {
            final ParameterizedType pt = (ParameterizedType) type;
            return this.listOfTypeArgumentDefinitionsOf(pt);
        } else if (type instanceof Class) {
            final Class<?> clazz = (Class<?>) type;
            return this.listOfTypeParameterNamesOf(clazz);
        } else {
            return emptyList();
            // throw new UnsupportedOperationException("Unsupported type: " + type.getClass());
        }
    }

    /**
     * <p>
     * Maps {@linkplain GenericDeclaration#getTypeParameters() each parameter} of the given {@link GenericDeclaration
     * entity} to its definition statement and returns a {@linkplain List list} of these values.
     * </p>
     *
     * <p>
     * In case the given {@code entity} declares no type parameter at all, the returned list will be empty.
     * </p>
     *
     * @implSpec The default implementation already provides the aforementioned behaviour.
     *
     * @param entity
     *            the given entity (that potentially declares type parameters)
     * @return a list of the {@code entity}'s parameters, each mapped to its definition statement
     */
    public default List<String> listOfTypeParameterDefinitionsOf(final GenericDeclaration entity) {
        requireNonNull(entity);
        return stream(entity.getTypeParameters()).map(var -> {
            final String name = var.getName();
            final String bounds = csv(convert(var.getBounds(), this::originCanonicalDefinitionOf));
            return name + ofEmptyable(bounds).prepend(EXTENDS).orEmpty();
        }).collect(toList());
    }

    /**
     * <p>
     * Maps {@linkplain Type#getActualTypeArguments() each argument} of the given {@link Type type} to its definition
     * statement and returns a {@linkplain List list} of these values.
     * </p>
     *
     * <p>
     * In case the given {@code type} declares no type parameter at all, the returned list will be empty.
     * </p>
     *
     * @implSpec The default implementation already provides the aforementioned behaviour.
     *
     * @param entity
     *            the given type (that potentially declares type parameters)
     * @return a list of the {@code type}'s arguments, each mapped to its definition statement
     */
    public default List<String> listOfTypeArgumentDefinitionsOf(final ParameterizedType type) {
        requireNonNull(type);
        return convert(type.getActualTypeArguments(), this::originCanonicalDefinitionOf);
    }

    /**
     * <p>
     * Returns the definition statement of a given {@link Type type}.
     *
     * In case of a <em>{@linkplain ParameterizedType parameterized type}</em> this is
     * {@linkplain #originCanonicalNameOf(ParameterizedType, Function) the canonical name} plus the
     * {@linkplain #listOfTypeVariableNamesOf(Type) definition statement of each type argument}; In case of a
     * <em>{@link Class}-based type</em> this is the {@link #originCanonicalNameOf(Class, Function) the canonical name}
     * plus the {@linkplain #listOfTypeVariableNamesOf(Type) name statement of each type parameter}; <em>Otherwise</em>
     * this is just the canonical name of the given {@code type}.
     * </p>
     *
     * @implSpec The default implementation already provides the aforementioned behaviour.
     *
     * @param type
     *            the given type
     * @return the definition statement of the given {@code type}
     */
    public default String originCanonicalDefinitionOf(final Type type) {
        requireNonNull(type);
        if (type instanceof ParameterizedType) {
            // TODO: Consider {@link ParameterizedType#getOwnerType()}?
            return this.originCanonicalNameOf((ParameterizedType) type, this::listOfTypeVariableNamesOf);
        } else if (type instanceof Class) {
            return this.originCanonicalNameOf((Class<?>) type, this::listOfTypeVariableNamesOf);
        } else {
            return this.originCanonicalNameOf(type);
        }
    }

    /**
     * <p>
     * Returns the canonical name of the given {@link Type type}.
     * </p>
     *
     * @implSpec The default implementation refers to {@link Type#getTypeName()}. However, if the given type is a
     *           {@link Class}, the default implementation just refers to {@link Class#getCanonicalName()} because the
     *           type name of nested types differs from its canonical class name. (For example, the type name of
     *           {@link java.util.Map.Entry} is {@code java.util.Map$Entry} whereas the canonical class name is
     *           {@code java.util.Map.Entry}.)
     *
     * @param type
     *            the origin type
     * @return the canonical name of the given {@code type}
     */
    public default String originCanonicalNameOf(final Type type) {
        requireNonNull(type);
        if (type instanceof Class) {
            return ((Class<?>) type).getCanonicalName();
        } else {
            return type.getTypeName();
        }
    }

    /**
     * <p>
     * Returns the {@linkplain #originCanonicalNameOf(Type) canonical name} of the given {@link ParameterizedType type}
     * 's {@linkplain ParameterizedType#getRawType() raw type}, succeeded by a {@linkplain Strings#diamond(Iterable)
     * bcsv'ed} presentation of the result of the given suffix function (applied to the given {@code type}).
     * </p>
     *
     * @implSpec The default implementation already provides the aforementioned behaviour.
     *
     * @see #listOfTypeArgumentDefinitionsOf(ParameterizedType)
     * @see #listOfTypeVariableNamesOf(Type)
     *
     * @param type
     *            the origin type
     * @param suffixRenderer
     *            the suffix function applied to the given {@code type}
     * @return the canonical name of the given {@code type}, succeeded by a bcsv'ed suffix
     */
    public default String originCanonicalNameOf(final ParameterizedType type,
                                                final Function<? super ParameterizedType, ? extends List<String>> suffixRenderer) {
        requireNonNull(type);
        requireNonNull(suffixRenderer);
        return this.originCanonicalNameOf(type.getRawType()) + diamond(suffixRenderer.apply(type));
    }

    /**
     * <p>
     * Returns the {@linkplain #originCanonicalNameOf(Type) canonical name} of the given {@link Class type}, succeeded
     * by a {@linkplain Strings#diamond(Iterable) bcsv'ed} presentation of the result of the given suffix function
     * (applied to the given {@code type}).
     * </p>
     *
     * @implSpec The default implementation already provides the aforementioned behaviour.
     *
     * @see #listOfTypeParameterWildcardsOf(GenericDeclaration)
     * @see #listOfTypeParameterNamesOf(GenericDeclaration)
     * @see #listOfTypeParameterDefinitionsOf(GenericDeclaration)
     * @see #listOfTypeVariableNamesOf(Type)
     *
     * @param type
     *            the origin type
     * @param suffixRenderer
     *            the suffix function applied to the given {@code type}
     * @return the canonical name of the given {@code type}, succeeded by a bcsv'ed suffix
     */
    public default String originCanonicalNameOf(final Class<?> type, final Function<? super Class<?>, ? extends List<String>> suffixRenderer) {
        requireNonNull(type);
        requireNonNull(suffixRenderer);
        return this.originCanonicalNameOf(type) + diamond(suffixRenderer.apply(type));
    }

    /**
     * <p>
     * Returns the {@linkplain #originCanonicalNameOf(Type) canonical name} of the given {@link Class type}, succeeded
     * by a given string (joined by the {@linkplain org.j8unit.generator.util.Java#JAVA_NAMESPACE_DELIMITER java
     * name-space delimiter}).
     *
     * Usually, the name refers to a {@code static} field or method.
     * </p>
     *
     * @implSpec The default implementation already provides the aforementioned behaviour.
     *
     * @param type
     *            the origin type
     * @param methodName
     *            the suffix name
     * @return the canonical name of the given {@code type}, succeeded by a given suffix (joined by the java name-space
     *         delimiter)
     */
    public default String originCanonicalNameOf(final Class<?> type, final String methodName) {
        requireNonNull(type);
        return this.originCanonicalNameOf(type) + JAVA_NAMESPACE_DELIMITER + methodName;
    }

    /**
     * <p>
     * Returns the canonical class name of the given origin {@link Class type}'s class.
     * </p>
     *
     * @implSpec The default implementation refers to {@link #originCanonicalNameOf(Class)} and appends
     *           {@link org.j8unit.generator.util.Java#CLASS_SUFFIX}.
     *
     * @see #originBasicClassOf(Class)
     * @see #originSimpleClassOf(Class)
     *
     * @param type
     *            the origin type
     * @return the canonical class name of the given {@code type}
     */
    public default String originCanonicalClassOf(final Class<?> type) {
        requireNonNull(type);
        return this.originCanonicalNameOf(type) + CLASS_SUFFIX;
    }

    /**
     * <p>
     * Returns the basic name of the given origin {@link Class type}. For any
     * {@linkplain org.j8unit.generator.analysis.TypePosition#TOP_LEVEL top level} type this is the
     * {@linkplain #originSimpleNameOf(Class) simple name}; For any enveloped type this is the simple name preceded by
     * the basic name of the immediately enclosing type and the
     * {@linkplain org.j8unit.generator.util.Java#JAVA_NAMESPACE_DELIMITER java name-space delimiter}.
     * </p>
     *
     * @implSpec The default implementation provides exactly the behaviour as described above.
     *
     * @see #originCanonicalNameOf(Class)
     * @see #originSimpleNameOf(Class)
     *
     * @param type
     *            the origin type
     * @return the basic name of the given {@code type}
     */
    public default String originBasicNameOf(final Class<?> type) {
        requireNonNull(type);
        if (TOP_LEVEL.matches(type)) {
            return this.originSimpleNameOf(type);
        } else {
            assert nonNull(type.getEnclosingClass());
            return this.originBasicNameOf(type.getEnclosingClass()) + JAVA_NAMESPACE_DELIMITER + this.originSimpleNameOf(type);
        }
    }

    /**
     * <p>
     * Returns the basic class name of the given {@link Class type}. This is the {@link #originBasicNameOf(Class) type's
     * basic name} followed by {@value org.j8unit.generator.util.Java#CLASS_SUFFIX}.
     * </p>
     *
     * @implSpec The default implementation refers to {@link #originBasicNameOf(Class)} and appends
     *           {@link org.j8unit.generator.util.Java#CLASS_SUFFIX}.
     *
     * @see #originCanonicalClassOf(Class)
     * @see #originSimpleClassOf(Class)
     *
     * @param type
     *            the origin type
     * @return the basic class name of the given {@code type}
     */
    public default String originBasicClassOf(final Class<?> type) {
        requireNonNull(type);
        return originBasicNameOf(type) + CLASS_SUFFIX;
    }

    /**
     * <p>
     * Returns the simple name of the given origin {@link Class type}.
     * </p>
     *
     * @implSpec The default implementation just refers to {@link Class#getSimpleName()}.
     *
     * @see #originCanonicalNameOf(Class)
     * @see #originBasicNameOf(Class)
     *
     * @param type
     *            the origin type
     * @return the simple name of the given {@code type}
     */
    public default String originSimpleNameOf(final Class<?> type) {
        requireNonNull(type);
        return type.getSimpleName();
    }

    /**
     * <p>
     * Returns the simple class name of the given {@link Class type}. This is the {@link #originSimpleNameOf(Class)
     * type's simple name} followed by {@value org.j8unit.generator.util.Java#CLASS_SUFFIX}.
     * </p>
     *
     * @implSpec The default implementation refers to {@link #originSimpleNameOf(Class)} and appends
     *           {@link org.j8unit.generator.util.Java#CLASS_SUFFIX}.
     *
     * @see #originCanonicalClassOf(Class)
     * @see #originBasicClassOf(Class)
     *
     * @param type
     *            the origin type
     * @return the simple class name of the given {@code type}
     */
    public default String originSimpleClassOf(final Class<?> type) {
        requireNonNull(type);
        return originSimpleNameOf(type) + CLASS_SUFFIX;
    }

    /**
     * <p>
     * Returns the JavaDoc representation of a given {@linkplain Package package}.
     * </p>
     *
     * @param pakkage
     *            the given package
     * @return the JavaDoc representation of the given package
     */
    public default String javadocNameOf(final Package pakkage) {
        requireNonNull(pakkage);
        return this.originPackageFor(pakkage).orElseThrow(IllegalArgumentException::new);
    }

    /**
     * <p>
     * Returns the JavaDoc representation of a given {@link Class entity}.
     * </p>
     *
     * @param entity
     *            the given entity
     * @return the JavaDoc representation of the given {@code entity}
     */
    public default String javadocNameOf(final Class<?> entity) {
        requireNonNull(entity);
        return this.originCanonicalNameOf(entity);
    }

    /**
     * <p>
     * Returns the JavaDoc representation of a given {@linkplain Executable executable}.
     * </p>
     *
     * @param executable
     *            the given executable
     * @return the JavaDoc representation of the given {@code executable}
     */
    public default String javadocNameOf(final Executable executable) {
        requireNonNull(executable);
        return this.javadocNameOf(executable.getDeclaringClass(), executable);
    }

    /**
     * <p>
     * Returns the JavaDoc representation of a given {@linkplain Executable executable} as if defined by the given
     * {@code base} entity.
     * </p>
     *
     * @param base
     *            the given base entity
     * @param executable
     *            the given executable
     * @return the JavaDoc representation of the given {@code executable} as if defined by the given {@code base} type
     */
    public default String javadocNameOf(final Class<?> base, final Executable executable) {
        requireNonNull(base);
        requireNonNull(executable);
        final String jdType = this.javadocNameOf(base);
        final String jdExecutable = executable instanceof Constructor ? executable.getDeclaringClass().getSimpleName() : executable.getName();
        final String jdParameters = csv(stream(executable.getParameterTypes()).map(this::javadocNameOf));
        return jdType + "#" + jdExecutable + "(" + (executable.isVarArgs() ? toVarArg(jdParameters) : jdParameters) + ")";
    }

}
