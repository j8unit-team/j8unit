package org.j8unit.repository.javax.management.remote;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXConnectorServerFactoryClassTest
implements org.j8unit.repository.javax.management.remote.JMXConnectorServerFactoryClassTests<javax.management.remote.JMXConnectorServerFactory> {

    @Override
    public Class<javax.management.remote.JMXConnectorServerFactory> createNewSUT() {
        return javax.management.remote.JMXConnectorServerFactory.class;
    }

}
