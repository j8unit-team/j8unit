package org.j8unit.repository.java.security.cert;

import java.security.cert.CertPathParameters;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertPathParametersTest
implements org.j8unit.repository.java.security.cert.CertPathParametersTests<CertPathParameters> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CertPathParameters]

    @Override
    public CertPathParameters createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.cert.CertPathParameters], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CertPathParameters]

}
