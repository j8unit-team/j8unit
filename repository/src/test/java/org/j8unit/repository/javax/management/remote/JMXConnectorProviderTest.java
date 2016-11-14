package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXConnectorProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JMXConnectorProvider} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.management.remote.JMXConnectorProviderTests}).
 */

@RunWith(J8Unit4.class)
public class JMXConnectorProviderTest
implements JMXConnectorProviderTests<JMXConnectorProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.JMXConnectorProvider]

    @Override
    public JMXConnectorProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.remote.JMXConnectorProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.remote.JMXConnectorProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.remote.JMXConnectorProvider]

}
