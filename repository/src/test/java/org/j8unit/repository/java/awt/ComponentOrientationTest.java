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
public class ComponentOrientationTest
implements org.j8unit.repository.java.awt.ComponentOrientationTests<java.awt.ComponentOrientation> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.awt.ComponentOrientation.LEFT_TO_RIGHT, //
                                java.awt.ComponentOrientation.UNKNOWN, //
                                java.awt.ComponentOrientation.RIGHT_TO_LEFT);
    }

    @Parameter(0)
    public java.awt.ComponentOrientation sut;

    @Override
    public java.awt.ComponentOrientation createNewSUT() {
        return this.sut;
    }

}
