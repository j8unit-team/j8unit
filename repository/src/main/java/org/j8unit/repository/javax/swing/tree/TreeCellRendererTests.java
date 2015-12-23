package org.j8unit.repository.javax.swing.tree;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.tree.TreeCellRenderer interface
 * javax.swing.tree.TreeCellRenderer}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.tree.TreeCellRendererTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.tree.TreeCellRendererClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.tree.TreeCellRenderer
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TreeCellRendererTests<SUT extends javax.swing.tree.TreeCellRenderer>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.tree.TreeCellRenderer#getTreeCellRendererComponent(javax.swing.JTree, java.lang.Object, boolean, boolean, boolean, int, boolean)
     * public abstract java.awt.Component
     * javax.swing.tree.TreeCellRenderer.getTreeCellRendererComponent(javax.swing.JTree,java.lang.Object,boolean,boolean,boolean,int,boolean)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.tree.TreeCellRenderer#getTreeCellRendererComponent(javax.swing.JTree, java.lang.Object,
     *             boolean, boolean, boolean, int, boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTreeCellRendererComponent_JTree_Object_boolean_boolean_boolean_int_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
