package org.j8unit.repository.javax.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateExceptionTest
implements org.j8unit.repository.javax.security.cert.CertificateExceptionTests<javax.security.cert.CertificateException> {

    @Override
    public javax.security.cert.CertificateException createNewSUT() {
        return new javax.security.cert.CertificateException();
    }

}
