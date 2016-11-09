package org.j8unit.repository.java.time;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.OffsetDateTime;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link OffsetDateTime} (by simply reusing
 * the J8Unit test interface {@link OffsetDateTimeTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class OffsetDateTimeTest
implements OffsetDateTimeTests<OffsetDateTime> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.OffsetDateTime]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(OffsetDateTime.MIN, //
                                OffsetDateTime.MAX);
    }

    @Parameter(0)
    public OffsetDateTime sut;

    @Override
    public OffsetDateTime createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.OffsetDateTime]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.OffsetDateTime]

}
