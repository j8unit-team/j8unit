package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.JInternalFrame;
import javax.swing.JInternalFrame.JDesktopIcon;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JInternalFrameTest
implements FactoryBasedJ8UnitTest<JInternalFrame>, JInternalFrameTests<JInternalFrame> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JInternalFrame]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(JInternalFrame::new);
    }

    @Parameter(0)
    public Callable<JInternalFrame> sutFactory;

    @Override
    public Callable<JInternalFrame> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JInternalFrame]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JInternalFrame]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link JDesktopIcon} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.javax.swing.JInternalFrameTests.JDesktopIconTests}).
     */

    @RunWith(J8Unit4.class)
    public static class JDesktopIconTest
    implements JDesktopIconTests<JDesktopIcon> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JInternalFrame$JDesktopIcon]

        @Override
        public JDesktopIcon createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.JInternalFrame.JDesktopIcon], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JInternalFrame$JDesktopIcon]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JInternalFrame$JDesktopIcon]

    }

}
