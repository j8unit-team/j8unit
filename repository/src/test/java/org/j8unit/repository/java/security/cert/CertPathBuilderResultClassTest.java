package org.j8unit.repository.java.security.cert;

import java.security.cert.CertPathBuilderResult;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CertPathBuilderResult} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.security.cert.CertPathBuilderResultClassTests}).
 */

@RunWith(J8Unit4.class)
public class CertPathBuilderResultClassTest
implements CertPathBuilderResultClassTests<CertPathBuilderResult> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CertPathBuilderResult]

    @Override
    public Class<CertPathBuilderResult> createNewSUT() {
        return CertPathBuilderResult.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.CertPathBuilderResult]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CertPathBuilderResult]

}
