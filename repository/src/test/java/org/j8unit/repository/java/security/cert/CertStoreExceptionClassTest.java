package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertStoreExceptionClassTest
implements org.j8unit.repository.java.security.cert.CertStoreExceptionClassTests<java.security.cert.CertStoreException> {

    @Override
    public Class<java.security.cert.CertStoreException> createNewSUT() {
        return java.security.cert.CertStoreException.class;
    }

}
