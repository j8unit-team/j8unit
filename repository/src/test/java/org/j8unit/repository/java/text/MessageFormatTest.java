package org.j8unit.repository.java.text;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.text.MessageFormat;
import java.text.MessageFormat.Field;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MessageFormat} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.text.MessageFormatTests}).
 */

@RunWith(J8Unit4.class)
public class MessageFormatTest
implements MessageFormatTests<MessageFormat> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.MessageFormat]

    @Override
    public MessageFormat createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.text.MessageFormat], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.MessageFormat]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.MessageFormat]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Field} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.text.MessageFormatTests.FieldTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class FieldTest
    implements org.j8unit.repository.java.text.MessageFormatTests.FieldTests<Field> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.MessageFormat$Field]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOf(Field.ARGUMENT);
        }

        @Parameter(0)
        public Field sut;

        @Override
        public Field createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.MessageFormat$Field]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.MessageFormat$Field]

    }

}
