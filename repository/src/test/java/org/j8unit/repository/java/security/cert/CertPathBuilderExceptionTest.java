package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertPathBuilderExceptionTest
implements org.j8unit.repository.java.security.cert.CertPathBuilderExceptionTests<java.security.cert.CertPathBuilderException> {

    @Override
    public java.security.cert.CertPathBuilderException createNewSUT() {
        return new java.security.cert.CertPathBuilderException();
    }

}
