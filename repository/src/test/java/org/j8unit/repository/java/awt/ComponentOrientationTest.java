package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.ComponentOrientation;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class ComponentOrientationTest
implements org.j8unit.repository.java.awt.ComponentOrientationTests<ComponentOrientation> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.ComponentOrientation]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ComponentOrientation.LEFT_TO_RIGHT, //
                                ComponentOrientation.UNKNOWN, //
                                ComponentOrientation.RIGHT_TO_LEFT);
    }

    @Parameter(0)
    public ComponentOrientation sut;

    @Override
    public ComponentOrientation createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.ComponentOrientation]

}
