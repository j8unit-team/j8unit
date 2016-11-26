package org.j8unit.repository.java.time;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.Duration;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Duration} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.DurationTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DurationTest
implements DurationTests<Duration> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.Duration]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(Duration.ZERO);
    }

    @Parameter(0)
    public Duration sut;

    @Override
    public Duration createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.Duration]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.Duration]

}
