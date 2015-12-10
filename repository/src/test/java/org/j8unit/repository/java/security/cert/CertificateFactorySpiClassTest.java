package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateFactorySpiClassTest
implements org.j8unit.repository.java.security.cert.CertificateFactorySpiClassTests<java.security.cert.CertificateFactorySpi> {

    @Override
    public Class<java.security.cert.CertificateFactorySpi> createNewSUT() {
        return java.security.cert.CertificateFactorySpi.class;
    }

}
