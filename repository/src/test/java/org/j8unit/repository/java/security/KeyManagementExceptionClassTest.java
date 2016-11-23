package org.j8unit.repository.java.security;

import java.security.KeyManagementException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link KeyManagementException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.security.KeyManagementExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class KeyManagementExceptionClassTest
implements KeyManagementExceptionClassTests<KeyManagementException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.KeyManagementException]

    @Override
    public Class<KeyManagementException> createNewSUT() {
        return KeyManagementException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.KeyManagementException#KeyManagementException(Throwable) public
     * java.security.KeyManagementException(java.lang.Throwable)}.
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
    public void create_KeyManagementException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final KeyManagementException sut = null; // = new KeyManagementException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.KeyManagementException#KeyManagementException(String, Throwable) public
     * java.security.KeyManagementException(java.lang.String,java.lang.Throwable)}.
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
    public void create_KeyManagementException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final KeyManagementException sut = null; // = new KeyManagementException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.KeyManagementException#KeyManagementException(String) public
     * java.security.KeyManagementException(java.lang.String)}.
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
    public void create_KeyManagementException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final KeyManagementException sut = null; // = new KeyManagementException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.KeyManagementException#KeyManagementException() public
     * java.security.KeyManagementException()}.
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
    public void create_KeyManagementException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final KeyManagementException sut = new KeyManagementException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.KeyManagementException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.KeyManagementException]

}
