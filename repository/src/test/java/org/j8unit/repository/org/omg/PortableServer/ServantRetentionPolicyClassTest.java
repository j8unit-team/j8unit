package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.ServantRetentionPolicy;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ServantRetentionPolicy} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableServer.ServantRetentionPolicyClassTests}).
 */

@RunWith(J8Unit4.class)
public class ServantRetentionPolicyClassTest
implements ServantRetentionPolicyClassTests<ServantRetentionPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.ServantRetentionPolicy]

    @Override
    public Class<ServantRetentionPolicy> createNewSUT() {
        return ServantRetentionPolicy.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.ServantRetentionPolicy]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.ServantRetentionPolicy]

}
