package org.j8unit.repository.javax.management.monitor;

import javax.management.monitor.MonitorNotification;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MonitorNotificationClassTest
implements org.j8unit.repository.javax.management.monitor.MonitorNotificationClassTests<MonitorNotification> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.monitor.MonitorNotification]

    @Override
    public Class<MonitorNotification> createNewSUT() {
        return MonitorNotification.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.monitor.MonitorNotification]

}
