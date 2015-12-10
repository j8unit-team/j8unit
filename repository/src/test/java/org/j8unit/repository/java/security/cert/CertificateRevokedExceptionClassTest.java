package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateRevokedExceptionClassTest
implements org.j8unit.repository.java.security.cert.CertificateRevokedExceptionClassTests<java.security.cert.CertificateRevokedException> {

    @Override
    public Class<java.security.cert.CertificateRevokedException> createNewSUT() {
        return java.security.cert.CertificateRevokedException.class;
    }

}
