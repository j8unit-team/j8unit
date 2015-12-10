package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IdUniquenessPolicyClassTest
implements org.j8unit.repository.org.omg.PortableServer.IdUniquenessPolicyClassTests<org.omg.PortableServer.IdUniquenessPolicy> {

    @Override
    public Class<org.omg.PortableServer.IdUniquenessPolicy> createNewSUT() {
        return org.omg.PortableServer.IdUniquenessPolicy.class;
    }

}
