package org.j8unit.repository.javax.management.monitor;

import javax.management.monitor.CounterMonitorMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CounterMonitorMBean} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.monitor.CounterMonitorMBeanClassTests}).
 */

@RunWith(J8Unit4.class)
public class CounterMonitorMBeanClassTest
implements CounterMonitorMBeanClassTests<CounterMonitorMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.monitor.CounterMonitorMBean]

    @Override
    public Class<CounterMonitorMBean> createNewSUT() {
        return CounterMonitorMBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.monitor.CounterMonitorMBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.monitor.CounterMonitorMBean]

}
