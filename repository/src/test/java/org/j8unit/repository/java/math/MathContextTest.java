package org.j8unit.repository.java.math;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MathContextTest
implements org.j8unit.repository.java.math.MathContextTests<java.math.MathContext> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.math.MathContext.DECIMAL64, //
                                java.math.MathContext.DECIMAL128, //
                                java.math.MathContext.UNLIMITED, //
                                java.math.MathContext.DECIMAL32);
    }

    @Parameter(0)
    public java.math.MathContext sut;

    @Override
    public java.math.MathContext createNewSUT() {
        return this.sut;
    }

}
