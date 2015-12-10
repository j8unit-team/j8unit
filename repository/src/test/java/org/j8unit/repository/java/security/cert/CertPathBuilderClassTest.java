package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertPathBuilderClassTest
implements org.j8unit.repository.java.security.cert.CertPathBuilderClassTests<java.security.cert.CertPathBuilder> {

    @Override
    public Class<java.security.cert.CertPathBuilder> createNewSUT() {
        return java.security.cert.CertPathBuilder.class;
    }

}
