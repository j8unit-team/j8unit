package org.j8unit.repository.javax.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateNotYetValidExceptionClassTest
implements org.j8unit.repository.javax.security.cert.CertificateNotYetValidExceptionClassTests<javax.security.cert.CertificateNotYetValidException> {

    @Override
    public Class<javax.security.cert.CertificateNotYetValidException> createNewSUT() {
        return javax.security.cert.CertificateNotYetValidException.class;
    }

}
