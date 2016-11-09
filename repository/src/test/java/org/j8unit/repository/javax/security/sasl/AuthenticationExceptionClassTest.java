package org.j8unit.repository.javax.security.sasl;

import javax.security.sasl.AuthenticationException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AuthenticationException} (by simply
 * reusing the J8Unit test interface {@link AuthenticationExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class AuthenticationExceptionClassTest
implements AuthenticationExceptionClassTests<AuthenticationException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.sasl.AuthenticationException]

    @Override
    public Class<AuthenticationException> createNewSUT() {
        return AuthenticationException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.sasl.AuthenticationException#AuthenticationException() public
     * javax.security.sasl.AuthenticationException()}.
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
    public void create_AuthenticationException()
    throws Exception {
        // create new instance
        final AuthenticationException sut = new AuthenticationException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.sasl.AuthenticationException#AuthenticationException(String) public
     * javax.security.sasl.AuthenticationException(java.lang.String)}.
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
    public void create_AuthenticationException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AuthenticationException sut = null; // = new AuthenticationException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.sasl.AuthenticationException#AuthenticationException(String, Throwable) public
     * javax.security.sasl.AuthenticationException(java.lang.String,java.lang.Throwable)}.
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
    public void create_AuthenticationException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AuthenticationException sut = null; // = new AuthenticationException(String, Throwable);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.sasl.AuthenticationException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.sasl.AuthenticationException]

}
