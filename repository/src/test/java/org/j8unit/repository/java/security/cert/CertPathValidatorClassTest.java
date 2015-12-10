package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertPathValidatorClassTest
implements org.j8unit.repository.java.security.cert.CertPathValidatorClassTests<java.security.cert.CertPathValidator> {

    @Override
    public Class<java.security.cert.CertPathValidator> createNewSUT() {
        return java.security.cert.CertPathValidator.class;
    }

}
