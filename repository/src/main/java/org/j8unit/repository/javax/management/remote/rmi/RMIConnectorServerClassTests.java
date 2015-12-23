package org.j8unit.repository.javax.management.remote.rmi;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.remote.rmi.RMIConnectorServer class
 * javax.management.remote.rmi.RMIConnectorServer}, containing all class relevant test methods (at least the test
 * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
 * containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.management.remote.rmi.RMIConnectorServerTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable
 * test method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.remote.rmi.RMIConnectorServerTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.remote.rmi.RMIConnectorServer
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RMIConnectorServerClassTests<SUT extends javax.management.remote.rmi.RMIConnectorServer>
extends org.j8unit.repository.javax.management.remote.JMXConnectorServerClassTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectorServer#RMIConnectorServer(javax.management.remote.JMXServiceURL, java.util.Map)
     * public javax.management.remote.rmi.RMIConnectorServer(javax.management.remote.JMXServiceURL,java.util.Map) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.remote.rmi.RMIConnectorServer#RMIConnectorServer(javax.management.remote.
     *             JMXServiceURL, java.util.Map)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_RMIConnectorServer_JMXServiceURL_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.remote.rmi.RMIConnectorServer sut = null; // = new
                                                                         // RMIConnectorServer(javax.management.remote.JMXServiceURL,
                                                                         // java.util.Map);
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectorServer#RMIConnectorServer(javax.management.remote.JMXServiceURL, java.util.Map, javax.management.MBeanServer)
     * public
     * javax.management.remote.rmi.RMIConnectorServer(javax.management.remote.JMXServiceURL,java.util.Map,javax.management.MBeanServer)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.remote.rmi.RMIConnectorServer#RMIConnectorServer(javax.management.remote.
     *             JMXServiceURL, java.util.Map, javax.management.MBeanServer)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_RMIConnectorServer_JMXServiceURL_Map_MBeanServer()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.remote.rmi.RMIConnectorServer sut = null; // = new
                                                                         // RMIConnectorServer(javax.management.remote.JMXServiceURL,
                                                                         // java.util.Map,
                                                                         // javax.management.MBeanServer);
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectorServer#RMIConnectorServer(javax.management.remote.JMXServiceURL, java.util.Map, javax.management.remote.rmi.RMIServerImpl, javax.management.MBeanServer)
     * public
     * javax.management.remote.rmi.RMIConnectorServer(javax.management.remote.JMXServiceURL,java.util.Map,javax.management.remote.rmi.RMIServerImpl,javax.management.MBeanServer)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.remote.rmi.RMIConnectorServer#RMIConnectorServer(javax.management.remote.
     *             JMXServiceURL, java.util.Map, javax.management.remote.rmi.RMIServerImpl,
     *             javax.management.MBeanServer)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_RMIConnectorServer_JMXServiceURL_Map_RMIServerImpl_MBeanServer()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.remote.rmi.RMIConnectorServer sut = null; // = new
                                                                         // RMIConnectorServer(javax.management.remote.JMXServiceURL,
                                                                         // java.util.Map,
                                                                         // javax.management.remote.rmi.RMIServerImpl,
                                                                         // javax.management.MBeanServer);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.management.remote.rmi.RMIConnectorServer#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.management.remote.rmi.RMIConnectorServer.class.isAssignableFrom(sut));
    }

}
