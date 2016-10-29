package org.j8unit.repository.java.math;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.math.BigDecimal;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class BigDecimalTest
implements org.j8unit.repository.java.math.BigDecimalTests<BigDecimal> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.math.BigDecimal]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(BigDecimal.ZERO, //
                                BigDecimal.ONE, //
                                BigDecimal.TEN);
    }

    @Parameter(0)
    public BigDecimal sut;

    @Override
    public BigDecimal createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.math.BigDecimal]

}
