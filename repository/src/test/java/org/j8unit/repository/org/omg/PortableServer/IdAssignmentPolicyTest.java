package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableServer.IdAssignmentPolicy;

@RunWith(J8Unit4.class)
public class IdAssignmentPolicyTest
implements org.j8unit.repository.org.omg.PortableServer.IdAssignmentPolicyTests<IdAssignmentPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.IdAssignmentPolicy]

    @Override
    public IdAssignmentPolicy createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableServer.IdAssignmentPolicy], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.IdAssignmentPolicy]

}
