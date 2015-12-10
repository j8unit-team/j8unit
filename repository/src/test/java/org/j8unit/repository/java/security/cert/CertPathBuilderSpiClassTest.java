package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertPathBuilderSpiClassTest
implements org.j8unit.repository.java.security.cert.CertPathBuilderSpiClassTests<java.security.cert.CertPathBuilderSpi> {

    @Override
    public Class<java.security.cert.CertPathBuilderSpi> createNewSUT() {
        return java.security.cert.CertPathBuilderSpi.class;
    }

}
