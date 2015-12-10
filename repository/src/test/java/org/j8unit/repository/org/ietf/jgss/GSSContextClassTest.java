package org.j8unit.repository.org.ietf.jgss;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GSSContextClassTest
implements org.j8unit.repository.org.ietf.jgss.GSSContextClassTests<org.ietf.jgss.GSSContext> {

    @Override
    public Class<org.ietf.jgss.GSSContext> createNewSUT() {
        return org.ietf.jgss.GSSContext.class;
    }

}
