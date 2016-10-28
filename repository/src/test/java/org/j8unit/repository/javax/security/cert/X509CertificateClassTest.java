package org.j8unit.repository.javax.security.cert;

import static org.junit.Assert.fail;
import java.io.InputStream;
import javax.security.cert.X509Certificate;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509CertificateClassTest
implements org.j8unit.repository.javax.security.cert.X509CertificateClassTests<X509Certificate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.cert.X509Certificate]

    @Override
    public Class<X509Certificate> createNewSUT() {
        return X509Certificate.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link X509Certificate#X509Certificate() public
     * javax.security.cert.X509Certificate()}.
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
     * Test method for the hereby targeted method-under-test {@link X509Certificate#getInstance(byte[]) public static
     * final javax.security.cert.X509Certificate javax.security.cert.X509Certificate.getInstance(byte[]) throws
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
        // write some test for {@link X509Certificate#getInstance(byte[])}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link X509Certificate#getInstance(InputStream) public
     * static final javax.security.cert.X509Certificate
     * javax.security.cert.X509Certificate.getInstance(java.io.InputStream) throws
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
        // write some test for {@link X509Certificate#getInstance(InputStream)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.cert.X509Certificate]

}
