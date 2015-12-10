package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PKIXCertPathCheckerClassTest
implements org.j8unit.repository.java.security.cert.PKIXCertPathCheckerClassTests<java.security.cert.PKIXCertPathChecker> {

    @Override
    public Class<java.security.cert.PKIXCertPathChecker> createNewSUT() {
        return java.security.cert.PKIXCertPathChecker.class;
    }

}
