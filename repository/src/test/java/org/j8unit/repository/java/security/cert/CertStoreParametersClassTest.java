package org.j8unit.repository.java.security.cert;

import java.security.cert.CertStoreParameters;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CertStoreParameters} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.security.cert.CertStoreParametersClassTests}).
 */

@RunWith(J8Unit4.class)
public class CertStoreParametersClassTest
implements CertStoreParametersClassTests<CertStoreParameters> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CertStoreParameters]

    @Override
    public Class<CertStoreParameters> createNewSUT() {
        return CertStoreParameters.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.CertStoreParameters]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CertStoreParameters]

}
