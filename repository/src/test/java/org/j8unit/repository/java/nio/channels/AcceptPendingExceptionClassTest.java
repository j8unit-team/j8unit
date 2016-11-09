package org.j8unit.repository.java.nio.channels;

import java.nio.channels.AcceptPendingException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AcceptPendingException} (by simply
 * reusing the J8Unit test interface {@link AcceptPendingExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class AcceptPendingExceptionClassTest
implements AcceptPendingExceptionClassTests<AcceptPendingException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.AcceptPendingException]

    @Override
    public Class<AcceptPendingException> createNewSUT() {
        return AcceptPendingException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.channels.AcceptPendingException#AcceptPendingException() public
     * java.nio.channels.AcceptPendingException()}.
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
    public void create_AcceptPendingException()
    throws Exception {
        // create new instance
        final AcceptPendingException sut = new AcceptPendingException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.AcceptPendingException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.AcceptPendingException]

}
