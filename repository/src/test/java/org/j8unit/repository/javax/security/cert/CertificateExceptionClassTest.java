package org.j8unit.repository.javax.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateExceptionClassTest
implements org.j8unit.repository.javax.security.cert.CertificateExceptionClassTests<javax.security.cert.CertificateException> {

    @Override
    public Class<javax.security.cert.CertificateException> createNewSUT() {
        return javax.security.cert.CertificateException.class;
    }

}
