package org.j8unit.repository.java.time.format;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.format.DecimalStyle;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class DecimalStyleTest
implements org.j8unit.repository.java.time.format.DecimalStyleTests<DecimalStyle> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.format.DecimalStyle]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DecimalStyle.STANDARD);
    }

    @Parameter(0)
    public DecimalStyle sut;

    @Override
    public DecimalStyle createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.format.DecimalStyle]

}
