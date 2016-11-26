package org.j8unit.repository.javax.swing.plaf.basic;

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

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BasicTreeUI} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests}).
 */
@RunWith(J8Unit4.class)
public class BasicTreeUIClassTest
implements BasicTreeUIClassTests<BasicTreeUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI]

    @Override
    public Class<BasicTreeUI> createNewSUT() {
        return BasicTreeUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.basic.BasicTreeUI#BasicTreeUI() public javax.swing.plaf.basic.BasicTreeUI()}.
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
        @SuppressWarnings("unused")
        final BasicTreeUI sut = new BasicTreeUI();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicTreeUI#createUI(javax.swing.JComponent) public static
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
        // write some test for {@link javax.swing.plaf.basic.BasicTreeUI#createUI(javax.swing.JComponent)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link KeyHandler} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.KeyHandlerClassTests}).
     */
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
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicTreeUI.KeyHandler#KeyHandler(javax.swing.plaf.basic.BasicTreeUI) public
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
            final KeyHandler sut = null; // = new KeyHandler(javax.swing.plaf.basic.BasicTreeUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$KeyHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$KeyHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link TreeSelectionHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.TreeSelectionHandlerClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class TreeSelectionHandlerClassTest
    implements TreeSelectionHandlerClassTests<TreeSelectionHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeSelectionHandler]

        @Override
        public Class<TreeSelectionHandler> createNewSUT() {
            return TreeSelectionHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeSelectionHandler#TreeSelectionHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$TreeSelectionHandler(javax.swing.plaf.basic.BasicTreeUI)}.
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
            final TreeSelectionHandler sut = null; // = new TreeSelectionHandler(javax.swing.plaf.basic.BasicTreeUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeSelectionHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeSelectionHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link ComponentHandler} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.ComponentHandlerClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ComponentHandlerClassTest
    implements ComponentHandlerClassTests<ComponentHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$ComponentHandler]

        @Override
        public Class<ComponentHandler> createNewSUT() {
            return ComponentHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicTreeUI.ComponentHandler#ComponentHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$ComponentHandler(javax.swing.plaf.basic.BasicTreeUI)}.
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
            final ComponentHandler sut = null; // = new ComponentHandler(javax.swing.plaf.basic.BasicTreeUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$ComponentHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$ComponentHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link FocusHandler} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.FocusHandlerClassTests}).
     */
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
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicTreeUI.FocusHandler#FocusHandler(javax.swing.plaf.basic.BasicTreeUI)
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
            final FocusHandler sut = null; // = new FocusHandler(javax.swing.plaf.basic.BasicTreeUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$FocusHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$FocusHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link TreeCancelEditingAction} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.TreeCancelEditingActionClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class TreeCancelEditingActionClassTest
    implements TreeCancelEditingActionClassTests<TreeCancelEditingAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeCancelEditingAction]

        @Override
        public Class<TreeCancelEditingAction> createNewSUT() {
            return TreeCancelEditingAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction#TreeCancelEditingAction(javax.swing.plaf.basic.BasicTreeUI, String)
         * public
         * javax.swing.plaf.basic.BasicTreeUI$TreeCancelEditingAction(javax.swing.plaf.basic.BasicTreeUI,java.lang.String)}.
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
            final TreeCancelEditingAction sut = null; // = new
                                                      // TreeCancelEditingAction(javax.swing.plaf.basic.BasicTreeUI,
                                                      // String);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeCancelEditingAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeCancelEditingAction]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link TreeToggleAction} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.TreeToggleActionClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class TreeToggleActionClassTest
    implements TreeToggleActionClassTests<TreeToggleAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeToggleAction]

        @Override
        public Class<TreeToggleAction> createNewSUT() {
            return TreeToggleAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeToggleAction#TreeToggleAction(javax.swing.plaf.basic.BasicTreeUI, String)
         * public
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
            final TreeToggleAction sut = null; // = new TreeToggleAction(javax.swing.plaf.basic.BasicTreeUI, String);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeToggleAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeToggleAction]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link SelectionModelPropertyChangeHandler}
     * (by simply reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.SelectionModelPropertyChangeHandlerClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class SelectionModelPropertyChangeHandlerClassTest
    implements SelectionModelPropertyChangeHandlerClassTests<SelectionModelPropertyChangeHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$SelectionModelPropertyChangeHandler]

        @Override
        public Class<SelectionModelPropertyChangeHandler> createNewSUT() {
            return SelectionModelPropertyChangeHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler#SelectionModelPropertyChangeHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public
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
                                                                  // SelectionModelPropertyChangeHandler(javax.swing.plaf.basic.BasicTreeUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$SelectionModelPropertyChangeHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$SelectionModelPropertyChangeHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link MouseHandler} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.MouseHandlerClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class MouseHandlerClassTest
    implements MouseHandlerClassTests<MouseHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$MouseHandler]

        @Override
        public Class<MouseHandler> createNewSUT() {
            return MouseHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicTreeUI.MouseHandler#MouseHandler(javax.swing.plaf.basic.BasicTreeUI)
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
            final MouseHandler sut = null; // = new MouseHandler(javax.swing.plaf.basic.BasicTreeUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$MouseHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$MouseHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link CellEditorHandler} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.CellEditorHandlerClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class CellEditorHandlerClassTest
    implements CellEditorHandlerClassTests<CellEditorHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$CellEditorHandler]

        @Override
        public Class<CellEditorHandler> createNewSUT() {
            return CellEditorHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicTreeUI.CellEditorHandler#CellEditorHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$CellEditorHandler(javax.swing.plaf.basic.BasicTreeUI)}.
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
            final CellEditorHandler sut = null; // = new CellEditorHandler(javax.swing.plaf.basic.BasicTreeUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$CellEditorHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$CellEditorHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link TreeHomeAction} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.TreeHomeActionClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class TreeHomeActionClassTest
    implements TreeHomeActionClassTests<TreeHomeAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeHomeAction]

        @Override
        public Class<TreeHomeAction> createNewSUT() {
            return TreeHomeAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction#TreeHomeAction(javax.swing.plaf.basic.BasicTreeUI, int, String)
         * public
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
            final TreeHomeAction sut = null; // = new TreeHomeAction(javax.swing.plaf.basic.BasicTreeUI, int, String);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeHomeAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeHomeAction]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link TreePageAction} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.TreePageActionClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class TreePageActionClassTest
    implements TreePageActionClassTests<TreePageAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreePageAction]

        @Override
        public Class<TreePageAction> createNewSUT() {
            return TreePageAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreePageAction#TreePageAction(javax.swing.plaf.basic.BasicTreeUI, int, String)
         * public
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
            final TreePageAction sut = null; // = new TreePageAction(javax.swing.plaf.basic.BasicTreeUI, int, String);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreePageAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreePageAction]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link TreeTraverseAction} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.TreeTraverseActionClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class TreeTraverseActionClassTest
    implements TreeTraverseActionClassTests<TreeTraverseAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeTraverseAction]

        @Override
        public Class<TreeTraverseAction> createNewSUT() {
            return TreeTraverseAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction#TreeTraverseAction(javax.swing.plaf.basic.BasicTreeUI, int, String)
         * public
         * javax.swing.plaf.basic.BasicTreeUI$TreeTraverseAction(javax.swing.plaf.basic.BasicTreeUI,int,java.lang.String)}.
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
            final TreeTraverseAction sut = null; // = new TreeTraverseAction(javax.swing.plaf.basic.BasicTreeUI, int,
                                                 // String);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeTraverseAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeTraverseAction]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link NodeDimensionsHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.NodeDimensionsHandlerClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class NodeDimensionsHandlerClassTest
    implements NodeDimensionsHandlerClassTests<NodeDimensionsHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$NodeDimensionsHandler]

        @Override
        public Class<NodeDimensionsHandler> createNewSUT() {
            return NodeDimensionsHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicTreeUI.NodeDimensionsHandler#NodeDimensionsHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$NodeDimensionsHandler(javax.swing.plaf.basic.BasicTreeUI)}.
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
            final NodeDimensionsHandler sut = null; // = new NodeDimensionsHandler(javax.swing.plaf.basic.BasicTreeUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$NodeDimensionsHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$NodeDimensionsHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link TreeModelHandler} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.TreeModelHandlerClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class TreeModelHandlerClassTest
    implements TreeModelHandlerClassTests<TreeModelHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeModelHandler]

        @Override
        public Class<TreeModelHandler> createNewSUT() {
            return TreeModelHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeModelHandler#TreeModelHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$TreeModelHandler(javax.swing.plaf.basic.BasicTreeUI)}.
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
            final TreeModelHandler sut = null; // = new TreeModelHandler(javax.swing.plaf.basic.BasicTreeUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeModelHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeModelHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link TreeExpansionHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.TreeExpansionHandlerClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class TreeExpansionHandlerClassTest
    implements TreeExpansionHandlerClassTests<TreeExpansionHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeExpansionHandler]

        @Override
        public Class<TreeExpansionHandler> createNewSUT() {
            return TreeExpansionHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeExpansionHandler#TreeExpansionHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$TreeExpansionHandler(javax.swing.plaf.basic.BasicTreeUI)}.
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
            final TreeExpansionHandler sut = null; // = new TreeExpansionHandler(javax.swing.plaf.basic.BasicTreeUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeExpansionHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeExpansionHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link TreeIncrementAction} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.TreeIncrementActionClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class TreeIncrementActionClassTest
    implements TreeIncrementActionClassTests<TreeIncrementAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeIncrementAction]

        @Override
        public Class<TreeIncrementAction> createNewSUT() {
            return TreeIncrementAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction#TreeIncrementAction(javax.swing.plaf.basic.BasicTreeUI, int, String)
         * public
         * javax.swing.plaf.basic.BasicTreeUI$TreeIncrementAction(javax.swing.plaf.basic.BasicTreeUI,int,java.lang.String)}.
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
            final TreeIncrementAction sut = null; // = new TreeIncrementAction(javax.swing.plaf.basic.BasicTreeUI, int,
                                                  // String);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeIncrementAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$TreeIncrementAction]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link PropertyChangeHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.PropertyChangeHandlerClassTests}).
     */
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
         * {@link javax.swing.plaf.basic.BasicTreeUI.PropertyChangeHandler#PropertyChangeHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$PropertyChangeHandler(javax.swing.plaf.basic.BasicTreeUI)}.
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
            final PropertyChangeHandler sut = null; // = new PropertyChangeHandler(javax.swing.plaf.basic.BasicTreeUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$PropertyChangeHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$PropertyChangeHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link MouseInputHandler} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUIClassTests.MouseInputHandlerClassTests}).
     */
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
         * {@link javax.swing.plaf.basic.BasicTreeUI.MouseInputHandler#MouseInputHandler(javax.swing.plaf.basic.BasicTreeUI, java.awt.Component, java.awt.Component, java.awt.event.MouseEvent)
         * public
         * javax.swing.plaf.basic.BasicTreeUI$MouseInputHandler(javax.swing.plaf.basic.BasicTreeUI,java.awt.Component,java.awt.Component,java.awt.event.MouseEvent)}.
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
            final MouseInputHandler sut = null; // = new MouseInputHandler(javax.swing.plaf.basic.BasicTreeUI,
                                                // java.awt.Component, java.awt.Component, java.awt.event.MouseEvent);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$MouseInputHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTreeUI$MouseInputHandler]

    }

}
