package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertStoreExceptionTest
implements org.j8unit.repository.java.security.cert.CertStoreExceptionTests<java.security.cert.CertStoreException> {

    @Override
    public java.security.cert.CertStoreException createNewSUT() {
        return new java.security.cert.CertStoreException();
    }

}
