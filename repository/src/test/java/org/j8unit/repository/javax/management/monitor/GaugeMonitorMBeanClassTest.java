package org.j8unit.repository.javax.management.monitor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GaugeMonitorMBeanClassTest
implements org.j8unit.repository.javax.management.monitor.GaugeMonitorMBeanClassTests<javax.management.monitor.GaugeMonitorMBean> {

    @Override
    public Class<javax.management.monitor.GaugeMonitorMBean> createNewSUT() {
        return javax.management.monitor.GaugeMonitorMBean.class;
    }

}
