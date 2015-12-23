package org.j8unit.repository.javax.swing.plaf.synth;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ColorTypeTest
implements org.j8unit.repository.javax.swing.plaf.synth.ColorTypeTests<javax.swing.plaf.synth.ColorType> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(javax.swing.plaf.synth.ColorType.FOCUS, //
                                javax.swing.plaf.synth.ColorType.FOREGROUND, //
                                javax.swing.plaf.synth.ColorType.BACKGROUND, //
                                javax.swing.plaf.synth.ColorType.TEXT_FOREGROUND, //
                                javax.swing.plaf.synth.ColorType.TEXT_BACKGROUND);
    }

    @Parameter(0)
    public javax.swing.plaf.synth.ColorType sut;

    @Override
    public javax.swing.plaf.synth.ColorType createNewSUT() {
        return this.sut;
    }

}
