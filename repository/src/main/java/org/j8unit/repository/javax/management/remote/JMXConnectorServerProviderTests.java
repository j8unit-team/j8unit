package org.j8unit.repository.javax.management.remote;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.remote.JMXConnectorServerProvider interface
 * javax.management.remote.JMXConnectorServerProvider}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.remote.JMXConnectorServerProviderClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface JMXConnectorServerProviderTests<SUT extends javax.management.remote.JMXConnectorServerProvider>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.JMXConnectorServerProvider#newJMXConnectorServer(javax.management.remote.JMXServiceURL,java.util.Map,javax.management.MBeanServer)
     * public abstract javax.management.remote.JMXConnectorServer
     * javax.management.remote.JMXConnectorServerProvider.newJMXConnectorServer(javax.management.remote.JMXServiceURL,java.util.Map,javax.management.MBeanServer)
     * throws java.io.IOException}.
     * </p>
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
