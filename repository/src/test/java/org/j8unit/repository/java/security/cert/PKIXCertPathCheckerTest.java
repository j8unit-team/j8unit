package org.j8unit.repository.java.security.cert;

import java.security.cert.PKIXCertPathChecker;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PKIXCertPathCheckerTest
implements org.j8unit.repository.java.security.cert.PKIXCertPathCheckerTests<PKIXCertPathChecker> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.PKIXCertPathChecker]

    @Override
    public PKIXCertPathChecker createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.cert.PKIXCertPathChecker], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.PKIXCertPathChecker]

}
