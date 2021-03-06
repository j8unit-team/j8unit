package org.j8unit.repository.java.security.cert;

import java.security.cert.X509Certificate;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link X509Certificate} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.cert.X509CertificateClassTests}).
 */
@RunWith(J8Unit4.class)
public class X509CertificateClassTest
implements X509CertificateClassTests<X509Certificate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.X509Certificate]

    @Override
    public Class<X509Certificate> createNewSUT() {
        return X509Certificate.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.X509Certificate]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.X509Certificate]

}
