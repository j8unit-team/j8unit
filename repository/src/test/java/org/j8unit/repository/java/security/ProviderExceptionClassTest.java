package org.j8unit.repository.java.security;

import java.security.ProviderException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ProviderException} (by simply reusing the
 * J8Unit test interface {@link ProviderExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class ProviderExceptionClassTest
implements ProviderExceptionClassTests<ProviderException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.ProviderException]

    @Override
    public Class<ProviderException> createNewSUT() {
        return ProviderException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.ProviderException#ProviderException(Throwable) public
     * java.security.ProviderException(java.lang.Throwable)}.
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
    public void create_ProviderException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ProviderException sut = null; // = new ProviderException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.ProviderException#ProviderException(String, Throwable) public
     * java.security.ProviderException(java.lang.String,java.lang.Throwable)}.
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
    public void create_ProviderException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ProviderException sut = null; // = new ProviderException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.ProviderException#ProviderException(String) public
     * java.security.ProviderException(java.lang.String)}.
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
    public void create_ProviderException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ProviderException sut = null; // = new ProviderException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.ProviderException#ProviderException() public java.security.ProviderException()}.
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
    public void create_ProviderException()
    throws Exception {
        // create new instance
        final ProviderException sut = new ProviderException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.ProviderException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.ProviderException]

}
