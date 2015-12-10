package org.j8unit.repository.javax.management.remote;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TargetedNotificationClassTest
implements org.j8unit.repository.javax.management.remote.TargetedNotificationClassTests<javax.management.remote.TargetedNotification> {

    @Override
    public Class<javax.management.remote.TargetedNotification> createNewSUT() {
        return javax.management.remote.TargetedNotification.class;
    }

}
