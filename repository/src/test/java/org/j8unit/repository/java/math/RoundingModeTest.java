package org.j8unit.repository.java.math;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.math.RoundingMode;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
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
