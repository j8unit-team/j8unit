package org.j8unit.repository.java.security.cert;

import java.security.cert.CertPathBuilder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CertPathBuilder} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.security.cert.CertPathBuilderTests}).
 */
@RunWith(J8Unit4.class)
public class CertPathBuilderTest
implements CertPathBuilderTests<CertPathBuilder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CertPathBuilder]

    @Override
    public CertPathBuilder createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.cert.CertPathBuilder], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.CertPathBuilder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.CertPathBuilder]

}
