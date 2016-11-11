package org.j8unit.repository.javax.management.monitor;

import javax.management.monitor.MonitorMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MonitorMBean} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.monitor.MonitorMBeanClassTests}).
 */

@RunWith(J8Unit4.class)
public class MonitorMBeanClassTest
implements MonitorMBeanClassTests<MonitorMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.monitor.MonitorMBean]

    @Override
    public Class<MonitorMBean> createNewSUT() {
        return MonitorMBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.monitor.MonitorMBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.monitor.MonitorMBean]

}
