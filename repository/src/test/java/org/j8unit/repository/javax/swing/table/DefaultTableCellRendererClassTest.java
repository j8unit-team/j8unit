package org.j8unit.repository.javax.swing.table;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableCellRenderer.UIResource;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultTableCellRendererClassTest
implements org.j8unit.repository.javax.swing.table.DefaultTableCellRendererClassTests<DefaultTableCellRenderer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.table.DefaultTableCellRenderer]

    @Override
    public Class<DefaultTableCellRenderer> createNewSUT() {
        return DefaultTableCellRenderer.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.table.DefaultTableCellRenderer#DefaultTableCellRenderer() public
     * javax.swing.table.DefaultTableCellRenderer()}.
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
    public void create_DefaultTableCellRenderer()
    throws Exception {
        // create new instance
        final DefaultTableCellRenderer sut = new DefaultTableCellRenderer();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.table.DefaultTableCellRenderer]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.table.DefaultTableCellRenderer]

    @RunWith(J8Unit4.class)
    public static class UIResourceClassTest
    implements org.j8unit.repository.javax.swing.table.DefaultTableCellRendererClassTests.UIResourceClassTests<UIResource> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.table.DefaultTableCellRenderer$UIResource]

        @Override
        public Class<UIResource> createNewSUT() {
            return UIResource.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.table.DefaultTableCellRenderer.UIResource#UIResource() public
         * javax.swing.table.DefaultTableCellRenderer$UIResource()}.
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

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.table.DefaultTableCellRenderer$UIResource]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.table.DefaultTableCellRenderer$UIResource]

    }

}
