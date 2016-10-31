package org.j8unit.repository.org.ietf.jgss;

import org.ietf.jgss.GSSContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GSSContextClassTest
implements org.j8unit.repository.org.ietf.jgss.GSSContextClassTests<GSSContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.ietf.jgss.GSSContext]

    @Override
    public Class<GSSContext> createNewSUT() {
        return GSSContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.ietf.jgss.GSSContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.ietf.jgss.GSSContext]

}
