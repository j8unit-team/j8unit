package org.j8unit.repository.java.security;

import java.security.GeneralSecurityException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link GeneralSecurityException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.security.GeneralSecurityExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class GeneralSecurityExceptionClassTest
implements GeneralSecurityExceptionClassTests<GeneralSecurityException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.GeneralSecurityException]

    @Override
    public Class<GeneralSecurityException> createNewSUT() {
        return GeneralSecurityException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.GeneralSecurityException#GeneralSecurityException(Throwable) public
     * java.security.GeneralSecurityException(java.lang.Throwable)}.
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
    public void create_GeneralSecurityException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final GeneralSecurityException sut = null; // = new GeneralSecurityException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.GeneralSecurityException#GeneralSecurityException(String, Throwable) public
     * java.security.GeneralSecurityException(java.lang.String,java.lang.Throwable)}.
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
    public void create_GeneralSecurityException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final GeneralSecurityException sut = null; // = new GeneralSecurityException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.GeneralSecurityException#GeneralSecurityException(String) public
     * java.security.GeneralSecurityException(java.lang.String)}.
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
    public void create_GeneralSecurityException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final GeneralSecurityException sut = null; // = new GeneralSecurityException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.GeneralSecurityException#GeneralSecurityException() public
     * java.security.GeneralSecurityException()}.
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
    public void create_GeneralSecurityException()
    throws Exception {
        // create new instance
        final GeneralSecurityException sut = new GeneralSecurityException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.GeneralSecurityException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.GeneralSecurityException]

}
