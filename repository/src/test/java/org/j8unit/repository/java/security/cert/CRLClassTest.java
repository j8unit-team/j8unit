package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CRLClassTest
implements org.j8unit.repository.java.security.cert.CRLClassTests<java.security.cert.CRL> {

    @Override
    public Class<java.security.cert.CRL> createNewSUT() {
        return java.security.cert.CRL.class;
    }

}
