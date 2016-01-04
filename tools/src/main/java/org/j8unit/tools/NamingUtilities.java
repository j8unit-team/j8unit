package org.j8unit.tools;

import static java.util.Arrays.asList;
import static java.util.Arrays.stream;
import static java.util.Collections.nCopies;
import static java.util.Collections.singletonList;
import static java.util.Objects.requireNonNull;
import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.toList;
import static org.j8unit.tools.GeneratorAnalysis.baseComponentTypeOf;
import static org.j8unit.tools.TypeKind.TOP_LEVEL;
import static org.j8unit.tools.util.OptionalString.ofEmptyable;
import static org.j8unit.tools.util.Utilities.bcsv;
import static org.j8unit.tools.util.Utilities.csv;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.List;

public enum NamingUtilities {
    ;

    public static final String JAVA_LANG = java.lang.Object.class.getPackage().getName();

    static {
        assert "java.lang".equals(JAVA_LANG);
    }

    public static final String canonicalNameOf(final Package pakkage) {
        requireNonNull(pakkage);
        return pakkage.getName();
    }

    public static final String simpleCanonicalNameOf(final Class<?> clazz) {
        requireNonNull(clazz);
        return clazz.getSimpleName();
    }

    /**
     * Returns the simple (canonical) class for a given {@link Class} (w/o package, resp. envelope class).
     *
     * @see #simpleCanonicalNameOf(Class)
     *
     * @param clazz
     *            some {@link Class} to inspect
     * @return simple class of the given {@link Class}
     */
    public static final String simpleCanonicalClassOf(final Class<?> clazz) {
        requireNonNull(clazz);
        return simpleCanonicalNameOf(clazz) + ".class";
    }

    public static final String canonicalNameOf(final Type type) {
        requireNonNull(type);
        return canonicalNameOf(type, JAVA_LANG);
    }

    public static final String canonicalNameOf(final Type type, final Class<?> reference) {
        requireNonNull(type);
        requireNonNull(reference);
        return canonicalNameOf(type, reference.getPackage());
    }

    public static final String canonicalNameOf(final Type type, final Package reference) {
        requireNonNull(type);
        requireNonNull(reference);
        return canonicalNameOf(type, reference.getName());
    }

    public static final String canonicalNameOf(final Type type, final String reference) {
        requireNonNull(type);
        requireNonNull(reference);
        // ((Class) Map.Entry).getCanonicalName() --> java.util.Map.Entry
        // ( (Type) Map.Entry).getTypeName() --> java.util.Map$Entry
        if (type instanceof Class) {
            final Class<?> clazz = (Class<?>) type;
            final List<String> accessibleNS = JAVA_LANG.equals(reference) ? singletonList(reference) : asList(reference, JAVA_LANG);
            final String currentNS = ofNullable(baseComponentTypeOf(clazz).getPackage()).map(Package::getName).orElse("");
            if (accessibleNS.contains(currentNS)) {
                return (TOP_LEVEL.matches(clazz) ? simpleCanonicalNameOf(clazz) : canonicalNameOf(clazz.getEnclosingClass(), reference) + "."
                                                                                  + simpleCanonicalNameOf(clazz));
            } else {
                return clazz.getCanonicalName();
            }
        } else {
            return type.getTypeName();
        }
    }

    /**
     * Returns the (canonical) class for a given {@link Class}.
     *
     * @see #canonicalNameOf(Class)
     *
     * @param clazz
     *            some {@link Class} to inspect
     * @return class of the given {@link Class}
     */
    public static final String canonicalClassOf(final Class<?> clazz) {
        requireNonNull(clazz);
        return canonicalClassOf(clazz, JAVA_LANG);
    }

    public static final String canonicalClassOf(final Class<?> clazz, final Class<?> reference) {
        requireNonNull(clazz);
        requireNonNull(reference);
        return canonicalClassOf(clazz, reference.getPackage());
    }

