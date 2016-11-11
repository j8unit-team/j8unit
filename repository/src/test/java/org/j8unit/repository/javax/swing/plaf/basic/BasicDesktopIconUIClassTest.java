package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.plaf.basic.BasicDesktopIconUI;
import javax.swing.plaf.basic.BasicDesktopIconUI.MouseInputHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BasicDesktopIconUI} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.basic.BasicDesktopIconUIClassTests}).
 */

@RunWith(J8Unit4.class)
public class BasicDesktopIconUIClassTest
implements BasicDesktopIconUIClassTests<BasicDesktopIconUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicDesktopIconUI]

    @Override
    public Class<BasicDesktopIconUI> createNewSUT() {
        return BasicDesktopIconUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.basic.BasicDesktopIconUI#BasicDesktopIconUI() public
     * javax.swing.plaf.basic.BasicDesktopIconUI()}.
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
    public void create_BasicDesktopIconUI()
    throws Exception {
        // create new instance
        final BasicDesktopIconUI sut = new BasicDesktopIconUI();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicDesktopIconUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.basic.BasicDesktopIconUI.createUI(javax.swing.JComponent)}.
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
        // write some test for {@link javax.swing.plaf.basic.BasicDesktopIconUI#createUI(javax.swing.JComponent)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicDesktopIconUI]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicDesktopIconUI]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link MouseInputHandler} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicDesktopIconUIClassTests.MouseInputHandlerClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class MouseInputHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicDesktopIconUIClassTests.MouseInputHandlerClassTests<MouseInputHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicDesktopIconUI$MouseInputHandler]

        @Override
        public Class<MouseInputHandler> createNewSUT() {
            return MouseInputHandler.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicDesktopIconUI.MouseInputHandler#MouseInputHandler(javax.swing.plaf.basic.BasicDesktopIconUI)
         * public
         * javax.swing.plaf.basic.BasicDesktopIconUI$MouseInputHandler(javax.swing.plaf.basic.BasicDesktopIconUI)}.
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
        public void create_MouseInputHandler_BasicDesktopIconUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final MouseInputHandler sut = null; // = new MouseInputHandler(javax.swing.plaf.basic.BasicDesktopIconUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicDesktopIconUI$MouseInputHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicDesktopIconUI$MouseInputHandler]

    }

}
