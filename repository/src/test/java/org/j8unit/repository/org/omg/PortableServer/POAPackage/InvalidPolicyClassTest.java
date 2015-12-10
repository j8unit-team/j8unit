package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidPolicyClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.InvalidPolicyClassTests<org.omg.PortableServer.POAPackage.InvalidPolicy> {

    @Override
    public Class<org.omg.PortableServer.POAPackage.InvalidPolicy> createNewSUT() {
        return org.omg.PortableServer.POAPackage.InvalidPolicy.class;
    }

}
