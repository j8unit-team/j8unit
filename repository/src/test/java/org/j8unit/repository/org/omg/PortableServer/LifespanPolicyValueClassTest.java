package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LifespanPolicyValueClassTest
implements org.j8unit.repository.org.omg.PortableServer.LifespanPolicyValueClassTests<org.omg.PortableServer.LifespanPolicyValue> {

    @Override
    public Class<org.omg.PortableServer.LifespanPolicyValue> createNewSUT() {
        return org.omg.PortableServer.LifespanPolicyValue.class;
    }

}
