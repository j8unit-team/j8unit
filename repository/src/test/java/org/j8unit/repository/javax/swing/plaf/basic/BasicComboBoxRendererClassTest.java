package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.plaf.basic.BasicComboBoxRenderer;
import javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class BasicComboBoxRendererClassTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxRendererClassTests<BasicComboBoxRenderer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicComboBoxRenderer]

    @Override
    public Class<BasicComboBoxRenderer> createNewSUT() {
        return BasicComboBoxRenderer.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.basic.BasicComboBoxRenderer#BasicComboBoxRenderer() public
     * javax.swing.plaf.basic.BasicComboBoxRenderer()}.
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
    public void create_BasicComboBoxRenderer()
    throws Exception {
        // create new instance
        final BasicComboBoxRenderer sut = new BasicComboBoxRenderer();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicComboBoxRenderer]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicComboBoxRenderer]

    @SuppressWarnings("rawtypes")
    @RunWith(J8Unit4.class)
    public static class UIResourceClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxRendererClassTests.UIResourceClassTests<UIResource> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicComboBoxRenderer$UIResource]

        @Override
        public Class<UIResource> createNewSUT() {
            return UIResource.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource#UIResource() public
         * javax.swing.plaf.basic.BasicComboBoxRenderer$UIResource()}.
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

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicComboBoxRenderer$UIResource]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicComboBoxRenderer$UIResource]

    }

}
