package org.j8unit.repository.java.rmi.server;

import java.rmi.server.ServerNotActiveException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ServerNotActiveException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.rmi.server.ServerNotActiveExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class ServerNotActiveExceptionClassTest
implements ServerNotActiveExceptionClassTests<ServerNotActiveException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.ServerNotActiveException]

    @Override
    public Class<ServerNotActiveException> createNewSUT() {
        return ServerNotActiveException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.server.ServerNotActiveException#ServerNotActiveException() public
     * java.rmi.server.ServerNotActiveException()}.
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
    public void create_ServerNotActiveException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ServerNotActiveException sut = new ServerNotActiveException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.server.ServerNotActiveException#ServerNotActiveException(String) public
     * java.rmi.server.ServerNotActiveException(java.lang.String)}.
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
    public void create_ServerNotActiveException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ServerNotActiveException sut = null; // = new ServerNotActiveException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.server.ServerNotActiveException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.ServerNotActiveException]

}
