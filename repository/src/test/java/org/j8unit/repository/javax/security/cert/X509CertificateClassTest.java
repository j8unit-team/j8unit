package org.j8unit.repository.javax.security.cert;

import static org.junit.Assert.fail;
import javax.security.cert.X509Certificate;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link X509Certificate} (by simply reusing the
 * J8Unit test interface {@link X509CertificateClassTests}).
 */

@RunWith(J8Unit4.class)
public class X509CertificateClassTest
implements X509CertificateClassTests<X509Certificate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.cert.X509Certificate]

    @Override
    public Class<X509Certificate> createNewSUT() {
        return X509Certificate.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.cert.X509Certificate#X509Certificate() public javax.security.cert.X509Certificate()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_X509Certificate()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.security.cert.X509Certificate#getInstance(byte[]) public static final
     * javax.security.cert.X509Certificate javax.security.cert.X509Certificate.getInstance(byte[]) throws
     * javax.security.cert.CertificateException}.
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
    public void test_getInstance_byteArray()
    throws Exception {
        // write some test for {@link javax.security.cert.X509Certificate#getInstance(byte[])}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.security.cert.X509Certificate#getInstance(java.io.InputStream) public static final
     * javax.security.cert.X509Certificate javax.security.cert.X509Certificate.getInstance(java.io.InputStream) throws
     * javax.security.cert.CertificateException}.
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
    public void test_getInstance_InputStream()
    throws Exception {
        // write some test for {@link javax.security.cert.X509Certificate#getInstance(java.io.InputStream)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.cert.X509Certificate]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.cert.X509Certificate]

}
