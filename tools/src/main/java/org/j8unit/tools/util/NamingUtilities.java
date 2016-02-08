package org.j8unit.tools.util;

import static java.util.Arrays.asList;
import static java.util.Arrays.stream;
import static java.util.Collections.nCopies;
import static java.util.Collections.singleton;
import static java.util.Objects.requireNonNull;
import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.toList;
import static org.j8unit.tools.util.TypeAnalysis.baseComponentTypeOf;
import static org.j8unit.tools.util.TypeKind.TOP_LEVEL;
import static org.j8unit.tools.util.Utilities.bcsv;
import static org.j8unit.tools.util.Utilities.csv;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * <p>
 * Utility enum (aka. helper class) providing fancy naming tools.
 * </p>
 *
 * <p>
 * The main utility methods can be seen in the following table. Note, most of these methods do have alternatives (listed
 * within the last column, "See Also:").
 * </p>
 *
 * <table border="1" collapse="on">
 * <thead>
 * <tr>
 * <th rowspan="3">Utility Method</th>
 * <th colspan="6">Java Type</th>
 * <th rowspan="3">See Also:</th>
 * </tr>
 * <tr>
 * <th>{@link Object java.lang.Object}</th>
 * <th>{@link Iterable java.lang.Iterable&lt;T&gt;}</th>
 * <th>{@link Enum java.lang.Enum&lt;E extends Enum&lt;E&gt;&gt;}</th>
 * <th>{@link java.util.List java.util.List&lt;E&gt;}</th>
 * <th>{@link java.util.Map.Entry java.util.Map.Entry&lt;K, V&gt;}</th>
 * <th>{@link java.util.EnumMap java.util.EnumMap&lt;K extends Enum&lt;K&gt;, V&gt;}</th>
 * </tr>
 * <tr>
 * <th><sup>(Simple type, located within {@code java.lang})<sup></th>
 * <th><sup>(Generic type, located within {@code java.lang})<sup></th>
 * <th><sup>(Generic type with upper bound, located within {@code java.lang})<sup></th>
 * <th><sup>(Generic type, located within {@code java.util})<sup></th>
 * <th><sup>(Nested generic type, located within {@code java.util})<sup></th>
 * <th><sup>(Generic type with upper bound, located within {@code java.util})<sup></th>
 * </tr>
 * </thead><tbody>
 * <tr>
 * <td>{@link #simpleCanonicalNameOf(Class)}</td>
 * <td>{@code "Object"}</td>
 * <td>{@code "Iterable"}</td>
 * <td>{@code "Enum"}</td>
 * <td>{@code "List"}</td>
 * <td>{@code "Entry"}</td>
 * <td>{@code "EnumMap"}</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>{@link #simpleCanonicalClassOf(Class)}</td>
 * <td>{@code "Object.class"}</td>
 * <td>{@code "Iterable.class"}</td>
 * <td>{@code "Enum.class"}</td>
 * <td>{@code "List.class"}</td>
 * <td>{@code "Entry.class"}</td>
 * <td>{@code "EnumMap.class"}</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>{@link #canonicalNameOf(Class)}</td>
 * <td>{@code "Object"}</td>
 * <td>{@code "Iterable"}</td>
 * <td>{@code "Enum"}</td>
 * <td>{@code "java.util.List"}</td>
 * <td>{@code "java.util.Map.Entry"}</td>
 * <td>{@code "java.util.EnumMap"}</td>
 * <td>{@link #canonicalNameOf(Class, Class)}, {@link #canonicalNameOf(Class, Package)},
 * {@link #canonicalNameOf(Class, String)}</td>
 * </tr>
 * <tr>
 * <td>{@link #canonicalClassOf(Class)}</td>
 * <td>{@code "Object.class"}</td>
 * <td>{@code "Iterable.class"}</td>
 * <td>{@code "Enum.class"}</td>
 * <td>{@code "java.util.List.class"}</td>
 * <td>{@code "java.util.Map.Entry.class"}</td>
 * <td>{@code "java.util.EnumMap.class"}</td>
 * <td>{@link #canonicalClassOf(Class, Class)}, {@link #canonicalClassOf(Class, Package)},
 * {@link #canonicalClassOf(Class, String)}</td>
 * </tr>
 * <tr>
 * <td>{@link #canonicalNameWithUnboundTypeParameterNamesOf(Class)}</td>
 * <td>{@code "Object"}</td>
 * <td>{@code "Iterable<?>"}</td>
 * <td>{@code "Enum<?>"}</td>
 * <td>{@code "java.util.List<?>"}</td>
 * <td>{@code "java.util.Map.Entry<?, ?>"}</td>
 * <td>{@code "java.util.EnumMap<?, ?>"}</td>
 * <td>{@link #canonicalNameWithUnboundTypeParameterNamesOf(Class, Class)},
 * {@link #canonicalNameWithUnboundTypeParameterNamesOf(Class, Package)},
 * {@link #canonicalNameWithUnboundTypeParameterNamesOf(Class, String)}</td>
 * </tr>
 * <tr>
 * <td>{@link #listOfTypeParameterNamesOf(Class)}</td>
 * <td>{@code ()}</td>
 * <td>{@code ("T")}</td>
 * <td>{@code ("E")}</td>
 * <td>{@code ("E")}</td>
 * <td>{@code ("K", "V")}</td>
 * <td>{@code ("K", "V")}</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>{@link #createTypeParametersUsage(Class)}</td>
 * <td>{@code ""}</td>
 * <td>{@code "T"}</td>
 * <td>{@code "E"}</td>
 * <td>{@code "E"}</td>
 * <td>{@code "K, V"}</td>
 * <td>{@code "K, V"}</td>
 * <td>{@link #createTypeParametersUsage(Class, Class)}, {@link #createTypeParametersUsage(Class, Package)},
 * {@link #createTypeParametersUsage(Class, String)}</td>
 * </tr>
 * <tr>
 * <td>{@link #canonicalNameWithTypeParameterNamesOf(Class)}</td>
 * <td>{@code "Object"}</td>
 * <td>{@code "Iterable<T>"}</td>
 * <td>{@code "Enum<E>"}</td>
 * <td>{@code "java.util.List<E>"}</td>
 * <td>{@code "java.util.Map.Entry<K, V>"}</td>
 * <td>{@code "java.util.EnumMap<K, V>"}</td>
 * <td>{@link #canonicalNameWithTypeParameterNamesOf(Class, Class)},
 * {@link #canonicalNameWithTypeParameterNamesOf(Class, Package)},
 * {@link #canonicalNameWithTypeParameterNamesOf(Class, String)}</td>
 * </tr>
 * <tr>
 * <td>{@link #listOfTypeParameterDefinitionsOf(Class)}</td>
 * <td>{@code ()}</td>
 * <td>{@code ("T")}</td>
 * <td>{@code ("E extends Enum<E>")}</td>
 * <td>{@code ("E")}</td>
 * <td>{@code ("K", "V")}</td>
 * <td>{@code ("K extends Enum<K>", "V")}</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>{@link #canonicalNameWithTypeParameterDefinitionsOf(Class)}</td>
 * <td>{@code "Object"}</td>
 * <td>{@code "Iterable<T>"}</td>
 * <td>{@code "Enum<E extends Enum<E>>"}</td>
 * <td>{@code "java.util.List<E>"}</td>
 * <td>{@code "java.util.Map.Entry<K, V>"}</td>
 * <td>{@code "java.util.EnumMap<K extends Enum<K>, V>"}</td>
 * <td>{@link #canonicalNameWithTypeParameterDefinitionsOf(Class, Class)},
 * {@link #canonicalNameWithTypeParameterDefinitionsOf(Class, Package)},
 * {@link #canonicalNameWithTypeParameterDefinitionsOf(Class, String)}</td>
 * </tr>
 * </tbody>
 * </table>
 */
public enum NamingUtilities {
    ;

    /**
     * <p>
     * Constant of the very basic Java language package: {@code java.lang}.
     * </p>
     */
    public static final String JAVA_LANG = java.lang.Object.class.getPackage().getName();

    /**
     * <p>
     * Returns the canonical name of the given {@link Package package}.
     * </p>
     *
     * @param pakkage
     *            the given package
     * @return the canonical name of the given {@code package}
     */
    public static final String canonicalNameOf(final Package pakkage) {
        requireNonNull(pakkage);
        return pakkage.getName();
    }

    /**
     * <p>
     * Returns the simple canonical name of the given {@link Class entity}.
     * </p>
     *
     * @param entity
     *            the given entity
     * @return the simple canonical name of the given {@code entity}
     */
    public static final String simpleCanonicalNameOf(final Class<?> entity) {
        requireNonNull(entity);
        return entity.getSimpleName();
    }

    /**
     * <p>
     * Returns the simple canonical class name of the given {@link Class entity} (w/o package, resp. envelope class).
     * </p>
     *
     * @param entity
     *            the given entity
     * @return the simple canonical class name of the given {@code entity}
     */
    public static final String simpleCanonicalClassOf(final Class<?> entity) {
        requireNonNull(entity);
        return simpleCanonicalNameOf(entity) + ".class";
    }

    /**
     * <p>
     * Returns the canonical name of the given {@link Type type}.
     *
     * If the given {@code type} represents a class, its according canonical name is created in relation to
     * {@link #JAVA_LANG}.
     * </p>
     *
     * @param type
     *            the given type
     * @return the canonical name of the given {@code type} (in relation to {@link #JAVA_LANG})
     */
    public static final String canonicalNameOf(final Type type) {
        requireNonNull(type);
        return canonicalNameOf(type, JAVA_LANG);
    }

    /**
     * <p>
     * Returns the canonical name of the given {@link Type type}.
     *
     * If the given {@code type} represents a class, its according canonical name is created in relation to the also
     * given {@code reference} type.
     * </p>
     *
     * @param type
     *            the given type
     * @param reference
     *            the reference type used when resolving the returned canonical name
     * @return the canonical name of the given {@code type} (in relation to the given {@code reference} type)
     */
    public static final String canonicalNameOf(final Type type, final Class<?> reference) {
        requireNonNull(type);
        requireNonNull(reference);
        return canonicalNameOf(type, reference.getPackage());
    }

    /**
     * <p>
     * Returns the canonical name of the given {@link Type type}.
     *
     * If the given {@code type} represents a class, its according canonical name is created in relation to the also
     * given {@code reference} {@linkplain Package package}.
     * </p>
     *
     * @param type
     *            the given type
     * @param reference
     *            the reference package used when resolving the returned canonical name
     * @return the canonical name of the given {@code type} (in relation to the given {@code reference} package)
     */
    public static final String canonicalNameOf(final Type type, final Package reference) {
        requireNonNull(type);
        requireNonNull(reference);
        return canonicalNameOf(type, reference.getName());
    }

    /**
     * <p>
     * Returns the canonical name of the given {@link Type type}.
     *
     *
     * If the given {@code type} represents a class, its according canonical name is created in relation to the also
     * given {@code reference} package name.
     * </p>
     *
     * @param type
     *            the given type
     * @param reference
     *            the reference package name used when resolving the returned canonical name
     * @return the canonical name of the given {@code type} (in relation to the given {@code reference} package name)
     */
    public static final String canonicalNameOf(final Type type, final String reference) {
        requireNonNull(type);
        requireNonNull(reference);
        if (type instanceof Class) {
            /*
             * (1) Check class'ness to return correct value
             *
             * E.g., {@code Map.Entry.class.getCanonicalName()} returns {@code java.util.Map.Entry}
             */
            final Class<?> clazz = (Class<?>) type;
            final Collection<String> accessibleNS = JAVA_LANG.equals(reference) ? singleton(reference) : asList(reference, JAVA_LANG);
            final String typeNS = ofNullable(baseComponentTypeOf(clazz).getPackage()).map(Package::getName).orElse("");
            if (accessibleNS.contains(typeNS)) {
                return (TOP_LEVEL.matches(clazz) ? simpleCanonicalNameOf(clazz) : canonicalNameOf(clazz.getEnclosingClass(), reference) + "."
                                                                                  + simpleCanonicalNameOf(clazz));
            } else {
                return clazz.getCanonicalName();
            }
        } else {
            /*
             * (2) Use type behaviour at the latest case.
             *
             * Otherwise {@code Map.Entry.class.getTypeName()} returns {@code java.util.Map$Entry}
             */
            return type.getTypeName();
        }
    }

    /**
     * <p>
     * Returns the canonical class name of the given {@link Class entity} (in relation to {@link #JAVA_LANG}).
     * </p>
     *
     * @param entity
     *            the given entity
     * @return the canonical class name of the given {@code entity} (in relation to {@link #JAVA_LANG})
     */
    public static final String canonicalClassOf(final Class<?> entity) {
        requireNonNull(entity);
        return canonicalClassOf(entity, JAVA_LANG);
    }

    /**
     * <p>
     * Returns the canonical class name of the given {@link Class entity} (in relation to the given {@code reference}
     * type).
     * </p>
     *
     * @param entity
     *            the given entity
     * @param reference
     *            the reference type used when resolving the returned canonical class name
     * @return the canonical class name of the given {@code entity} (in relation to the given {@code reference} type)
     */
    public static final String canonicalClassOf(final Class<?> entity, final Class<?> reference) {
        requireNonNull(entity);
        requireNonNull(reference);
        return canonicalClassOf(entity, reference.getPackage());
    }

    /**
     * <p>
     * Returns the canonical class name of the given {@link Class entity} (in relation to the given {@code reference}
     * {@linkplain Package package}).
     * </p>
     *
     * @param entity
     *            the given entity
     * @param reference
     *            the reference package used when resolving the returned canonical class name
     * @return the canonical class name of the given {@code entity} (in relation to the given {@code reference} package)
     */
    public static final String canonicalClassOf(final Class<?> entity, final Package reference) {
        requireNonNull(entity);
        requireNonNull(reference);
        return canonicalClassOf(entity, reference.getName());
    }

    /**
     * <p>
     * Returns the canonical class name of the given {@link Class entity} (in relation to the given {@code reference}
     * package name).
     * </p>
     *
     * @param entity
     *            the given entity
     * @param reference
     *            the reference package name used when resolving the returned canonical name
     * @return the canonical class name of the given {@code entity} (in relation to the given {@code reference} package
     *         name)
     */
    public static final String canonicalClassOf(final Class<?> entity, final String reference) {
        requireNonNull(entity);
        requireNonNull(reference);
        return canonicalNameOf(entity, reference) + ".class";
    }

    /**
     * <p>
     * Replaces the last occurrence of {@code []} of a given {@code signature} string by {@code ...} and returns that
     * new string.
     *
     * If there is no {@code []} within the given {@code signature}, that unchanged string will be returned.
     * </p>
     *
     * @param signature
     *            the input signature string
     * @return the {@code ...}-representation of a given {@code []}-style {@code signature}
     */
    private static final String toVarArg(final String signature) {
        requireNonNull(signature);
        if (signature.contains("[]")) {
            // TODO: "contains" und "lastIndexOf"? Ist das nötig?
            final int index = signature.lastIndexOf("[]");
            return signature.substring(0, index) + "..." + signature.substring(index + 2, signature.length());
        } else {
            return signature;
        }
    }

    /**
     * <p>
     * Returns the value similar to {@link Executable#toString()} but replaces the last {@code []} by {@code ...} if the
     * given {@link Executable executable} {@linkplain Executable#isVarArgs() is declared to take a variable number of
     * arguments}.
     * </p>
     *
     * @param executable
     *            the given executable
     * @return the variable-argument aware {@code toString}-representation of the given {@code executable}
     */
    public static final String toVarArgAwareString(final Executable executable) {
        return executable.isVarArgs() ? toVarArg(executable.toString()) : executable.toString();
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
    public static final String javadocNameOf(final Package pakkage) {
        requireNonNull(pakkage);
        return canonicalNameOf(pakkage);
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
    public static final String javadocNameOf(final Class<?> entity) {
        requireNonNull(entity);
        return canonicalNameOf(entity);
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
    public static final String javadocNameOf(final Executable executable) {
        requireNonNull(executable);
        return javadocNameOf(executable.getDeclaringClass(), executable);
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
    public static final String javadocNameOf(final Class<?> base, final Executable executable) {
        requireNonNull(base);
        requireNonNull(executable);
        final String jdType = javadocNameOf(base);
        final String jdExecutable = executable instanceof Constructor ? simpleCanonicalNameOf(executable.getDeclaringClass()) : executable.getName();
        final String jdParameters = csv(stream(executable.getParameterTypes()).map(NamingUtilities::canonicalNameOf));
        return jdType + "#" + jdExecutable + "(" + (executable.isVarArgs() ? toVarArg(jdParameters) : jdParameters) + ")";
    }

    /**
     * <p>
     * Maps {@linkplain Class#getTypeParameters() each parameter} of the given {@link Class type} to the unbound
     * representation ({@code "?"}) and returns a {@linkplain List list} of these values.
     *
     * In case the given type declares no type parameter at all, the returned list will be empty.
     * </p>
     *
     * @param type
     *            the given type
     * @return a list of the type's parameters, each mapped to the unbound representation
     */
    public static final List<String> listOfUnboundTypeParameterNamesOf(final Class<?> type) {
        requireNonNull(type);
        return nCopies(type.getTypeParameters().length, "?");
    }

    /**
     * <p>
     * Returns an unbound representation of the given {@link Class type}; That is, the
     * {@linkplain #canonicalNameOf(Type, String) canonical name of the given type} (in relation to {@link #JAVA_LANG})
     * followed by the {@linkplain Utilities#bcsv(Iterable) bcsv'ed} join of the unbound type's
     * {@linkplain Class#getTypeParameters() parameters}.
     * </p>
     *
     * @param type
     *            the given type
     * @return an unbound representation of the given type
     */
    public static final String canonicalNameWithUnboundTypeParameterNamesOf(final Class<?> type) {
        requireNonNull(type);
        return canonicalNameWithUnboundTypeParameterNamesOf(type, JAVA_LANG);
    }

    /**
     * <p>
     * Returns an unbound representation of the given {@link Class type}; That is, the
     * {@linkplain #canonicalNameOf(Type, String) canonical name of the given type} (in relation to the also given
     * reference type) followed by the {@linkplain Utilities#bcsv(Iterable) bcsv'ed} join of the unbound type's
     * {@linkplain Class#getTypeParameters() parameters}.
     * </p>
     *
     * @param type
     *            the given type
     * @param reference
     *            the reference type used when resolving the type's canonical name
     * @return an unbound representation of the given type
     */
    public static final String canonicalNameWithUnboundTypeParameterNamesOf(final Class<?> type, final Class<?> reference) {
        requireNonNull(type);
        requireNonNull(reference);
        return canonicalNameWithUnboundTypeParameterNamesOf(type, reference.getPackage());
    }

    /**
     * <p>
     * Returns an unbound representation of the given {@link Class type}; That is, the
     * {@linkplain #canonicalNameOf(Type, String) canonical name of the given type} (in relation to the also given
     * reference {@linkplain Package package}) followed by the {@linkplain Utilities#bcsv(Iterable) bcsv'ed} join of the
     * unbound type's {@linkplain Class#getTypeParameters() parameters}.
     * </p>
     *
     * @param type
     *            the given type
     * @param reference
     *            the reference package used when resolving the type's canonical name
     * @return an unbound representation of the given type
     */
    public static final String canonicalNameWithUnboundTypeParameterNamesOf(final Class<?> type, final Package reference) {
        requireNonNull(type);
        requireNonNull(reference);
        return canonicalNameWithUnboundTypeParameterNamesOf(type, reference.getName());
    }

    /**
     * <p>
     * Returns an unbound representation of the given {@link Class type}; That is, the
     * {@linkplain #canonicalNameOf(Type, String) canonical name of the given type} (in relation to the also given
     * reference package name) followed by the {@linkplain Utilities#bcsv(Iterable) bcsv'ed} join of the unbound type's
     * {@linkplain Class#getTypeParameters() parameters}.
     * </p>
     *
     * @param type
     *            the given type
     * @param referencePackage
     *            the reference package name used when resolving the type's canonical name
     * @return an unbound representation of the given type
     */
    public static final String canonicalNameWithUnboundTypeParameterNamesOf(final Class<?> type, final String referencePackage) {
        requireNonNull(type);
        requireNonNull(referencePackage);
        return canonicalNameOf(type, referencePackage) + bcsv(listOfUnboundTypeParameterNamesOf(type));
    }

    /**
     * <p>
     * Returns the definition statement of a given {@link Type type}.
     *
     * In case of a {@linkplain ParameterizedType parameterized type} its according definition statement also contains
     * the definition of {@linkplain ParameterizedType#getActualTypeArguments() each actual type argument}.
     *
     * In case of a {@link Class}-based type its according definition statement is created in relation to the also given
     * reference package name.
     * </p>
     *
     * @param type
     *            the given type
     * @param referencePackage
     *            the reference package name used when creating the returned definition statement
     * @return the definition statement of a given {@link Type type}
     */
    private static final String definitionStatementOf(final Type type, final String referencePackage) {
        requireNonNull(type);
        requireNonNull(referencePackage);
        if (type instanceof ParameterizedType) {
            final ParameterizedType pt = (ParameterizedType) type;
            return canonicalNameOf(pt.getRawType(), referencePackage) + bcsv(listOfTypeArgumentsDefinitionStatementsOf(pt, referencePackage));
        } else if (type instanceof Class) {
            final Class<?> clazz = (Class<?>) type;
            return canonicalNameWithTypeParameterNamesOf(clazz, referencePackage);
        } else {
            return canonicalNameOf(type, referencePackage);
        }
    }

    /**
     * <p>
     * Returns a {@linkplain List list} of the {@linkplain #definitionStatementOf(Type, String) definition statements}
     * of {@linkplain ParameterizedType#getActualTypeArguments() each actual type argument} of the given
     * {@linkplain ParameterizedType parameterized type}.
     * </p>
     *
     * <p>
     * In case of a {@link Class}-based type argument its according definition statement is created in relation to the
     * also given reference package name.
     * </p>
     *
     * @param type
     *            the given parameterized type
     * @param referencePackage
     *            the reference package name used when creating the returned definition statements
     * @return a list of the parameter statements of the given parameterized type's actual type arguments
     */
    private static final List<String> listOfTypeArgumentsDefinitionStatementsOf(final ParameterizedType type, final String referencePackage) {
        requireNonNull(type);
        requireNonNull(referencePackage);
        return stream(type.getActualTypeArguments()).map(a -> definitionStatementOf(a, referencePackage)).collect(toList());
    }

    /**
     * <p>
     * Maps {@linkplain Class#getTypeParameters() each parameter} of the given {@link Class type} to its
     * {@linkplain TypeVariable#getName() name} and returns a {@linkplain List list} of these values.
     * </p>
     *
     * <p>
     * In case the given type declares no type parameter at all, the returned list will be empty.
     * </p>
     *
     * @param type
     *            the given type
     * @return a list of the type's parameters, each mapped to its name
     */
    public static final List<String> listOfTypeParameterNamesOf(final Class<?> type) {
        requireNonNull(type);
        return stream(type.getTypeParameters()).map(TypeVariable::getName).collect(toList());
    }

    /**
     * <p>
     * Returns the {@linkplain Utilities#csv(Iterable) csv'ed} combination either of
     * {@linkplain #listOfTypeArgumentsDefinitionStatementsOf(ParameterizedType, String) the type's arguments definition
     * statements} (if it is a {@linkplain ParameterizedType parameterized type}) or of the
     * {@linkplain #listOfTypeParameterNamesOf(Class) type's parameters} (if it is {@link Class}-based).
     * </p>
     *
     * <p>
     * In case of {@link Class}-based type arguments, resp. type parameters, the according canonical names are created
     * in relation to {@link #JAVA_LANG}.
     * </p>
     *
     * <p>
     * In case of zero type arguments, resp. zero type parameters, the empty {@link String} ({@code ""}) will be
     * returned.
     * </p>
     *
     * @param type
     *            the given type
     * @return the {@linkplain Utilities#csv(Iterable) csv'ed} combination of either the type's arguments or the type's
     *         parameters
     */
    public static final String createTypeParametersUsage(final Type type) {
        requireNonNull(type);
        return createTypeParametersUsage(type, JAVA_LANG);
    }

    /**
     * <p>
     * Returns the {@linkplain Utilities#csv(Iterable) csv'ed} combination either of
     * {@linkplain #listOfTypeArgumentsDefinitionStatementsOf(ParameterizedType, String) the type's arguments definition
     * statements} (if it is a {@linkplain ParameterizedType parameterized type}) or of the
     * {@linkplain #listOfTypeParameterNamesOf(Class) type's parameters} (if it is {@link Class}-based).
     * </p>
     *
     * <p>
     * In case of {@link Class}-based type arguments, resp. type parameters, the according canonical names are created
     * in relation to the also given reference type.
     * </p>
     *
     * <p>
     * In case of zero type arguments, resp. zero type parameters, the empty {@link String} ({@code ""}) will be
     * returned.
     * </p>
     *
     * @param type
     *            the given type
     * @param reference
     *            the reference type name when resolving the type's arguments, resp. the type's parameters
     * @return the {@linkplain Utilities#csv(Iterable) csv'ed} combination of either the type's arguments or the type's
     *         parameters
     */
    public static final String createTypeParametersUsage(final Type type, final Class<?> reference) {
        requireNonNull(type);
        requireNonNull(reference);
        return createTypeParametersUsage(type, reference.getPackage());
    }

    /**
     * <p>
     * Returns the {@linkplain Utilities#csv(Iterable) csv'ed} combination either of
     * {@linkplain #listOfTypeArgumentsDefinitionStatementsOf(ParameterizedType, String) the type's arguments definition
     * statements} (if it is a {@linkplain ParameterizedType parameterized type}) or of the
     * {@linkplain #listOfTypeParameterNamesOf(Class) type's parameters} (if it is {@link Class}-based).
     * </p>
     *
     * <p>
     * In case of {@link Class}-based type arguments, resp. type parameters, the according canonical names are created
     * in relation to the also given reference {@linkplain Package package}.
     * </p>
     *
     * <p>
     * In case of zero type arguments, resp. zero type parameters, the empty {@link String} ({@code ""}) will be
     * returned.
     * </p>
     *
     * @param type
     *            the given type
     * @param reference
     *            the reference package used when resolving the type's arguments, resp. the type's parameters
     * @return the {@linkplain Utilities#csv(Iterable) csv'ed} combination of either the type's arguments or the type's
     *         parameters
     */
    public static final String createTypeParametersUsage(final Type type, final Package reference) {
        requireNonNull(type);
        requireNonNull(reference);
        return createTypeParametersUsage(type, reference.getName());
    }

    /**
     * <p>
     * Returns the {@linkplain Utilities#csv(Iterable) csv'ed} combination either of
     * {@linkplain #listOfTypeArgumentsDefinitionStatementsOf(ParameterizedType, String) the type's arguments definition
     * statements} (if it is a {@linkplain ParameterizedType parameterized type}) or of the
     * {@linkplain #listOfTypeParameterNamesOf(Class) type's parameters} (if it is {@link Class}-based).
     * </p>
     *
     * <p>
     * In case of zero type arguments, resp. zero type parameters, the empty {@link String} ({@code ""}) will be
     * returned.
     * </p>
     *
     * @param type
     *            the given type
     * @param referencePackage
     *            the reference package name used when resolving the type's arguments, resp. the type's parameters
     * @return the {@linkplain Utilities#csv(Iterable) csv'ed} combination of either the type's arguments or the type's
     *         parameters
     */
    public static final String createTypeParametersUsage(final Type type, final String referencePackage) {
        requireNonNull(type);
        requireNonNull(referencePackage);
        if (type instanceof ParameterizedType) {
            final ParameterizedType pt = (ParameterizedType) type;
            return csv(listOfTypeArgumentsDefinitionStatementsOf(pt, referencePackage));
        } else if (type instanceof Class) {
            final Class<?> clazz = (Class<?>) type;
            return csv(listOfTypeParameterNamesOf(clazz));
        } else {
            throw new UnsupportedOperationException("There is no support for the specific kind of type: " + type.getClass());
        }
    }

    /**
     * <p>
     * Returns a parameterised representation of the given {@link Class type}; That is, the
     * {@linkplain #canonicalNameOf(Type, String) canonical name of the given type} (in relation to {@link #JAVA_LANG})
     * followed by the {@linkplain Utilities#bcsv(Iterable) bcsv'ed} join of the
     * {@linkplain #listOfTypeParameterNamesOf(Class) type's parameter names}.
     * </p>
     *
     * @param type
     *            the given type
     * @return an unbound representation of the given type
     */
    public static final String canonicalNameWithTypeParameterNamesOf(final Class<?> type) {
        requireNonNull(type);
        return canonicalNameWithTypeParameterNamesOf(type, JAVA_LANG);
    }

    /**
     * <p>
     * Returns a parameterised representation of the given {@link Class type}; That is, the
     * {@linkplain #canonicalNameOf(Type, String) canonical name of the given type} (in relation to the also given
     * reference type) followed by the {@linkplain Utilities#bcsv(Iterable) bcsv'ed} join of the
     * {@linkplain #listOfTypeParameterNamesOf(Class) type's parameter names}.
     * </p>
     *
     * @param type
     *            the given type
     * @param reference
     *            the reference type used when resolving the type's canonical name
     * @return an unbound representation of the given type
     */
    public static final String canonicalNameWithTypeParameterNamesOf(final Class<?> type, final Class<?> reference) {
        requireNonNull(type);
        requireNonNull(reference);
        return canonicalNameWithTypeParameterNamesOf(type, reference.getPackage());
    }

    /**
     * <p>
     * Returns a parameterised representation of the given {@link Class type}; That is, the
     * {@linkplain #canonicalNameOf(Type, String) canonical name of the given type} (in relation to the also given
     * reference {@linkplain Package package}) followed by the {@linkplain Utilities#bcsv(Iterable) bcsv'ed} join of the
     * {@linkplain #listOfTypeParameterNamesOf(Class) type's parameter names}.
     * </p>
     *
     * @param type
     *            the given type
     * @param reference
     *            the reference package used when resolving the type's canonical name
     * @return an unbound representation of the given type
     */
    public static final String canonicalNameWithTypeParameterNamesOf(final Class<?> type, final Package reference) {
        requireNonNull(type);
        requireNonNull(reference);
        return canonicalNameWithTypeParameterNamesOf(type, reference.getName());
    }

    /**
     * <p>
     * Returns a parameterised representation of the given {@link Class type}; That is, the
     * {@linkplain #canonicalNameOf(Type, String) canonical name of the given type} (in relation to the also given
     * reference package name) followed by the {@linkplain Utilities#bcsv(Iterable) bcsv'ed} join of the
     * {@linkplain #listOfTypeParameterNamesOf(Class) type's parameter names}.
     * </p>
     *
     * @param type
     *            the given type
     * @param referencePackage
     *            the reference package name used when resolving the type's canonical name
     * @return an unbound representation of the given type
     */
    public static final String canonicalNameWithTypeParameterNamesOf(final Class<?> type, final String referencePackage) {
        requireNonNull(type);
        requireNonNull(referencePackage);
        return canonicalNameOf(type, referencePackage) + bcsv(listOfTypeParameterNamesOf(type));
    }

    /**
     * <p>
     * Maps {@linkplain Class#getTypeParameters() each parameter} of the given {@link Class type} to its definition
     * statement and returns a {@linkplain List list} of these values.
     * </p>
     *
     * <p>
     * In case of a type parameter with {@link Class}-based upper-bounds these bounds are stated in relation to
     * {@link #JAVA_LANG}. (Further, in order to decrease verbosity the definition statement does not comprise
     * {@link Object} as an upper bound.)
     *
     * In case the given type declares no type parameter at all, the returned list will be empty.
     * </p>
     *
     * @param type
     *            the given type
     * @return a list of the type's parameters, each mapped to its definition statement
     */
    public static final List<String> listOfTypeParameterDefinitionsOf(final Class<?> type) {
        requireNonNull(type);
        return listOfTypeParameterDefinitionsOf(type, JAVA_LANG);
    }

    /**
     * <p>
     * Maps {@linkplain Class#getTypeParameters() each parameter} of the given {@link Class type} to its definition
     * statement and returns a {@linkplain List list} of these values.
     * </p>
     *
     * <p>
     * In case of a type parameter with {@link Class}-based upper-bounds these bounds are stated in relation to the also
     * given reference type. (Further, in order to decrease verbosity the definition statement does not comprise
     * {@link Object} as an upper bound.)
     * </p>
     *
     * <p>
     * In case the given type declares no type parameter at all, the returned list will be empty.
     * </p>
     *
     * @param type
     *            the given type
     * @param reference
     *            the reference type used when stating {@link Class}-based upper-bounds
     * @return a list of the type's parameters, each mapped to its definition statement
     */
    public static final List<String> listOfTypeParameterDefinitionsOf(final Class<?> type, final Class<?> reference) {
        requireNonNull(type);
        requireNonNull(reference);
        return listOfTypeParameterDefinitionsOf(type, reference.getPackage());
    }

    /**
     * <p>
     * Maps {@linkplain Class#getTypeParameters() each parameter} of the given {@link Class type} to its definition
     * statement and returns a {@linkplain List list} of these values.
     * </p>
     *
     * <p>
     * In case of a type parameter with {@link Class}-based upper-bounds these bounds are stated in relation to the also
     * given reference {@linkplain Package package}. (Further, in order to decrease verbosity the definition statement
     * does not comprise {@link Object} as an upper bound.)
     * </p>
     *
     * <p>
     * In case the given type declares no type parameter at all, the returned list will be empty.
     * </p>
     *
     * @param type
     *            the given type
     * @param reference
     *            the reference package used when stating {@link Class}-based upper-bounds
     * @return a list of the type's parameters, each mapped to its definition statement
     */
    public static final List<String> listOfTypeParameterDefinitionsOf(final Class<?> type, final Package reference) {
        requireNonNull(type);
        requireNonNull(reference);
        return listOfTypeParameterDefinitionsOf(type, reference.getName());
    }

    /**
     * <p>
     * Maps {@linkplain Class#getTypeParameters() each parameter} of the given {@link Class type} to its definition
     * statement and returns a {@linkplain List list} of these values.
     * </p>
     *
     * <p>
     * In case of a type parameter with {@link Class}-based upper-bounds these bounds are stated in relation to the also
     * given reference package name. (Further, in order to decrease verbosity the definition statement does not comprise
     * {@link Object} as an upper bound.)
     * </p>
     *
     * <p>
     * In case the given type declares no type parameter at all, the returned list will be empty.
     * </p>
     *
     * @param type
     *            the given type
     * @param referencePackage
     *            the reference package name used when stating {@link Class}-based upper-bounds
     * @return a list of the type's parameters, each mapped to its definition statement
     */
    public static final List<String> listOfTypeParameterDefinitionsOf(final Class<?> type, final String referencePackage) {
        requireNonNull(type);
        requireNonNull(referencePackage);
        return Arrays.stream(type.getTypeParameters()) //
                     .map(tv -> tv.getName() //
                                + OptionalString.ofEmptyable(csv(Arrays.stream(tv.getBounds()) //
                                                                       .filter(t -> !Object.class.equals(t)) //
                                                                       .map(t -> definitionStatementOf(t, referencePackage)))) //
                                                .prepend(" extends ") //
                                                .orElse("")) //
                     .collect(toList());
    }

    /**
     * <p>
     * Returns a complete definition representation of the given {@link Class type}; That is, the
     * {@linkplain #canonicalNameOf(Type, String) canonical name of the given type} (in relation to {@link #JAVA_LANG})
     * followed by the {@linkplain Utilities#bcsv(Iterable) bcsv'ed} join of the
     * {@linkplain #listOfTypeParameterDefinitionsOf(Class) type's parameter definition statements}. (These definitions
     * are similarly stated in relation to {@link #JAVA_LANG}.)
     * </p>
     *
     * @param type
     *            the given type
     * @return an unbound representation of the given type
     */
    public static final String canonicalNameWithTypeParameterDefinitionsOf(final Class<?> type) {
        requireNonNull(type);
        return canonicalNameWithTypeParameterDefinitionsOf(type, JAVA_LANG);
    }

    /**
     * <p>
     * Returns a complete definition representation of the given {@link Class type}; That is, the
     * {@linkplain #canonicalNameOf(Type, String) canonical name of the given type} (in relation to the also given
     * reference type) followed by the {@linkplain Utilities#bcsv(Iterable) bcsv'ed} join of the
     * {@linkplain #listOfTypeParameterDefinitionsOf(Class) type's parameter definition statements}. (These definitions
     * are similarly stated in relation to the also given reference type.)
     * </p>
     *
     * @param type
     *            the given type
     * @param reference
     *            the reference type used when stating {@link Class}-based upper-bounds
     * @return an unbound representation of the given type
     */
    public static final String canonicalNameWithTypeParameterDefinitionsOf(final Class<?> type, final Class<?> reference) {
        requireNonNull(type);
        requireNonNull(reference);
        return canonicalNameWithTypeParameterDefinitionsOf(type, reference.getPackage());
    }

    /**
     * <p>
     * Returns a complete definition representation of the given {@link Class type}; That is, the
     * {@linkplain #canonicalNameOf(Type, String) canonical name of the given type} (in relation to the also given
     * reference {@linkplain Package package}) followed by the {@linkplain Utilities#bcsv(Iterable) bcsv'ed} join of the
     * {@linkplain #listOfTypeParameterDefinitionsOf(Class) type's parameter definition statements}. (These definitions
     * are similarly stated in relation to the also given reference package.)
     * </p>
     *
     * @param type
     *            the given type
     * @param reference
     *            the reference package used when stating {@link Class}-based upper-bounds
     * @return an unbound representation of the given type
     */
    public static final String canonicalNameWithTypeParameterDefinitionsOf(final Class<?> type, final Package reference) {
        requireNonNull(type);
        requireNonNull(reference);
        return canonicalNameWithTypeParameterDefinitionsOf(type, reference.getName());
    }

    /**
     * <p>
     * Returns a complete definition representation of the given {@link Class type}; That is, the
     * {@linkplain #canonicalNameOf(Type, String) canonical name of the given type} (in relation to the also given
     * reference package name) followed by the {@linkplain Utilities#bcsv(Iterable) bcsv'ed} join of the
     * {@linkplain #listOfTypeParameterDefinitionsOf(Class) type's parameter definition statements}. (These definitions
     * are similarly stated in relation to the also given reference package name.)
     * </p>
     *
     * @param type
     *            the given type
     * @param referencePackage
     *            the reference package name used when stating {@link Class}-based upper-bounds
     * @return an unbound representation of the given type
     */
    public static final String canonicalNameWithTypeParameterDefinitionsOf(final Class<?> type, final String referencePackage) {
        requireNonNull(type);
        requireNonNull(referencePackage);
        return canonicalNameOf(type, referencePackage) + bcsv(listOfTypeParameterDefinitionsOf(type, referencePackage));
    }

}
