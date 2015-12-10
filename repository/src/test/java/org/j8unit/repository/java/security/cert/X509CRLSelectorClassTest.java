package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509CRLSelectorClassTest
implements org.j8unit.repository.java.security.cert.X509CRLSelectorClassTests<java.security.cert.X509CRLSelector> {

    @Override
    public Class<java.security.cert.X509CRLSelector> createNewSUT() {
        return java.security.cert.X509CRLSelector.class;
    }

}
