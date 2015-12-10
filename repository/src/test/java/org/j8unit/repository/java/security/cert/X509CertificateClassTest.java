package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509CertificateClassTest
implements org.j8unit.repository.java.security.cert.X509CertificateClassTests<java.security.cert.X509Certificate> {

    @Override
    public Class<java.security.cert.X509Certificate> createNewSUT() {
        return java.security.cert.X509Certificate.class;
    }

}
