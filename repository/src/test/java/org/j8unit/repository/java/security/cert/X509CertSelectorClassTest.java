package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509CertSelectorClassTest
implements org.j8unit.repository.java.security.cert.X509CertSelectorClassTests<java.security.cert.X509CertSelector> {

    @Override
    public Class<java.security.cert.X509CertSelector> createNewSUT() {
        return java.security.cert.X509CertSelector.class;
    }

}
