package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertPathValidatorSpiClassTest
implements org.j8unit.repository.java.security.cert.CertPathValidatorSpiClassTests<java.security.cert.CertPathValidatorSpi> {

    @Override
    public Class<java.security.cert.CertPathValidatorSpi> createNewSUT() {
        return java.security.cert.CertPathValidatorSpi.class;
    }

}
