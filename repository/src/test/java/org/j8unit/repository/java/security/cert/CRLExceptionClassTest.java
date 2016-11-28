package org.j8unit.repository.java.security.cert;

import java.security.cert.CRLException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CRLException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.cert.CRLExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class CRLExceptionClassTest
implements CRLExceptionClassTests<CRLException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CRLException]

    @Override
    public Class<CRLException> createNewSUT() {
        return CRLException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CRLException#CRLException(Throwable) public
     * java.security.cert.CRLException(java.lang.Throwable)}.
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
    public void create_CRLException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CRLException sut = null; // = new CRLException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CRLException#CRLException(String, Throwable) public
     * java.security.cert.CRLException(java.lang.String,java.lang.Throwable)}.
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
    public void create_CRLException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CRLException sut = null; // = new CRLException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CRLException#CRLException(String) public
     * java.security.cert.CRLException(java.lang.String)}.
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
    public void create_CRLException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CRLException sut = null; // = new CRLException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.security.cert.CRLException#CRLException()
     * public java.security.cert.CRLException()}.
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
    public void create_CRLException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CRLException sut = new CRLException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.CRLException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CRLException]

}
