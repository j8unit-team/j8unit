package org.j8unit.repository.javax.management.monitor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CounterMonitorClassTest
implements org.j8unit.repository.javax.management.monitor.CounterMonitorClassTests<javax.management.monitor.CounterMonitor> {

    @Override
    public Class<javax.management.monitor.CounterMonitor> createNewSUT() {
        return javax.management.monitor.CounterMonitor.class;
    }

}
