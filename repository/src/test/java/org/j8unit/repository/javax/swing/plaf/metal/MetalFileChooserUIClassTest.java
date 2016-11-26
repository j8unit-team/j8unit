package org.j8unit.repository.javax.swing.plaf.metal;

import javax.swing.plaf.metal.MetalFileChooserUI;
import javax.swing.plaf.metal.MetalFileChooserUI.FilterComboBoxRenderer;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MetalFileChooserUI} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.metal.MetalFileChooserUIClassTests}).
 */
@RunWith(J8Unit4.class)
public class MetalFileChooserUIClassTest
implements MetalFileChooserUIClassTests<MetalFileChooserUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.metal.MetalFileChooserUI]

    @Override
    public Class<MetalFileChooserUI> createNewSUT() {
        return MetalFileChooserUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.metal.MetalFileChooserUI#MetalFileChooserUI(javax.swing.JFileChooser) public
     * javax.swing.plaf.metal.MetalFileChooserUI(javax.swing.JFileChooser)}.
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
    public void create_MetalFileChooserUI_JFileChooser()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MetalFileChooserUI sut = null; // = new MetalFileChooserUI(javax.swing.JFileChooser);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.metal.MetalFileChooserUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.metal.MetalFileChooserUI.createUI(javax.swing.JComponent)}.
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
        // write some test for {@link javax.swing.plaf.metal.MetalFileChooserUI#createUI(javax.swing.JComponent)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.metal.MetalFileChooserUI]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.metal.MetalFileChooserUI]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link FilterComboBoxRenderer} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalFileChooserUIClassTests.FilterComboBoxRendererClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class FilterComboBoxRendererClassTest
    implements FilterComboBoxRendererClassTests<FilterComboBoxRenderer> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.metal.MetalFileChooserUI$FilterComboBoxRenderer]

        @Override
        public Class<FilterComboBoxRenderer> createNewSUT() {
            return FilterComboBoxRenderer.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.metal.MetalFileChooserUI.FilterComboBoxRenderer#FilterComboBoxRenderer(javax.swing.plaf.metal.MetalFileChooserUI)
         * public
         * javax.swing.plaf.metal.MetalFileChooserUI$FilterComboBoxRenderer(javax.swing.plaf.metal.MetalFileChooserUI)}.
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
        public void create_FilterComboBoxRenderer_MetalFileChooserUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final FilterComboBoxRenderer sut = null; // = new
                                                     // FilterComboBoxRenderer(javax.swing.plaf.metal.MetalFileChooserUI);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.metal.MetalFileChooserUI$FilterComboBoxRenderer]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.metal.MetalFileChooserUI$FilterComboBoxRenderer]

    }

}
