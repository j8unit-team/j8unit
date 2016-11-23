package org.j8unit.repository.java.security;

import java.security.KeyException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link KeyException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.KeyExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class KeyExceptionClassTest
implements KeyExceptionClassTests<KeyException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.KeyException]

    @Override
    public Class<KeyException> createNewSUT() {
        return KeyException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.KeyException#KeyException(Throwable) public
     * java.security.KeyException(java.lang.Throwable)}.
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
    public void create_KeyException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final KeyException sut = null; // = new KeyException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.KeyException#KeyException(String, Throwable) public
     * java.security.KeyException(java.lang.String,java.lang.Throwable)}.
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
    public void create_KeyException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final KeyException sut = null; // = new KeyException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.security.KeyException#KeyException(String)
     * public java.security.KeyException(java.lang.String)}.
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
    public void create_KeyException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final KeyException sut = null; // = new KeyException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.security.KeyException#KeyException()
     * public java.security.KeyException()}.
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
    public void create_KeyException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final KeyException sut = new KeyException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.KeyException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.KeyException]

}
