package org.j8unit.repository.java.security.spec;

import java.security.spec.InvalidKeySpecException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InvalidKeySpecException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.security.spec.InvalidKeySpecExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class InvalidKeySpecExceptionClassTest
implements InvalidKeySpecExceptionClassTests<InvalidKeySpecException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.spec.InvalidKeySpecException]

    @Override
    public Class<InvalidKeySpecException> createNewSUT() {
        return InvalidKeySpecException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.spec.InvalidKeySpecException#InvalidKeySpecException(Throwable) public
     * java.security.spec.InvalidKeySpecException(java.lang.Throwable)}.
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
    public void create_InvalidKeySpecException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidKeySpecException sut = null; // = new InvalidKeySpecException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.spec.InvalidKeySpecException#InvalidKeySpecException(String, Throwable) public
     * java.security.spec.InvalidKeySpecException(java.lang.String,java.lang.Throwable)}.
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
    public void create_InvalidKeySpecException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidKeySpecException sut = null; // = new InvalidKeySpecException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.spec.InvalidKeySpecException#InvalidKeySpecException(String) public
     * java.security.spec.InvalidKeySpecException(java.lang.String)}.
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
    public void create_InvalidKeySpecException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidKeySpecException sut = null; // = new InvalidKeySpecException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.spec.InvalidKeySpecException#InvalidKeySpecException() public
     * java.security.spec.InvalidKeySpecException()}.
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
    public void create_InvalidKeySpecException()
    throws Exception {
        // create new instance
        final InvalidKeySpecException sut = new InvalidKeySpecException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.spec.InvalidKeySpecException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.spec.InvalidKeySpecException]

}
