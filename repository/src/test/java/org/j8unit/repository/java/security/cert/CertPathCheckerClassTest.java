package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertPathCheckerClassTest
implements org.j8unit.repository.java.security.cert.CertPathCheckerClassTests<java.security.cert.CertPathChecker> {

    @Override
    public Class<java.security.cert.CertPathChecker> createNewSUT() {
        return java.security.cert.CertPathChecker.class;
    }

}
