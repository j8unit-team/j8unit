package org.j8unit.repository.java.security.cert;

import java.security.cert.CertPathChecker;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertPathCheckerClassTest
implements org.j8unit.repository.java.security.cert.CertPathCheckerClassTests<CertPathChecker> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CertPathChecker]

    @Override
    public Class<CertPathChecker> createNewSUT() {
        return CertPathChecker.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.CertPathChecker]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CertPathChecker]

}
