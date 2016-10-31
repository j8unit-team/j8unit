package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.ServantRetentionPolicy;

@RunWith(J8Unit4.class)
public class ServantRetentionPolicyClassTest
implements org.j8unit.repository.org.omg.PortableServer.ServantRetentionPolicyClassTests<ServantRetentionPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.ServantRetentionPolicy]

    @Override
    public Class<ServantRetentionPolicy> createNewSUT() {
        return ServantRetentionPolicy.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.ServantRetentionPolicy]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.ServantRetentionPolicy]

}
