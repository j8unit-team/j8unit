package org.j8unit.repository.javax.management;

import javax.management.NotificationBroadcaster;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NotificationBroadcaster} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.management.NotificationBroadcasterClassTests}).
 */

@RunWith(J8Unit4.class)
public class NotificationBroadcasterClassTest
implements NotificationBroadcasterClassTests<NotificationBroadcaster> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.NotificationBroadcaster]

    @Override
    public Class<NotificationBroadcaster> createNewSUT() {
        return NotificationBroadcaster.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.NotificationBroadcaster]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.NotificationBroadcaster]

}
