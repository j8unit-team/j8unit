package org.j8unit.repository.javax.management.monitor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CounterMonitorMBeanClassTest
implements org.j8unit.repository.javax.management.monitor.CounterMonitorMBeanClassTests<javax.management.monitor.CounterMonitorMBean> {

    @Override
    public Class<javax.management.monitor.CounterMonitorMBean> createNewSUT() {
        return javax.management.monitor.CounterMonitorMBean.class;
    }

}
