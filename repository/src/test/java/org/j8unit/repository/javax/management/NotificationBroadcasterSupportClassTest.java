package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotificationBroadcasterSupportClassTest
implements org.j8unit.repository.javax.management.NotificationBroadcasterSupportClassTests<javax.management.NotificationBroadcasterSupport> {

    @Override
    public Class<javax.management.NotificationBroadcasterSupport> createNewSUT() {
        return javax.management.NotificationBroadcasterSupport.class;
    }

}