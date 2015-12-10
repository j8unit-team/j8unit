package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PKIXReasonClassTest
implements org.j8unit.repository.java.security.cert.PKIXReasonClassTests<java.security.cert.PKIXReason> {

    @Override
    public Class<java.security.cert.PKIXReason> createNewSUT() {
        return java.security.cert.PKIXReason.class;
    }

}
