package org.j8unit.repository.javax.swing.plaf.synth;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.swing.plaf.synth.ColorType;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ColorTypeTest
implements org.j8unit.repository.javax.swing.plaf.synth.ColorTypeTests<ColorType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.synth.ColorType]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ColorType.FOCUS, //
                                ColorType.FOREGROUND, //
                                ColorType.BACKGROUND, //
                                ColorType.TEXT_FOREGROUND, //
                                ColorType.TEXT_BACKGROUND);
    }

    @Parameter(0)
    public ColorType sut;

    @Override
    public ColorType createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.synth.ColorType]

}
