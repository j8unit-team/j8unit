package org.j8unit.repository.javax.swing.plaf.basic;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager;
import javax.swing.plaf.basic.BasicSplitPaneUI.BasicVerticalLayoutManager;
import javax.swing.plaf.basic.BasicSplitPaneUI.FocusHandler;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardEndHandler;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardHomeHandler;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardResizeToggleHandler;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler;
import javax.swing.plaf.basic.BasicSplitPaneUI.PropertyHandler;
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
public class BasicSplitPaneUITest
implements FactoryBasedJ8UnitTest<BasicSplitPaneUI>, BasicSplitPaneUITests<BasicSplitPaneUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(BasicSplitPaneUI::new);
    }

    @Parameter(0)
    public Callable<BasicSplitPaneUI> sutFactory;

    @Override
    public Callable<BasicSplitPaneUI> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link BasicHorizontalLayoutManager} (by
     * simply reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUITests.BasicHorizontalLayoutManagerTests}).
     */
    @RunWith(J8Unit4.class)
    public static class BasicHorizontalLayoutManagerTest
    implements BasicHorizontalLayoutManagerTests<BasicHorizontalLayoutManager> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$BasicHorizontalLayoutManager]

        @Override
        public BasicHorizontalLayoutManager createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$BasicHorizontalLayoutManager]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$BasicHorizontalLayoutManager]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link KeyboardResizeToggleHandler} (by
     * simply reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUITests.KeyboardResizeToggleHandlerTests}).
     */
    @RunWith(J8Unit4.class)
    public static class KeyboardResizeToggleHandlerTest
    implements KeyboardResizeToggleHandlerTests<KeyboardResizeToggleHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardResizeToggleHandler]

        @Override
        public KeyboardResizeToggleHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardResizeToggleHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardResizeToggleHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardResizeToggleHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link KeyboardHomeHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUITests.KeyboardHomeHandlerTests}).
     */
    @RunWith(J8Unit4.class)
    public static class KeyboardHomeHandlerTest
    implements KeyboardHomeHandlerTests<KeyboardHomeHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardHomeHandler]

        @Override
        public KeyboardHomeHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardHomeHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardHomeHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardHomeHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link KeyboardUpLeftHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUITests.KeyboardUpLeftHandlerTests}).
     */
    @RunWith(J8Unit4.class)
    public static class KeyboardUpLeftHandlerTest
    implements KeyboardUpLeftHandlerTests<KeyboardUpLeftHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardUpLeftHandler]

        @Override
        public KeyboardUpLeftHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardUpLeftHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardUpLeftHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link BasicVerticalLayoutManager} (by
     * simply reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUITests.BasicVerticalLayoutManagerTests}).
     */
    @RunWith(J8Unit4.class)
    public static class BasicVerticalLayoutManagerTest
    implements BasicVerticalLayoutManagerTests<BasicVerticalLayoutManager> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$BasicVerticalLayoutManager]

        @Override
        public BasicVerticalLayoutManager createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicSplitPaneUI.BasicVerticalLayoutManager], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$BasicVerticalLayoutManager]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$BasicVerticalLayoutManager]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link KeyboardEndHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUITests.KeyboardEndHandlerTests}).
     */
    @RunWith(J8Unit4.class)
    public static class KeyboardEndHandlerTest
    implements KeyboardEndHandlerTests<KeyboardEndHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardEndHandler]

        @Override
        public KeyboardEndHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardEndHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardEndHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardEndHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link KeyboardDownRightHandler} (by
     * simply reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUITests.KeyboardDownRightHandlerTests}).
     */
    @RunWith(J8Unit4.class)
    public static class KeyboardDownRightHandlerTest
    implements KeyboardDownRightHandlerTests<KeyboardDownRightHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardDownRightHandler]

        @Override
        public KeyboardDownRightHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardDownRightHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardDownRightHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link FocusHandler} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUITests.FocusHandlerTests}).
     */
    @RunWith(J8Unit4.class)
    public static class FocusHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUITests.FocusHandlerTests<FocusHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$FocusHandler]

        @Override
        public FocusHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicSplitPaneUI.FocusHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$FocusHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$FocusHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link PropertyHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUITests.PropertyHandlerTests}).
     */
    @RunWith(J8Unit4.class)
    public static class PropertyHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUITests.PropertyHandlerTests<PropertyHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$PropertyHandler]

        @Override
        public PropertyHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicSplitPaneUI.PropertyHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$PropertyHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$PropertyHandler]

    }

}
