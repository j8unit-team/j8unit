package org.j8unit.repository.java.math;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.math.RoundingMode;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class RoundingModeTest
implements org.j8unit.repository.java.math.RoundingModeTests<RoundingMode> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.math.RoundingMode]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(RoundingMode.class);
    }

    @Parameter(0)
    public RoundingMode sut;

    @Override
    public RoundingMode createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.math.RoundingMode]

}
