package org.j8unit.repository.javax.swing.plaf.basic;

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
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BasicSplitPaneUI} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUIClassTests}).
 */

@RunWith(J8Unit4.class)
public class BasicSplitPaneUIClassTest
implements BasicSplitPaneUIClassTests<BasicSplitPaneUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI]

    @Override
    public Class<BasicSplitPaneUI> createNewSUT() {
        return BasicSplitPaneUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#BasicSplitPaneUI() public
     * javax.swing.plaf.basic.BasicSplitPaneUI()}.
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
    public void create_BasicSplitPaneUI()
    throws Exception {
        // create new instance
        final BasicSplitPaneUI sut = new BasicSplitPaneUI();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.basic.BasicSplitPaneUI.createUI(javax.swing.JComponent)}.
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
        // write some test for {@link javax.swing.plaf.basic.BasicSplitPaneUI#createUI(javax.swing.JComponent)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link BasicHorizontalLayoutManager} (by
     * simply reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUIClassTests.BasicHorizontalLayoutManagerClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class BasicHorizontalLayoutManagerClassTest
    implements BasicHorizontalLayoutManagerClassTests<BasicHorizontalLayoutManager> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$BasicHorizontalLayoutManager]

        @Override
        public Class<BasicHorizontalLayoutManager> createNewSUT() {
            return BasicHorizontalLayoutManager.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$BasicHorizontalLayoutManager]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$BasicHorizontalLayoutManager]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link KeyboardResizeToggleHandler} (by
     * simply reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUIClassTests.KeyboardResizeToggleHandlerClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class KeyboardResizeToggleHandlerClassTest
    implements KeyboardResizeToggleHandlerClassTests<KeyboardResizeToggleHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardResizeToggleHandler]

        @Override
        public Class<KeyboardResizeToggleHandler> createNewSUT() {
            return KeyboardResizeToggleHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardResizeToggleHandler#KeyboardResizeToggleHandler(javax.swing.plaf.basic.BasicSplitPaneUI)
         * public
         * javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardResizeToggleHandler(javax.swing.plaf.basic.BasicSplitPaneUI)}.
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
        public void create_KeyboardResizeToggleHandler_BasicSplitPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final KeyboardResizeToggleHandler sut = null; // = new
                                                          // KeyboardResizeToggleHandler(javax.swing.plaf.basic.BasicSplitPaneUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardResizeToggleHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardResizeToggleHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link KeyboardHomeHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUIClassTests.KeyboardHomeHandlerClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class KeyboardHomeHandlerClassTest
    implements KeyboardHomeHandlerClassTests<KeyboardHomeHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardHomeHandler]

        @Override
        public Class<KeyboardHomeHandler> createNewSUT() {
            return KeyboardHomeHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardHomeHandler#KeyboardHomeHandler(javax.swing.plaf.basic.BasicSplitPaneUI)
         * public javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardHomeHandler(javax.swing.plaf.basic.BasicSplitPaneUI)}.
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
        public void create_KeyboardHomeHandler_BasicSplitPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final KeyboardHomeHandler sut = null; // = new KeyboardHomeHandler(javax.swing.plaf.basic.BasicSplitPaneUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardHomeHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardHomeHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link KeyboardUpLeftHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUIClassTests.KeyboardUpLeftHandlerClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class KeyboardUpLeftHandlerClassTest
    implements KeyboardUpLeftHandlerClassTests<KeyboardUpLeftHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardUpLeftHandler]

        @Override
        public Class<KeyboardUpLeftHandler> createNewSUT() {
            return KeyboardUpLeftHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler#KeyboardUpLeftHandler(javax.swing.plaf.basic.BasicSplitPaneUI)
         * public
         * javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardUpLeftHandler(javax.swing.plaf.basic.BasicSplitPaneUI)}.
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
        public void create_KeyboardUpLeftHandler_BasicSplitPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final KeyboardUpLeftHandler sut = null; // = new
                                                    // KeyboardUpLeftHandler(javax.swing.plaf.basic.BasicSplitPaneUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardUpLeftHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardUpLeftHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link BasicVerticalLayoutManager} (by
     * simply reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUIClassTests.BasicVerticalLayoutManagerClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class BasicVerticalLayoutManagerClassTest
    implements BasicVerticalLayoutManagerClassTests<BasicVerticalLayoutManager> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$BasicVerticalLayoutManager]

        @Override
        public Class<BasicVerticalLayoutManager> createNewSUT() {
            return BasicVerticalLayoutManager.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.BasicVerticalLayoutManager#BasicVerticalLayoutManager(javax.swing.plaf.basic.BasicSplitPaneUI)
         * public
         * javax.swing.plaf.basic.BasicSplitPaneUI$BasicVerticalLayoutManager(javax.swing.plaf.basic.BasicSplitPaneUI)}.
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
        public void create_BasicVerticalLayoutManager_BasicSplitPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final BasicVerticalLayoutManager sut = null; // = new
                                                         // BasicVerticalLayoutManager(javax.swing.plaf.basic.BasicSplitPaneUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$BasicVerticalLayoutManager]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$BasicVerticalLayoutManager]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link KeyboardEndHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUIClassTests.KeyboardEndHandlerClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class KeyboardEndHandlerClassTest
    implements KeyboardEndHandlerClassTests<KeyboardEndHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardEndHandler]

        @Override
        public Class<KeyboardEndHandler> createNewSUT() {
            return KeyboardEndHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardEndHandler#KeyboardEndHandler(javax.swing.plaf.basic.BasicSplitPaneUI)
         * public javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardEndHandler(javax.swing.plaf.basic.BasicSplitPaneUI)}.
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
        public void create_KeyboardEndHandler_BasicSplitPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final KeyboardEndHandler sut = null; // = new KeyboardEndHandler(javax.swing.plaf.basic.BasicSplitPaneUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardEndHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardEndHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link KeyboardDownRightHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUIClassTests.KeyboardDownRightHandlerClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class KeyboardDownRightHandlerClassTest
    implements KeyboardDownRightHandlerClassTests<KeyboardDownRightHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardDownRightHandler]

        @Override
        public Class<KeyboardDownRightHandler> createNewSUT() {
            return KeyboardDownRightHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler#KeyboardDownRightHandler(javax.swing.plaf.basic.BasicSplitPaneUI)
         * public
         * javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardDownRightHandler(javax.swing.plaf.basic.BasicSplitPaneUI)}.
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
        public void create_KeyboardDownRightHandler_BasicSplitPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final KeyboardDownRightHandler sut = null; // = new
                                                       // KeyboardDownRightHandler(javax.swing.plaf.basic.BasicSplitPaneUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardDownRightHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardDownRightHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link FocusHandler} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUIClassTests.FocusHandlerClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class FocusHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUIClassTests.FocusHandlerClassTests<FocusHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$FocusHandler]

        @Override
        public Class<FocusHandler> createNewSUT() {
            return FocusHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.FocusHandler#FocusHandler(javax.swing.plaf.basic.BasicSplitPaneUI)
         * public javax.swing.plaf.basic.BasicSplitPaneUI$FocusHandler(javax.swing.plaf.basic.BasicSplitPaneUI)}.
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
        public void create_FocusHandler_BasicSplitPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final FocusHandler sut = null; // = new FocusHandler(javax.swing.plaf.basic.BasicSplitPaneUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$FocusHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$FocusHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link PropertyHandler} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUIClassTests.PropertyHandlerClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class PropertyHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUIClassTests.PropertyHandlerClassTests<PropertyHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$PropertyHandler]

        @Override
        public Class<PropertyHandler> createNewSUT() {
            return PropertyHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.PropertyHandler#PropertyHandler(javax.swing.plaf.basic.BasicSplitPaneUI)
         * public javax.swing.plaf.basic.BasicSplitPaneUI$PropertyHandler(javax.swing.plaf.basic.BasicSplitPaneUI)}.
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
        public void create_PropertyHandler_BasicSplitPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final PropertyHandler sut = null; // = new PropertyHandler(javax.swing.plaf.basic.BasicSplitPaneUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$PropertyHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicSplitPaneUI$PropertyHandler]

    }

}
