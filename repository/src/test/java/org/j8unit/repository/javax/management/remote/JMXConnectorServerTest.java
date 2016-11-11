package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXConnectorServer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JMXConnectorServer} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.management.remote.JMXConnectorServerTests}).
 */

@RunWith(J8Unit4.class)
public class JMXConnectorServerTest
implements JMXConnectorServerTests<JMXConnectorServer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.JMXConnectorServer]

    @Override
    public JMXConnectorServer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.remote.JMXConnectorServer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.remote.JMXConnectorServer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.remote.JMXConnectorServer]

}