    public static final String canonicalClassOf(final Class<?> clazz, final Package reference) {
        requireNonNull(clazz);
        requireNonNull(reference);
        return canonicalClassOf(clazz, reference.getName());
    }

    public static final String canonicalClassOf(final Class<?> clazz, final String reference) {
        requireNonNull(clazz);
        requireNonNull(reference);
        return canonicalNameOf(clazz, reference) + ".class";
    }

    private static final String toVararg(final String signature) {
        requireNonNull(signature);
        if (signature.contains("[]")) {
            return signature.substring(0, signature.lastIndexOf("[]")) + "..." + signature.substring(signature.lastIndexOf("[]") + 2, signature.length());
        } else {
            return signature;
        }
    }

    public static final String toVarArgAwareString(final Executable executable) {
        return executable.isVarArgs() ? toVararg(executable.toString()) : executable.toString();
    }

    public static final String javadocNameOf(final Package pakkage) {
        requireNonNull(pakkage);
        return canonicalNameOf(pakkage);
    }

    public static final String javadocNameOf(final Executable executable) {
        requireNonNull(executable);
        return javadocNameOf(executable.getDeclaringClass(), executable);
    }

    /**
     * {@link String#String(String)}
     *
     * @param customBase
     * @param executable
     * @return
     */
    public static final String javadocNameOf(final Class<?> customBase, final Executable executable) {
        requireNonNull(customBase);
        requireNonNull(executable);
        final String jdClass = canonicalNameOf(customBase);
        final String jdMethod = executable instanceof Constructor ? simpleCanonicalNameOf(executable.getDeclaringClass()) : executable.getName();
        final String jdParameters = csv(stream(executable.getParameterTypes()).map(NamingUtilities::canonicalNameOf));
        return jdClass + "#" + jdMethod + "(" + (executable.isVarArgs() ? toVararg(jdParameters) : jdParameters) + ")";
    }

    private static final List<String> listOfTypeParameterStatementsOf(final ParameterizedType type, final String reference) {
        requireNonNull(type);
        requireNonNull(reference);
        return stream(type.getActualTypeArguments()).map(t -> createTypeParameterStatementOf(t, reference)).collect(toList());
    }

    private static final String createTypeParameterStatementOf(final Type type, final String reference) {
        requireNonNull(type);
        requireNonNull(reference);
        if (type instanceof ParameterizedType) {
            final ParameterizedType pt = (ParameterizedType) type;
            return canonicalNameOf(pt.getRawType(), reference) + bcsv(listOfTypeParameterStatementsOf(pt, reference));
        } else {
            return canonicalNameOf(type, reference);
        }
    }

    public static final String createTypeParametersUsage(final Type type) {
        // type can (!) be null
        return createTypeParametersUsage(type, JAVA_LANG);
    }

    public static final String createTypeParametersUsage(final Type type, final Class<?> reference) {
        // type can (!) be null
        requireNonNull(reference);
        return createTypeParametersUsage(type, reference.getPackage());
    }

    public static final String createTypeParametersUsage(final Type type, final Package reference) {
        // type can (!) be null
        requireNonNull(reference);
        return createTypeParametersUsage(type, reference.getName());
    }

    public static final String createTypeParametersUsage(final Type type, final String reference) {
        // type can (!) be null
        requireNonNull(reference);
        if (type == null) {
            return "";
        } else if (type instanceof ParameterizedType) {
            return csv(listOfTypeParameterStatementsOf((ParameterizedType) type, reference));
        } else if (type instanceof Class) {
            return csv(listOfTypeParameterNamesOf((Class<?>) type));
        } else {
            return "";
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

    public static final List<String> listOfTypeParameterNamesOf(final Class<?> clazz) {
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
        return canonicalNameOf(clazz, reference) + bcsv(listOfTypeParameterNamesOf(clazz));
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
                                                        .map(t -> createTypeParameterStatementOf(t, reference)))) //
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
