package org.j8unit.repository.javax.rmi.ssl;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SslRMIClientSocketFactory} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.rmi.ssl.SslRMIClientSocketFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class SslRMIClientSocketFactoryClassTest
implements SslRMIClientSocketFactoryClassTests<SslRMIClientSocketFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.rmi.ssl.SslRMIClientSocketFactory]

    @Override
    public Class<SslRMIClientSocketFactory> createNewSUT() {
        return SslRMIClientSocketFactory.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.rmi.ssl.SslRMIClientSocketFactory#SslRMIClientSocketFactory() public
     * javax.rmi.ssl.SslRMIClientSocketFactory()}.
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
    public void create_SslRMIClientSocketFactory()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SslRMIClientSocketFactory sut = new SslRMIClientSocketFactory();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.rmi.ssl.SslRMIClientSocketFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.rmi.ssl.SslRMIClientSocketFactory]

}
