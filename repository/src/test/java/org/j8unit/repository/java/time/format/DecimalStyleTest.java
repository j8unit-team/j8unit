package org.j8unit.repository.java.time.format;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.format.DecimalStyle;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DecimalStyle} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.format.DecimalStyleTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DecimalStyleTest
implements DecimalStyleTests<DecimalStyle> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.format.DecimalStyle]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(DecimalStyle.STANDARD);
    }

    @Parameter(0)
    public DecimalStyle sut;

    @Override
    public DecimalStyle createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.format.DecimalStyle]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.format.DecimalStyle]

}
