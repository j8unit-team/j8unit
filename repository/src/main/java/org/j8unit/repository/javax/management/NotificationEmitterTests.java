package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.NotificationEmitter interface
 * javax.management.NotificationEmitter}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link NotificationEmitterClassTests}.
 * </p>
 *
 * @see javax.management.NotificationEmitter interface javax.management.NotificationEmitter (the hereby targeted
 *      class-under-test class)
 * @see NotificationEmitterClassTests NotificationEmitterClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NotificationEmitterTests<SUT extends javax.management.NotificationEmitter>
extends NotificationBroadcasterTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.NotificationEmitter#removeNotificationListener(javax.management.NotificationListener, javax.management.NotificationFilter, Object)
     * public abstract void
     * javax.management.NotificationEmitter.removeNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * throws javax.management.ListenerNotFoundException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.NotificationEmitter#removeNotificationListener(javax.management.NotificationListener, javax.management.NotificationFilter, Object)
     * public abstract void
     * javax.management.NotificationEmitter.removeNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * throws javax.management.ListenerNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.NotificationEmitter#removeNotificationListener(javax.management.NotificationListener,
     *      javax.management.NotificationFilter, Object) public abstract void
     *      javax.management.NotificationEmitter.removeNotificationListener(javax.management.NotificationListener,javax.
     *      management.NotificationFilter,java.lang.Object) throws javax.management.ListenerNotFoundException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeNotificationListener_NotificationListener_NotificationFilter_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
