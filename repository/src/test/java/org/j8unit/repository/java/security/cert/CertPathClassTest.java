package org.j8unit.repository.java.security.cert;

import java.security.cert.CertPath;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CertPath} (by simply reusing the J8Unit
 * test interface {@link CertPathClassTests}).
 */

@RunWith(J8Unit4.class)
public class CertPathClassTest
implements CertPathClassTests<CertPath> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CertPath]

    @Override
    public Class<CertPath> createNewSUT() {
        return CertPath.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.CertPath]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CertPath]

}
