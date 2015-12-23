package org.j8unit.repository.java.awt.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.event.AWTEventListenerProxy class
 * java.awt.event.AWTEventListenerProxy}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.awt.event.AWTEventListenerProxyTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.awt.event.AWTEventListenerProxyClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.event.AWTEventListenerProxy
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AWTEventListenerProxyTests<SUT extends java.awt.event.AWTEventListenerProxy>
extends org.j8unit.repository.java.awt.event.AWTEventListenerTests<SUT>,
org.j8unit.repository.java.util.EventListenerProxyTests<SUT, java.awt.event.AWTEventListener> {

    /**
     * <p>
     * Test method for {@link java.awt.event.AWTEventListenerProxy#eventDispatched(java.awt.AWTEvent) public void
     * java.awt.event.AWTEventListenerProxy.eventDispatched(java.awt.AWTEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.event.AWTEventListenerProxy#eventDispatched(java.awt.AWTEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_eventDispatched_AWTEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.event.AWTEventListenerProxy#getEventMask() public long
     * java.awt.event.AWTEventListenerProxy.getEventMask()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.event.AWTEventListenerProxy#getEventMask()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEventMask()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
