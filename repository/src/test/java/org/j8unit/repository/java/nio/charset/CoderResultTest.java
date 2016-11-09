package org.j8unit.repository.java.nio.charset;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.nio.charset.CoderResult;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CoderResult} (by simply reusing the
 * J8Unit test interface {@link CoderResultTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CoderResultTest
implements CoderResultTests<CoderResult> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.charset.CoderResult]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(CoderResult.OVERFLOW, //
                                CoderResult.UNDERFLOW);
    }

    @Parameter(0)
    public CoderResult sut;

    @Override
    public CoderResult createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.charset.CoderResult]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.charset.CoderResult]

}
