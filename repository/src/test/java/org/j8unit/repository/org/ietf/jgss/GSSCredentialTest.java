package org.j8unit.repository.org.ietf.jgss;

import org.ietf.jgss.GSSCredential;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link GSSCredential} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.ietf.jgss.GSSCredentialTests}).
 */

@RunWith(J8Unit4.class)
public class GSSCredentialTest
implements GSSCredentialTests<GSSCredential> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.ietf.jgss.GSSCredential]

    @Override
    public GSSCredential createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.ietf.jgss.GSSCredential], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.ietf.jgss.GSSCredential]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.ietf.jgss.GSSCredential]

}
