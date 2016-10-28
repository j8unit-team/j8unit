package org.j8unit.repository.javax.management;

import javax.management.NotificationBroadcaster;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotificationBroadcasterClassTest
implements org.j8unit.repository.javax.management.NotificationBroadcasterClassTests<NotificationBroadcaster> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.NotificationBroadcaster]

    @Override
    public Class<NotificationBroadcaster> createNewSUT() {
        return NotificationBroadcaster.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.NotificationBroadcaster]

}
