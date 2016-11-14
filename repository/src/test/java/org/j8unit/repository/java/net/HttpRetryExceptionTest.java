package org.j8unit.repository.java.net;

import java.net.HttpRetryException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link HttpRetryException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.net.HttpRetryExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class HttpRetryExceptionTest
implements HttpRetryExceptionTests<HttpRetryException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.HttpRetryException]

    @Override
    public HttpRetryException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.net.HttpRetryException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.HttpRetryException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.HttpRetryException]

}
