package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PKIXCertPathBuilderResultClassTest
implements org.j8unit.repository.java.security.cert.PKIXCertPathBuilderResultClassTests<java.security.cert.PKIXCertPathBuilderResult> {

    @Override
    public Class<java.security.cert.PKIXCertPathBuilderResult> createNewSUT() {
        return java.security.cert.PKIXCertPathBuilderResult.class;
    }

}
