package org.j8unit.repository.javax.management;

import javax.management.NotificationBroadcaster;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NotificationBroadcaster} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.management.NotificationBroadcasterTests}).
 */
@RunWith(J8Unit4.class)
public class NotificationBroadcasterTest
implements NotificationBroadcasterTests<NotificationBroadcaster> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.NotificationBroadcaster]

    @Override
    public NotificationBroadcaster createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.NotificationBroadcaster], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.NotificationBroadcaster]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.NotificationBroadcaster]

}
