package org.j8unit.repository.java.rmi.server;

import static org.junit.Assert.fail;
import java.rmi.server.RMISocketFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RMISocketFactory} (by simply reusing the
 * J8Unit test interface {@link RMISocketFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class RMISocketFactoryClassTest
implements RMISocketFactoryClassTests<RMISocketFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.RMISocketFactory]

    @Override
    public Class<RMISocketFactory> createNewSUT() {
        return RMISocketFactory.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.server.RMISocketFactory#RMISocketFactory() public java.rmi.server.RMISocketFactory()}.
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
    public void create_RMISocketFactory()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.rmi.server.RMISocketFactory#getDefaultSocketFactory() public static synchronized
     * java.rmi.server.RMISocketFactory java.rmi.server.RMISocketFactory.getDefaultSocketFactory()}.
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
    public void test_getDefaultSocketFactory()
    throws Exception {
        // write some test for {@link java.rmi.server.RMISocketFactory#getDefaultSocketFactory()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.rmi.server.RMISocketFactory#setSocketFactory(java.rmi.server.RMISocketFactory) public static
     * synchronized void java.rmi.server.RMISocketFactory.setSocketFactory(java.rmi.server.RMISocketFactory) throws
     * java.io.IOException}.
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
    public void test_setSocketFactory_RMISocketFactory()
    throws Exception {
        // write some test for {@link
        // java.rmi.server.RMISocketFactory#setSocketFactory(java.rmi.server.RMISocketFactory)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.rmi.server.RMISocketFactory#setFailureHandler(java.rmi.server.RMIFailureHandler) public static
     * synchronized void java.rmi.server.RMISocketFactory.setFailureHandler(java.rmi.server.RMIFailureHandler)}.
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
    public void test_setFailureHandler_RMIFailureHandler()
    throws Exception {
        // write some test for {@link
        // java.rmi.server.RMISocketFactory#setFailureHandler(java.rmi.server.RMIFailureHandler)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.rmi.server.RMISocketFactory#getFailureHandler()
     * public static synchronized java.rmi.server.RMIFailureHandler
     * java.rmi.server.RMISocketFactory.getFailureHandler()}.
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
    public void test_getFailureHandler()
    throws Exception {
        // write some test for {@link java.rmi.server.RMISocketFactory#getFailureHandler()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.rmi.server.RMISocketFactory#getSocketFactory()
     * public static synchronized java.rmi.server.RMISocketFactory java.rmi.server.RMISocketFactory.getSocketFactory()}.
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
    public void test_getSocketFactory()
    throws Exception {
        // write some test for {@link java.rmi.server.RMISocketFactory#getSocketFactory()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.server.RMISocketFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.RMISocketFactory]

}
