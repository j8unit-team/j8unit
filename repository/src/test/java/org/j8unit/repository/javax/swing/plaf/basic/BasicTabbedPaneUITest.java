package org.j8unit.repository.javax.swing.plaf.basic;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.plaf.basic.BasicTabbedPaneUI.FocusHandler;
import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;
import javax.swing.plaf.basic.BasicTabbedPaneUI.PropertyChangeHandler;
import javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler;
import javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout;
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
public class BasicTabbedPaneUITest
implements FactoryBasedJ8UnitTest<BasicTabbedPaneUI>, BasicTabbedPaneUITests<BasicTabbedPaneUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTabbedPaneUI]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(BasicTabbedPaneUI::new);
    }

    @Parameter(0)
    public Callable<BasicTabbedPaneUI> sutFactory;

    @Override
    public Callable<BasicTabbedPaneUI> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTabbedPaneUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTabbedPaneUI]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link TabbedPaneLayout} (by simply
     * reusing the J8Unit test interface {@link TabbedPaneLayoutTests}).
     */

    @RunWith(J8Unit4.class)
    public static class TabbedPaneLayoutTest
    implements TabbedPaneLayoutTests<TabbedPaneLayout> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTabbedPaneUI$TabbedPaneLayout]

        @Override
        public TabbedPaneLayout createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTabbedPaneUI$TabbedPaneLayout]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTabbedPaneUI$TabbedPaneLayout]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link MouseHandler} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.MouseHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class MouseHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.MouseHandlerTests<MouseHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTabbedPaneUI$MouseHandler]

        @Override
        public MouseHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTabbedPaneUI$MouseHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTabbedPaneUI$MouseHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link FocusHandler} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.FocusHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class FocusHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.FocusHandlerTests<FocusHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTabbedPaneUI$FocusHandler]

        @Override
        public FocusHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTabbedPaneUI.FocusHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTabbedPaneUI$FocusHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTabbedPaneUI$FocusHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link TabSelectionHandler} (by simply
     * reusing the J8Unit test interface {@link TabSelectionHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class TabSelectionHandlerTest
    implements TabSelectionHandlerTests<TabSelectionHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTabbedPaneUI$TabSelectionHandler]

        @Override
        public TabSelectionHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTabbedPaneUI$TabSelectionHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTabbedPaneUI$TabSelectionHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link PropertyChangeHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.PropertyChangeHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class PropertyChangeHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.PropertyChangeHandlerTests<PropertyChangeHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTabbedPaneUI$PropertyChangeHandler]

        @Override
        public PropertyChangeHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTabbedPaneUI.PropertyChangeHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTabbedPaneUI$PropertyChangeHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTabbedPaneUI$PropertyChangeHandler]

    }

}
