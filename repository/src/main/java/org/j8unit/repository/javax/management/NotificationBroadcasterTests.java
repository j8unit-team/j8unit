package org.j8unit.repository.javax.management;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.NotificationBroadcaster interface
 * javax.management.NotificationBroadcaster}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link NotificationBroadcasterClassTests}.
 * </p>
 *
 * @see javax.management.NotificationBroadcaster interface javax.management.NotificationBroadcaster (the hereby targeted
 *      class-under-test class)
 * @see NotificationBroadcasterClassTests NotificationBroadcasterClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NotificationBroadcasterTests<SUT extends javax.management.NotificationBroadcaster>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.NotificationBroadcaster#addNotificationListener(javax.management.NotificationListener, javax.management.NotificationFilter, Object)
     * public abstract void
     * javax.management.NotificationBroadcaster.addNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * throws java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.NotificationBroadcaster#addNotificationListener(javax.management.NotificationListener, javax.management.NotificationFilter, Object)
     * public abstract void
     * javax.management.NotificationBroadcaster.addNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * throws java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.NotificationBroadcaster#addNotificationListener(javax.management.NotificationListener,
     *      javax.management.NotificationFilter, Object) public abstract void
     *      javax.management.NotificationBroadcaster.addNotificationListener(javax.management.NotificationListener,javax
     *      .management.NotificationFilter,java.lang.Object) throws java.lang.IllegalArgumentException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addNotificationListener_NotificationListener_NotificationFilter_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.NotificationBroadcaster#getNotificationInfo() public abstract
     * javax.management.MBeanNotificationInfo[] javax.management.NotificationBroadcaster.getNotificationInfo()}.
     *
     * <p>
     * Test method for {@link javax.management.NotificationBroadcaster#getNotificationInfo() public abstract
     * javax.management.MBeanNotificationInfo[] javax.management.NotificationBroadcaster.getNotificationInfo()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.NotificationBroadcaster#getNotificationInfo() public abstract
     *      javax.management.MBeanNotificationInfo[] javax.management.NotificationBroadcaster.getNotificationInfo() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNotificationInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.NotificationBroadcaster#removeNotificationListener(javax.management.NotificationListener)
     * public abstract void
     * javax.management.NotificationBroadcaster.removeNotificationListener(javax.management.NotificationListener) throws
     * javax.management.ListenerNotFoundException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.NotificationBroadcaster#removeNotificationListener(javax.management.NotificationListener)
     * public abstract void
     * javax.management.NotificationBroadcaster.removeNotificationListener(javax.management.NotificationListener) throws
     * javax.management.ListenerNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.NotificationBroadcaster#removeNotificationListener(javax.management.NotificationListener)
     *      public abstract void
     *      javax.management.NotificationBroadcaster.removeNotificationListener(javax.management.NotificationListener)
     *      throws javax.management.ListenerNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeNotificationListener_NotificationListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
