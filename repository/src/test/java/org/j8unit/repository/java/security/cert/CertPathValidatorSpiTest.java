package org.j8unit.repository.java.security.cert;

import java.security.cert.CertPathValidatorSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertPathValidatorSpiTest
implements org.j8unit.repository.java.security.cert.CertPathValidatorSpiTests<CertPathValidatorSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CertPathValidatorSpi]

    @Override
    public CertPathValidatorSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.cert.CertPathValidatorSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.CertPathValidatorSpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.CertPathValidatorSpi]

}
