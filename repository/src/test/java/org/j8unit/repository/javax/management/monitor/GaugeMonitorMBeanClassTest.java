package org.j8unit.repository.javax.management.monitor;

import javax.management.monitor.GaugeMonitorMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GaugeMonitorMBeanClassTest
implements org.j8unit.repository.javax.management.monitor.GaugeMonitorMBeanClassTests<GaugeMonitorMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.monitor.GaugeMonitorMBean]

    @Override
    public Class<GaugeMonitorMBean> createNewSUT() {
        return GaugeMonitorMBean.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.monitor.GaugeMonitorMBean]

}
