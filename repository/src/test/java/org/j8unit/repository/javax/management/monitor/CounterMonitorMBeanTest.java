package org.j8unit.repository.javax.management.monitor;

import javax.management.monitor.CounterMonitorMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CounterMonitorMBean} (by simply
 * reusing the J8Unit test interface {@link CounterMonitorMBeanTests}).
 */

@RunWith(J8Unit4.class)
public class CounterMonitorMBeanTest
implements CounterMonitorMBeanTests<CounterMonitorMBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.monitor.CounterMonitorMBean]

    @Override
    public CounterMonitorMBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.monitor.CounterMonitorMBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.monitor.CounterMonitorMBean]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.monitor.CounterMonitorMBean]

}
