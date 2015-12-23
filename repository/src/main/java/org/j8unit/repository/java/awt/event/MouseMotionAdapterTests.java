package org.j8unit.repository.java.awt.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.event.MouseMotionAdapter class
 * java.awt.event.MouseMotionAdapter}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.awt.event.MouseMotionAdapterTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.awt.event.MouseMotionAdapterClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.event.MouseMotionAdapter
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MouseMotionAdapterTests<SUT extends java.awt.event.MouseMotionAdapter>
extends org.j8unit.repository.java.awt.event.MouseMotionListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.event.MouseMotionAdapter#mouseDragged(java.awt.event.MouseEvent) public void
     * java.awt.event.MouseMotionAdapter.mouseDragged(java.awt.event.MouseEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.event.MouseMotionAdapter#mouseDragged(java.awt.event.MouseEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_mouseDragged_MouseEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.event.MouseMotionAdapter#mouseMoved(java.awt.event.MouseEvent) public void
     * java.awt.event.MouseMotionAdapter.mouseMoved(java.awt.event.MouseEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.event.MouseMotionAdapter#mouseMoved(java.awt.event.MouseEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_mouseMoved_MouseEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
