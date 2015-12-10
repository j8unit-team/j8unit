package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateExpiredExceptionClassTest
implements org.j8unit.repository.java.security.cert.CertificateExpiredExceptionClassTests<java.security.cert.CertificateExpiredException> {

    @Override
    public Class<java.security.cert.CertificateExpiredException> createNewSUT() {
        return java.security.cert.CertificateExpiredException.class;
    }

}
