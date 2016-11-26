package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.TrustManagerFactorySpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TrustManagerFactorySpi} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.TrustManagerFactorySpiTests}).
 */
@RunWith(J8Unit4.class)
public class TrustManagerFactorySpiTest
implements TrustManagerFactorySpiTests<TrustManagerFactorySpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.TrustManagerFactorySpi]

    @Override
    public TrustManagerFactorySpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.TrustManagerFactorySpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.TrustManagerFactorySpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.TrustManagerFactorySpi]

}
