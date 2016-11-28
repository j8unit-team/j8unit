package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLSession;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SSLSession} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.SSLSessionTests}).
 */
@RunWith(J8Unit4.class)
public class SSLSessionTest
implements SSLSessionTests<SSLSession> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLSession]

    @Override
    public SSLSession createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.SSLSession], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.SSLSession]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.SSLSession]

}
