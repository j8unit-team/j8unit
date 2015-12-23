package org.j8unit.repository.java.awt.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.event.HierarchyBoundsAdapter class
 * java.awt.event.HierarchyBoundsAdapter}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.awt.event.HierarchyBoundsAdapterTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.awt.event.HierarchyBoundsAdapterClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.event.HierarchyBoundsAdapter
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HierarchyBoundsAdapterTests<SUT extends java.awt.event.HierarchyBoundsAdapter>
extends org.j8unit.repository.java.awt.event.HierarchyBoundsListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.event.HierarchyBoundsAdapter#ancestorMoved(java.awt.event.HierarchyEvent) public
     * void java.awt.event.HierarchyBoundsAdapter.ancestorMoved(java.awt.event.HierarchyEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.event.HierarchyBoundsAdapter#ancestorMoved(java.awt.event.HierarchyEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.event.HierarchyBoundsAdapter#ancestorResized(java.awt.event.HierarchyEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_ancestorResized_HierarchyEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
