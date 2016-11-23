package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.DefaultMutableTreeNode;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DefaultMutableTreeNode} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.tree.DefaultMutableTreeNodeClassTests}).
 */

@RunWith(J8Unit4.class)
public class DefaultMutableTreeNodeClassTest
implements DefaultMutableTreeNodeClassTests<DefaultMutableTreeNode> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.tree.DefaultMutableTreeNode]

    @Override
    public Class<DefaultMutableTreeNode> createNewSUT() {
        return DefaultMutableTreeNode.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.tree.DefaultMutableTreeNode#DefaultMutableTreeNode(Object) public
     * javax.swing.tree.DefaultMutableTreeNode(java.lang.Object)}.
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
    public void create_DefaultMutableTreeNode_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DefaultMutableTreeNode sut = null; // = new DefaultMutableTreeNode(Object);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.tree.DefaultMutableTreeNode#DefaultMutableTreeNode() public
     * javax.swing.tree.DefaultMutableTreeNode()}.
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
    public void create_DefaultMutableTreeNode()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DefaultMutableTreeNode sut = new DefaultMutableTreeNode();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.tree.DefaultMutableTreeNode#DefaultMutableTreeNode(Object, boolean) public
     * javax.swing.tree.DefaultMutableTreeNode(java.lang.Object,boolean)}.
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
    public void create_DefaultMutableTreeNode_Object_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DefaultMutableTreeNode sut = null; // = new DefaultMutableTreeNode(Object, boolean);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.tree.DefaultMutableTreeNode]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.tree.DefaultMutableTreeNode]

}
