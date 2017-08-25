package org.j8unit.generator.util;

import static java.util.Objects.requireNonNull;
import static org.j8unit.generator.util.OptionalString.ofOptional;
import static org.j8unit.generator.util.Strings.bcsv;
import static org.j8unit.generator.util.Strings.implode;
import static org.j8unit.generator.util.Strings.untrim;
import java.util.Collection;
import java.util.Optional;

/**
 * <p>
 * Utility enum (aka. helper class) providing fancy <em>Java</em> stuff.
 * </p>
 */
public enum Java {
    ;

    /**
     * The {@code annotation}s prefix token (i.&thinsp;e., {@value #ANNOTATION_TOKEN}).
     */
    public static final String ANNOTATION_TOKEN = "@";

    /**
     * Returns the rendered {@link #ANNOTATION_TOKEN annotation} statement of the given annotation {@code type} and the
     * given value {@code data}.
     *
     * @param type
     *            the annotation type
     * @param data
     *            the value data
     * @return the rendered annotation statement
     */
    public static String annotation(final String type, final Collection<? extends CharSequence> data) {
        if (data.size() < 2) {
            return implode(data, STRING_MASKING, STRING_MASKING, ENUMERATION_DELIMITER, ANNOTATION_TOKEN + type + "(", ")");
        } else {
            return implode(data, STRING_MASKING, STRING_MASKING, ENUMERATION_DELIMITER, ANNOTATION_TOKEN + type + "({", "})");
        }
    }

    /**
     * The {@code array}s suffix token (i.&thinsp;e., {@value #ARRAY_TOKEN}).
     */
    public static final String ARRAY_TOKEN = "[]";

    /**
     * The {@code static} keyword.
     */
    public static final String STATIC = "static";

    /**
     * The java byte-code files suffix (i.&thinsp;e., {@value #CLASS_SUFFIX}).
     */
    public static final String CLASS_SUFFIX = ".class";

    /**
     * Returns the diamond-enveloped, comma-separated presentation of the given data.
     *
     * @param data
     *            the given data
     * @return the diamond-enveloped, comma-separated presentation
     */
    public static final String diamond(final CharSequence... data) {
        requireNonNull(data);
        return bcsv(data);
    }

    /**
     * Returns the diamond-enveloped, comma-separated presentation of the given data.
     *
     * @param data
     *            the given data
     * @return the diamond-enveloped, comma-separated presentation
     */
    public static final String diamond(final Iterable<? extends CharSequence> data) {
        requireNonNull(data);
        return bcsv(data);
    }

    /**
     * The enumerations delimiter (i.&thinsp;e., {@value #ENUMERATION_DELIMITER}).
     */
    public static final String ENUMERATION_DELIMITER = ", ";

    /**
     * The {@code extends} keyword.
     */
    public static final String EXTENDS = "extends";

    /**
     * Returns the rendered {@link #EXTENDS extends} statement of the given {@code name} and the given {@code base}
     * type.
     *
     * @param name
     *            the type name
     * @param base
     *            the type's base type
     * @return the rendered extends statement
     */
    public static String extending(final String name, final String base) {
        return extending(name, OptionalString.of(base));
    }

    /**
     * Returns the rendered {@link #EXTENDS extends} statement of the given {@code name} and the given optional
     * {@code base} type. Returns the {@code base} name only, if there is no {@code base}.
     *
     * @param name
     *            the type name
     * @param base
     *            the optional type's base type
     * @return the rendered extends statement
     */
    public static String extending(final String name, final Optional<String> base) {
        return extending(name, ofOptional(base));
    }

    /**
     * Returns the rendered {@link #EXTENDS extends} statement of the given {@code name} and the given optional
     * {@code base} type. Returns the {@code base} name only, if there is no {@code base}.
     *
     * @param name
     *            the type name
     * @param base
     *            the optional type's base type
     * @return the rendered extends statement
     */
    public static String extending(final String name, final OptionalString base) {
        return name + base.prepend(untrim(EXTENDS)).orEmpty();
    }

    /**
     * The java source-code files suffix (i.&thinsp;e., {@value #JAVA_FILE_EXTENSION}).
     */
    public static final String JAVA_FILE_EXTENSION = ".java";

    /**
     * The Java's very basic {@code java.lang} package.
     */
    public static final Package JAVA_LANG_PACKAGE = java.lang.Object.class.getPackage();

    /**
     * The package name of the very basic Java language package: {@code java.lang}.
     */
    public static final String JAVA_LANG = JAVA_LANG_PACKAGE.getName();

    /**
     * The delimiter of java name-spaces: {@value #JAVA_NAMESPACE_DELIMITER}.
     */
    public static final String JAVA_NAMESPACE_DELIMITER = ".";

    /**
     * The simple name of a package-info file.
     */
    public static final String PACKAGE_INFO_FILENAME = "package-info" + JAVA_FILE_EXTENSION;

    /**
     * The {@link String} masking token (i.&thinsp;e., {@value #STRING_MASKING}).
     */
    public static final String STRING_MASKING = "\"";

    /**
     * The variable-arity array token (i.&thinsp;e., {@value #VARARG_TOKEN}).
     */
    public static final String VARARG_TOKEN = "...";

    /**
     * <p>
     * Replaces the last occurrence of {@value #ARRAY_TOKEN} of a given {@code signature} string by
     * {@value #VARARG_TOKEN} and returns that new string.
     *
     * If there is no {@value #ARRAY_TOKEN} within the given {@code signature}, that unchanged string will be returned.
     * </p>
     *
     * @param signature
     *            the input signature string
     * @return the {@value #VARARG_TOKEN}-representation of a given {@value #ARRAY_TOKEN}-style {@code signature}
     */
    public static final String toVarArg(final String signature) {
        requireNonNull(signature);
        if (signature.contains(ARRAY_TOKEN)) {
            final int index = signature.lastIndexOf(ARRAY_TOKEN);
            return signature.substring(0, index) + VARARG_TOKEN + signature.substring(index + ARRAY_TOKEN.length(), signature.length());
        } else {
            return signature;
        }
    }

    /**
     * The unbound generic (wild-card) token (i.&thinsp;e., {@value #WILDCARD_TOKEN}).
     */
    public static final String WILDCARD_TOKEN = "?";

}
