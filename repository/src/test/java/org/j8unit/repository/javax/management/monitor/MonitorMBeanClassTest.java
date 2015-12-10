package org.j8unit.repository.javax.management.monitor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MonitorMBeanClassTest
implements org.j8unit.repository.javax.management.monitor.MonitorMBeanClassTests<javax.management.monitor.MonitorMBean> {

    @Override
    public Class<javax.management.monitor.MonitorMBean> createNewSUT() {
        return javax.management.monitor.MonitorMBean.class;
    }

}
