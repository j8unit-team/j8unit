package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateExceptionClassTest
implements org.j8unit.repository.java.security.cert.CertificateExceptionClassTests<java.security.cert.CertificateException> {

    @Override
    public Class<java.security.cert.CertificateException> createNewSUT() {
        return java.security.cert.CertificateException.class;
    }

}
