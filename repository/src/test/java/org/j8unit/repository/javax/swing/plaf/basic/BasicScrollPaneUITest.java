package org.j8unit.repository.javax.swing.plaf.basic;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.basic.BasicScrollPaneUI;
import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;
import javax.swing.plaf.basic.BasicScrollPaneUI.PropertyChangeHandler;
import javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener;
import javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler;
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
public class BasicScrollPaneUITest
implements FactoryBasedJ8UnitTest<BasicScrollPaneUI>, BasicScrollPaneUITests<BasicScrollPaneUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicScrollPaneUI]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(BasicScrollPaneUI::new);
    }

    @Parameter(0)
    public Callable<BasicScrollPaneUI> sutFactory;

    @Override
    public Callable<BasicScrollPaneUI> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicScrollPaneUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicScrollPaneUI]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link HSBChangeListener} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUITests.HSBChangeListenerTests}).
     */
    @RunWith(J8Unit4.class)
    public static class HSBChangeListenerTest
    implements HSBChangeListenerTests<HSBChangeListener> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicScrollPaneUI$HSBChangeListener]

        @Override
        public HSBChangeListener createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicScrollPaneUI$HSBChangeListener]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicScrollPaneUI$HSBChangeListener]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link PropertyChangeHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUITests.PropertyChangeHandlerTests}).
     */
    @RunWith(J8Unit4.class)
    public static class PropertyChangeHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUITests.PropertyChangeHandlerTests<PropertyChangeHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicScrollPaneUI$PropertyChangeHandler]

        @Override
        public PropertyChangeHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicScrollPaneUI.PropertyChangeHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicScrollPaneUI$PropertyChangeHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicScrollPaneUI$PropertyChangeHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ViewportChangeHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUITests.ViewportChangeHandlerTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ViewportChangeHandlerTest
    implements ViewportChangeHandlerTests<ViewportChangeHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicScrollPaneUI$ViewportChangeHandler]

        @Override
        public ViewportChangeHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicScrollPaneUI$ViewportChangeHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicScrollPaneUI$ViewportChangeHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link VSBChangeListener} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUITests.VSBChangeListenerTests}).
     */
    @RunWith(J8Unit4.class)
    public static class VSBChangeListenerTest
    implements VSBChangeListenerTests<VSBChangeListener> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicScrollPaneUI$VSBChangeListener]

        @Override
        public VSBChangeListener createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicScrollPaneUI$VSBChangeListener]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicScrollPaneUI$VSBChangeListener]

    }

}
