package org.j8unit.repository.javax.rmi.ssl;

import javax.rmi.ssl.SslRMIServerSocketFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SslRMIServerSocketFactory} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.rmi.ssl.SslRMIServerSocketFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class SslRMIServerSocketFactoryClassTest
implements SslRMIServerSocketFactoryClassTests<SslRMIServerSocketFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.rmi.ssl.SslRMIServerSocketFactory]

    @Override
    public Class<SslRMIServerSocketFactory> createNewSUT() {
        return SslRMIServerSocketFactory.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.rmi.ssl.SslRMIServerSocketFactory#SslRMIServerSocketFactory() public
     * javax.rmi.ssl.SslRMIServerSocketFactory()}.
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
    public void create_SslRMIServerSocketFactory()
    throws Exception {
        // create new instance
        final SslRMIServerSocketFactory sut = new SslRMIServerSocketFactory();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.rmi.ssl.SslRMIServerSocketFactory#SslRMIServerSocketFactory(String[], String[], boolean) public
     * javax.rmi.ssl.SslRMIServerSocketFactory(java.lang.String[],java.lang.String[],boolean) throws
     * java.lang.IllegalArgumentException}.
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
    public void create_SslRMIServerSocketFactory_StringArray_StringArray_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SslRMIServerSocketFactory sut = null; // = new SslRMIServerSocketFactory(String[], String[], boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.rmi.ssl.SslRMIServerSocketFactory#SslRMIServerSocketFactory(javax.net.ssl.SSLContext, String[], String[], boolean)
     * public
     * javax.rmi.ssl.SslRMIServerSocketFactory(javax.net.ssl.SSLContext,java.lang.String[],java.lang.String[],boolean)
     * throws java.lang.IllegalArgumentException}.
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
    public void create_SslRMIServerSocketFactory_SSLContext_StringArray_StringArray_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SslRMIServerSocketFactory sut = null; // = new SslRMIServerSocketFactory(javax.net.ssl.SSLContext,
                                                    // String[], String[], boolean);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.rmi.ssl.SslRMIServerSocketFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.rmi.ssl.SslRMIServerSocketFactory]

}
