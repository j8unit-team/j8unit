package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class THREAD_POLICY_IDClassTest
implements org.j8unit.repository.org.omg.PortableServer.THREAD_POLICY_IDClassTests<org.omg.PortableServer.THREAD_POLICY_ID> {

    @Override
    public Class<org.omg.PortableServer.THREAD_POLICY_ID> createNewSUT() {
        return org.omg.PortableServer.THREAD_POLICY_ID.class;
    }

}
