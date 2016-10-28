package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXConnector;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXConnectorClassTest
implements org.j8unit.repository.javax.management.remote.JMXConnectorClassTests<JMXConnector> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.JMXConnector]

    @Override
    public Class<JMXConnector> createNewSUT() {
        return JMXConnector.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.JMXConnector]

}
