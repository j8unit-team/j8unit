package org.j8unit.repository.javax.swing.plaf.basic;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout;
import javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler;
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
public class BasicOptionPaneUITest
implements FactoryBasedJ8UnitTest<BasicOptionPaneUI>, BasicOptionPaneUITests<BasicOptionPaneUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicOptionPaneUI]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(BasicOptionPaneUI::new);
    }

    @Parameter(0)
    public Callable<BasicOptionPaneUI> sutFactory;

    @Override
    public Callable<BasicOptionPaneUI> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicOptionPaneUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicOptionPaneUI]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link PropertyChangeHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests.PropertyChangeHandlerTests}).
     */
    @RunWith(J8Unit4.class)
    public static class PropertyChangeHandlerTest
    implements PropertyChangeHandlerTests<PropertyChangeHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicOptionPaneUI$PropertyChangeHandler]

        @Override
        public PropertyChangeHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicOptionPaneUI$PropertyChangeHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicOptionPaneUI$PropertyChangeHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ButtonAreaLayout} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests.ButtonAreaLayoutTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ButtonAreaLayoutTest
    implements ButtonAreaLayoutTests<ButtonAreaLayout> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicOptionPaneUI$ButtonAreaLayout]

        @Override
        public ButtonAreaLayout createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicOptionPaneUI$ButtonAreaLayout]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicOptionPaneUI$ButtonAreaLayout]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ButtonActionListener} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests.ButtonActionListenerTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ButtonActionListenerTest
    implements ButtonActionListenerTests<ButtonActionListener> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicOptionPaneUI$ButtonActionListener]

        @Override
        public ButtonActionListener createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicOptionPaneUI$ButtonActionListener]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicOptionPaneUI$ButtonActionListener]

    }

}
