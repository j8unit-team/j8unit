package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WrongPolicyClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.WrongPolicyClassTests<org.omg.PortableServer.POAPackage.WrongPolicy> {

    @Override
    public Class<org.omg.PortableServer.POAPackage.WrongPolicy> createNewSUT() {
        return org.omg.PortableServer.POAPackage.WrongPolicy.class;
    }

}
