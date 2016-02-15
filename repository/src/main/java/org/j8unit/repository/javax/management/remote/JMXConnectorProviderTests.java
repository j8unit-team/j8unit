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
 * non-{@code static} methods) of {@linkplain javax.management.remote.JMXConnectorProvider interface
 * javax.management.remote.JMXConnectorProvider}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link JMXConnectorProviderClassTests}.
 * </p>
 *
 * @see javax.management.remote.JMXConnectorProvider interface javax.management.remote.JMXConnectorProvider (the hereby
 *      targeted class-under-test class)
 * @see JMXConnectorProviderClassTests JMXConnectorProviderClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JMXConnectorProviderTests<SUT extends javax.management.remote.JMXConnectorProvider>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.JMXConnectorProvider#newJMXConnector(javax.management.remote.JMXServiceURL, java.util.Map)
     * public abstract javax.management.remote.JMXConnector
     * javax.management.remote.JMXConnectorProvider.newJMXConnector(javax.management.remote.JMXServiceURL,java.util.Map<java.lang.String,
     * ?>) throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.remote.JMXConnectorProvider#newJMXConnector(javax.management.remote.JMXServiceURL, java.util.Map)
     * public abstract javax.management.remote.JMXConnector
     * javax.management.remote.JMXConnectorProvider.newJMXConnector(javax.management.remote.JMXServiceURL,java.util.Map)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXConnectorProvider#newJMXConnector(javax.management.remote.JMXServiceURL,
     *      java.util.Map) public abstract javax.management.remote.JMXConnector
     *      javax.management.remote.JMXConnectorProvider.newJMXConnector(javax.management.remote.JMXServiceURL,java.util
     *      .Map) throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newJMXConnector_JMXServiceURL_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
