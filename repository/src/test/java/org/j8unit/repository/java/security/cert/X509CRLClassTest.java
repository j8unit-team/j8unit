package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509CRLClassTest
implements org.j8unit.repository.java.security.cert.X509CRLClassTests<java.security.cert.X509CRL> {

    @Override
    public Class<java.security.cert.X509CRL> createNewSUT() {
        return java.security.cert.X509CRL.class;
    }

}
