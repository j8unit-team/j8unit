package org.j8unit.repository.java.security.cert;

import java.security.cert.CertPathValidatorResult;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertPathValidatorResultTest
implements org.j8unit.repository.java.security.cert.CertPathValidatorResultTests<CertPathValidatorResult> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CertPathValidatorResult]

    @Override
    public CertPathValidatorResult createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.cert.CertPathValidatorResult], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.CertPathValidatorResult]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.CertPathValidatorResult]

}
