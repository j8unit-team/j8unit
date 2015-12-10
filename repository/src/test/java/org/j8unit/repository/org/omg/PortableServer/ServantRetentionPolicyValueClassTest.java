package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServantRetentionPolicyValueClassTest
implements org.j8unit.repository.org.omg.PortableServer.ServantRetentionPolicyValueClassTests<org.omg.PortableServer.ServantRetentionPolicyValue> {

    @Override
    public Class<org.omg.PortableServer.ServantRetentionPolicyValue> createNewSUT() {
        return org.omg.PortableServer.ServantRetentionPolicyValue.class;
    }

}
