package org.j8unit.repository.java.time.temporal;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.temporal.WeekFields;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class WeekFieldsTest
implements org.j8unit.repository.java.time.temporal.WeekFieldsTests<WeekFields> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.WeekFields]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(WeekFields.SUNDAY_START, //
                                WeekFields.ISO);
    }

    @Parameter(0)
    public WeekFields sut;

    @Override
    public WeekFields createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.WeekFields]

}
