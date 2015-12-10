package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateFactoryClassTest
implements org.j8unit.repository.java.security.cert.CertificateFactoryClassTests<java.security.cert.CertificateFactory> {

    @Override
    public Class<java.security.cert.CertificateFactory> createNewSUT() {
        return java.security.cert.CertificateFactory.class;
    }

}
