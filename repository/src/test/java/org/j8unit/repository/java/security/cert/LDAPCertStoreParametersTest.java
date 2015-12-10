package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LDAPCertStoreParametersTest
implements org.j8unit.repository.java.security.cert.LDAPCertStoreParametersTests<java.security.cert.LDAPCertStoreParameters> {

    @Override
    public java.security.cert.LDAPCertStoreParameters createNewSUT() {
        return new java.security.cert.LDAPCertStoreParameters();
    }

}
