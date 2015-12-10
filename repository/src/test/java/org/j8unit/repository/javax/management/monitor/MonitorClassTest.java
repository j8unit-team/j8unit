package org.j8unit.repository.javax.management.monitor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MonitorClassTest
implements org.j8unit.repository.javax.management.monitor.MonitorClassTests<javax.management.monitor.Monitor> {

    @Override
    public Class<javax.management.monitor.Monitor> createNewSUT() {
        return javax.management.monitor.Monitor.class;
    }

}
