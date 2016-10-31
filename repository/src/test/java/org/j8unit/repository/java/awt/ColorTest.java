package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.Color;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ColorTest
implements org.j8unit.repository.java.awt.ColorTests<Color> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Color]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Color.lightGray, //
                                Color.magenta, //
                                Color.GRAY, //
                                Color.pink, //
                                Color.BLUE, //
                                Color.yellow, //
                                Color.cyan, //
                                Color.red, //
                                Color.gray, //
                                Color.PINK, //
                                Color.white, //
                                Color.BLACK, //
                                Color.ORANGE, //
                                Color.WHITE, //
                                Color.green, //
                                Color.black, //
                                Color.GREEN, //
                                Color.RED, //
                                Color.orange, //
                                Color.LIGHT_GRAY, //
                                Color.blue, //
                                Color.darkGray, //
                                Color.MAGENTA, //
                                Color.YELLOW, //
                                Color.DARK_GRAY, //
                                Color.CYAN);
    }

    @Parameter(0)
    public Color sut;

    @Override
    public Color createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.Color]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.Color]

}
