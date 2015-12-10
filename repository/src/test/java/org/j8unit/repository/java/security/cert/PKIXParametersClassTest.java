package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PKIXParametersClassTest
implements org.j8unit.repository.java.security.cert.PKIXParametersClassTests<java.security.cert.PKIXParameters> {

    @Override
    public Class<java.security.cert.PKIXParameters> createNewSUT() {
        return java.security.cert.PKIXParameters.class;
    }

}
