package org.j8unit.repository.java.time;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.LocalDateTime;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LocalDateTime} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.LocalDateTimeTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class LocalDateTimeTest
implements LocalDateTimeTests<LocalDateTime> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.LocalDateTime]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(LocalDateTime.MIN, //
                                LocalDateTime.MAX);
    }

    @Parameter(0)
    public LocalDateTime sut;

    @Override
    public LocalDateTime createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.LocalDateTime]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.LocalDateTime]

}
