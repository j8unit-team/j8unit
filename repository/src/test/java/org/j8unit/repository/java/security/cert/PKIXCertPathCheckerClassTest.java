package org.j8unit.repository.java.security.cert;

import java.security.cert.PKIXCertPathChecker;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PKIXCertPathChecker} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.security.cert.PKIXCertPathCheckerClassTests}).
 */

@RunWith(J8Unit4.class)
public class PKIXCertPathCheckerClassTest
implements PKIXCertPathCheckerClassTests<PKIXCertPathChecker> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.PKIXCertPathChecker]

    @Override
    public Class<PKIXCertPathChecker> createNewSUT() {
        return PKIXCertPathChecker.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.PKIXCertPathChecker]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.PKIXCertPathChecker]

}
