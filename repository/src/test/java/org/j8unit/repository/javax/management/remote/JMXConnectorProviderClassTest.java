package org.j8unit.repository.javax.management.remote;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXConnectorProviderClassTest
implements org.j8unit.repository.javax.management.remote.JMXConnectorProviderClassTests<javax.management.remote.JMXConnectorProvider> {

    @Override
    public Class<javax.management.remote.JMXConnectorProvider> createNewSUT() {
        return javax.management.remote.JMXConnectorProvider.class;
    }

}
