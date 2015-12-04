package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.NotificationEmitter interface javax.management.NotificationEmitter},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.NotificationEmitterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface NotificationEmitterTests<SUT extends javax.management.NotificationEmitter>
extends org.j8unit.repository.javax.management.NotificationBroadcasterTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.NotificationEmitter#removeNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * public abstract void
     * javax.management.NotificationEmitter.removeNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * throws javax.management.ListenerNotFoundException}.
     * </p>
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
