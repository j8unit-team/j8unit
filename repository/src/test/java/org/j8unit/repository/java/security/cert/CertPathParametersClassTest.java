package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertPathParametersClassTest
implements org.j8unit.repository.java.security.cert.CertPathParametersClassTests<java.security.cert.CertPathParameters> {

    @Override
    public Class<java.security.cert.CertPathParameters> createNewSUT() {
        return java.security.cert.CertPathParameters.class;
    }

}
