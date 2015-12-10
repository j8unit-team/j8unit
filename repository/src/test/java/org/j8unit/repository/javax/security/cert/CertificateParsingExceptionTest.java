package org.j8unit.repository.javax.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateParsingExceptionTest
implements org.j8unit.repository.javax.security.cert.CertificateParsingExceptionTests<javax.security.cert.CertificateParsingException> {

    @Override
    public javax.security.cert.CertificateParsingException createNewSUT() {
        return new javax.security.cert.CertificateParsingException();
    }

}
