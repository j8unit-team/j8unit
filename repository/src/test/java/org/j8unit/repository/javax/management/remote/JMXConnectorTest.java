package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXConnector;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXConnectorTest
implements org.j8unit.repository.javax.management.remote.JMXConnectorTests<JMXConnector> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.JMXConnector]

    @Override
    public JMXConnector createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.remote.JMXConnector], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.remote.JMXConnector]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.remote.JMXConnector]

}
