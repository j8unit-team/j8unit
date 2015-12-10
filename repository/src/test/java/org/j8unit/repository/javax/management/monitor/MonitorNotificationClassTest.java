package org.j8unit.repository.javax.management.monitor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MonitorNotificationClassTest
implements org.j8unit.repository.javax.management.monitor.MonitorNotificationClassTests<javax.management.monitor.MonitorNotification> {

    @Override
    public Class<javax.management.monitor.MonitorNotification> createNewSUT() {
        return javax.management.monitor.MonitorNotification.class;
    }

}
