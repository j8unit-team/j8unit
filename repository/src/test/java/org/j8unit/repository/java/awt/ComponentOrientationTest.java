package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.ComponentOrientation;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ComponentOrientation} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.awt.ComponentOrientationTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ComponentOrientationTest
implements ComponentOrientationTests<ComponentOrientation> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.ComponentOrientation]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.ComponentOrientation]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.ComponentOrientation]

}
