package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateEncodingExceptionTest
implements org.j8unit.repository.java.security.cert.CertificateEncodingExceptionTests<java.security.cert.CertificateEncodingException> {

    @Override
    public java.security.cert.CertificateEncodingException createNewSUT() {
        return new java.security.cert.CertificateEncodingException();
    }

}
