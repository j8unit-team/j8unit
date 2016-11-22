package org.j8unit.repository.java.time.temporal;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.temporal.WeekFields;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link WeekFields} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.temporal.WeekFieldsTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class WeekFieldsTest
implements WeekFieldsTests<WeekFields> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.WeekFields]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(WeekFields.SUNDAY_START, //
                                WeekFields.ISO);
    }

    @Parameter(0)
    public WeekFields sut;

    @Override
    public WeekFields createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.temporal.WeekFields]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.temporal.WeekFields]

}
