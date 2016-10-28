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
implements FactoryBasedJ8UnitTest<BasicTreeUI>, org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests<BasicTreeUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(BasicTreeUI::new);
    }

    @Parameter(0)
    public Callable<BasicTreeUI> sutFactory;

    @Override
    public Callable<BasicTreeUI> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI]

    @RunWith(J8Unit4.class)
    public static class MouseHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.MouseHandlerTests<MouseHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$MouseHandler]

        @Override
        public MouseHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.MouseHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$MouseHandler]

    }

    @RunWith(J8Unit4.class)
    public static class NodeDimensionsHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.NodeDimensionsHandlerTests<NodeDimensionsHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$NodeDimensionsHandler]

        @Override
        public NodeDimensionsHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.NodeDimensionsHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$NodeDimensionsHandler]

    }

    @RunWith(J8Unit4.class)
    public static class PropertyChangeHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.PropertyChangeHandlerTests<PropertyChangeHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$PropertyChangeHandler]

        @Override
        public PropertyChangeHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.PropertyChangeHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$PropertyChangeHandler]

    }

    @RunWith(J8Unit4.class)
    public static class TreeExpansionHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeExpansionHandlerTests<TreeExpansionHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeExpansionHandler]

        @Override
        public TreeExpansionHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.TreeExpansionHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeExpansionHandler]

    }

    @RunWith(J8Unit4.class)
    public static class TreeTraverseActionTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeTraverseActionTests<TreeTraverseAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeTraverseAction]

        @Override
        public TreeTraverseAction createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeTraverseAction]

    }

    @RunWith(J8Unit4.class)
    public static class SelectionModelPropertyChangeHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.SelectionModelPropertyChangeHandlerTests<SelectionModelPropertyChangeHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$SelectionModelPropertyChangeHandler]

        @Override
        public SelectionModelPropertyChangeHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$SelectionModelPropertyChangeHandler]

    }

    @RunWith(J8Unit4.class)
    public static class MouseInputHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.MouseInputHandlerTests<MouseInputHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$MouseInputHandler]

        @Override
        public MouseInputHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.MouseInputHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$MouseInputHandler]

    }

    @RunWith(J8Unit4.class)
    public static class CellEditorHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.CellEditorHandlerTests<CellEditorHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$CellEditorHandler]

        @Override
        public CellEditorHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.CellEditorHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$CellEditorHandler]

    }

    @RunWith(J8Unit4.class)
    public static class KeyHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.KeyHandlerTests<KeyHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$KeyHandler]

        @Override
        public KeyHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.KeyHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$KeyHandler]

    }

    @RunWith(J8Unit4.class)
    public static class TreeModelHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeModelHandlerTests<TreeModelHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeModelHandler]

        @Override
        public TreeModelHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.TreeModelHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeModelHandler]

    }

    @RunWith(J8Unit4.class)
    public static class TreeHomeActionTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeHomeActionTests<TreeHomeAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeHomeAction]

        @Override
        public TreeHomeAction createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeHomeAction]

    }

    @RunWith(J8Unit4.class)
    public static class TreeToggleActionTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeToggleActionTests<TreeToggleAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeToggleAction]

        @Override
        public TreeToggleAction createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.TreeToggleAction], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeToggleAction]

    }

    @RunWith(J8Unit4.class)
    public static class ComponentHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.ComponentHandlerTests<ComponentHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$ComponentHandler]

        @Override
        public ComponentHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.ComponentHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$ComponentHandler]

    }

    @RunWith(J8Unit4.class)
    public static class FocusHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.FocusHandlerTests<FocusHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$FocusHandler]

        @Override
        public FocusHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.FocusHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$FocusHandler]

    }

    @RunWith(J8Unit4.class)
    public static class TreeCancelEditingActionTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeCancelEditingActionTests<TreeCancelEditingAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeCancelEditingAction]

        @Override
        public TreeCancelEditingAction createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeCancelEditingAction]

    }

    @RunWith(J8Unit4.class)
    public static class TreeSelectionHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeSelectionHandlerTests<TreeSelectionHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeSelectionHandler]

        @Override
        public TreeSelectionHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.TreeSelectionHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeSelectionHandler]

    }

    @RunWith(J8Unit4.class)
    public static class TreeIncrementActionTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeIncrementActionTests<TreeIncrementAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeIncrementAction]

        @Override
        public TreeIncrementAction createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreeIncrementAction]

    }

    @RunWith(J8Unit4.class)
    public static class TreePageActionTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreePageActionTests<TreePageAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreePageAction]

        @Override
        public TreePageAction createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTreeUI.TreePageAction], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTreeUI$TreePageAction]

    }

}
