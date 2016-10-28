package org.j8unit.repository.java.security.cert;

import java.security.cert.CRL;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CRLClassTest
implements org.j8unit.repository.java.security.cert.CRLClassTests<CRL> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CRL]

    @Override
    public Class<CRL> createNewSUT() {
        return CRL.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CRL]

}
