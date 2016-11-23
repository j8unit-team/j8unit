package org.j8unit.repository.java.security.cert;

import java.security.cert.CertPathBuilderException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CertPathBuilderException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.security.cert.CertPathBuilderExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class CertPathBuilderExceptionClassTest
implements CertPathBuilderExceptionClassTests<CertPathBuilderException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CertPathBuilderException]

    @Override
    public Class<CertPathBuilderException> createNewSUT() {
        return CertPathBuilderException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CertPathBuilderException#CertPathBuilderException(String, Throwable) public
     * java.security.cert.CertPathBuilderException(java.lang.String,java.lang.Throwable)}.
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
    public void create_CertPathBuilderException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertPathBuilderException sut = null; // = new CertPathBuilderException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CertPathBuilderException#CertPathBuilderException(Throwable) public
     * java.security.cert.CertPathBuilderException(java.lang.Throwable)}.
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
    public void create_CertPathBuilderException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertPathBuilderException sut = null; // = new CertPathBuilderException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CertPathBuilderException#CertPathBuilderException(String) public
     * java.security.cert.CertPathBuilderException(java.lang.String)}.
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
    public void create_CertPathBuilderException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertPathBuilderException sut = null; // = new CertPathBuilderException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CertPathBuilderException#CertPathBuilderException() public
     * java.security.cert.CertPathBuilderException()}.
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
    public void create_CertPathBuilderException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertPathBuilderException sut = new CertPathBuilderException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.CertPathBuilderException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CertPathBuilderException]

}
