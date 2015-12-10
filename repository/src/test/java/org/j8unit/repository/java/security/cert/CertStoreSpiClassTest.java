package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertStoreSpiClassTest
implements org.j8unit.repository.java.security.cert.CertStoreSpiClassTests<java.security.cert.CertStoreSpi> {

    @Override
    public Class<java.security.cert.CertStoreSpi> createNewSUT() {
        return java.security.cert.CertStoreSpi.class;
    }

}
