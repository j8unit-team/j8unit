package org.j8unit.repository.java.time;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.time.DayOfWeek;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DayOfWeek} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.DayOfWeekTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DayOfWeekTest
implements DayOfWeekTests<DayOfWeek> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.DayOfWeek]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOfEnumClass(DayOfWeek.class);
    }

    @Parameter(0)
    public DayOfWeek sut;

    @Override
    public DayOfWeek createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.DayOfWeek]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.DayOfWeek]

}
