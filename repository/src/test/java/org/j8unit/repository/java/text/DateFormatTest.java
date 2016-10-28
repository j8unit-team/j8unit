package org.j8unit.repository.java.text;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.text.DateFormat;
import java.text.DateFormat.Field;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class DateFormatTest
implements org.j8unit.repository.java.text.DateFormatTests<DateFormat> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.DateFormat]

    @Override
    public DateFormat createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.text.DateFormat], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.DateFormat]

    @RunWith(J8Unit4.class)
    public static class FieldTest
    implements org.j8unit.repository.java.text.DateFormatTests.FieldTests<Field> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.DateFormat$Field]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(Field.TIME_ZONE, //
                                    Field.ERA, //
                                    Field.YEAR, //
                                    Field.WEEK_OF_YEAR, //
                                    Field.HOUR0, //
                                    Field.HOUR1, //
                                    Field.MILLISECOND, //
                                    Field.DAY_OF_WEEK, //
                                    Field.MINUTE, //
                                    Field.SECOND, //
                                    Field.DAY_OF_YEAR, //
                                    Field.HOUR_OF_DAY0, //
                                    Field.HOUR_OF_DAY1, //
                                    Field.MONTH, //
                                    Field.DAY_OF_MONTH, //
                                    Field.WEEK_OF_MONTH, //
                                    Field.AM_PM, //
                                    Field.DAY_OF_WEEK_IN_MONTH);
        }

        @Parameter(0)
        public Field sut;

        @Override
        public Field createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.DateFormat$Field]

    }

}
