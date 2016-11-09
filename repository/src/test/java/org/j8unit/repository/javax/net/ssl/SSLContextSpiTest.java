package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLContextSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SSLContextSpi} (by simply reusing the
 * J8Unit test interface {@link SSLContextSpiTests}).
 */

@RunWith(J8Unit4.class)
public class SSLContextSpiTest
implements SSLContextSpiTests<SSLContextSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLContextSpi]

    @Override
    public SSLContextSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.SSLContextSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.SSLContextSpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.SSLContextSpi]

}
