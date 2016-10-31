package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXConnectorServerMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXConnectorServerMBeanClassTest
implements org.j8unit.repository.javax.management.remote.JMXConnectorServerMBeanClassTests<JMXConnectorServerMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.JMXConnectorServerMBean]

    @Override
    public Class<JMXConnectorServerMBean> createNewSUT() {
        return JMXConnectorServerMBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.JMXConnectorServerMBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.JMXConnectorServerMBean]

}
