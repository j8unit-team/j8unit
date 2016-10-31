package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.CertPathTrustManagerParameters;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertPathTrustManagerParametersTest
implements org.j8unit.repository.javax.net.ssl.CertPathTrustManagerParametersTests<CertPathTrustManagerParameters> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.CertPathTrustManagerParameters]

    @Override
    public CertPathTrustManagerParameters createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.net.ssl.CertPathTrustManagerParameters], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.CertPathTrustManagerParameters]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.CertPathTrustManagerParameters]

}
