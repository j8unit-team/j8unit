package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateClassTest
implements org.j8unit.repository.java.security.cert.CertificateClassTests<java.security.cert.Certificate> {

    @Override
    public Class<java.security.cert.Certificate> createNewSUT() {
        return java.security.cert.Certificate.class;
    }

}
