package org.j8unit.generator.util;

import static java.util.Objects.requireNonNull;
import static org.j8unit.generator.util.Strings.bcsv;
import static org.j8unit.generator.util.Strings.implode;
import java.util.stream.Stream;

public enum Java {
    ;

    public static final String ANNOTATION = "@";

    public static final String ARRAY_TOKEN = "[]";

    public static final String STATIC = "static";

    /**
     * <p>
     * The suffix of Java classes: {@value #CLASS_SUFFIX}.
     * </p>
     */
    public static final String CLASS_SUFFIX = ".class";

    public static final String ENUMERATION_DELIMITER = ", ";

    public static final String EXTENDS = " extends ";

    /**
     * <p>
     * The file extension of java source files.
     * </p>
     */
    public static final String JAVA_FILE_EXTENSION = ".java";

    public static final Package JAVA_LANG_PACKAGE = java.lang.Object.class.getPackage();

    /**
     * <p>
     * The package name of the very basic Java language package: {@code java.lang}.
     * </p>
     */
    public static final String JAVA_LANG = JAVA_LANG_PACKAGE.getName();

    /**
     * <p>
     * The delimiter of java name-spaces: {@value #JAVA_NAMESPACE_DELIMITER}.
     * </p>
     */
    public static final String JAVA_NAMESPACE_DELIMITER = ".";

    /**
     * <p>
     * The name of the package-info file.
     * </p>
     */
    public static final String PACKAGE_INFO_FILENAME = "package-info" + JAVA_FILE_EXTENSION;

    public static final String STRING_MASKING = "\"";

    public static final String VARARG_TOKEN = "...";

    public static final String WILDCARD_TOKEN = "?";

    public static String annotation(final String annoType, final Iterable<? extends CharSequence> data) {
        return implode(data, STRING_MASKING, STRING_MASKING, ENUMERATION_DELIMITER, ANNOTATION + annoType + "(", ")");
    }

    public static final String diamond(final CharSequence... data) {
        requireNonNull(data);
        return bcsv(data);
    }

    public static final String diamond(final Iterable<? extends CharSequence> data) {
        requireNonNull(data);
        return bcsv(data);
    }

    public static final String diamond(final Stream<? extends CharSequence> data) {
        requireNonNull(data);
        return bcsv(data);
    }

    public static String extending(final String x, final String y) {
        return x + EXTENDS + y;
    }

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
            // TODO: "contains" und "lastIndexOf"? Ist das nötig?
            final int index = signature.lastIndexOf(ARRAY_TOKEN);
            return signature.substring(0, index) + VARARG_TOKEN + signature.substring(index + ARRAY_TOKEN.length(), signature.length());
        } else {
            return signature;
        }
    }

}
