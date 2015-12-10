package org.j8unit.repository.org.ietf.jgss;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GSSCredentialClassTest
implements org.j8unit.repository.org.ietf.jgss.GSSCredentialClassTests<org.ietf.jgss.GSSCredential> {

    @Override
    public Class<org.ietf.jgss.GSSCredential> createNewSUT() {
        return org.ietf.jgss.GSSCredential.class;
    }

}
