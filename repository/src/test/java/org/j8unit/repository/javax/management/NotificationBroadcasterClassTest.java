package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotificationBroadcasterClassTest
implements org.j8unit.repository.javax.management.NotificationBroadcasterClassTests<javax.management.NotificationBroadcaster> {

    @Override
    public Class<javax.management.NotificationBroadcaster> createNewSUT() {
        return javax.management.NotificationBroadcaster.class;
    }

}
