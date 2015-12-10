package org.j8unit.repository.javax.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateClassTest
implements org.j8unit.repository.javax.security.cert.CertificateClassTests<javax.security.cert.Certificate> {

    @Override
    public Class<javax.security.cert.Certificate> createNewSUT() {
        return javax.security.cert.Certificate.class;
    }

}
