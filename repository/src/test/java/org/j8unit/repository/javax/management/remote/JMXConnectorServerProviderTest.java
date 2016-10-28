package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXConnectorServerProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXConnectorServerProviderTest
implements org.j8unit.repository.javax.management.remote.JMXConnectorServerProviderTests<JMXConnectorServerProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.JMXConnectorServerProvider]

    @Override
    public JMXConnectorServerProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.remote.JMXConnectorServerProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.JMXConnectorServerProvider]

}
