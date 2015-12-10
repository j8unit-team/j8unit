package org.j8unit.repository.org.ietf.jgss;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OidClassTest
implements org.j8unit.repository.org.ietf.jgss.OidClassTests<org.ietf.jgss.Oid> {

    @Override
    public Class<org.ietf.jgss.Oid> createNewSUT() {
        return org.ietf.jgss.Oid.class;
    }

}
