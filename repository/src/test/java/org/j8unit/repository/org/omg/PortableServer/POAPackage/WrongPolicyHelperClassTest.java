package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WrongPolicyHelperClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.WrongPolicyHelperClassTests<org.omg.PortableServer.POAPackage.WrongPolicyHelper> {

    @Override
    public Class<org.omg.PortableServer.POAPackage.WrongPolicyHelper> createNewSUT() {
        return org.omg.PortableServer.POAPackage.WrongPolicyHelper.class;
    }

}
