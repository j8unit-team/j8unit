package org.j8unit.tools.util;

import static java.util.Arrays.asList;
import static java.util.Arrays.stream;
import static java.util.Collections.nCopies;
import static java.util.Collections.singleton;
import static java.util.Objects.requireNonNull;
import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.toList;
import static org.j8unit.tools.util.OptionalString.ofEmptyable;
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

public enum NamingUtilities {
    ;

    /**
     * Constant of the very basic Java language package: {@code java.lang}.
     */
    public static final String JAVA_LANG = java.lang.Object.class.getPackage().getName();

    /**
     * Returns the canonical name of the given {@linkplain Package package}.
     *
     * @param pakkage
     *            the given package
     * @return the canonical name of the given package
     */
    public static final String canonicalNameOf(final Package pakkage) {
        requireNonNull(pakkage);
        return pakkage.getName();
    }

    /**
     * Returns the simple canonical name of the given {@linkplain Class type}.
     *
     * @param type
     *            the given type
     * @return the simple canonical name of the given type
     */
    public static final String simpleCanonicalNameOf(final Class<?> type) {
        requireNonNull(type);
        return type.getSimpleName();
    }

    /**
     * Returns the simple canonical {@code class} name of the given {@linkplain Class type} (w/o package, resp. envelope
     * class).
     *
     * @param type
     *            the given type
     * @return the simple canonical {@code class} name of the given type
     */
    public static final String simpleCanonicalClassOf(final Class<?> type) {
        requireNonNull(type);
        return simpleCanonicalNameOf(type) + ".class";
    }

    /**
     * Returns the canonical name of the given {@linkplain Type type}; In case of a {@link Class}-based type its
     * according canonical name is created in relation to {@link #JAVA_LANG}.
     *
     * @param type
     *            the given type
     * @return the canonical name of the given type (in relation to {@link #JAVA_LANG})
     */
    public static final String canonicalNameOf(final Type type) {
        requireNonNull(type);
        return canonicalNameOf(type, JAVA_LANG);
    }

    /**
     * Returns the canonical name of the given {@linkplain Type type}; In case of a {@link Class}-based type its
     * according canonical name is created in relation to the also given reference type.
     *
     * @param type
     *            the given type
     * @param reference
     *            the reference type when resolving the returned canonical name
     * @return the canonical name of the given type (in relation to the given reference type)
     */
    public static final String canonicalNameOf(final Type type, final Class<?> reference) {
        requireNonNull(type);
        requireNonNull(reference);
        return canonicalNameOf(type, reference.getPackage());
    }

    /**
     * Returns the canonical name of the given {@linkplain Type type}; In case of a {@link Class}-based type its
     * according canonical name is created in relation to the also given reference {@linkplain Package package}.
     *
     * @param type
     *            the given type
     * @param reference
     *            the reference package when resolving the returned canonical name
     * @return the canonical name of the given type (in relation to the given reference package)
     */
    public static final String canonicalNameOf(final Type type, final Package reference) {
        requireNonNull(type);
        requireNonNull(reference);
        return canonicalNameOf(type, reference.getName());
    }

