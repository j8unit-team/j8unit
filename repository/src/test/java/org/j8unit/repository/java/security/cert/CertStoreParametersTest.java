package org.j8unit.repository.java.security.cert;

import java.security.cert.CertStoreParameters;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CertStoreParameters} (by simply
 * reusing the J8Unit test interface {@link CertStoreParametersTests}).
 */

@RunWith(J8Unit4.class)
public class CertStoreParametersTest
implements CertStoreParametersTests<CertStoreParameters> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CertStoreParameters]

    @Override
    public CertStoreParameters createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.cert.CertStoreParameters], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.CertStoreParameters]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.CertStoreParameters]

}
