package org.j8unit.repository.javax.management.monitor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CounterMonitorTest
implements org.j8unit.repository.javax.management.monitor.CounterMonitorTests<javax.management.monitor.CounterMonitor> {

    @Override
    public javax.management.monitor.CounterMonitor createNewSUT() {
        return new javax.management.monitor.CounterMonitor();
    }

}
