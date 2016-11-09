package org.j8unit.repository.javax.management.monitor;

import javax.management.monitor.GaugeMonitorMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link GaugeMonitorMBean} (by simply reusing the
 * J8Unit test interface {@link GaugeMonitorMBeanClassTests}).
 */

@RunWith(J8Unit4.class)
public class GaugeMonitorMBeanClassTest
implements GaugeMonitorMBeanClassTests<GaugeMonitorMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.monitor.GaugeMonitorMBean]

    @Override
    public Class<GaugeMonitorMBean> createNewSUT() {
        return GaugeMonitorMBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.monitor.GaugeMonitorMBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.monitor.GaugeMonitorMBean]

}
