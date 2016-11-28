package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.plaf.basic.BasicListUI;
import javax.swing.plaf.basic.BasicListUI.FocusHandler;
import javax.swing.plaf.basic.BasicListUI.ListDataHandler;
import javax.swing.plaf.basic.BasicListUI.ListSelectionHandler;
import javax.swing.plaf.basic.BasicListUI.MouseInputHandler;
import javax.swing.plaf.basic.BasicListUI.PropertyChangeHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BasicListUI} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.basic.BasicListUIClassTests}).
 */
@RunWith(J8Unit4.class)
public class BasicListUIClassTest
implements BasicListUIClassTests<BasicListUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicListUI]

    @Override
    public Class<BasicListUI> createNewSUT() {
        return BasicListUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.basic.BasicListUI#BasicListUI() public javax.swing.plaf.basic.BasicListUI()}.
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
    public void create_BasicListUI()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BasicListUI sut = new BasicListUI();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicListUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.basic.BasicListUI.createUI(javax.swing.JComponent)}.
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
        // write some test for {@link javax.swing.plaf.basic.BasicListUI#createUI(javax.swing.JComponent)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicListUI]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicListUI]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link ListSelectionHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicListUIClassTests.ListSelectionHandlerClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ListSelectionHandlerClassTest
    implements ListSelectionHandlerClassTests<ListSelectionHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicListUI$ListSelectionHandler]

        @Override
        public Class<ListSelectionHandler> createNewSUT() {
            return ListSelectionHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicListUI.ListSelectionHandler#ListSelectionHandler(javax.swing.plaf.basic.BasicListUI)
         * public javax.swing.plaf.basic.BasicListUI$ListSelectionHandler(javax.swing.plaf.basic.BasicListUI)}.
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
        public void create_ListSelectionHandler_BasicListUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final ListSelectionHandler sut = null; // = new ListSelectionHandler(javax.swing.plaf.basic.BasicListUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicListUI$ListSelectionHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicListUI$ListSelectionHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link ListDataHandler} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicListUIClassTests.ListDataHandlerClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ListDataHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicListUIClassTests.ListDataHandlerClassTests<ListDataHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicListUI$ListDataHandler]

        @Override
        public Class<ListDataHandler> createNewSUT() {
            return ListDataHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicListUI.ListDataHandler#ListDataHandler(javax.swing.plaf.basic.BasicListUI)
         * public javax.swing.plaf.basic.BasicListUI$ListDataHandler(javax.swing.plaf.basic.BasicListUI)}.
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
        public void create_ListDataHandler_BasicListUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final ListDataHandler sut = null; // = new ListDataHandler(javax.swing.plaf.basic.BasicListUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicListUI$ListDataHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicListUI$ListDataHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link PropertyChangeHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicListUIClassTests.PropertyChangeHandlerClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class PropertyChangeHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicListUIClassTests.PropertyChangeHandlerClassTests<PropertyChangeHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicListUI$PropertyChangeHandler]

        @Override
        public Class<PropertyChangeHandler> createNewSUT() {
            return PropertyChangeHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicListUI.PropertyChangeHandler#PropertyChangeHandler(javax.swing.plaf.basic.BasicListUI)
         * public javax.swing.plaf.basic.BasicListUI$PropertyChangeHandler(javax.swing.plaf.basic.BasicListUI)}.
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
        public void create_PropertyChangeHandler_BasicListUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final PropertyChangeHandler sut = null; // = new PropertyChangeHandler(javax.swing.plaf.basic.BasicListUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicListUI$PropertyChangeHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicListUI$PropertyChangeHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link FocusHandler} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicListUIClassTests.FocusHandlerClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class FocusHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicListUIClassTests.FocusHandlerClassTests<FocusHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicListUI$FocusHandler]

        @Override
        public Class<FocusHandler> createNewSUT() {
            return FocusHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicListUI.FocusHandler#FocusHandler(javax.swing.plaf.basic.BasicListUI)
         * public javax.swing.plaf.basic.BasicListUI$FocusHandler(javax.swing.plaf.basic.BasicListUI)}.
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
        public void create_FocusHandler_BasicListUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final FocusHandler sut = null; // = new FocusHandler(javax.swing.plaf.basic.BasicListUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicListUI$FocusHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicListUI$FocusHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link MouseInputHandler} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicListUIClassTests.MouseInputHandlerClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class MouseInputHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicListUIClassTests.MouseInputHandlerClassTests<MouseInputHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicListUI$MouseInputHandler]

        @Override
        public Class<MouseInputHandler> createNewSUT() {
            return MouseInputHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicListUI.MouseInputHandler#MouseInputHandler(javax.swing.plaf.basic.BasicListUI)
         * public javax.swing.plaf.basic.BasicListUI$MouseInputHandler(javax.swing.plaf.basic.BasicListUI)}.
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
        public void create_MouseInputHandler_BasicListUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final MouseInputHandler sut = null; // = new MouseInputHandler(javax.swing.plaf.basic.BasicListUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicListUI$MouseInputHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicListUI$MouseInputHandler]

    }

}
