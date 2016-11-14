package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.plaf.basic.BasicTableUI;
import javax.swing.plaf.basic.BasicTableUI.FocusHandler;
import javax.swing.plaf.basic.BasicTableUI.KeyHandler;
import javax.swing.plaf.basic.BasicTableUI.MouseInputHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BasicTableUI} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTableUIClassTests}).
 */

@RunWith(J8Unit4.class)
public class BasicTableUIClassTest
implements BasicTableUIClassTests<BasicTableUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTableUI]

    @Override
    public Class<BasicTableUI> createNewSUT() {
        return BasicTableUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.basic.BasicTableUI#BasicTableUI() public javax.swing.plaf.basic.BasicTableUI()}.
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
    public void create_BasicTableUI()
    throws Exception {
        // create new instance
        final BasicTableUI sut = new BasicTableUI();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicTableUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.basic.BasicTableUI.createUI(javax.swing.JComponent)}.
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
        // write some test for {@link javax.swing.plaf.basic.BasicTableUI#createUI(javax.swing.JComponent)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTableUI]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTableUI]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link KeyHandler} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTableUIClassTests.KeyHandlerClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class KeyHandlerClassTest
    implements KeyHandlerClassTests<KeyHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTableUI$KeyHandler]

        @Override
        public Class<KeyHandler> createNewSUT() {
            return KeyHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicTableUI.KeyHandler#KeyHandler(javax.swing.plaf.basic.BasicTableUI) public
         * javax.swing.plaf.basic.BasicTableUI$KeyHandler(javax.swing.plaf.basic.BasicTableUI)}.
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
        public void create_KeyHandler_BasicTableUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final KeyHandler sut = null; // = new KeyHandler(javax.swing.plaf.basic.BasicTableUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTableUI$KeyHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTableUI$KeyHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link MouseInputHandler} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTableUIClassTests.MouseInputHandlerClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class MouseInputHandlerClassTest
    implements MouseInputHandlerClassTests<MouseInputHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTableUI$MouseInputHandler]

        @Override
        public Class<MouseInputHandler> createNewSUT() {
            return MouseInputHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicTableUI.MouseInputHandler#MouseInputHandler(javax.swing.plaf.basic.BasicTableUI)
         * public javax.swing.plaf.basic.BasicTableUI$MouseInputHandler(javax.swing.plaf.basic.BasicTableUI)}.
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
        public void create_MouseInputHandler_BasicTableUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final MouseInputHandler sut = null; // = new MouseInputHandler(javax.swing.plaf.basic.BasicTableUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTableUI$MouseInputHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTableUI$MouseInputHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link FocusHandler} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTableUIClassTests.FocusHandlerClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class FocusHandlerClassTest
    implements FocusHandlerClassTests<FocusHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicTableUI$FocusHandler]

        @Override
        public Class<FocusHandler> createNewSUT() {
            return FocusHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicTableUI.FocusHandler#FocusHandler(javax.swing.plaf.basic.BasicTableUI)
         * public javax.swing.plaf.basic.BasicTableUI$FocusHandler(javax.swing.plaf.basic.BasicTableUI)}.
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
        public void create_FocusHandler_BasicTableUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final FocusHandler sut = null; // = new FocusHandler(javax.swing.plaf.basic.BasicTableUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicTableUI$FocusHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicTableUI$FocusHandler]

    }

}
