package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateEncodingExceptionClassTest
implements org.j8unit.repository.java.security.cert.CertificateEncodingExceptionClassTests<java.security.cert.CertificateEncodingException> {

    @Override
    public Class<java.security.cert.CertificateEncodingException> createNewSUT() {
        return java.security.cert.CertificateEncodingException.class;
    }

}
