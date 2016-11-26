package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.DefaultTreeCellRenderer;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DefaultTreeCellRenderer} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.tree.DefaultTreeCellRendererClassTests}).
 */
@RunWith(J8Unit4.class)
public class DefaultTreeCellRendererClassTest
implements DefaultTreeCellRendererClassTests<DefaultTreeCellRenderer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.tree.DefaultTreeCellRenderer]

    @Override
    public Class<DefaultTreeCellRenderer> createNewSUT() {
        return DefaultTreeCellRenderer.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.tree.DefaultTreeCellRenderer#DefaultTreeCellRenderer() public
     * javax.swing.tree.DefaultTreeCellRenderer()}.
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
    public void create_DefaultTreeCellRenderer()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DefaultTreeCellRenderer sut = new DefaultTreeCellRenderer();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.tree.DefaultTreeCellRenderer]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.tree.DefaultTreeCellRenderer]

}
