package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotificationBroadcasterSupportTest
implements org.j8unit.repository.javax.management.NotificationBroadcasterSupportTests<javax.management.NotificationBroadcasterSupport> {

    @Override
    public javax.management.NotificationBroadcasterSupport createNewSUT() {
        return new javax.management.NotificationBroadcasterSupport();
    }

}
