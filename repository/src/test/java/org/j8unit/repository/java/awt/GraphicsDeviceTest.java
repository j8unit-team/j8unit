package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.awt.GraphicsDevice;
import java.awt.GraphicsDevice.WindowTranslucency;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link GraphicsDevice} (by simply reusing
 * the J8Unit test interface {@link GraphicsDeviceTests}).
 */

@RunWith(J8Unit4.class)
public class GraphicsDeviceTest
implements GraphicsDeviceTests<GraphicsDevice> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.GraphicsDevice]

    @Override
    public GraphicsDevice createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.GraphicsDevice], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.GraphicsDevice]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.GraphicsDevice]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link WindowTranslucency} (by simply
     * reusing the J8Unit test interface {@link WindowTranslucencyTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class WindowTranslucencyTest
    implements WindowTranslucencyTests<WindowTranslucency> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.GraphicsDevice$WindowTranslucency]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(WindowTranslucency.class);
        }

        @Parameter(0)
        public WindowTranslucency sut;

        @Override
        public WindowTranslucency createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.GraphicsDevice$WindowTranslucency]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.GraphicsDevice$WindowTranslucency]

    }

}
