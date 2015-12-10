package org.j8unit.repository.javax.management.monitor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringMonitorClassTest
implements org.j8unit.repository.javax.management.monitor.StringMonitorClassTests<javax.management.monitor.StringMonitor> {

    @Override
    public Class<javax.management.monitor.StringMonitor> createNewSUT() {
        return javax.management.monitor.StringMonitor.class;
    }

}
