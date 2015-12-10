package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LifespanPolicyClassTest
implements org.j8unit.repository.org.omg.PortableServer.LifespanPolicyClassTests<org.omg.PortableServer.LifespanPolicy> {

    @Override
    public Class<org.omg.PortableServer.LifespanPolicy> createNewSUT() {
        return org.omg.PortableServer.LifespanPolicy.class;
    }

}
