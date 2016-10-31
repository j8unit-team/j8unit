package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.ThreadPolicy;

@RunWith(J8Unit4.class)
public class ThreadPolicyClassTest
implements org.j8unit.repository.org.omg.PortableServer.ThreadPolicyClassTests<ThreadPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.ThreadPolicy]

    @Override
    public Class<ThreadPolicy> createNewSUT() {
        return ThreadPolicy.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.ThreadPolicy]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.ThreadPolicy]

}
