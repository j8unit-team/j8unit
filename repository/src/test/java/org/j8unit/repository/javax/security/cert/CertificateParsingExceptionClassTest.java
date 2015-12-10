package org.j8unit.repository.javax.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateParsingExceptionClassTest
implements org.j8unit.repository.javax.security.cert.CertificateParsingExceptionClassTests<javax.security.cert.CertificateParsingException> {

    @Override
    public Class<javax.security.cert.CertificateParsingException> createNewSUT() {
        return javax.security.cert.CertificateParsingException.class;
    }

}
