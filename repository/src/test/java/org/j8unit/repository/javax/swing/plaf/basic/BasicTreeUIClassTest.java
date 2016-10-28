package org.j8unit.repository.javax.swing.plaf.basic;

import java.awt.Component;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
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
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicTreeUIClassTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests<BasicTreeUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI]

    @Override
    public Class<BasicTreeUI> createNewSUT() {
        return BasicTreeUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link BasicTreeUI#BasicTreeUI() public
     * javax.swing.plaf.basic.BasicTreeUI()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_BasicTreeUI()
    throws Exception {
        // create new instance
        final BasicTreeUI sut = new BasicTreeUI();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link BasicTreeUI#createUI(JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.basic.BasicTreeUI.createUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_createUI_JComponent()
    throws Exception {
        // write some test for {@link BasicTreeUI#createUI(JComponent)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI]

    @RunWith(J8Unit4.class)
    public static class MouseHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.MouseHandlerClassTests<MouseHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$MouseHandler]

        @Override
        public Class<MouseHandler> createNewSUT() {
            return MouseHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test {@link MouseHandler#MouseHandler(BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$MouseHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_MouseHandler_BasicTreeUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final MouseHandler sut = null; // = new MouseHandler(BasicTreeUI);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$MouseHandler]

    }

    @RunWith(J8Unit4.class)
    public static class NodeDimensionsHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.NodeDimensionsHandlerClassTests<NodeDimensionsHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$NodeDimensionsHandler]

        @Override
        public Class<NodeDimensionsHandler> createNewSUT() {
            return NodeDimensionsHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link NodeDimensionsHandler#NodeDimensionsHandler(BasicTreeUI) public
         * javax.swing.plaf.basic.BasicTreeUI$NodeDimensionsHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_NodeDimensionsHandler_BasicTreeUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final NodeDimensionsHandler sut = null; // = new NodeDimensionsHandler(BasicTreeUI);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$NodeDimensionsHandler]

    }

    @RunWith(J8Unit4.class)
    public static class TreeHomeActionClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.TreeHomeActionClassTests<TreeHomeAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeHomeAction]

        @Override
        public Class<TreeHomeAction> createNewSUT() {
            return TreeHomeAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link TreeHomeAction#TreeHomeAction(BasicTreeUI, int, String) public
         * javax.swing.plaf.basic.BasicTreeUI$TreeHomeAction(javax.swing.plaf.basic.BasicTreeUI,int,java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_TreeHomeAction_BasicTreeUI_int_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final TreeHomeAction sut = null; // = new TreeHomeAction(BasicTreeUI, int, String);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeHomeAction]

    }

    @RunWith(J8Unit4.class)
    public static class TreeExpansionHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.TreeExpansionHandlerClassTests<TreeExpansionHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeExpansionHandler]

        @Override
        public Class<TreeExpansionHandler> createNewSUT() {
            return TreeExpansionHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link TreeExpansionHandler#TreeExpansionHandler(BasicTreeUI) public
         * javax.swing.plaf.basic.BasicTreeUI$TreeExpansionHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_TreeExpansionHandler_BasicTreeUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final TreeExpansionHandler sut = null; // = new TreeExpansionHandler(BasicTreeUI);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeExpansionHandler]

    }

    @RunWith(J8Unit4.class)
    public static class ComponentHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.ComponentHandlerClassTests<ComponentHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$ComponentHandler]

        @Override
        public Class<ComponentHandler> createNewSUT() {
            return ComponentHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link ComponentHandler#ComponentHandler(BasicTreeUI) public
         * javax.swing.plaf.basic.BasicTreeUI$ComponentHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_ComponentHandler_BasicTreeUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final ComponentHandler sut = null; // = new ComponentHandler(BasicTreeUI);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$ComponentHandler]

    }

    @RunWith(J8Unit4.class)
    public static class FocusHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.FocusHandlerClassTests<FocusHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$FocusHandler]

        @Override
        public Class<FocusHandler> createNewSUT() {
            return FocusHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test {@link FocusHandler#FocusHandler(BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$FocusHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_FocusHandler_BasicTreeUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final FocusHandler sut = null; // = new FocusHandler(BasicTreeUI);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$FocusHandler]

    }

    @RunWith(J8Unit4.class)
    public static class MouseInputHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.MouseInputHandlerClassTests<MouseInputHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$MouseInputHandler]

        @Override
        public Class<MouseInputHandler> createNewSUT() {
            return MouseInputHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link MouseInputHandler#MouseInputHandler(BasicTreeUI, Component, Component, MouseEvent) public
         * javax.swing.plaf.basic.BasicTreeUI$MouseInputHandler(javax.swing.plaf.basic.BasicTreeUI,java.awt.Component,java.awt.Component,java.awt.event.MouseEvent)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_MouseInputHandler_BasicTreeUI_Component_Component_MouseEvent()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final MouseInputHandler sut = null; // = new MouseInputHandler(BasicTreeUI, Component, Component,
                                                // MouseEvent);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$MouseInputHandler]

    }

    @RunWith(J8Unit4.class)
    public static class TreePageActionClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.TreePageActionClassTests<TreePageAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreePageAction]

        @Override
        public Class<TreePageAction> createNewSUT() {
            return TreePageAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link TreePageAction#TreePageAction(BasicTreeUI, int, String) public
         * javax.swing.plaf.basic.BasicTreeUI$TreePageAction(javax.swing.plaf.basic.BasicTreeUI,int,java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_TreePageAction_BasicTreeUI_int_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final TreePageAction sut = null; // = new TreePageAction(BasicTreeUI, int, String);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreePageAction]

    }

    @RunWith(J8Unit4.class)
    public static class TreeSelectionHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.TreeSelectionHandlerClassTests<TreeSelectionHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeSelectionHandler]

        @Override
        public Class<TreeSelectionHandler> createNewSUT() {
            return TreeSelectionHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link TreeSelectionHandler#TreeSelectionHandler(BasicTreeUI) public
         * javax.swing.plaf.basic.BasicTreeUI$TreeSelectionHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_TreeSelectionHandler_BasicTreeUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final TreeSelectionHandler sut = null; // = new TreeSelectionHandler(BasicTreeUI);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeSelectionHandler]

    }

    @RunWith(J8Unit4.class)
    public static class SelectionModelPropertyChangeHandlerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.SelectionModelPropertyChangeHandlerClassTests<SelectionModelPropertyChangeHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$SelectionModelPropertyChangeHandler]

        @Override
        public Class<SelectionModelPropertyChangeHandler> createNewSUT() {
            return SelectionModelPropertyChangeHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link SelectionModelPropertyChangeHandler#SelectionModelPropertyChangeHandler(BasicTreeUI) public
         * javax.swing.plaf.basic.BasicTreeUI$SelectionModelPropertyChangeHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_SelectionModelPropertyChangeHandler_BasicTreeUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final SelectionModelPropertyChangeHandler sut = null; // = new
                                                                  // SelectionModelPropertyChangeHandler(BasicTreeUI);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$SelectionModelPropertyChangeHandler]

    }

    @RunWith(J8Unit4.class)
    public static class KeyHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.KeyHandlerClassTests<KeyHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$KeyHandler]

        @Override
        public Class<KeyHandler> createNewSUT() {
            return KeyHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test {@link KeyHandler#KeyHandler(BasicTreeUI) public
         * javax.swing.plaf.basic.BasicTreeUI$KeyHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_KeyHandler_BasicTreeUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final KeyHandler sut = null; // = new KeyHandler(BasicTreeUI);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$KeyHandler]

    }

    @RunWith(J8Unit4.class)
    public static class TreeModelHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.TreeModelHandlerClassTests<TreeModelHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeModelHandler]

        @Override
        public Class<TreeModelHandler> createNewSUT() {
            return TreeModelHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link TreeModelHandler#TreeModelHandler(BasicTreeUI) public
         * javax.swing.plaf.basic.BasicTreeUI$TreeModelHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_TreeModelHandler_BasicTreeUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final TreeModelHandler sut = null; // = new TreeModelHandler(BasicTreeUI);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeModelHandler]

    }

    @RunWith(J8Unit4.class)
    public static class TreeToggleActionClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.TreeToggleActionClassTests<TreeToggleAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeToggleAction]

        @Override
        public Class<TreeToggleAction> createNewSUT() {
            return TreeToggleAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link TreeToggleAction#TreeToggleAction(BasicTreeUI, String) public
         * javax.swing.plaf.basic.BasicTreeUI$TreeToggleAction(javax.swing.plaf.basic.BasicTreeUI,java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_TreeToggleAction_BasicTreeUI_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final TreeToggleAction sut = null; // = new TreeToggleAction(BasicTreeUI, String);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeToggleAction]

    }

    @RunWith(J8Unit4.class)
    public static class TreeTraverseActionClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.TreeTraverseActionClassTests<TreeTraverseAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeTraverseAction]

        @Override
        public Class<TreeTraverseAction> createNewSUT() {
            return TreeTraverseAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link TreeTraverseAction#TreeTraverseAction(BasicTreeUI, int, String) public
         * javax.swing.plaf.basic.BasicTreeUI$TreeTraverseAction(javax.swing.plaf.basic.BasicTreeUI,int,java.lang.String)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_TreeTraverseAction_BasicTreeUI_int_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final TreeTraverseAction sut = null; // = new TreeTraverseAction(BasicTreeUI, int, String);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeTraverseAction]

    }

    @RunWith(J8Unit4.class)
    public static class PropertyChangeHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.PropertyChangeHandlerClassTests<PropertyChangeHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$PropertyChangeHandler]

        @Override
        public Class<PropertyChangeHandler> createNewSUT() {
            return PropertyChangeHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link PropertyChangeHandler#PropertyChangeHandler(BasicTreeUI) public
         * javax.swing.plaf.basic.BasicTreeUI$PropertyChangeHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_PropertyChangeHandler_BasicTreeUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final PropertyChangeHandler sut = null; // = new PropertyChangeHandler(BasicTreeUI);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$PropertyChangeHandler]

    }

    @RunWith(J8Unit4.class)
    public static class CellEditorHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.CellEditorHandlerClassTests<CellEditorHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$CellEditorHandler]

        @Override
        public Class<CellEditorHandler> createNewSUT() {
            return CellEditorHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link CellEditorHandler#CellEditorHandler(BasicTreeUI) public
         * javax.swing.plaf.basic.BasicTreeUI$CellEditorHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_CellEditorHandler_BasicTreeUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final CellEditorHandler sut = null; // = new CellEditorHandler(BasicTreeUI);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$CellEditorHandler]

    }

    @RunWith(J8Unit4.class)
    public static class TreeIncrementActionClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.TreeIncrementActionClassTests<TreeIncrementAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeIncrementAction]

        @Override
        public Class<TreeIncrementAction> createNewSUT() {
            return TreeIncrementAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link TreeIncrementAction#TreeIncrementAction(BasicTreeUI, int, String) public
         * javax.swing.plaf.basic.BasicTreeUI$TreeIncrementAction(javax.swing.plaf.basic.BasicTreeUI,int,java.lang.String)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_TreeIncrementAction_BasicTreeUI_int_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final TreeIncrementAction sut = null; // = new TreeIncrementAction(BasicTreeUI, int, String);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeIncrementAction]

    }

    @RunWith(J8Unit4.class)
    public static class TreeCancelEditingActionClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.TreeCancelEditingActionClassTests<TreeCancelEditingAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeCancelEditingAction]

        @Override
        public Class<TreeCancelEditingAction> createNewSUT() {
            return TreeCancelEditingAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link TreeCancelEditingAction#TreeCancelEditingAction(BasicTreeUI, String) public
         * javax.swing.plaf.basic.BasicTreeUI$TreeCancelEditingAction(javax.swing.plaf.basic.BasicTreeUI,java.lang.String)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_TreeCancelEditingAction_BasicTreeUI_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final TreeCancelEditingAction sut = null; // = new TreeCancelEditingAction(BasicTreeUI, String);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeCancelEditingAction]

    }

}
