package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CRLSelectorClassTest
implements org.j8unit.repository.java.security.cert.CRLSelectorClassTests<java.security.cert.CRLSelector> {

    @Override
    public Class<java.security.cert.CRLSelector> createNewSUT() {
        return java.security.cert.CRLSelector.class;
    }

}
