package org.j8unit.repository.java.time;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.LocalTime;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class LocalTimeTest
implements org.j8unit.repository.java.time.LocalTimeTests<LocalTime> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.LocalTime]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(LocalTime.MIDNIGHT, //
                                LocalTime.MIN, //
                                LocalTime.NOON, //
                                LocalTime.MAX);
    }

    @Parameter(0)
    public LocalTime sut;

    @Override
    public LocalTime createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.LocalTime]

}
