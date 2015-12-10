package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateExceptionTest
implements org.j8unit.repository.java.security.cert.CertificateExceptionTests<java.security.cert.CertificateException> {

    @Override
    public java.security.cert.CertificateException createNewSUT() {
        return new java.security.cert.CertificateException();
    }

}
