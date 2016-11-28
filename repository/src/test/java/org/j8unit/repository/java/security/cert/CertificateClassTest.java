package org.j8unit.repository.java.security.cert;

import java.security.cert.Certificate;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Certificate} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.cert.CertificateClassTests}).
 */
@RunWith(J8Unit4.class)
public class CertificateClassTest
implements CertificateClassTests<Certificate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.Certificate]

    @Override
    public Class<Certificate> createNewSUT() {
        return Certificate.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.Certificate]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.Certificate]

}
