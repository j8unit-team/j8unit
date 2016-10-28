package org.j8unit.generator;

import static java.lang.Math.max;
import static java.lang.String.join;
import static java.util.Collections.nCopies;

public enum GeneratorTokens {
    ;

    /**
     * Name of: {@link org.j8unit.Assert#assertTrue(boolean)}
     */
    public static final String ASSERT_TRUE = "assertTrue";

    /**
     * Name of: {@link org.j8unit.J8UnitTest#createNewSUT()}
     */
    public static final String SUT_FACTORY = "createNewSUT";

    /**
     * Name of: {@link org.j8unit.FactoryBasedJ8UnitTest#getSUTFactory()}
     */
    public static final String SUT_FACTORY_FACTORY = "getSUTFactory";

    /**
     * Name of: {@link org.j8unit.util.TestParametersUtil#testParametersOf(Object...)}
     */
    public static final String TEST_PARAMETERS_OF = "testParametersOf";

    /**
     * Name of: {@link org.j8unit.util.TestParametersUtil#testParametersOfEnumClass(Class)}
     */
    public static final String TEST_PARAMETERS_OF_ENUM_CLASS = "testParametersOfEnumClass";

    private static final int INDENT_WITH = 4;

    private static final String INDENT = join("", nCopies(INDENT_WITH, " "));

    public static final String indent(final int depth) {
        return join("", nCopies(max(0, depth), INDENT));
    }

    public static final String indent() {
        return indent(1);
    }

}
