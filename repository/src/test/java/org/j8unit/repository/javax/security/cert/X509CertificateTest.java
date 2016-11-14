package org.j8unit.repository.javax.security.cert;

import javax.security.cert.X509Certificate;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link X509Certificate} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.security.cert.X509CertificateTests}).
 */

@RunWith(J8Unit4.class)
public class X509CertificateTest
implements X509CertificateTests<X509Certificate> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.cert.X509Certificate]

    @Override
    public X509Certificate createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.security.cert.X509Certificate], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.cert.X509Certificate]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.cert.X509Certificate]

}
