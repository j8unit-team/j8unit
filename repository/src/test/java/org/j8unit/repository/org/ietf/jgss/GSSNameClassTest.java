package org.j8unit.repository.org.ietf.jgss;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GSSNameClassTest
implements org.j8unit.repository.org.ietf.jgss.GSSNameClassTests<org.ietf.jgss.GSSName> {

    @Override
    public Class<org.ietf.jgss.GSSName> createNewSUT() {
        return org.ietf.jgss.GSSName.class;
    }

}
