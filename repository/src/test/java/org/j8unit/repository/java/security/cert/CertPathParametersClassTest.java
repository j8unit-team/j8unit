package org.j8unit.repository.java.security.cert;

import java.security.cert.CertPathParameters;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertPathParametersClassTest
implements org.j8unit.repository.java.security.cert.CertPathParametersClassTests<CertPathParameters> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CertPathParameters]

    @Override
    public Class<CertPathParameters> createNewSUT() {
        return CertPathParameters.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.CertPathParameters]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CertPathParameters]

}
