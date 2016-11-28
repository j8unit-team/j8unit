package org.j8unit.repository.javax.management.remote.rmi;

import javax.management.remote.rmi.RMIConnection;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RMIConnection} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.remote.rmi.RMIConnectionTests}).
 */
@RunWith(J8Unit4.class)
public class RMIConnectionTest
implements RMIConnectionTests<RMIConnection> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.rmi.RMIConnection]

    @Override
    public RMIConnection createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.remote.rmi.RMIConnection], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.remote.rmi.RMIConnection]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.remote.rmi.RMIConnection]

}
