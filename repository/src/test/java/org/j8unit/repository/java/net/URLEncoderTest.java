package org.j8unit.repository.java.net;

import java.net.URLEncoder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link URLEncoder} (by simply reusing the
 * J8Unit test interface {@link URLEncoderTests}).
 */

@RunWith(J8Unit4.class)
public class URLEncoderTest
implements URLEncoderTests<URLEncoder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.URLEncoder]

    @Override
    public URLEncoder createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.net.URLEncoder], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.URLEncoder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.URLEncoder]

}
