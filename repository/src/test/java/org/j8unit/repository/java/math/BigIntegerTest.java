package org.j8unit.repository.java.math;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.math.BigInteger;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BigInteger} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.math.BigIntegerTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class BigIntegerTest
implements BigIntegerTests<BigInteger> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.math.BigInteger]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.math.BigInteger]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.math.BigInteger]

}
