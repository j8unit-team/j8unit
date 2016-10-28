package org.j8unit.repository.javax.swing;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListCellRenderer.UIResource;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultListCellRendererClassTest
implements org.j8unit.repository.javax.swing.DefaultListCellRendererClassTests<DefaultListCellRenderer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.DefaultListCellRenderer]

    @Override
    public Class<DefaultListCellRenderer> createNewSUT() {
        return DefaultListCellRenderer.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.DefaultListCellRenderer#DefaultListCellRenderer() public
     * javax.swing.DefaultListCellRenderer()}.
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
    public void create_DefaultListCellRenderer()
    throws Exception {
        // create new instance
        final DefaultListCellRenderer sut = new DefaultListCellRenderer();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.DefaultListCellRenderer]

    @RunWith(J8Unit4.class)
    public static class UIResourceClassTest
    implements org.j8unit.repository.javax.swing.DefaultListCellRendererClassTests.UIResourceClassTests<UIResource> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.DefaultListCellRenderer$UIResource]

        @Override
        public Class<UIResource> createNewSUT() {
            return UIResource.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.DefaultListCellRenderer.UIResource#UIResource() public
         * javax.swing.DefaultListCellRenderer$UIResource()}.
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

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.DefaultListCellRenderer$UIResource]

    }

}
