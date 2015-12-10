package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509CRLSelectorTest
implements org.j8unit.repository.java.security.cert.X509CRLSelectorTests<java.security.cert.X509CRLSelector> {

    @Override
    public java.security.cert.X509CRLSelector createNewSUT() {
        return new java.security.cert.X509CRLSelector();
    }

}
