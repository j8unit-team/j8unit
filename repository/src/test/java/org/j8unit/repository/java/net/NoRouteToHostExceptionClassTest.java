package org.j8unit.repository.java.net;

import java.net.NoRouteToHostException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NoRouteToHostException} (by simply
 * reusing the J8Unit test interface {@link NoRouteToHostExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class NoRouteToHostExceptionClassTest
implements NoRouteToHostExceptionClassTests<NoRouteToHostException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.NoRouteToHostException]

    @Override
    public Class<NoRouteToHostException> createNewSUT() {
        return NoRouteToHostException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.net.NoRouteToHostException#NoRouteToHostException(String) public
     * java.net.NoRouteToHostException(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_NoRouteToHostException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NoRouteToHostException sut = null; // = new NoRouteToHostException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.net.NoRouteToHostException#NoRouteToHostException() public java.net.NoRouteToHostException()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_NoRouteToHostException()
    throws Exception {
        // create new instance
        final NoRouteToHostException sut = new NoRouteToHostException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.NoRouteToHostException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.NoRouteToHostException]

}
