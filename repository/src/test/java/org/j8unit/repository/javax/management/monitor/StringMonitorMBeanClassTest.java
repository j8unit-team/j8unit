package org.j8unit.repository.javax.management.monitor;

import javax.management.monitor.StringMonitorMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringMonitorMBeanClassTest
implements org.j8unit.repository.javax.management.monitor.StringMonitorMBeanClassTests<StringMonitorMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.monitor.StringMonitorMBean]

    @Override
    public Class<StringMonitorMBean> createNewSUT() {
        return StringMonitorMBean.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.monitor.StringMonitorMBean]

}
