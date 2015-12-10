package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThreadPolicyClassTest
implements org.j8unit.repository.org.omg.PortableServer.ThreadPolicyClassTests<org.omg.PortableServer.ThreadPolicy> {

    @Override
    public Class<org.omg.PortableServer.ThreadPolicy> createNewSUT() {
        return org.omg.PortableServer.ThreadPolicy.class;
    }

}
