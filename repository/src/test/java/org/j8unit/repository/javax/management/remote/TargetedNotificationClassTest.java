package org.j8unit.repository.javax.management.remote;

import javax.management.remote.TargetedNotification;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TargetedNotificationClassTest
implements org.j8unit.repository.javax.management.remote.TargetedNotificationClassTests<TargetedNotification> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.TargetedNotification]

    @Override
    public Class<TargetedNotification> createNewSUT() {
        return TargetedNotification.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.remote.TargetedNotification#TargetedNotification(javax.management.Notification, Integer)
     * public javax.management.remote.TargetedNotification(javax.management.Notification,java.lang.Integer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_TargetedNotification_Notification_Integer()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TargetedNotification sut = null; // = new TargetedNotification(javax.management.Notification, Integer);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.TargetedNotification]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.TargetedNotification]

}
