package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLContext;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SSLContext} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.net.ssl.SSLContextClassTests}).
 */
@RunWith(J8Unit4.class)
public class SSLContextClassTest
implements SSLContextClassTests<SSLContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.SSLContext]

    @Override
    public Class<SSLContext> createNewSUT() {
        return SSLContext.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.net.ssl.SSLContext#getDefault() public static
     * synchronized javax.net.ssl.SSLContext javax.net.ssl.SSLContext.getDefault() throws
     * java.security.NoSuchAlgorithmException}.
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
    public void test_getDefault()
    throws Exception {
        // write some test for {@link javax.net.ssl.SSLContext#getDefault()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.net.ssl.SSLContext#getInstance(String, String)
     * public static javax.net.ssl.SSLContext javax.net.ssl.SSLContext.getInstance(java.lang.String,java.lang.String)
     * throws java.security.NoSuchAlgorithmException,java.security.NoSuchProviderException}.
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
        // write some test for {@link javax.net.ssl.SSLContext#getInstance(String, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.net.ssl.SSLContext#getInstance(String) public
     * static javax.net.ssl.SSLContext javax.net.ssl.SSLContext.getInstance(java.lang.String) throws
     * java.security.NoSuchAlgorithmException}.
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
        // write some test for {@link javax.net.ssl.SSLContext#getInstance(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.net.ssl.SSLContext#getInstance(String, java.security.Provider) public static
     * javax.net.ssl.SSLContext javax.net.ssl.SSLContext.getInstance(java.lang.String,java.security.Provider) throws
     * java.security.NoSuchAlgorithmException}.
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
        // write some test for {@link javax.net.ssl.SSLContext#getInstance(String, java.security.Provider)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.net.ssl.SSLContext#setDefault(javax.net.ssl.SSLContext) public static synchronized void
     * javax.net.ssl.SSLContext.setDefault(javax.net.ssl.SSLContext)}.
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
    public void test_setDefault_SSLContext()
    throws Exception {
        // write some test for {@link javax.net.ssl.SSLContext#setDefault(javax.net.ssl.SSLContext)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.SSLContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.SSLContext]

}
