package org.j8unit.repository.javax.management.remote;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXConnectorFactoryClassTest
implements org.j8unit.repository.javax.management.remote.JMXConnectorFactoryClassTests<javax.management.remote.JMXConnectorFactory> {

    @Override
    public Class<javax.management.remote.JMXConnectorFactory> createNewSUT() {
        return javax.management.remote.JMXConnectorFactory.class;
    }

}
