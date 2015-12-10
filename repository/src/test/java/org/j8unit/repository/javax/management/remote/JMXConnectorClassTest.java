package org.j8unit.repository.javax.management.remote;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXConnectorClassTest
implements org.j8unit.repository.javax.management.remote.JMXConnectorClassTests<javax.management.remote.JMXConnector> {

    @Override
    public Class<javax.management.remote.JMXConnector> createNewSUT() {
        return javax.management.remote.JMXConnector.class;
    }

}
