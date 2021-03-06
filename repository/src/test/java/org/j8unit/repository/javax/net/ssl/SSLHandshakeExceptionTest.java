package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLHandshakeException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SSLHandshakeException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.SSLHandshakeExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class SSLHandshakeExceptionTest
implements SSLHandshakeExceptionTests<SSLHandshakeException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLHandshakeException]

    @Override
    public SSLHandshakeException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.net.ssl.SSLHandshakeException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.SSLHandshakeException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.SSLHandshakeException]

}
