package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateNotYetValidExceptionClassTest
implements org.j8unit.repository.java.security.cert.CertificateNotYetValidExceptionClassTests<java.security.cert.CertificateNotYetValidException> {

    @Override
    public Class<java.security.cert.CertificateNotYetValidException> createNewSUT() {
        return java.security.cert.CertificateNotYetValidException.class;
    }

}
