package org.j8unit.repository.java.security.cert;

import java.security.cert.TrustAnchor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TrustAnchor} (by simply reusing the
 * J8Unit test interface {@link TrustAnchorTests}).
 */

@RunWith(J8Unit4.class)
public class TrustAnchorTest
implements TrustAnchorTests<TrustAnchor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.TrustAnchor]

    @Override
    public TrustAnchor createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.cert.TrustAnchor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.TrustAnchor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.TrustAnchor]

}
