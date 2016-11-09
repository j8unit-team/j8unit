package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.plaf.basic.BasicComboBoxEditor;
import javax.swing.plaf.basic.BasicComboBoxEditor.UIResource;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BasicComboBoxEditor} (by simply reusing
 * the J8Unit test interface {@link BasicComboBoxEditorClassTests}).
 */

@RunWith(J8Unit4.class)
public class BasicComboBoxEditorClassTest
implements BasicComboBoxEditorClassTests<BasicComboBoxEditor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicComboBoxEditor]

    @Override
    public Class<BasicComboBoxEditor> createNewSUT() {
        return BasicComboBoxEditor.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.basic.BasicComboBoxEditor#BasicComboBoxEditor() public
     * javax.swing.plaf.basic.BasicComboBoxEditor()}.
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
    public void create_BasicComboBoxEditor()
    throws Exception {
        // create new instance
        final BasicComboBoxEditor sut = new BasicComboBoxEditor();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicComboBoxEditor]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicComboBoxEditor]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link UIResource} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxEditorClassTests.UIResourceClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class UIResourceClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxEditorClassTests.UIResourceClassTests<UIResource> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicComboBoxEditor$UIResource]

        @Override
        public Class<UIResource> createNewSUT() {
            return UIResource.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicComboBoxEditor.UIResource#UIResource() public
         * javax.swing.plaf.basic.BasicComboBoxEditor$UIResource()}.
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

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicComboBoxEditor$UIResource]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicComboBoxEditor$UIResource]

    }

}
