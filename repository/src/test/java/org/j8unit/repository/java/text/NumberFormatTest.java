package org.j8unit.repository.java.text;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.text.NumberFormat;
import java.text.NumberFormat.Field;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NumberFormat} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.text.NumberFormatTests}).
 */
@RunWith(J8Unit4.class)
public class NumberFormatTest
implements NumberFormatTests<NumberFormat> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.NumberFormat]

    @Override
    public NumberFormat createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.text.NumberFormat], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.NumberFormat]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.NumberFormat]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Field} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.text.NumberFormatTests.FieldTests}).
     */
    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class FieldTest
    implements org.j8unit.repository.java.text.NumberFormatTests.FieldTests<Field> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.NumberFormat$Field]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOf(Field.EXPONENT, //
                                    Field.SIGN, //
                                    Field.INTEGER, //
                                    Field.EXPONENT_SYMBOL, //
                                    Field.CURRENCY, //
                                    Field.FRACTION, //
                                    Field.DECIMAL_SEPARATOR, //
                                    Field.GROUPING_SEPARATOR, //
                                    Field.EXPONENT_SIGN, //
                                    Field.PERMILLE, //
                                    Field.PERCENT);
        }

        @Parameter(0)
        public Field sut;

        @Override
        public Field createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.NumberFormat$Field]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.NumberFormat$Field]

    }

}
