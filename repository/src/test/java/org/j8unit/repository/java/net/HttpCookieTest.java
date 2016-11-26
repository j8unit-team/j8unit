package org.j8unit.repository.java.net;

import java.net.HttpCookie;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link HttpCookie} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.net.HttpCookieTests}).
 */
@RunWith(J8Unit4.class)
public class HttpCookieTest
implements HttpCookieTests<HttpCookie> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.HttpCookie]

    @Override
    public HttpCookie createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.net.HttpCookie], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.HttpCookie]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.HttpCookie]

}
