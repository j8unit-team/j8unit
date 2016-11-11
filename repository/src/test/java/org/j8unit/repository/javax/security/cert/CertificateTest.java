package org.j8unit.repository.javax.security.cert;

import javax.security.cert.Certificate;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Certificate} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.security.cert.CertificateTests}).
 */

@RunWith(J8Unit4.class)
public class CertificateTest
implements CertificateTests<Certificate> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.cert.Certificate]

    @Override
    public Certificate createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.security.cert.Certificate], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.cert.Certificate]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.cert.Certificate]

}
