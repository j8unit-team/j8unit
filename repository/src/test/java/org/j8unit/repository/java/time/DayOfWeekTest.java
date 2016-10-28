package org.j8unit.repository.java.time;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.time.DayOfWeek;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class DayOfWeekTest
implements org.j8unit.repository.java.time.DayOfWeekTests<DayOfWeek> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.DayOfWeek]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(DayOfWeek.class);
    }

    @Parameter(0)
    public DayOfWeek sut;

    @Override
    public DayOfWeek createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.DayOfWeek]

}
