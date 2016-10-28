package org.j8unit.repository.java.security.cert;

import java.security.cert.PKIXParameters;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PKIXParametersTest
implements org.j8unit.repository.java.security.cert.PKIXParametersTests<PKIXParameters> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.PKIXParameters]

    @Override
    public PKIXParameters createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.cert.PKIXParameters], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.PKIXParameters]

}
