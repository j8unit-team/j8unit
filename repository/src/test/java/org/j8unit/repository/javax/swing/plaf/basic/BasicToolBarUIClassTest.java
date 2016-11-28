package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.plaf.basic.BasicToolBarUI;
import javax.swing.plaf.basic.BasicToolBarUI.DockingListener;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BasicToolBarUI} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.basic.BasicToolBarUIClassTests}).
 */
@RunWith(J8Unit4.class)
public class BasicToolBarUIClassTest
implements BasicToolBarUIClassTests<BasicToolBarUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicToolBarUI]

    @Override
    public Class<BasicToolBarUI> createNewSUT() {
        return BasicToolBarUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.basic.BasicToolBarUI#BasicToolBarUI() public javax.swing.plaf.basic.BasicToolBarUI()}.
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
    public void create_BasicToolBarUI()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BasicToolBarUI sut = new BasicToolBarUI();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicToolBarUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.basic.BasicToolBarUI.createUI(javax.swing.JComponent)}.
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
        // write some test for {@link javax.swing.plaf.basic.BasicToolBarUI#createUI(javax.swing.JComponent)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicToolBarUI]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicToolBarUI]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link DockingListener} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicToolBarUIClassTests.DockingListenerClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class DockingListenerClassTest
    implements DockingListenerClassTests<DockingListener> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicToolBarUI$DockingListener]

        @Override
        public Class<DockingListener> createNewSUT() {
            return DockingListener.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicToolBarUI.DockingListener#DockingListener(javax.swing.plaf.basic.BasicToolBarUI, javax.swing.JToolBar)
         * public
         * javax.swing.plaf.basic.BasicToolBarUI$DockingListener(javax.swing.plaf.basic.BasicToolBarUI,javax.swing.JToolBar)}.
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
        public void create_DockingListener_BasicToolBarUI_JToolBar()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final DockingListener sut = null; // = new DockingListener(javax.swing.plaf.basic.BasicToolBarUI,
                                              // javax.swing.JToolBar);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicToolBarUI$DockingListener]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicToolBarUI$DockingListener]

    }

}
