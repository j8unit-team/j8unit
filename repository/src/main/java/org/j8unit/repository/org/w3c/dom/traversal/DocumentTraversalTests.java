package org.j8unit.repository.org.w3c.dom.traversal;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.w3c.dom.traversal.DocumentTraversal interface org.w3c.dom.traversal.DocumentTraversal},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.traversal.DocumentTraversalClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DocumentTraversalTests<SUT extends org.w3c.dom.traversal.DocumentTraversal>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link org.w3c.dom.traversal.DocumentTraversal#createTreeWalker(org.w3c.dom.Node,int,org.w3c.dom.traversal.NodeFilter,boolean) public abstract org.w3c.dom.traversal.TreeWalker org.w3c.dom.traversal.DocumentTraversal.createTreeWalker(org.w3c.dom.Node,int,org.w3c.dom.traversal.NodeFilter,boolean) throws org.w3c.dom.DOMException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createTreeWalker_Node_int_NodeFilter_boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.traversal.DocumentTraversal#createNodeIterator(org.w3c.dom.Node,int,org.w3c.dom.traversal.NodeFilter,boolean) public abstract org.w3c.dom.traversal.NodeIterator org.w3c.dom.traversal.DocumentTraversal.createNodeIterator(org.w3c.dom.Node,int,org.w3c.dom.traversal.NodeFilter,boolean) throws org.w3c.dom.DOMException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createNodeIterator_Node_int_NodeFilter_boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
