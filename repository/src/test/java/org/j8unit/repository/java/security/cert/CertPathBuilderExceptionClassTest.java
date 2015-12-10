package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertPathBuilderExceptionClassTest
implements org.j8unit.repository.java.security.cert.CertPathBuilderExceptionClassTests<java.security.cert.CertPathBuilderException> {

    @Override
    public Class<java.security.cert.CertPathBuilderException> createNewSUT() {
        return java.security.cert.CertPathBuilderException.class;
    }

}
