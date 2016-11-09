package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.ServantRetentionPolicyOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ServantRetentionPolicyOperations} (by
 * simply reusing the J8Unit test interface {@link ServantRetentionPolicyOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class ServantRetentionPolicyOperationsClassTest
implements ServantRetentionPolicyOperationsClassTests<ServantRetentionPolicyOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.ServantRetentionPolicyOperations]

    @Override
    public Class<ServantRetentionPolicyOperations> createNewSUT() {
        return ServantRetentionPolicyOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.ServantRetentionPolicyOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.ServantRetentionPolicyOperations]

}
