package org.j8unit.repository.org.ietf.jgss;

import org.ietf.jgss.GSSCredential;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GSSCredentialClassTest
implements org.j8unit.repository.org.ietf.jgss.GSSCredentialClassTests<GSSCredential> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.ietf.jgss.GSSCredential]

    @Override
    public Class<GSSCredential> createNewSUT() {
        return GSSCredential.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.ietf.jgss.GSSCredential]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.ietf.jgss.GSSCredential]

}
