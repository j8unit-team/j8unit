package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXConnectorServerMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JMXConnectorServerMBean} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.remote.JMXConnectorServerMBeanClassTests}).
 */

@RunWith(J8Unit4.class)
public class JMXConnectorServerMBeanClassTest
implements JMXConnectorServerMBeanClassTests<JMXConnectorServerMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.JMXConnectorServerMBean]

    @Override
    public Class<JMXConnectorServerMBean> createNewSUT() {
        return JMXConnectorServerMBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.JMXConnectorServerMBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.JMXConnectorServerMBean]

}
