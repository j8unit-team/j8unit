package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertStoreParametersClassTest
implements org.j8unit.repository.java.security.cert.CertStoreParametersClassTests<java.security.cert.CertStoreParameters> {

    @Override
    public Class<java.security.cert.CertStoreParameters> createNewSUT() {
        return java.security.cert.CertStoreParameters.class;
    }

}
