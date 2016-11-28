package org.j8unit.repository.java.security;

import java.security.Certificate;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Certificate} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.CertificateTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class CertificateTest
implements org.j8unit.repository.java.security.CertificateTests<Certificate> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.Certificate]

    @Override
    public Certificate createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.Certificate], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.Certificate]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.Certificate]

}
