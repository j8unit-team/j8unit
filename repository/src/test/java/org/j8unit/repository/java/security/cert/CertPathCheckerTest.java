package org.j8unit.repository.java.security.cert;

import java.security.cert.CertPathChecker;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertPathCheckerTest
implements org.j8unit.repository.java.security.cert.CertPathCheckerTests<CertPathChecker> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CertPathChecker]

    @Override
    public CertPathChecker createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.cert.CertPathChecker], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.CertPathChecker]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.CertPathChecker]

}
