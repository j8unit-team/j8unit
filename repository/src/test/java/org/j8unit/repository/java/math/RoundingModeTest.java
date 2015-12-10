package org.j8unit.repository.java.math;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class RoundingModeTest
implements org.j8unit.repository.java.math.RoundingModeTests<java.math.RoundingMode> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(java.math.RoundingMode.class);
    }

    @Parameter(0)
    public java.math.RoundingMode sut;

    @Override
    public java.math.RoundingMode createNewSUT() {
        return this.sut;
    }

}
