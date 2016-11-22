package org.j8unit.repository.javax.swing.plaf.basic;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.plaf.basic.BasicTreeUI.CellEditorHandler;
import javax.swing.plaf.basic.BasicTreeUI.ComponentHandler;
import javax.swing.plaf.basic.BasicTreeUI.FocusHandler;
import javax.swing.plaf.basic.BasicTreeUI.KeyHandler;
import javax.swing.plaf.basic.BasicTreeUI.MouseHandler;
import javax.swing.plaf.basic.BasicTreeUI.MouseInputHandler;
import javax.swing.plaf.basic.BasicTreeUI.NodeDimensionsHandler;
import javax.swing.plaf.basic.BasicTreeUI.PropertyChangeHandler;
import javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler;
import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;
import javax.swing.plaf.basic.BasicTreeUI.TreeExpansionHandler;
import javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction;
import javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction;
import javax.swing.plaf.basic.BasicTreeUI.TreeModelHandler;
import javax.swing.plaf.basic.BasicTreeUI.TreePageAction;
import javax.swing.plaf.basic.BasicTreeUI.TreeSelectionHandler;
import javax.swing.plaf.basic.BasicTreeUI.TreeToggleAction;
import javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction;
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
public class BasicTreeUITest
implements FactoryBasedJ8UnitTest<BasicTreeUI>, BasicTreeUITests<BasicTreeUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(BasicTreeUI::new);
    }

    @Parameter(0)
    public Callable<BasicTreeUI> sutFactory;

    @Override
    public Callable<BasicTreeUI> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link KeyHandler} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.KeyHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class KeyHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.KeyHandlerTests<KeyHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$KeyHandler]

        @Override
        public KeyHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.KeyHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$KeyHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$KeyHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link TreeSelectionHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeSelectionHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class TreeSelectionHandlerTest
    implements TreeSelectionHandlerTests<TreeSelectionHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeSelectionHandler]

        @Override
        public TreeSelectionHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.TreeSelectionHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeSelectionHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeSelectionHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ComponentHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.ComponentHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ComponentHandlerTest
    implements ComponentHandlerTests<ComponentHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$ComponentHandler]

        @Override
        public ComponentHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.ComponentHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$ComponentHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$ComponentHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link FocusHandler} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.FocusHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class FocusHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.FocusHandlerTests<FocusHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$FocusHandler]

        @Override
        public FocusHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.FocusHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$FocusHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$FocusHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link TreeCancelEditingAction} (by
     * simply reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeCancelEditingActionTests}).
     */

    @RunWith(J8Unit4.class)
    public static class TreeCancelEditingActionTest
    implements TreeCancelEditingActionTests<TreeCancelEditingAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeCancelEditingAction]

        @Override
        public TreeCancelEditingAction createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeCancelEditingAction]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeCancelEditingAction]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link TreeToggleAction} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeToggleActionTests}).
     */

    @RunWith(J8Unit4.class)
    public static class TreeToggleActionTest
    implements TreeToggleActionTests<TreeToggleAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeToggleAction]

        @Override
        public TreeToggleAction createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.TreeToggleAction], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeToggleAction]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeToggleAction]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type
     * {@link SelectionModelPropertyChangeHandler} (by simply reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.SelectionModelPropertyChangeHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class SelectionModelPropertyChangeHandlerTest
    implements SelectionModelPropertyChangeHandlerTests<SelectionModelPropertyChangeHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$SelectionModelPropertyChangeHandler]

        @Override
        public SelectionModelPropertyChangeHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$SelectionModelPropertyChangeHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$SelectionModelPropertyChangeHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link MouseHandler} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.MouseHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class MouseHandlerTest
    implements MouseHandlerTests<MouseHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$MouseHandler]

        @Override
        public MouseHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.MouseHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$MouseHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$MouseHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link CellEditorHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.CellEditorHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class CellEditorHandlerTest
    implements CellEditorHandlerTests<CellEditorHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$CellEditorHandler]

        @Override
        public CellEditorHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.CellEditorHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$CellEditorHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$CellEditorHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link TreeHomeAction} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeHomeActionTests}).
     */

    @RunWith(J8Unit4.class)
    public static class TreeHomeActionTest
    implements TreeHomeActionTests<TreeHomeAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeHomeAction]

        @Override
        public TreeHomeAction createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeHomeAction]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeHomeAction]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link TreePageAction} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreePageActionTests}).
     */

    @RunWith(J8Unit4.class)
    public static class TreePageActionTest
    implements TreePageActionTests<TreePageAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreePageAction]

        @Override
        public TreePageAction createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.TreePageAction], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreePageAction]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreePageAction]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link TreeTraverseAction} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeTraverseActionTests}).
     */

    @RunWith(J8Unit4.class)
    public static class TreeTraverseActionTest
    implements TreeTraverseActionTests<TreeTraverseAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeTraverseAction]

        @Override
        public TreeTraverseAction createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeTraverseAction]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeTraverseAction]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link NodeDimensionsHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.NodeDimensionsHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class NodeDimensionsHandlerTest
    implements NodeDimensionsHandlerTests<NodeDimensionsHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$NodeDimensionsHandler]

        @Override
        public NodeDimensionsHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.NodeDimensionsHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$NodeDimensionsHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$NodeDimensionsHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link TreeModelHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeModelHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class TreeModelHandlerTest
    implements TreeModelHandlerTests<TreeModelHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeModelHandler]

        @Override
        public TreeModelHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.TreeModelHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeModelHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeModelHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link TreeExpansionHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeExpansionHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class TreeExpansionHandlerTest
    implements TreeExpansionHandlerTests<TreeExpansionHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeExpansionHandler]

        @Override
        public TreeExpansionHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.TreeExpansionHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeExpansionHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeExpansionHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link TreeIncrementAction} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeIncrementActionTests}).
     */

    @RunWith(J8Unit4.class)
    public static class TreeIncrementActionTest
    implements TreeIncrementActionTests<TreeIncrementAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeIncrementAction]

        @Override
        public TreeIncrementAction createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeIncrementAction]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeIncrementAction]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link PropertyChangeHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.PropertyChangeHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class PropertyChangeHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.PropertyChangeHandlerTests<PropertyChangeHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$PropertyChangeHandler]

        @Override
        public PropertyChangeHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.PropertyChangeHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$PropertyChangeHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$PropertyChangeHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link MouseInputHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.MouseInputHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class MouseInputHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.MouseInputHandlerTests<MouseInputHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$MouseInputHandler]

        @Override
        public MouseInputHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.MouseInputHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$MouseInputHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$MouseInputHandler]

    }

}
