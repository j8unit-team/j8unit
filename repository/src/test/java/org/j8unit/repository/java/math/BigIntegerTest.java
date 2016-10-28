package org.j8unit.repository.java.math;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.math.BigInteger;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class BigIntegerTest
implements org.j8unit.repository.java.math.BigIntegerTests<BigInteger> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.math.BigInteger]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(BigInteger.TEN, //
                                BigInteger.ZERO, //
                                BigInteger.ONE);
    }

    @Parameter(0)
    public BigInteger sut;

    @Override
    public BigInteger createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.math.BigInteger]

}
