package org.j8unit.repository.javax.management.remote.rmi;

import javax.management.remote.rmi.RMIServerImpl;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIServerImplTest
implements org.j8unit.repository.javax.management.remote.rmi.RMIServerImplTests<RMIServerImpl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.rmi.RMIServerImpl]

    @Override
    public RMIServerImpl createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.remote.rmi.RMIServerImpl], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.rmi.RMIServerImpl]

}
