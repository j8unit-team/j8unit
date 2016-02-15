package org.j8unit.repository.javax.naming.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.event.NamingExceptionEvent class
 * javax.naming.event.NamingExceptionEvent}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link NamingExceptionEventClassTests}.
 * </p>
 *
 * @see javax.naming.event.NamingExceptionEvent class javax.naming.event.NamingExceptionEvent (the hereby targeted
 *      class-under-test class)
 * @see NamingExceptionEventClassTests NamingExceptionEventClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NamingExceptionEventTests<SUT extends javax.naming.event.NamingExceptionEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.event.NamingExceptionEvent#dispatch(javax.naming.event.NamingListener) public
     * void javax.naming.event.NamingExceptionEvent.dispatch(javax.naming.event.NamingListener)}.
     *
     * <p>
     * Test method for {@link javax.naming.event.NamingExceptionEvent#dispatch(javax.naming.event.NamingListener) public
     * void javax.naming.event.NamingExceptionEvent.dispatch(javax.naming.event.NamingListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.event.NamingExceptionEvent#dispatch(javax.naming.event.NamingListener) public void
     *      javax.naming.event.NamingExceptionEvent.dispatch(javax.naming.event.NamingListener) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dispatch_NamingListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.event.NamingExceptionEvent#getEventContext() public
     * javax.naming.event.EventContext javax.naming.event.NamingExceptionEvent.getEventContext()}.
     *
     * <p>
     * Test method for {@link javax.naming.event.NamingExceptionEvent#getEventContext() public
     * javax.naming.event.EventContext javax.naming.event.NamingExceptionEvent.getEventContext()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.event.NamingExceptionEvent#getEventContext() public javax.naming.event.EventContext
     *      javax.naming.event.NamingExceptionEvent.getEventContext() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEventContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.event.NamingExceptionEvent#getException() public javax.naming.NamingException
     * javax.naming.event.NamingExceptionEvent.getException()}.
     *
     * <p>
     * Test method for {@link javax.naming.event.NamingExceptionEvent#getException() public javax.naming.NamingException
     * javax.naming.event.NamingExceptionEvent.getException()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.event.NamingExceptionEvent#getException() public javax.naming.NamingException
     *      javax.naming.event.NamingExceptionEvent.getException() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
