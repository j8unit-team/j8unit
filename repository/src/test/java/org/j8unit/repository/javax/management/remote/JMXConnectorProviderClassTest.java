package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXConnectorProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JMXConnectorProvider} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.remote.JMXConnectorProviderClassTests}).
 */

@RunWith(J8Unit4.class)
public class JMXConnectorProviderClassTest
implements JMXConnectorProviderClassTests<JMXConnectorProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.JMXConnectorProvider]

    @Override
    public Class<JMXConnectorProvider> createNewSUT() {
        return JMXConnectorProvider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.JMXConnectorProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.JMXConnectorProvider]

}
