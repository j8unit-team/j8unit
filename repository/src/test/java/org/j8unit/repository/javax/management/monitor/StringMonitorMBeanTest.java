package org.j8unit.repository.javax.management.monitor;

import javax.management.monitor.StringMonitorMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringMonitorMBeanTest
implements org.j8unit.repository.javax.management.monitor.StringMonitorMBeanTests<StringMonitorMBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.monitor.StringMonitorMBean]

    @Override
    public StringMonitorMBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.monitor.StringMonitorMBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.monitor.StringMonitorMBean]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.monitor.StringMonitorMBean]

}
