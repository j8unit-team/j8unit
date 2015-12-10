package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TrustAnchorClassTest
implements org.j8unit.repository.java.security.cert.TrustAnchorClassTests<java.security.cert.TrustAnchor> {

    @Override
    public Class<java.security.cert.TrustAnchor> createNewSUT() {
        return java.security.cert.TrustAnchor.class;
    }

}
