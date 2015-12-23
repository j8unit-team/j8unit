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
public class BigDecimalTest
implements org.j8unit.repository.java.math.BigDecimalTests<java.math.BigDecimal> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.math.BigDecimal.ZERO, //
                                java.math.BigDecimal.ONE, //
                                java.math.BigDecimal.TEN);
    }

    @Parameter(0)
    public java.math.BigDecimal sut;

    @Override
    public java.math.BigDecimal createNewSUT() {
        return this.sut;
    }

}
