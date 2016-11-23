package org.j8unit.repository.java.security;

import java.security.KeyStoreException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link KeyStoreException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.KeyStoreExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class KeyStoreExceptionClassTest
implements KeyStoreExceptionClassTests<KeyStoreException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.KeyStoreException]

    @Override
    public Class<KeyStoreException> createNewSUT() {
        return KeyStoreException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.KeyStoreException#KeyStoreException(Throwable) public
     * java.security.KeyStoreException(java.lang.Throwable)}.
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
    public void create_KeyStoreException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final KeyStoreException sut = null; // = new KeyStoreException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.KeyStoreException#KeyStoreException(String, Throwable) public
     * java.security.KeyStoreException(java.lang.String,java.lang.Throwable)}.
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
    public void create_KeyStoreException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final KeyStoreException sut = null; // = new KeyStoreException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.KeyStoreException#KeyStoreException(String) public
     * java.security.KeyStoreException(java.lang.String)}.
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
    public void create_KeyStoreException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final KeyStoreException sut = null; // = new KeyStoreException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.KeyStoreException#KeyStoreException() public java.security.KeyStoreException()}.
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
    public void create_KeyStoreException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final KeyStoreException sut = new KeyStoreException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.KeyStoreException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.KeyStoreException]

}
