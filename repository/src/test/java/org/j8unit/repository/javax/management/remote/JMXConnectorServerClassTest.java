package org.j8unit.repository.javax.management.remote;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXConnectorServerClassTest
implements org.j8unit.repository.javax.management.remote.JMXConnectorServerClassTests<javax.management.remote.JMXConnectorServer> {

    @Override
    public Class<javax.management.remote.JMXConnectorServer> createNewSUT() {
        return javax.management.remote.JMXConnectorServer.class;
    }

}
