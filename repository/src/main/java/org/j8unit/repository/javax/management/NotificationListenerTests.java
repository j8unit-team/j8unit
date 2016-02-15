package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.NotificationListener interface
 * javax.management.NotificationListener}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link NotificationListenerClassTests}.
 * </p>
 *
 * @see javax.management.NotificationListener interface javax.management.NotificationListener (the hereby targeted
 *      class-under-test class)
 * @see NotificationListenerClassTests NotificationListenerClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NotificationListenerTests<SUT extends javax.management.NotificationListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.NotificationListener#handleNotification(javax.management.Notification, Object) public
     * abstract void
     * javax.management.NotificationListener.handleNotification(javax.management.Notification,java.lang.Object)}.
     *
     * <p>
     * Test method for
     * {@link javax.management.NotificationListener#handleNotification(javax.management.Notification, Object) public
     * abstract void
     * javax.management.NotificationListener.handleNotification(javax.management.Notification,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.NotificationListener#handleNotification(javax.management.Notification, Object) public
     *      abstract void
     *      javax.management.NotificationListener.handleNotification(javax.management.Notification,java.lang.Object)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_handleNotification_Notification_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
