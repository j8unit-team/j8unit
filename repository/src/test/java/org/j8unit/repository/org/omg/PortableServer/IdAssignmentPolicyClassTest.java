package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.IdAssignmentPolicy;

@RunWith(J8Unit4.class)
public class IdAssignmentPolicyClassTest
implements org.j8unit.repository.org.omg.PortableServer.IdAssignmentPolicyClassTests<IdAssignmentPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.IdAssignmentPolicy]

    @Override
    public Class<IdAssignmentPolicy> createNewSUT() {
        return IdAssignmentPolicy.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.IdAssignmentPolicy]

}
