package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WrongPolicyTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.WrongPolicyTests<org.omg.PortableServer.POAPackage.WrongPolicy> {

    @Override
    public org.omg.PortableServer.POAPackage.WrongPolicy createNewSUT() {
        return new org.omg.PortableServer.POAPackage.WrongPolicy();
    }

}
