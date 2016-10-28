package org.j8unit.repository.java.time;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.Duration;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class DurationTest
implements org.j8unit.repository.java.time.DurationTests<Duration> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.Duration]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Duration.ZERO);
    }

    @Parameter(0)
    public Duration sut;

    @Override
    public Duration createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.Duration]

}
