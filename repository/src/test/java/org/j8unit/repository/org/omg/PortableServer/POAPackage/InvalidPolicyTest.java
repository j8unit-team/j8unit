package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidPolicyTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.InvalidPolicyTests<org.omg.PortableServer.POAPackage.InvalidPolicy> {

    @Override
    public org.omg.PortableServer.POAPackage.InvalidPolicy createNewSUT() {
        return new org.omg.PortableServer.POAPackage.InvalidPolicy();
    }

}
