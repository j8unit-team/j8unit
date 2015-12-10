package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertPathClassTest
implements org.j8unit.repository.java.security.cert.CertPathClassTests<java.security.cert.CertPath> {

    @Override
    public Class<java.security.cert.CertPath> createNewSUT() {
        return java.security.cert.CertPath.class;
    }

}
