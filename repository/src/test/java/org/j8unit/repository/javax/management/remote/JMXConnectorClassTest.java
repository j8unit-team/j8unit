package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXConnector;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JMXConnector} (by simply reusing the
 * J8Unit test interface {@link JMXConnectorClassTests}).
 */

@RunWith(J8Unit4.class)
public class JMXConnectorClassTest
implements JMXConnectorClassTests<JMXConnector> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.JMXConnector]

    @Override
    public Class<JMXConnector> createNewSUT() {
        return JMXConnector.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.JMXConnector]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.JMXConnector]

}
