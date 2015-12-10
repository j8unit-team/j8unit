package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateExpiredExceptionTest
implements org.j8unit.repository.java.security.cert.CertificateExpiredExceptionTests<java.security.cert.CertificateExpiredException> {

    @Override
    public java.security.cert.CertificateExpiredException createNewSUT() {
        return new java.security.cert.CertificateExpiredException();
    }

}
