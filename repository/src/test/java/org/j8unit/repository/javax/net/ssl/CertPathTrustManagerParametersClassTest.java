package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertPathTrustManagerParametersClassTest
implements org.j8unit.repository.javax.net.ssl.CertPathTrustManagerParametersClassTests<javax.net.ssl.CertPathTrustManagerParameters> {

    @Override
    public Class<javax.net.ssl.CertPathTrustManagerParameters> createNewSUT() {
        return javax.net.ssl.CertPathTrustManagerParameters.class;
    }

}
