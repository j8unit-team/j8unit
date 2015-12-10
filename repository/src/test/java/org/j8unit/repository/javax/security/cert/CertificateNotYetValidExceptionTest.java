package org.j8unit.repository.javax.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateNotYetValidExceptionTest
implements org.j8unit.repository.javax.security.cert.CertificateNotYetValidExceptionTests<javax.security.cert.CertificateNotYetValidException> {

    @Override
    public javax.security.cert.CertificateNotYetValidException createNewSUT() {
        return new javax.security.cert.CertificateNotYetValidException();
    }

}
