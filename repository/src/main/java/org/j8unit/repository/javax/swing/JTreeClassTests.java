package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.JTree class javax.swing.JTree}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.JTreeTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable
 * test method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.JTreeTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.JTree
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JTreeClassTests<SUT extends javax.swing.JTree>
extends org.j8unit.repository.javax.swing.ScrollableClassTests<SUT>, org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>,
org.j8unit.repository.javax.swing.JComponentClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.JTree.DropLocation class
     * javax.swing.JTree$DropLocation}, containing all class relevant test methods (at least the test methods of
     * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.JTreeTests.DropLocationTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.JTreeTests.DropLocationTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.JTree.DropLocation
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DropLocationClassTests<SUT extends javax.swing.JTree.DropLocation>
    extends org.j8unit.repository.javax.swing.TransferHandlerClassTests.DropLocationClassTests<SUT> {

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.JTree.DropLocation#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.JTree.DropLocation.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.JTree.DynamicUtilTreeNode class
     * javax.swing.JTree$DynamicUtilTreeNode}, containing all class relevant test methods (at least the test methods of
     * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.JTreeTests.DynamicUtilTreeNodeTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.JTreeTests.DynamicUtilTreeNodeTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.JTree.DynamicUtilTreeNode
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DynamicUtilTreeNodeClassTests<SUT extends javax.swing.JTree.DynamicUtilTreeNode>
    extends org.j8unit.repository.javax.swing.tree.DefaultMutableTreeNodeClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.JTree.DynamicUtilTreeNode#DynamicUtilTreeNode(java.lang.Object, java.lang.Object) public
         * javax.swing.JTree$DynamicUtilTreeNode(java.lang.Object,java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.JTree.DynamicUtilTreeNode#DynamicUtilTreeNode(java.lang.Object, java.lang.Object)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_DynamicUtilTreeNode_Object_Object()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.JTree.DynamicUtilTreeNode sut = null; // = new DynamicUtilTreeNode(java.lang.Object,
                                                                    // java.lang.Object);
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.JTree.DynamicUtilTreeNode#createChildren(javax.swing.tree.DefaultMutableTreeNode, java.lang.Object)
         * public static void
         * javax.swing.JTree$DynamicUtilTreeNode.createChildren(javax.swing.tree.DefaultMutableTreeNode,java.lang.Object)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.JTree.DynamicUtilTreeNode#createChildren(javax.swing.tree.DefaultMutableTreeNode,
         *             java.lang.Object)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_createChildren_DefaultMutableTreeNode_Object()
        throws Exception {
            // query fresh subject-under-test
            final Class<SUT> sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.JTree.DynamicUtilTreeNode#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.JTree.DynamicUtilTreeNode.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTree#JTree() public javax.swing.JTree()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JTree#JTree()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTree()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JTree sut = null; // = new JTree();
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTree#JTree(java.util.Hashtable) public
     * javax.swing.JTree(java.util.Hashtable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JTree#JTree(java.util.Hashtable)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTree_Hashtable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JTree sut = null; // = new JTree(java.util.Hashtable);
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTree#JTree(java.lang.Object[]) public javax.swing.JTree(java.lang.Object[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JTree#JTree(java.lang.Object[])
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTree_ObjectArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JTree sut = null; // = new JTree(java.lang.Object[]);
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTree#JTree(javax.swing.tree.TreeModel) public
     * javax.swing.JTree(javax.swing.tree.TreeModel)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JTree#JTree(javax.swing.tree.TreeModel)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTree_TreeModel()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JTree sut = null; // = new JTree(javax.swing.tree.TreeModel);
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTree#JTree(javax.swing.tree.TreeNode) public
     * javax.swing.JTree(javax.swing.tree.TreeNode)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JTree#JTree(javax.swing.tree.TreeNode)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTree_TreeNode()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JTree sut = null; // = new JTree(javax.swing.tree.TreeNode);
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTree#JTree(javax.swing.tree.TreeNode, boolean) public
     * javax.swing.JTree(javax.swing.tree.TreeNode,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JTree#JTree(javax.swing.tree.TreeNode, boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTree_TreeNode_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JTree sut = null; // = new JTree(javax.swing.tree.TreeNode, boolean);
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTree#JTree(java.util.Vector) public javax.swing.JTree(java.util.Vector)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JTree#JTree(java.util.Vector)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTree_Vector()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JTree sut = null; // = new JTree(java.util.Vector);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.swing.JTree#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JTree.class.isAssignableFrom(sut));
    }

}
