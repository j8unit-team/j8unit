package org.j8unit.repository.java.time;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.OffsetTime;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class OffsetTimeTest
implements org.j8unit.repository.java.time.OffsetTimeTests<OffsetTime> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.OffsetTime]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(OffsetTime.MIN, //
                                OffsetTime.MAX);
    }

    @Parameter(0)
    public OffsetTime sut;

    @Override
    public OffsetTime createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.OffsetTime]

}
