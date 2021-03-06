package org.j8unit.repository.java.math;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.math.MathContext;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MathContext} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.math.MathContextTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MathContextTest
implements MathContextTests<MathContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.math.MathContext]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(MathContext.DECIMAL64, //
                                MathContext.DECIMAL128, //
                                MathContext.UNLIMITED, //
                                MathContext.DECIMAL32);
    }

    @Parameter(0)
    public MathContext sut;

    @Override
    public MathContext createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.math.MathContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.math.MathContext]

}
