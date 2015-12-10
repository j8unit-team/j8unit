package org.j8unit.repository.javax.management.remote;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXConnectorServerProviderClassTest
implements org.j8unit.repository.javax.management.remote.JMXConnectorServerProviderClassTests<javax.management.remote.JMXConnectorServerProvider> {

    @Override
    public Class<javax.management.remote.JMXConnectorServerProvider> createNewSUT() {
        return javax.management.remote.JMXConnectorServerProvider.class;
    }

}
