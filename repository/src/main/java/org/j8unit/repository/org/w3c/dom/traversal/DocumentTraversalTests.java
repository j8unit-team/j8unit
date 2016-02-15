package org.j8unit.repository.org.w3c.dom.traversal;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.w3c.dom.traversal.DocumentTraversal interface
 * org.w3c.dom.traversal.DocumentTraversal}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link DocumentTraversalClassTests}.
 * </p>
 *
 * @see org.w3c.dom.traversal.DocumentTraversal interface org.w3c.dom.traversal.DocumentTraversal (the hereby targeted
 *      class-under-test class)
 * @see DocumentTraversalClassTests DocumentTraversalClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DocumentTraversalTests<SUT extends org.w3c.dom.traversal.DocumentTraversal>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.w3c.dom.traversal.DocumentTraversal#createTreeWalker(org.w3c.dom.Node, int, org.w3c.dom.traversal.NodeFilter, boolean)
     * public abstract org.w3c.dom.traversal.TreeWalker
     * org.w3c.dom.traversal.DocumentTraversal.createTreeWalker(org.w3c.dom.Node,int,org.w3c.dom.traversal.NodeFilter,boolean)
     * throws org.w3c.dom.DOMException}.
     *
     * <p>
     * Test method for
     * {@link org.w3c.dom.traversal.DocumentTraversal#createTreeWalker(org.w3c.dom.Node, int, org.w3c.dom.traversal.NodeFilter, boolean)
     * public abstract org.w3c.dom.traversal.TreeWalker
     * org.w3c.dom.traversal.DocumentTraversal.createTreeWalker(org.w3c.dom.Node,int,org.w3c.dom.traversal.NodeFilter,boolean)
     * throws org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.traversal.DocumentTraversal#createTreeWalker(org.w3c.dom.Node, int,
     *      org.w3c.dom.traversal.NodeFilter, boolean) public abstract org.w3c.dom.traversal.TreeWalker
     *      org.w3c.dom.traversal.DocumentTraversal.createTreeWalker(org.w3c.dom.Node,int,org.w3c.dom.traversal.
     *      NodeFilter,boolean) throws org.w3c.dom.DOMException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createTreeWalker_Node_int_NodeFilter_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.w3c.dom.traversal.DocumentTraversal#createNodeIterator(org.w3c.dom.Node, int, org.w3c.dom.traversal.NodeFilter, boolean)
     * public abstract org.w3c.dom.traversal.NodeIterator
     * org.w3c.dom.traversal.DocumentTraversal.createNodeIterator(org.w3c.dom.Node,int,org.w3c.dom.traversal.NodeFilter,boolean)
     * throws org.w3c.dom.DOMException}.
     *
     * <p>
     * Test method for
     * {@link org.w3c.dom.traversal.DocumentTraversal#createNodeIterator(org.w3c.dom.Node, int, org.w3c.dom.traversal.NodeFilter, boolean)
     * public abstract org.w3c.dom.traversal.NodeIterator
     * org.w3c.dom.traversal.DocumentTraversal.createNodeIterator(org.w3c.dom.Node,int,org.w3c.dom.traversal.NodeFilter,boolean)
     * throws org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.traversal.DocumentTraversal#createNodeIterator(org.w3c.dom.Node, int,
     *      org.w3c.dom.traversal.NodeFilter, boolean) public abstract org.w3c.dom.traversal.NodeIterator
     *      org.w3c.dom.traversal.DocumentTraversal.createNodeIterator(org.w3c.dom.Node,int,org.w3c.dom.traversal.
     *      NodeFilter,boolean) throws org.w3c.dom.DOMException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createNodeIterator_Node_int_NodeFilter_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
