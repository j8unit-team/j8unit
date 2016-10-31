package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecurityExceptionClassTest
implements org.j8unit.repository.java.lang.SecurityExceptionClassTests<SecurityException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.SecurityException]

    @Override
    public Class<SecurityException> createNewSUT() {
        return SecurityException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link SecurityException#SecurityException(Throwable)
     * public java.lang.SecurityException(java.lang.Throwable)}.
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
    public void create_SecurityException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SecurityException sut = null; // = new SecurityException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link SecurityException#SecurityException(String, Throwable) public
     * java.lang.SecurityException(java.lang.String,java.lang.Throwable)}.
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
    public void create_SecurityException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SecurityException sut = null; // = new SecurityException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link SecurityException#SecurityException(String)
     * public java.lang.SecurityException(java.lang.String)}.
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
    public void create_SecurityException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SecurityException sut = null; // = new SecurityException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link SecurityException#SecurityException() public
     * java.lang.SecurityException()}.
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
    public void create_SecurityException()
    throws Exception {
        // create new instance
        final SecurityException sut = new SecurityException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.SecurityException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.SecurityException]

}
