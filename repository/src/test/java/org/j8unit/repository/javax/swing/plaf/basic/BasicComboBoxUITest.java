package org.j8unit.repository.javax.swing.plaf.basic;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager;
import javax.swing.plaf.basic.BasicComboBoxUI.FocusHandler;
import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;
import javax.swing.plaf.basic.BasicComboBoxUI.KeyHandler;
import javax.swing.plaf.basic.BasicComboBoxUI.ListDataHandler;
import javax.swing.plaf.basic.BasicComboBoxUI.PropertyChangeHandler;
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
public class BasicComboBoxUITest
implements FactoryBasedJ8UnitTest<BasicComboBoxUI>, BasicComboBoxUITests<BasicComboBoxUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxUI]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(BasicComboBoxUI::new);
    }

    @Parameter(0)
    public Callable<BasicComboBoxUI> sutFactory;

    @Override
    public Callable<BasicComboBoxUI> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxUI]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ListDataHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.ListDataHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ListDataHandlerTest
    implements ListDataHandlerTests<ListDataHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxUI$ListDataHandler]

        @Override
        public ListDataHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicComboBoxUI.ListDataHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxUI$ListDataHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxUI$ListDataHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ItemHandler} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.ItemHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ItemHandlerTest
    implements ItemHandlerTests<ItemHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxUI$ItemHandler]

        @Override
        public ItemHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxUI$ItemHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxUI$ItemHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link PropertyChangeHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.PropertyChangeHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class PropertyChangeHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.PropertyChangeHandlerTests<PropertyChangeHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxUI$PropertyChangeHandler]

        @Override
        public PropertyChangeHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicComboBoxUI.PropertyChangeHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxUI$PropertyChangeHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxUI$PropertyChangeHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link KeyHandler} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.KeyHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class KeyHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.KeyHandlerTests<KeyHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxUI$KeyHandler]

        @Override
        public KeyHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicComboBoxUI.KeyHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxUI$KeyHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxUI$KeyHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link FocusHandler} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.FocusHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class FocusHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.FocusHandlerTests<FocusHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxUI$FocusHandler]

        @Override
        public FocusHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicComboBoxUI.FocusHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxUI$FocusHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxUI$FocusHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ComboBoxLayoutManager} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.ComboBoxLayoutManagerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ComboBoxLayoutManagerTest
    implements ComboBoxLayoutManagerTests<ComboBoxLayoutManager> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxUI$ComboBoxLayoutManager]

        @Override
        public ComboBoxLayoutManager createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxUI$ComboBoxLayoutManager]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxUI$ComboBoxLayoutManager]

    }

}
