package org.j8unit.repository.java.security.cert;

import java.security.cert.CertificateFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CertificateFactory} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.security.cert.CertificateFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class CertificateFactoryClassTest
implements CertificateFactoryClassTests<CertificateFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CertificateFactory]

    @Override
    public Class<CertificateFactory> createNewSUT() {
        return CertificateFactory.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.cert.CertificateFactory#getInstance(String, String) public static final
     * java.security.cert.CertificateFactory
     * java.security.cert.CertificateFactory.getInstance(java.lang.String,java.lang.String) throws
     * java.security.cert.CertificateException,java.security.NoSuchProviderException}.
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
    public void test_getInstance_String_String()
    throws Exception {
        // write some test for {@link java.security.cert.CertificateFactory#getInstance(String, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.cert.CertificateFactory#getInstance(String, java.security.Provider) public static final
     * java.security.cert.CertificateFactory
     * java.security.cert.CertificateFactory.getInstance(java.lang.String,java.security.Provider) throws
     * java.security.cert.CertificateException}.
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
    public void test_getInstance_String_Provider()
    throws Exception {
        // write some test for {@link java.security.cert.CertificateFactory#getInstance(String, java.security.Provider)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.cert.CertificateFactory#getInstance(String) public static final
     * java.security.cert.CertificateFactory java.security.cert.CertificateFactory.getInstance(java.lang.String) throws
     * java.security.cert.CertificateException}.
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
    public void test_getInstance_String()
    throws Exception {
        // write some test for {@link java.security.cert.CertificateFactory#getInstance(String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.CertificateFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CertificateFactory]

}
