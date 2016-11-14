package org.j8unit.repository.javax.security.auth.x500;

import javax.security.auth.x500.X500PrivateCredential;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link X500PrivateCredential} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.security.auth.x500.X500PrivateCredentialTests}).
 */

@RunWith(J8Unit4.class)
public class X500PrivateCredentialTest
implements X500PrivateCredentialTests<X500PrivateCredential> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.x500.X500PrivateCredential]

    @Override
    public X500PrivateCredential createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.auth.x500.X500PrivateCredential], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.x500.X500PrivateCredential]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.x500.X500PrivateCredential]

}
