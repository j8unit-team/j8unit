package org.j8unit.repository.javax.management.monitor;

import javax.management.monitor.MonitorNotification;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MonitorNotification} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.monitor.MonitorNotificationClassTests}).
 */
@RunWith(J8Unit4.class)
public class MonitorNotificationClassTest
implements MonitorNotificationClassTests<MonitorNotification> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.monitor.MonitorNotification]

    @Override
    public Class<MonitorNotification> createNewSUT() {
        return MonitorNotification.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.monitor.MonitorNotification]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.monitor.MonitorNotification]

}
