package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.event.TreeWillExpandListener interface
 * javax.swing.event.TreeWillExpandListener}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link TreeWillExpandListenerClassTests}.
 * </p>
 *
 * @see javax.swing.event.TreeWillExpandListener interface javax.swing.event.TreeWillExpandListener (the hereby targeted
 *      class-under-test class)
 * @see TreeWillExpandListenerClassTests TreeWillExpandListenerClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TreeWillExpandListenerTests<SUT extends javax.swing.event.TreeWillExpandListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.event.TreeWillExpandListener#treeWillCollapse(javax.swing.event.TreeExpansionEvent) public
     * abstract void javax.swing.event.TreeWillExpandListener.treeWillCollapse(javax.swing.event.TreeExpansionEvent)
     * throws javax.swing.tree.ExpandVetoException}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.event.TreeWillExpandListener#treeWillCollapse(javax.swing.event.TreeExpansionEvent) public
     * abstract void javax.swing.event.TreeWillExpandListener.treeWillCollapse(javax.swing.event.TreeExpansionEvent)
     * throws javax.swing.tree.ExpandVetoException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.TreeWillExpandListener#treeWillCollapse(javax.swing.event.TreeExpansionEvent) public
     *      abstract void
     *      javax.swing.event.TreeWillExpandListener.treeWillCollapse(javax.swing.event.TreeExpansionEvent) throws
     *      javax.swing.tree.ExpandVetoException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_treeWillCollapse_TreeExpansionEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.event.TreeWillExpandListener#treeWillExpand(javax.swing.event.TreeExpansionEvent) public
     * abstract void javax.swing.event.TreeWillExpandListener.treeWillExpand(javax.swing.event.TreeExpansionEvent)
     * throws javax.swing.tree.ExpandVetoException}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.event.TreeWillExpandListener#treeWillExpand(javax.swing.event.TreeExpansionEvent) public
     * abstract void javax.swing.event.TreeWillExpandListener.treeWillExpand(javax.swing.event.TreeExpansionEvent)
     * throws javax.swing.tree.ExpandVetoException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.TreeWillExpandListener#treeWillExpand(javax.swing.event.TreeExpansionEvent) public
     *      abstract void javax.swing.event.TreeWillExpandListener.treeWillExpand(javax.swing.event.TreeExpansionEvent)
     *      throws javax.swing.tree.ExpandVetoException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_treeWillExpand_TreeExpansionEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
