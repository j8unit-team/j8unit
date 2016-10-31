package org.j8unit.repository.javax.management.monitor;

import javax.management.monitor.MonitorNotification;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MonitorNotificationTest
implements org.j8unit.repository.javax.management.monitor.MonitorNotificationTests<MonitorNotification> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.monitor.MonitorNotification]

    @Override
    public MonitorNotification createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.monitor.MonitorNotification], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.monitor.MonitorNotification]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.monitor.MonitorNotification]

}
