package org.j8unit.repository.javax.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateEncodingExceptionTest
implements org.j8unit.repository.javax.security.cert.CertificateEncodingExceptionTests<javax.security.cert.CertificateEncodingException> {

    @Override
    public javax.security.cert.CertificateEncodingException createNewSUT() {
        return new javax.security.cert.CertificateEncodingException();
    }

}
