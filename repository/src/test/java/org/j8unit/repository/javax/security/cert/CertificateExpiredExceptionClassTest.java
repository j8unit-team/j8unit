package org.j8unit.repository.javax.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateExpiredExceptionClassTest
implements org.j8unit.repository.javax.security.cert.CertificateExpiredExceptionClassTests<javax.security.cert.CertificateExpiredException> {

    @Override
    public Class<javax.security.cert.CertificateExpiredException> createNewSUT() {
        return javax.security.cert.CertificateExpiredException.class;
    }

}
