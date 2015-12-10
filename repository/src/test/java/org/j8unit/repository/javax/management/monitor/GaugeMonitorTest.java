package org.j8unit.repository.javax.management.monitor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GaugeMonitorTest
implements org.j8unit.repository.javax.management.monitor.GaugeMonitorTests<javax.management.monitor.GaugeMonitor> {

    @Override
    public javax.management.monitor.GaugeMonitor createNewSUT() {
        return new javax.management.monitor.GaugeMonitor();
    }

}
