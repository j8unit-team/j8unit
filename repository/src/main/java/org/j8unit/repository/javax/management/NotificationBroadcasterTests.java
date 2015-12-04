package org.j8unit.repository.javax.management;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.NotificationBroadcaster interface javax.management.NotificationBroadcaster},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.NotificationBroadcasterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface NotificationBroadcasterTests<SUT extends javax.management.NotificationBroadcaster>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.NotificationBroadcaster#addNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * public abstract void
     * javax.management.NotificationBroadcaster.addNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * throws java.lang.IllegalArgumentException}.
     * </p>
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
     * </p>
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
     * </p>
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
