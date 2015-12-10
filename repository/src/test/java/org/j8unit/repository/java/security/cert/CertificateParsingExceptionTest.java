package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateParsingExceptionTest
implements org.j8unit.repository.java.security.cert.CertificateParsingExceptionTests<java.security.cert.CertificateParsingException> {

    @Override
    public java.security.cert.CertificateParsingException createNewSUT() {
        return new java.security.cert.CertificateParsingException();
    }

}
