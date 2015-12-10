package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IdAssignmentPolicyValueClassTest
implements org.j8unit.repository.org.omg.PortableServer.IdAssignmentPolicyValueClassTests<org.omg.PortableServer.IdAssignmentPolicyValue> {

    @Override
    public Class<org.omg.PortableServer.IdAssignmentPolicyValue> createNewSUT() {
        return org.omg.PortableServer.IdAssignmentPolicyValue.class;
    }

}
