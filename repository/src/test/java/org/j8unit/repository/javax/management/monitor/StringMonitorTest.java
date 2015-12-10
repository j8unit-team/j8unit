package org.j8unit.repository.javax.management.monitor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringMonitorTest
implements org.j8unit.repository.javax.management.monitor.StringMonitorTests<javax.management.monitor.StringMonitor> {

    @Override
    public javax.management.monitor.StringMonitor createNewSUT() {
        return new javax.management.monitor.StringMonitor();
    }

}
