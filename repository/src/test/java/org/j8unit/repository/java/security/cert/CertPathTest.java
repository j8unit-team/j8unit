package org.j8unit.repository.java.security.cert;

import java.security.cert.CertPath;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CertPath} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.cert.CertPathTests}).
 */
@RunWith(J8Unit4.class)
public class CertPathTest
implements CertPathTests<CertPath> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CertPath]

    @Override
    public CertPath createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.cert.CertPath], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.CertPath]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.CertPath]

}
