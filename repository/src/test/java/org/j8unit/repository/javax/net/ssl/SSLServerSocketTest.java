package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLServerSocket;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SSLServerSocket} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.SSLServerSocketTests}).
 */

@RunWith(J8Unit4.class)
public class SSLServerSocketTest
implements SSLServerSocketTests<SSLServerSocket> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLServerSocket]

    @Override
    public SSLServerSocket createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.SSLServerSocket], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.SSLServerSocket]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.SSLServerSocket]

}