    /**
     * Returns the canonical name of the given {@linkplain Type type}; In case of a {@link Class}-based type its
     * according canonical name is created in relation to the also given reference package name.
     *
     * @param type
     *            the given type
     * @param referencePackage
     *            the reference package name when resolving the returned canonical name
     * @return the canonical name of the given type (in relation to the given reference package name)
     */
    public static final String canonicalNameOf(final Type type, final String referencePackage) {
        requireNonNull(type);
        requireNonNull(referencePackage);
        if (type instanceof Class) {
            /*
             * (1) Check class'ness to return correct value
             *
             * E.g., {@code Map.Entry.class.getCanonicalName()} returns {@code java.util.Map.Entry}
             */
            final Class<?> clazz = (Class<?>) type;
            final Collection<String> accessibleNS = JAVA_LANG.equals(referencePackage) ? singleton(referencePackage) : asList(referencePackage, JAVA_LANG);
            final String typeNS = ofNullable(baseComponentTypeOf(clazz).getPackage()).map(Package::getName).orElse("");
            if (accessibleNS.contains(typeNS)) {
                return (TOP_LEVEL.matches(clazz) ? simpleCanonicalNameOf(clazz) : canonicalNameOf(clazz.getEnclosingClass(), referencePackage) + "."
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
     * Returns the canonical {@code class} name of the given {@linkplain Class type} (in relation to {@link #JAVA_LANG}
     * ).
     *
     * @param type
     *            the given type
     * @return the canonical {@code class} name of the given type (in relation to {@link #JAVA_LANG})
     */
    public static final String canonicalClassOf(final Class<?> clazz) {
        requireNonNull(clazz);
        return canonicalClassOf(clazz, JAVA_LANG);
    }

    /**
     * Returns the canonical {@code class} name of the given {@linkplain Class type} (in relation to the given reference
     * type).
     *
     * @param type
     *            the given type
     * @param reference
     *            the reference type when resolving the returned canonical {@code class} name
     * @return the canonical {@code class} name of the given type (in relation to the given reference type)
     */
    public static final String canonicalClassOf(final Class<?> clazz, final Class<?> reference) {
        requireNonNull(clazz);
        requireNonNull(reference);
        return canonicalClassOf(clazz, reference.getPackage());
    }

    /**
     * Returns the canonical {@code class} name of the given {@linkplain Class type} (in relation to the given reference
     * {@linkplain Package package}).
     *
     * @param type
     *            the given type
     * @param reference
     *            the reference package when resolving the returned canonical {@code class} name
     * @return the canonical {@code class} name of the given type (in relation to the given reference package)
     */
    public static final String canonicalClassOf(final Class<?> clazz, final Package reference) {
        requireNonNull(clazz);
        requireNonNull(reference);
        return canonicalClassOf(clazz, reference.getName());
    }

    /**
     * Returns the canonical {@code class} name of the given {@linkplain Class type} (in relation to the given reference
     * package name).
     *
     * @param type
     *            the given type
     * @param referencePackage
     *            the reference package name when resolving the returned canonical name
     * @return the canonical {@code class} name of the given type (in relation to the given reference package name)
     */
    public static final String canonicalClassOf(final Class<?> clazz, final String referencePackage) {
        requireNonNull(clazz);
        requireNonNull(referencePackage);
        return canonicalNameOf(clazz, referencePackage) + ".class";
    }

    /**
     * Replaces the last occurrence of {@code []} by {@code ...} and returns that new {@linkplain String string}.
     *
     * If there is no {@code []} within the given string, that unchanged string will be returned.
     *
     * @param signature
     *            the given string
     * @return the {@code ...}-representation of a given {@code []}-style string
     */
    private static final String toVarArg(final String signature) {
        requireNonNull(signature);
        if (signature.contains("[]")) {
            return signature.substring(0, signature.lastIndexOf("[]")) + "..." + signature.substring(signature.lastIndexOf("[]") + 2, signature.length());
        } else {
            return signature;
        }
    }

    /**
     * Returns the value similar to {@link Executable#toString()} but replaces the last {@code []} by {@code ...} if the
     * given {@linkplain Executable executable} is declared to take a variable number of arguments.
     *
     * @param executable
     *            the given executable
     * @return the variable-argument aware {@linkplain Executable#toString() toString} representation of the given
     *         executable
     */
    public static final String toVarArgAwareString(final Executable executable) {
        return executable.isVarArgs() ? toVarArg(executable.toString()) : executable.toString();
    }

    /**
     * Returns the JavaDoc representation of a given {@linkplain Package package}.
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
     * Returns the JavaDoc representation of a given {@linkplain Class type}.
     *
     * @param type
     *            the given type
     * @return the JavaDoc representation of the given type
     */
    public static final String javadocNameOf(final Class<?> type) {
        requireNonNull(type);
        return canonicalNameOf(type);
    }

    /**
     * Returns the JavaDoc representation of a given {@linkplain Executable executable}.
     *
     * @param executable
     *            the given executable
     * @return the JavaDoc representation of the given executable
     */
    public static final String javadocNameOf(final Executable executable) {
        requireNonNull(executable);
        return javadocNameOf(executable.getDeclaringClass(), executable);
    }

    /**
     * Returns the JavaDoc representation of a given {@linkplain Executable executable} as if defined by the given base
     * {@linkplain Class type}.
     *
     * @param baseType
     *            the given base type
     * @param executable
     *            the given executable
     * @return the JavaDoc representation of the given executable as if defined by the given base type
     */
    public static final String javadocNameOf(final Class<?> baseType, final Executable executable) {
        requireNonNull(baseType);
        requireNonNull(executable);
        final String jdType = javadocNameOf(baseType);
        final String jdExecutable = executable instanceof Constructor ? simpleCanonicalNameOf(executable.getDeclaringClass()) : executable.getName();
        final String jdParameters = csv(stream(executable.getParameterTypes()).map(NamingUtilities::canonicalNameOf));
        return jdType + "#" + jdExecutable + "(" + (executable.isVarArgs() ? toVarArg(jdParameters) : jdParameters) + ")";
    }

    /**
     * Returns the definition statement of a given {@linkplain Type type}.
     *
     * In case of a {@linkplain ParameterizedType parameterized type} its according definition statement also contains
     * the definition of {@linkplain ParameterizedType#getActualTypeArguments() each actual type argument}.
     *
     * In case of a {@link Class}-based type its according definition statement is created in relation to the also given
     * reference package name.
     *
     * @param type
     *            the given type
     * @param referencePackage
     *            the reference package name when resolving the returned canonical name
     * @return the definition statement of a given {@linkplain Type type}
     */
    private static final String definitionStatementOf(final Type type, final String referencePackage) {
        requireNonNull(type);
        requireNonNull(referencePackage);
        if (type instanceof ParameterizedType) {
            final ParameterizedType pt = (ParameterizedType) type;
            return canonicalNameOf(pt.getRawType(), referencePackage) + bcsv(definitionStatementsOfTypeArgumentsOf(pt, referencePackage));
        } else {
            return canonicalNameOf(type, referencePackage);
        }
    }

    /**
     * Returns a {@linkplain List list} of the {@linkplain #definitionStatementOf(Type, String) definition statements}
     * of {@linkplain ParameterizedType#getActualTypeArguments() each actual type argument} of the given
     * {@linkplain ParameterizedType parameterized type}.
     *
     * In case of a {@link Class}-based type argument its according definition statement is created in relation to the
     * also given reference package name.
     *
     * @param type
     *            the given parameterized type
     * @param referencePackage
     *            the reference package name when resolving the returned canonical name
     * @return a list of the parameter statements of the given parameterized type's actual type arguments
     */
    private static final List<String> definitionStatementsOfTypeArgumentsOf(final ParameterizedType type, final String referencePackage) {
        requireNonNull(type);
        requireNonNull(referencePackage);
        return stream(type.getActualTypeArguments()).map(a -> definitionStatementOf(a, referencePackage)).collect(toList());
    }

    public static final String createTypeParametersUsage(final Type type) {
        requireNonNull(type);
        return createTypeParametersUsage(type, JAVA_LANG);
    }

    public static final String createTypeParametersUsage(final Type type, final Class<?> reference) {
        requireNonNull(type);
        requireNonNull(reference);
        return createTypeParametersUsage(type, reference.getPackage());
    }

    public static final String createTypeParametersUsage(final Type type, final Package reference) {
        requireNonNull(type);
        requireNonNull(reference);
        return createTypeParametersUsage(type, reference.getName());
    }

    /**
     * Returns the {@linkplain Utilities#csv(Iterable) csv'ed} combination of either
     * {@linkplain #definitionStatementsOfTypeArgumentsOf(ParameterizedType, String) the type's arguments definition
     * statements} (if it is a {@linkplain ParameterizedType parameterized type}) or the
     * {@linkplain #namesOfTypeParametersOf(Class) type's parameters }
     *
     *
     * {@link ParameterizedType#getActualTypeArguments()} {@link Class#getTypeParameters()}
     *
     * @param type
     * @param reference
     * @return
     */
    private static final String createTypeParametersUsage(final Type type, final String reference) {
        requireNonNull(type);
        requireNonNull(reference);
        if (type instanceof ParameterizedType) {
            return csv(definitionStatementsOfTypeArgumentsOf((ParameterizedType) type, reference));
        } else if (type instanceof Class) {
            return csv(namesOfTypeParametersOf((Class<?>) type));
            // TODO: DO we need that?:
            // } else if (type instanceof TypeVariable) {
            // return ((TypeVariable<?>) type).getName();
        } else {
            throw new UnsupportedOperationException("There is no support for the specific kind of type: " + type.getClass());
        }
    }

    public static final List<String> listOfUnboundTypeParameterNamesOf(final Class<?> clazz) {
        requireNonNull(clazz);
        return nCopies(clazz.getTypeParameters().length, "?");
    }

    public static final String canonicalNameWithUnboundTypeParameterNamesOf(final Class<?> clazz) {
        requireNonNull(clazz);
        return canonicalNameOf(clazz) + bcsv(listOfUnboundTypeParameterNamesOf(clazz));
    }

    /**
     * Returns a {@linkplain List list} of the {@linkplain TypeVariable#getName() names} of
     * {@linkplain Class#getTypeParameters() each type parameter} of the given {@linkplain Class type}.
     *
     * In case the given type declares no type variables, the list will be empty.
     *
     * @param clazz
     *            the given type
     * @return a list of the type's type parameters' names
     */
    public static final List<String> namesOfTypeParametersOf(final Class<?> clazz) {
        requireNonNull(clazz);
        return stream(clazz.getTypeParameters()).map(TypeVariable::getName).collect(toList());
    }

    public static final String canonicalNameWithTypeParameterNamesOf(final Class<?> clazz) {
        requireNonNull(clazz);
        return canonicalNameWithTypeParameterNamesOf(clazz, JAVA_LANG);
    }

    public static final String canonicalNameWithTypeParameterNamesOf(final Class<?> clazz, final Class<?> reference) {
        requireNonNull(clazz);
        requireNonNull(reference);
        return canonicalNameWithTypeParameterNamesOf(clazz, reference.getPackage());
    }

    public static final String canonicalNameWithTypeParameterNamesOf(final Class<?> clazz, final Package reference) {
        requireNonNull(clazz);
        requireNonNull(reference);
        return canonicalNameWithTypeParameterNamesOf(clazz, reference.getName());
    }

    public static final String canonicalNameWithTypeParameterNamesOf(final Class<?> clazz, final String reference) {
        requireNonNull(clazz);
        requireNonNull(reference);
        return canonicalNameOf(clazz, reference) + bcsv(namesOfTypeParametersOf(clazz));
    }

    public static final List<String> listOfTypeParameterDefinitionsOf(final Class<?> clazz) {
        requireNonNull(clazz);
        return listOfTypeParameterDefinitionsOf(clazz, JAVA_LANG);
    }

    public static final List<String> listOfTypeParameterDefinitionsOf(final Class<?> clazz, final Class<?> reference) {
        requireNonNull(clazz);
        requireNonNull(reference);
        return listOfTypeParameterDefinitionsOf(clazz, reference.getPackage());
    }

    public static final List<String> listOfTypeParameterDefinitionsOf(final Class<?> clazz, final Package reference) {
        requireNonNull(clazz);
        requireNonNull(reference);
        return listOfTypeParameterDefinitionsOf(clazz, reference.getName());
    }

    public static final List<String> listOfTypeParameterDefinitionsOf(final Class<?> clazz, final String reference) {
        requireNonNull(clazz);
        requireNonNull(reference);
        return Arrays.stream(clazz.getTypeParameters()) //
                     .map(tv -> tv.toString() //
                                + ofEmptyable(csv(Arrays.stream(tv.getBounds()) //
                                                        .filter(t -> !Object.class.equals(t)) //
                                                        .map(t -> definitionStatementOf(t, reference)))) //
                                                                                                         .prepend(" extends ") //
                                                                                                         .orElse("")) //
                     .collect(toList());
    }

    public static final String canonicalNameWithTypeParameterDefinitionsOf(final Class<?> clazz) {
        requireNonNull(clazz);
        return canonicalNameWithTypeParameterDefinitionsOf(clazz, JAVA_LANG);
    }

    public static final String canonicalNameWithTypeParameterDefinitionsOf(final Class<?> clazz, final Class<?> reference) {
        requireNonNull(clazz);
        requireNonNull(reference);
        return canonicalNameWithTypeParameterDefinitionsOf(clazz, reference.getPackage());
    }

    public static final String canonicalNameWithTypeParameterDefinitionsOf(final Class<?> clazz, final Package reference) {
        requireNonNull(clazz);
        requireNonNull(reference);
        return canonicalNameWithTypeParameterDefinitionsOf(clazz, reference.getName());
    }

    public static final String canonicalNameWithTypeParameterDefinitionsOf(final Class<?> clazz, final String reference) {
        requireNonNull(clazz);
        requireNonNull(reference);
        return canonicalNameOf(clazz, reference) + bcsv(listOfTypeParameterDefinitionsOf(clazz, reference));
    }

}
