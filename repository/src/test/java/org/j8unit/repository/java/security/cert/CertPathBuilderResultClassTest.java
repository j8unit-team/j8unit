package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertPathBuilderResultClassTest
implements org.j8unit.repository.java.security.cert.CertPathBuilderResultClassTests<java.security.cert.CertPathBuilderResult> {

    @Override
    public Class<java.security.cert.CertPathBuilderResult> createNewSUT() {
        return java.security.cert.CertPathBuilderResult.class;
    }

}
