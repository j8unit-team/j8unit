package org.j8unit.repository.java.net;

import java.net.UnknownServiceException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UnknownServiceException} (by simply
 * reusing the J8Unit test interface {@link UnknownServiceExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class UnknownServiceExceptionClassTest
implements UnknownServiceExceptionClassTests<UnknownServiceException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.UnknownServiceException]

    @Override
    public Class<UnknownServiceException> createNewSUT() {
        return UnknownServiceException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.net.UnknownServiceException#UnknownServiceException() public java.net.UnknownServiceException()}.
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
    public void create_UnknownServiceException()
    throws Exception {
        // create new instance
        final UnknownServiceException sut = new UnknownServiceException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.net.UnknownServiceException#UnknownServiceException(String) public
     * java.net.UnknownServiceException(java.lang.String)}.
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
    public void create_UnknownServiceException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnknownServiceException sut = null; // = new UnknownServiceException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.UnknownServiceException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.UnknownServiceException]

}
