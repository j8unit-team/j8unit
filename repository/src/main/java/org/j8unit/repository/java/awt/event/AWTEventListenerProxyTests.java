package org.j8unit.repository.java.awt.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.event.AWTEventListenerProxy class
 * java.awt.event.AWTEventListenerProxy}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link AWTEventListenerProxyClassTests}.
 * </p>
 *
 * @see java.awt.event.AWTEventListenerProxy class java.awt.event.AWTEventListenerProxy (the hereby targeted
 *      class-under-test class)
 * @see AWTEventListenerProxyClassTests AWTEventListenerProxyClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AWTEventListenerProxyTests<SUT extends java.awt.event.AWTEventListenerProxy>
extends AWTEventListenerTests<SUT>, org.j8unit.repository.java.util.EventListenerProxyTests<SUT, java.awt.event.AWTEventListener> {

    /**
     * <p>
     * Test method for {@link java.awt.event.AWTEventListenerProxy#eventDispatched(java.awt.AWTEvent) public void
     * java.awt.event.AWTEventListenerProxy.eventDispatched(java.awt.AWTEvent)}.
     *
     * <p>
     * Test method for {@link java.awt.event.AWTEventListenerProxy#eventDispatched(java.awt.AWTEvent) public void
     * java.awt.event.AWTEventListenerProxy.eventDispatched(java.awt.AWTEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.event.AWTEventListenerProxy#eventDispatched(java.awt.AWTEvent) public void
     *      java.awt.event.AWTEventListenerProxy.eventDispatched(java.awt.AWTEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
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
     * <p>
     * Test method for {@link java.awt.event.AWTEventListenerProxy#getEventMask() public long
     * java.awt.event.AWTEventListenerProxy.getEventMask()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.event.AWTEventListenerProxy#getEventMask() public long
     *      java.awt.event.AWTEventListenerProxy.getEventMask() (the hereby targeted method-under-test)
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
