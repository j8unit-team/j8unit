package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ColorTest
implements org.j8unit.repository.java.awt.ColorTests<java.awt.Color> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.awt.Color.lightGray, //
                                java.awt.Color.magenta, //
                                java.awt.Color.GRAY, //
                                java.awt.Color.pink, //
                                java.awt.Color.BLUE, //
                                java.awt.Color.yellow, //
                                java.awt.Color.cyan, //
                                java.awt.Color.red, //
                                java.awt.Color.gray, //
                                java.awt.Color.PINK, //
                                java.awt.Color.white, //
                                java.awt.Color.BLACK, //
                                java.awt.Color.ORANGE, //
                                java.awt.Color.WHITE, //
                                java.awt.Color.green, //
                                java.awt.Color.black, //
                                java.awt.Color.GREEN, //
                                java.awt.Color.RED, //
                                java.awt.Color.orange, //
                                java.awt.Color.LIGHT_GRAY, //
                                java.awt.Color.blue, //
                                java.awt.Color.darkGray, //
                                java.awt.Color.MAGENTA, //
                                java.awt.Color.YELLOW, //
                                java.awt.Color.DARK_GRAY, //
                                java.awt.Color.CYAN);
    }

    @Parameter(0)
    public java.awt.Color sut;

    @Override
    public java.awt.Color createNewSUT() {
        return this.sut;
    }

}
