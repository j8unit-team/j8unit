package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.ExtendedSSLSession;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ExtendedSSLSession} (by simply
 * reusing the J8Unit test interface {@link ExtendedSSLSessionTests}).
 */

@RunWith(J8Unit4.class)
public class ExtendedSSLSessionTest
implements ExtendedSSLSessionTests<ExtendedSSLSession> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.ExtendedSSLSession]

    @Override
    public ExtendedSSLSession createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.ExtendedSSLSession], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.ExtendedSSLSession]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.ExtendedSSLSession]

}
