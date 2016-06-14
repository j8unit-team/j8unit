package org.j8unit.generator;

import static java.lang.Math.max;
import static java.lang.String.join;
import static java.lang.System.lineSeparator;
import static java.util.Collections.nCopies;

public enum GeneratorTokens {
    ;

    public static final String J8UNIT_BEGIN_MARKER = "J8UNIT MARKER";

    public static final String J8UNIT_END_MARKER = "J8UNIT MARKER";

    public static final String BEGIN_OF_TESTS = "Begin of Test Execution of Current Type-Under-Test";

    public static final String BEGIN_OF_TYPE_UNDER_TEST = "Begin of Inheritable Test Methods of Current Type-Under-Test";

    public static final String END_OF_TYPE_UNDER_TEST = "End of Inheritable Test Methods of Current Type-Under-Test";

    public static final String END_OF_TESTS = "End of Test Execution of Current Type-Under-Test";

    public static final String NL = lineSeparator();

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

    public static final String INDENT = "    ";

    public static final String indent(final int depth) {
        return join("", nCopies(max(0, depth), INDENT));
    }

}
