package org.j8unit.tools;

import static java.lang.String.join;
import static java.lang.System.lineSeparator;
import static java.util.Collections.nCopies;

public enum GeneratorTokens {
    ;

    public static final String IGNORE_STATEMENT = "With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.";

    public static final String NL = lineSeparator();

    public static final String SPACE = "    ";

    public static final String indent(final int level) {
        return join("", nCopies(level, SPACE));
    }

}
