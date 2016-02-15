package org.j8unit.repository.javax.management.remote;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.remote.JMXConnectorServerProvider interface
 * javax.management.remote.JMXConnectorServerProvider}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link JMXConnectorServerProviderClassTests}.
 * </p>
 *
 * @see javax.management.remote.JMXConnectorServerProvider interface javax.management.remote.JMXConnectorServerProvider
 *      (the hereby targeted class-under-test class)
 * @see JMXConnectorServerProviderClassTests JMXConnectorServerProviderClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JMXConnectorServerProviderTests<SUT extends javax.management.remote.JMXConnectorServerProvider>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.JMXConnectorServerProvider#newJMXConnectorServer(javax.management.remote.JMXServiceURL, java.util.Map, javax.management.MBeanServer)
     * public abstract javax.management.remote.JMXConnectorServer
     * javax.management.remote.JMXConnectorServerProvider.newJMXConnectorServer(javax.management.remote.JMXServiceURL,java.util.Map<java.lang.String,
     * ?>,javax.management.MBeanServer) throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.remote.JMXConnectorServerProvider#newJMXConnectorServer(javax.management.remote.JMXServiceURL, java.util.Map, javax.management.MBeanServer)
     * public abstract javax.management.remote.JMXConnectorServer
     * javax.management.remote.JMXConnectorServerProvider.newJMXConnectorServer(javax.management.remote.JMXServiceURL,java.util.Map,javax.management.MBeanServer)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXConnectorServerProvider#newJMXConnectorServer(javax.management.remote.JMXServiceURL,
     *      java.util.Map, javax.management.MBeanServer) public abstract javax.management.remote.JMXConnectorServer
     *      javax.management.remote.JMXConnectorServerProvider.newJMXConnectorServer(javax.management.remote.
     *      JMXServiceURL,java.util.Map,javax.management.MBeanServer) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newJMXConnectorServer_JMXServiceURL_Map_MBeanServer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
