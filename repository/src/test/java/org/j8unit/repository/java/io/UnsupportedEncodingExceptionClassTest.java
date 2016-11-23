package org.j8unit.repository.java.io;

import java.io.UnsupportedEncodingException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UnsupportedEncodingException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.io.UnsupportedEncodingExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class UnsupportedEncodingExceptionClassTest
implements UnsupportedEncodingExceptionClassTests<UnsupportedEncodingException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.UnsupportedEncodingException]

    @Override
    public Class<UnsupportedEncodingException> createNewSUT() {
        return UnsupportedEncodingException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.UnsupportedEncodingException#UnsupportedEncodingException() public
     * java.io.UnsupportedEncodingException()}.
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
    public void create_UnsupportedEncodingException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnsupportedEncodingException sut = new UnsupportedEncodingException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.UnsupportedEncodingException#UnsupportedEncodingException(String) public
     * java.io.UnsupportedEncodingException(java.lang.String)}.
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
    public void create_UnsupportedEncodingException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnsupportedEncodingException sut = null; // = new UnsupportedEncodingException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.UnsupportedEncodingException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.UnsupportedEncodingException]

}
