package org.j8unit.repository.javax.swing.plaf.basic;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.basic.BasicListUI;
import javax.swing.plaf.basic.BasicListUI.FocusHandler;
import javax.swing.plaf.basic.BasicListUI.ListDataHandler;
import javax.swing.plaf.basic.BasicListUI.ListSelectionHandler;
import javax.swing.plaf.basic.BasicListUI.MouseInputHandler;
import javax.swing.plaf.basic.BasicListUI.PropertyChangeHandler;
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
public class BasicListUITest
implements FactoryBasedJ8UnitTest<BasicListUI>, BasicListUITests<BasicListUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicListUI]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(BasicListUI::new);
    }

    @Parameter(0)
    public Callable<BasicListUI> sutFactory;

    @Override
    public Callable<BasicListUI> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicListUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicListUI]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ListSelectionHandler} (by simply
     * reusing the J8Unit test interface {@link ListSelectionHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ListSelectionHandlerTest
    implements ListSelectionHandlerTests<ListSelectionHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicListUI$ListSelectionHandler]

        @Override
        public ListSelectionHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicListUI.ListSelectionHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicListUI$ListSelectionHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicListUI$ListSelectionHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link FocusHandler} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicListUITests.FocusHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class FocusHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicListUITests.FocusHandlerTests<FocusHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicListUI$FocusHandler]

        @Override
        public FocusHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicListUI.FocusHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicListUI$FocusHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicListUI$FocusHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link MouseInputHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicListUITests.MouseInputHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class MouseInputHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicListUITests.MouseInputHandlerTests<MouseInputHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicListUI$MouseInputHandler]

        @Override
        public MouseInputHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicListUI.MouseInputHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicListUI$MouseInputHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicListUI$MouseInputHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link PropertyChangeHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicListUITests.PropertyChangeHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class PropertyChangeHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicListUITests.PropertyChangeHandlerTests<PropertyChangeHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicListUI$PropertyChangeHandler]

        @Override
        public PropertyChangeHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicListUI.PropertyChangeHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicListUI$PropertyChangeHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicListUI$PropertyChangeHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ListDataHandler} (by simply
     * reusing the J8Unit test interface {@link ListDataHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ListDataHandlerTest
    implements ListDataHandlerTests<ListDataHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicListUI$ListDataHandler]

        @Override
        public ListDataHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicListUI.ListDataHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicListUI$ListDataHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicListUI$ListDataHandler]

    }

}
