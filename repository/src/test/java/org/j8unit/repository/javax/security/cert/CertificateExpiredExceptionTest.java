package org.j8unit.repository.javax.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateExpiredExceptionTest
implements org.j8unit.repository.javax.security.cert.CertificateExpiredExceptionTests<javax.security.cert.CertificateExpiredException> {

    @Override
    public javax.security.cert.CertificateExpiredException createNewSUT() {
        return new javax.security.cert.CertificateExpiredException();
    }

}
