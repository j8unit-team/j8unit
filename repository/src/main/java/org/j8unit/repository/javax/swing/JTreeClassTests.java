package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.JTree class javax.swing.JTree}, containing all class relevant test methods (at
 * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.javax.swing.JTreeTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.JTreeTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JTreeClassTests<SUT extends Class<? extends javax.swing.JTree>>
extends org.j8unit.repository.javax.swing.ScrollableClassTests<SUT>, org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>,
org.j8unit.repository.javax.swing.JComponentClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.JTree$DropLocation class javax.swing.JTree$DropLocation}, containing all class
     * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
     * methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.JTreeTests.DropLocationTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.JTreeTests.DropLocationTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DropLocationClassTests<SUT extends Class<? extends javax.swing.JTree.DropLocation>>
    extends org.j8unit.repository.javax.swing.TransferHandlerClassTests.DropLocationClassTests<SUT> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.JTree.DropLocation> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.JTree.DropLocation.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.JTree$DynamicUtilTreeNode class javax.swing.JTree$DynamicUtilTreeNode},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.JTreeTests.DynamicUtilTreeNodeTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.JTreeTests.DynamicUtilTreeNodeTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DynamicUtilTreeNodeClassTests<SUT extends Class<? extends javax.swing.JTree.DynamicUtilTreeNode>>
    extends org.j8unit.repository.javax.swing.tree.DefaultMutableTreeNodeClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.JTree.DynamicUtilTreeNode#DynamicUtilTreeNode(java.lang.Object,java.lang.Object) public
         * javax.swing.JTree$DynamicUtilTreeNode(java.lang.Object,java.lang.Object)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_DynamicUtilTreeNode_Object_Object()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.JTree.DynamicUtilTreeNode sut = null; // = new
                                                                    // DynamicUtilTreeNode(java.lang.Object,java.lang.Object);
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.JTree.DynamicUtilTreeNode#createChildren(javax.swing.tree.DefaultMutableTreeNode,java.lang.Object)
         * public static void
         * javax.swing.JTree$DynamicUtilTreeNode.createChildren(javax.swing.tree.DefaultMutableTreeNode,java.lang.Object)}
         * .
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_createChildren_DefaultMutableTreeNode_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.JTree.DynamicUtilTreeNode> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.JTree.DynamicUtilTreeNode.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link javax.swing.JTree#JTree() public javax.swing.JTree()}.
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
     * Test method for {@link javax.swing.JTree#JTree(java.util.Hashtable) public
     * javax.swing.JTree(java.util.Hashtable)}.
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
     * Test method for {@link javax.swing.JTree#JTree(java.lang.Object[]) public javax.swing.JTree(java.lang.Object[])}.
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
     * Test method for {@link javax.swing.JTree#JTree(javax.swing.tree.TreeModel) public
     * javax.swing.JTree(javax.swing.tree.TreeModel)}.
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
     * Test method for {@link javax.swing.JTree#JTree(javax.swing.tree.TreeNode) public
     * javax.swing.JTree(javax.swing.tree.TreeNode)}.
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
     * Test method for {@link javax.swing.JTree#JTree(javax.swing.tree.TreeNode,boolean) public
     * javax.swing.JTree(javax.swing.tree.TreeNode,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JTree_TreeNode_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JTree sut = null; // = new JTree(javax.swing.tree.TreeNode,boolean);
    }

    /**
     * Test method for {@link javax.swing.JTree#JTree(java.util.Vector) public javax.swing.JTree(java.util.Vector)}.
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

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.JTree> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JTree.class.isAssignableFrom(sut));
    }

}
