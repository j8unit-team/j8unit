package org.j8unit.repository.java.security.cert;

import java.security.cert.CertPathValidatorResult;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CertPathValidatorResult} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.security.cert.CertPathValidatorResultClassTests}).
 */
@RunWith(J8Unit4.class)
public class CertPathValidatorResultClassTest
implements CertPathValidatorResultClassTests<CertPathValidatorResult> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CertPathValidatorResult]

    @Override
    public Class<CertPathValidatorResult> createNewSUT() {
        return CertPathValidatorResult.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.CertPathValidatorResult]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CertPathValidatorResult]

}
