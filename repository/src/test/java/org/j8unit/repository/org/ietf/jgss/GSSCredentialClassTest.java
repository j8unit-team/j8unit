package org.j8unit.repository.org.ietf.jgss;

import org.ietf.jgss.GSSCredential;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link GSSCredential} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.ietf.jgss.GSSCredentialClassTests}).
 */
@RunWith(J8Unit4.class)
public class GSSCredentialClassTest
implements GSSCredentialClassTests<GSSCredential> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.ietf.jgss.GSSCredential]

    @Override
    public Class<GSSCredential> createNewSUT() {
        return GSSCredential.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.ietf.jgss.GSSCredential]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.ietf.jgss.GSSCredential]

}
