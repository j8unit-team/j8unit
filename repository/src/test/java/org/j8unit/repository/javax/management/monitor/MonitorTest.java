package org.j8unit.repository.javax.management.monitor;

import javax.management.monitor.Monitor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MonitorTest
implements org.j8unit.repository.javax.management.monitor.MonitorTests<Monitor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.monitor.Monitor]

    @Override
    public Monitor createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.monitor.Monitor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.monitor.Monitor]

}
