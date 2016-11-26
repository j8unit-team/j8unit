package org.j8unit.repository.javax.swing.plaf.metal;

import javax.swing.plaf.metal.MetalTabbedPaneUI;
import javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MetalTabbedPaneUI} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.metal.MetalTabbedPaneUIClassTests}).
 */
@RunWith(J8Unit4.class)
public class MetalTabbedPaneUIClassTest
implements MetalTabbedPaneUIClassTests<MetalTabbedPaneUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.metal.MetalTabbedPaneUI]

    @Override
    public Class<MetalTabbedPaneUI> createNewSUT() {
        return MetalTabbedPaneUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.metal.MetalTabbedPaneUI#MetalTabbedPaneUI() public
     * javax.swing.plaf.metal.MetalTabbedPaneUI()}.
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
    public void create_MetalTabbedPaneUI()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MetalTabbedPaneUI sut = new MetalTabbedPaneUI();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.metal.MetalTabbedPaneUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.metal.MetalTabbedPaneUI.createUI(javax.swing.JComponent)}.
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
        // write some test for {@link javax.swing.plaf.metal.MetalTabbedPaneUI#createUI(javax.swing.JComponent)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.metal.MetalTabbedPaneUI]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.metal.MetalTabbedPaneUI]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link TabbedPaneLayout} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalTabbedPaneUIClassTests.TabbedPaneLayoutClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class TabbedPaneLayoutClassTest
    implements TabbedPaneLayoutClassTests<TabbedPaneLayout> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.metal.MetalTabbedPaneUI$TabbedPaneLayout]

        @Override
        public Class<TabbedPaneLayout> createNewSUT() {
            return TabbedPaneLayout.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout#TabbedPaneLayout(javax.swing.plaf.metal.MetalTabbedPaneUI)
         * public javax.swing.plaf.metal.MetalTabbedPaneUI$TabbedPaneLayout(javax.swing.plaf.metal.MetalTabbedPaneUI)}.
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
        public void create_TabbedPaneLayout_MetalTabbedPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final TabbedPaneLayout sut = null; // = new TabbedPaneLayout(javax.swing.plaf.metal.MetalTabbedPaneUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.metal.MetalTabbedPaneUI$TabbedPaneLayout]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.metal.MetalTabbedPaneUI$TabbedPaneLayout]

    }

}
