package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXConnectorServerMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JMXConnectorServerMBean} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.remote.JMXConnectorServerMBeanTests}).
 */

@RunWith(J8Unit4.class)
public class JMXConnectorServerMBeanTest
implements JMXConnectorServerMBeanTests<JMXConnectorServerMBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.JMXConnectorServerMBean]

    @Override
    public JMXConnectorServerMBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.remote.JMXConnectorServerMBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.remote.JMXConnectorServerMBean]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.remote.JMXConnectorServerMBean]

}
