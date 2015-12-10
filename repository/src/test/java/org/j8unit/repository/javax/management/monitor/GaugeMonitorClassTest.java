package org.j8unit.repository.javax.management.monitor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GaugeMonitorClassTest
implements org.j8unit.repository.javax.management.monitor.GaugeMonitorClassTests<javax.management.monitor.GaugeMonitor> {

    @Override
    public Class<javax.management.monitor.GaugeMonitor> createNewSUT() {
        return javax.management.monitor.GaugeMonitor.class;
    }

}
