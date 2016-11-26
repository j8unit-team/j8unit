package org.j8unit.repository.java.security.cert;

import java.security.cert.CertificateFactorySpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CertificateFactorySpi} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.security.cert.CertificateFactorySpiTests}).
 */
@RunWith(J8Unit4.class)
public class CertificateFactorySpiTest
implements CertificateFactorySpiTests<CertificateFactorySpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CertificateFactorySpi]

    @Override
    public CertificateFactorySpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.cert.CertificateFactorySpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.CertificateFactorySpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.CertificateFactorySpi]

}
