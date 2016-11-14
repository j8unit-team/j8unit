package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.ColorSupported;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ColorSupported} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.print.attribute.standard.ColorSupportedTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ColorSupportedTest
implements ColorSupportedTests<ColorSupported> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.ColorSupported]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ColorSupported.SUPPORTED, //
                                ColorSupported.NOT_SUPPORTED);
    }

    @Parameter(0)
    public ColorSupported sut;

    @Override
    public ColorSupported createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.ColorSupported]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.ColorSupported]

}
