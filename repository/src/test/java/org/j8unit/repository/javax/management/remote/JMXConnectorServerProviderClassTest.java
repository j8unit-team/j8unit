package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXConnectorServerProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JMXConnectorServerProvider} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.remote.JMXConnectorServerProviderClassTests}).
 */

@RunWith(J8Unit4.class)
public class JMXConnectorServerProviderClassTest
implements JMXConnectorServerProviderClassTests<JMXConnectorServerProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.JMXConnectorServerProvider]

    @Override
    public Class<JMXConnectorServerProvider> createNewSUT() {
        return JMXConnectorServerProvider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.JMXConnectorServerProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.JMXConnectorServerProvider]

}
