package org.j8unit.repository.javax.management.remote.rmi;

import javax.management.remote.rmi.RMIJRMPServerImpl;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RMIJRMPServerImpl} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.remote.rmi.RMIJRMPServerImplTests}).
 */

@RunWith(J8Unit4.class)
public class RMIJRMPServerImplTest
implements RMIJRMPServerImplTests<RMIJRMPServerImpl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.rmi.RMIJRMPServerImpl]

    @Override
    public RMIJRMPServerImpl createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.remote.rmi.RMIJRMPServerImpl], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.remote.rmi.RMIJRMPServerImpl]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.remote.rmi.RMIJRMPServerImpl]

}
