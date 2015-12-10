package org.j8unit.repository.javax.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateEncodingExceptionClassTest
implements org.j8unit.repository.javax.security.cert.CertificateEncodingExceptionClassTests<javax.security.cert.CertificateEncodingException> {

    @Override
    public Class<javax.security.cert.CertificateEncodingException> createNewSUT() {
        return javax.security.cert.CertificateEncodingException.class;
    }

}
