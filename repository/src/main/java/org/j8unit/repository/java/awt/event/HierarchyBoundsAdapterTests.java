package org.j8unit.repository.java.awt.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.event.HierarchyBoundsAdapter class
 * java.awt.event.HierarchyBoundsAdapter}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link HierarchyBoundsAdapterClassTests}.
 * </p>
 *
 * @see java.awt.event.HierarchyBoundsAdapter class java.awt.event.HierarchyBoundsAdapter (the hereby targeted
 *      class-under-test class)
 * @see HierarchyBoundsAdapterClassTests HierarchyBoundsAdapterClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HierarchyBoundsAdapterTests<SUT extends java.awt.event.HierarchyBoundsAdapter>
extends HierarchyBoundsListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.event.HierarchyBoundsAdapter#ancestorMoved(java.awt.event.HierarchyEvent) public
     * void java.awt.event.HierarchyBoundsAdapter.ancestorMoved(java.awt.event.HierarchyEvent)}.
     *
     * <p>
     * Test method for {@link java.awt.event.HierarchyBoundsAdapter#ancestorMoved(java.awt.event.HierarchyEvent) public
     * void java.awt.event.HierarchyBoundsAdapter.ancestorMoved(java.awt.event.HierarchyEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.event.HierarchyBoundsAdapter#ancestorMoved(java.awt.event.HierarchyEvent) public void
     *      java.awt.event.HierarchyBoundsAdapter.ancestorMoved(java.awt.event.HierarchyEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_ancestorMoved_HierarchyEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.event.HierarchyBoundsAdapter#ancestorResized(java.awt.event.HierarchyEvent)
     * public void java.awt.event.HierarchyBoundsAdapter.ancestorResized(java.awt.event.HierarchyEvent)}.
     *
     * <p>
     * Test method for {@link java.awt.event.HierarchyBoundsAdapter#ancestorResized(java.awt.event.HierarchyEvent)
     * public void java.awt.event.HierarchyBoundsAdapter.ancestorResized(java.awt.event.HierarchyEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.event.HierarchyBoundsAdapter#ancestorResized(java.awt.event.HierarchyEvent) public void
     *      java.awt.event.HierarchyBoundsAdapter.ancestorResized(java.awt.event.HierarchyEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_ancestorResized_HierarchyEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
