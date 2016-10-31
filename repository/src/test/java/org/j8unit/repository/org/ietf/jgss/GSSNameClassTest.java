package org.j8unit.repository.org.ietf.jgss;

import org.ietf.jgss.GSSName;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GSSNameClassTest
implements org.j8unit.repository.org.ietf.jgss.GSSNameClassTests<GSSName> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.ietf.jgss.GSSName]

    @Override
    public Class<GSSName> createNewSUT() {
        return GSSName.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.ietf.jgss.GSSName]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.ietf.jgss.GSSName]

}
