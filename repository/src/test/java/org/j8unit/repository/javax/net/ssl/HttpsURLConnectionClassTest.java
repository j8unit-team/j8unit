package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.HttpsURLConnection;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HttpsURLConnection} (by simply reusing
 * the J8Unit test interface {@link HttpsURLConnectionClassTests}).
 */

@RunWith(J8Unit4.class)
public class HttpsURLConnectionClassTest
implements HttpsURLConnectionClassTests<HttpsURLConnection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.HttpsURLConnection]

    @Override
    public Class<HttpsURLConnection> createNewSUT() {
        return HttpsURLConnection.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.net.ssl.HttpsURLConnection#getDefaultSSLSocketFactory() public static javax.net.ssl.SSLSocketFactory
     * javax.net.ssl.HttpsURLConnection.getDefaultSSLSocketFactory()}.
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
    public void test_getDefaultSSLSocketFactory()
    throws Exception {
        // write some test for {@link javax.net.ssl.HttpsURLConnection#getDefaultSSLSocketFactory()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.net.ssl.HttpsURLConnection#setDefaultHostnameVerifier(javax.net.ssl.HostnameVerifier) public static
     * void javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(javax.net.ssl.HostnameVerifier)}.
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
    public void test_setDefaultHostnameVerifier_HostnameVerifier()
    throws Exception {
        // write some test for {@link
        // javax.net.ssl.HttpsURLConnection#setDefaultHostnameVerifier(javax.net.ssl.HostnameVerifier)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.net.ssl.HttpsURLConnection#setDefaultSSLSocketFactory(javax.net.ssl.SSLSocketFactory) public static
     * void javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(javax.net.ssl.SSLSocketFactory)}.
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
    public void test_setDefaultSSLSocketFactory_SSLSocketFactory()
    throws Exception {
        // write some test for {@link
        // javax.net.ssl.HttpsURLConnection#setDefaultSSLSocketFactory(javax.net.ssl.SSLSocketFactory)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.net.ssl.HttpsURLConnection#getDefaultHostnameVerifier() public static javax.net.ssl.HostnameVerifier
     * javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()}.
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
    public void test_getDefaultHostnameVerifier()
    throws Exception {
        // write some test for {@link javax.net.ssl.HttpsURLConnection#getDefaultHostnameVerifier()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.HttpsURLConnection]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.HttpsURLConnection]

}
