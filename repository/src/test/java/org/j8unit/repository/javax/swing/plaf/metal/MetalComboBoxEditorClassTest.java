package org.j8unit.repository.javax.swing.plaf.metal;

import javax.swing.plaf.metal.MetalComboBoxEditor;
import javax.swing.plaf.metal.MetalComboBoxEditor.UIResource;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MetalComboBoxEditor} (by simply reusing
 * the J8Unit test interface {@link MetalComboBoxEditorClassTests}).
 */

@RunWith(J8Unit4.class)
public class MetalComboBoxEditorClassTest
implements MetalComboBoxEditorClassTests<MetalComboBoxEditor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.metal.MetalComboBoxEditor]

    @Override
    public Class<MetalComboBoxEditor> createNewSUT() {
        return MetalComboBoxEditor.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.metal.MetalComboBoxEditor#MetalComboBoxEditor() public
     * javax.swing.plaf.metal.MetalComboBoxEditor()}.
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
    public void create_MetalComboBoxEditor()
    throws Exception {
        // create new instance
        final MetalComboBoxEditor sut = new MetalComboBoxEditor();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.metal.MetalComboBoxEditor]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.metal.MetalComboBoxEditor]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link UIResource} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxEditorClassTests.UIResourceClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class UIResourceClassTest
    implements org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxEditorClassTests.UIResourceClassTests<UIResource> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.metal.MetalComboBoxEditor$UIResource]

        @Override
        public Class<UIResource> createNewSUT() {
            return UIResource.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.metal.MetalComboBoxEditor.UIResource#UIResource() public
         * javax.swing.plaf.metal.MetalComboBoxEditor$UIResource()}.
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
        public void create_UIResource()
        throws Exception {
            // create new instance
            final UIResource sut = new UIResource();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.metal.MetalComboBoxEditor$UIResource]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.metal.MetalComboBoxEditor$UIResource]

    }

}
