package org.j8unit.repository.java.nio.channels;

import java.nio.channels.NotYetConnectedException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NotYetConnectedException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.nio.channels.NotYetConnectedExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class NotYetConnectedExceptionClassTest
implements NotYetConnectedExceptionClassTests<NotYetConnectedException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.NotYetConnectedException]

    @Override
    public Class<NotYetConnectedException> createNewSUT() {
        return NotYetConnectedException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.channels.NotYetConnectedException#NotYetConnectedException() public
     * java.nio.channels.NotYetConnectedException()}.
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
    public void create_NotYetConnectedException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NotYetConnectedException sut = new NotYetConnectedException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.NotYetConnectedException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.NotYetConnectedException]

}
