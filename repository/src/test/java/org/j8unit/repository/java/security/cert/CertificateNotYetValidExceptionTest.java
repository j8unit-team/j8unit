package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateNotYetValidExceptionTest
implements org.j8unit.repository.java.security.cert.CertificateNotYetValidExceptionTests<java.security.cert.CertificateNotYetValidException> {

    @Override
    public java.security.cert.CertificateNotYetValidException createNewSUT() {
        return new java.security.cert.CertificateNotYetValidException();
    }

}
