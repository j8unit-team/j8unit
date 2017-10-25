package org.j8unit.generator.util;

import static java.util.regex.Pattern.LITERAL;
import static java.util.regex.Pattern.compile;
import java.io.File;
import java.nio.file.Path;
import java.util.regex.Pattern;

public enum Paths {
    ;

    private static final Pattern NAMESPACE_SPLITTER = compile(".", LITERAL);

    public static final Path resolve(final File base, final Package pakkage) {
        return java.nio.file.Paths.get(base.getPath(), NAMESPACE_SPLITTER.split(pakkage.getName()));
    }

}
