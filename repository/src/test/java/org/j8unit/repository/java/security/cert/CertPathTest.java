package org.j8unit.repository.java.security.cert;

import java.security.cert.CertPath;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertPathTest
implements org.j8unit.repository.java.security.cert.CertPathTests<CertPath> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CertPath]

    @Override
    public CertPath createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.cert.CertPath], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.CertPath]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.CertPath]

}
