package org.j8unit.repository.javax.management.remote.rmi;

import javax.management.remote.rmi.RMIServerImpl;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RMIServerImpl} (by simply reusing the
 * J8Unit test interface {@link RMIServerImplTests}).
 */

@RunWith(J8Unit4.class)
public class RMIServerImplTest
implements RMIServerImplTests<RMIServerImpl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.rmi.RMIServerImpl]

    @Override
    public RMIServerImpl createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.remote.rmi.RMIServerImpl], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.remote.rmi.RMIServerImpl]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.remote.rmi.RMIServerImpl]

}
