package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PKIXCertPathValidatorResultClassTest
implements org.j8unit.repository.java.security.cert.PKIXCertPathValidatorResultClassTests<java.security.cert.PKIXCertPathValidatorResult> {

    @Override
    public Class<java.security.cert.PKIXCertPathValidatorResult> createNewSUT() {
        return java.security.cert.PKIXCertPathValidatorResult.class;
    }

}
