package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertStoreClassTest
implements org.j8unit.repository.java.security.cert.CertStoreClassTests<java.security.cert.CertStore> {

    @Override
    public Class<java.security.cert.CertStore> createNewSUT() {
        return java.security.cert.CertStore.class;
    }

}
