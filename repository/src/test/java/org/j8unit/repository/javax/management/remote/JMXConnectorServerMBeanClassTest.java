package org.j8unit.repository.javax.management.remote;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXConnectorServerMBeanClassTest
implements org.j8unit.repository.javax.management.remote.JMXConnectorServerMBeanClassTests<javax.management.remote.JMXConnectorServerMBean> {

    @Override
    public Class<javax.management.remote.JMXConnectorServerMBean> createNewSUT() {
        return javax.management.remote.JMXConnectorServerMBean.class;
    }

}
