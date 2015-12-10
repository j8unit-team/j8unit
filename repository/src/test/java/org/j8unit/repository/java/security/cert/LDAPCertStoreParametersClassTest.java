package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LDAPCertStoreParametersClassTest
implements org.j8unit.repository.java.security.cert.LDAPCertStoreParametersClassTests<java.security.cert.LDAPCertStoreParameters> {

    @Override
    public Class<java.security.cert.LDAPCertStoreParameters> createNewSUT() {
        return java.security.cert.LDAPCertStoreParameters.class;
    }

}
