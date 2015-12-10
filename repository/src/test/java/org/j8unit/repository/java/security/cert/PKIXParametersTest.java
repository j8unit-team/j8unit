package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PKIXParametersTest
implements org.j8unit.repository.java.security.cert.PKIXParametersTests<java.security.cert.PKIXParameters> {

    @Override
    public java.security.cert.PKIXParameters createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.security.cert.PKIXParameters] available.");
    }

}
