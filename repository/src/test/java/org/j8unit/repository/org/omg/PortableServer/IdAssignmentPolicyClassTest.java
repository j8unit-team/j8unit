package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IdAssignmentPolicyClassTest
implements org.j8unit.repository.org.omg.PortableServer.IdAssignmentPolicyClassTests<org.omg.PortableServer.IdAssignmentPolicy> {

    @Override
    public Class<org.omg.PortableServer.IdAssignmentPolicy> createNewSUT() {
        return org.omg.PortableServer.IdAssignmentPolicy.class;
    }

}
