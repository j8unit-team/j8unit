package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThreadPolicyValueClassTest
implements org.j8unit.repository.org.omg.PortableServer.ThreadPolicyValueClassTests<org.omg.PortableServer.ThreadPolicyValue> {

    @Override
    public Class<org.omg.PortableServer.ThreadPolicyValue> createNewSUT() {
        return org.omg.PortableServer.ThreadPolicyValue.class;
    }

}
