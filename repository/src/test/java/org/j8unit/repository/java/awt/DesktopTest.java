package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Desktop} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.DesktopTests}).
 */

@RunWith(J8Unit4.class)
public class DesktopTest
implements DesktopTests<Desktop> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Desktop]

    @Override
    public Desktop createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.Desktop], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.Desktop]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.Desktop]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Action} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.awt.DesktopTests.ActionTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class ActionTest
    implements ActionTests<Action> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Desktop$Action]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOfEnumClass(Action.class);
        }

        @Parameter(0)
        public Action sut;

        @Override
        public Action createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.Desktop$Action]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.Desktop$Action]

    }

}
