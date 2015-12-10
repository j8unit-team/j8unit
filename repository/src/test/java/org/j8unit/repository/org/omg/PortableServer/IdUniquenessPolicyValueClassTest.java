package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IdUniquenessPolicyValueClassTest
implements org.j8unit.repository.org.omg.PortableServer.IdUniquenessPolicyValueClassTests<org.omg.PortableServer.IdUniquenessPolicyValue> {

    @Override
    public Class<org.omg.PortableServer.IdUniquenessPolicyValue> createNewSUT() {
        return org.omg.PortableServer.IdUniquenessPolicyValue.class;
    }

}
