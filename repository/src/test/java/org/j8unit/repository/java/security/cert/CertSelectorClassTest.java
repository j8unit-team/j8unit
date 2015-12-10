package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertSelectorClassTest
implements org.j8unit.repository.java.security.cert.CertSelectorClassTests<java.security.cert.CertSelector> {

    @Override
    public Class<java.security.cert.CertSelector> createNewSUT() {
        return java.security.cert.CertSelector.class;
    }

}
