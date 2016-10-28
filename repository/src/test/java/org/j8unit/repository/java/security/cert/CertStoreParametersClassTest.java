package org.j8unit.repository.java.security.cert;

import java.security.cert.CertStoreParameters;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertStoreParametersClassTest
implements org.j8unit.repository.java.security.cert.CertStoreParametersClassTests<CertStoreParameters> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CertStoreParameters]

    @Override
    public Class<CertStoreParameters> createNewSUT() {
        return CertStoreParameters.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CertStoreParameters]

}
