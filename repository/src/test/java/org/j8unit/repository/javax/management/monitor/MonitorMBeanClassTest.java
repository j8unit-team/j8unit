package org.j8unit.repository.javax.management.monitor;

import javax.management.monitor.MonitorMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MonitorMBeanClassTest
implements org.j8unit.repository.javax.management.monitor.MonitorMBeanClassTests<MonitorMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.monitor.MonitorMBean]

    @Override
    public Class<MonitorMBean> createNewSUT() {
        return MonitorMBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.monitor.MonitorMBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.monitor.MonitorMBean]

}
