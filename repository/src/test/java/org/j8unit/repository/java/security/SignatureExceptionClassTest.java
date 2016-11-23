package org.j8unit.repository.java.security;

import java.security.SignatureException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SignatureException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.security.SignatureExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class SignatureExceptionClassTest
implements SignatureExceptionClassTests<SignatureException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.SignatureException]

    @Override
    public Class<SignatureException> createNewSUT() {
        return SignatureException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.SignatureException#SignatureException(Throwable) public
     * java.security.SignatureException(java.lang.Throwable)}.
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
    public void create_SignatureException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SignatureException sut = null; // = new SignatureException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.SignatureException#SignatureException(String, Throwable) public
     * java.security.SignatureException(java.lang.String,java.lang.Throwable)}.
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
    public void create_SignatureException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SignatureException sut = null; // = new SignatureException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.SignatureException#SignatureException(String) public
     * java.security.SignatureException(java.lang.String)}.
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
    public void create_SignatureException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SignatureException sut = null; // = new SignatureException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.SignatureException#SignatureException() public java.security.SignatureException()}.
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
    public void create_SignatureException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SignatureException sut = new SignatureException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.SignatureException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.SignatureException]

}
