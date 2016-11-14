package org.j8unit.repository.javax.management.remote.rmi;

import javax.management.remote.rmi.RMIConnectorServer;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RMIConnectorServer} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.remote.rmi.RMIConnectorServerClassTests}).
 */

@RunWith(J8Unit4.class)
public class RMIConnectorServerClassTest
implements RMIConnectorServerClassTests<RMIConnectorServer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.rmi.RMIConnectorServer]

    @Override
    public Class<RMIConnectorServer> createNewSUT() {
        return RMIConnectorServer.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.remote.rmi.RMIConnectorServer#RMIConnectorServer(javax.management.remote.JMXServiceURL, java.util.Map, javax.management.remote.rmi.RMIServerImpl, javax.management.MBeanServer)
     * public
     * javax.management.remote.rmi.RMIConnectorServer(javax.management.remote.JMXServiceURL,java.util.Map<java.lang.String,
     * ?>,javax.management.remote.rmi.RMIServerImpl,javax.management.MBeanServer) throws java.io.IOException}.
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
    public void create_RMIConnectorServer_JMXServiceURL_Map_RMIServerImpl_MBeanServer()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RMIConnectorServer sut = null; // = new RMIConnectorServer(javax.management.remote.JMXServiceURL,
                                             // java.util.Map, javax.management.remote.rmi.RMIServerImpl,
                                             // javax.management.MBeanServer);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.remote.rmi.RMIConnectorServer#RMIConnectorServer(javax.management.remote.JMXServiceURL, java.util.Map, javax.management.MBeanServer)
     * public
     * javax.management.remote.rmi.RMIConnectorServer(javax.management.remote.JMXServiceURL,java.util.Map<java.lang.String,
     * ?>,javax.management.MBeanServer) throws java.io.IOException}.
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
    public void create_RMIConnectorServer_JMXServiceURL_Map_MBeanServer()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RMIConnectorServer sut = null; // = new RMIConnectorServer(javax.management.remote.JMXServiceURL,
                                             // java.util.Map, javax.management.MBeanServer);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.remote.rmi.RMIConnectorServer#RMIConnectorServer(javax.management.remote.JMXServiceURL, java.util.Map)
     * public
     * javax.management.remote.rmi.RMIConnectorServer(javax.management.remote.JMXServiceURL,java.util.Map<java.lang.String,
     * ?>) throws java.io.IOException}.
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
    public void create_RMIConnectorServer_JMXServiceURL_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RMIConnectorServer sut = null; // = new RMIConnectorServer(javax.management.remote.JMXServiceURL,
                                             // java.util.Map);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.rmi.RMIConnectorServer]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.rmi.RMIConnectorServer]

}
