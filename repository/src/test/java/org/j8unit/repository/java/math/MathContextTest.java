package org.j8unit.repository.java.math;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.math.MathContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class MathContextTest
implements org.j8unit.repository.java.math.MathContextTests<MathContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.math.MathContext]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
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

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.math.MathContext]

}
