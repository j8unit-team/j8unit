package org.j8unit.repository.java.time.temporal;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.time.temporal.ChronoUnit;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ChronoUnit} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.temporal.ChronoUnitTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ChronoUnitTest
implements ChronoUnitTests<ChronoUnit> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.ChronoUnit]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOfEnumClass(ChronoUnit.class);
    }

    @Parameter(0)
    public ChronoUnit sut;

    @Override
    public ChronoUnit createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.temporal.ChronoUnit]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.temporal.ChronoUnit]

}
