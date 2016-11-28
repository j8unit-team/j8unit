package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.IdAssignmentPolicyOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IdAssignmentPolicyOperations} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableServer.IdAssignmentPolicyOperationsClassTests}).
 */
@RunWith(J8Unit4.class)
public class IdAssignmentPolicyOperationsClassTest
implements IdAssignmentPolicyOperationsClassTests<IdAssignmentPolicyOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.IdAssignmentPolicyOperations]

    @Override
    public Class<IdAssignmentPolicyOperations> createNewSUT() {
        return IdAssignmentPolicyOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.IdAssignmentPolicyOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.IdAssignmentPolicyOperations]

}
