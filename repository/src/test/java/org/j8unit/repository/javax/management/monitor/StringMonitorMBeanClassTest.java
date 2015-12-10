package org.j8unit.repository.javax.management.monitor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringMonitorMBeanClassTest
implements org.j8unit.repository.javax.management.monitor.StringMonitorMBeanClassTests<javax.management.monitor.StringMonitorMBean> {

    @Override
    public Class<javax.management.monitor.StringMonitorMBean> createNewSUT() {
        return javax.management.monitor.StringMonitorMBean.class;
    }

}
