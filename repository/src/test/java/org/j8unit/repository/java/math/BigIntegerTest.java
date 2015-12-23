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
public class BigIntegerTest
implements org.j8unit.repository.java.math.BigIntegerTests<java.math.BigInteger> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.math.BigInteger.TEN, //
                                java.math.BigInteger.ZERO, //
                                java.math.BigInteger.ONE);
    }

    @Parameter(0)
    public java.math.BigInteger sut;

    @Override
    public java.math.BigInteger createNewSUT() {
        return this.sut;
    }

}
