package org.j8unit.tools;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public enum GeneratorUtil {
    ;

    public static final String getClassNameWithTypeVariableNames(final Class<?> clazz, final Membership membership) {
        final String tpUsage = stream(clazz.getTypeParameters()).map(TypeVariable::getName).collect(joining(","));
        final String name = GeneratorSetup.getClassName(clazz) + (tpUsage.isEmpty() ? "" : "<" + tpUsage + ">");
        switch (membership) {
            case CLASS:
                return "Class<? extends " + name + ">";
            case INSTANCE:
                return name;
        }
        assert false;
        return name;
    }

    static String createTypeParametersUsage(final Type type) {
        if (type instanceof ParameterizedType) {
            final String collect = stream(((ParameterizedType) type).getActualTypeArguments()).map(GeneratorUtil::createTypeParameterStatement)
                                                                                              .collect(joining(","));
            return collect;
        } else {
            return "";
        }
    }

    static String createTypeParametersStatement2(final Class<?> clazz) {
        return stream(clazz.getTypeParameters()).map(TypeVariable::toString).collect(joining(", "));
    }

    static String createTypeParametersStatement(final Class<?> clazz) {
        return stream(clazz.getTypeParameters()).map(GeneratorUtil::createTypeParameterStatement).collect(joining(", "));
    }

    static String createTypeParameterStatement(final TypeVariable<?> tv) {
        if (Arrays.deepEquals(new Object[] { Object.class }, tv.getBounds())) {
            // if only extends Object --> skip verbosity
            return tv.toString();
        } else {
            return tv.toString() + " extends " + stream(tv.getBounds()).map(GeneratorUtil::createTypeParameterStatement).collect(joining(","));
        }
    }

    public static String createTypeParameterStatement(final Type t) {
        if (t instanceof ParameterizedType) {
            final ParameterizedType pt = (ParameterizedType) t;
            return createTypeParameterStatement(pt.getRawType()) + "<"
                   + stream(pt.getActualTypeArguments()).map(GeneratorUtil::createTypeParameterStatement).collect(joining(",")) + ">";
        } else if (t instanceof Class) {
            final Class<?> clazz = (Class<?>) t;
            return Utilities.getJavadocName(clazz);
        }
        return t.toString();
    }

}
