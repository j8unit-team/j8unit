package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PKIXBuilderParametersClassTest
implements org.j8unit.repository.java.security.cert.PKIXBuilderParametersClassTests<java.security.cert.PKIXBuilderParameters> {

    @Override
    public Class<java.security.cert.PKIXBuilderParameters> createNewSUT() {
        return java.security.cert.PKIXBuilderParameters.class;
    }

}
