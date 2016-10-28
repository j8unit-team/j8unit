package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.ColorSupported;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class ColorSupportedTest
implements org.j8unit.repository.javax.print.attribute.standard.ColorSupportedTests<ColorSupported> {

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

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.ColorSupported]

}
