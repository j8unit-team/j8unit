package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509CertSelectorTest
implements org.j8unit.repository.java.security.cert.X509CertSelectorTests<java.security.cert.X509CertSelector> {

    @Override
    public java.security.cert.X509CertSelector createNewSUT() {
        return new java.security.cert.X509CertSelector();
    }

}
