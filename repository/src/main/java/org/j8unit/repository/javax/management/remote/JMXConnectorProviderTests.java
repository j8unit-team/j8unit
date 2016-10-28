package org.j8unit.repository.javax.management.remote;

import java.util.Map;
import javax.management.remote.JMXConnectorProvider;
import javax.management.remote.JMXServiceURL;
import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link JMXConnectorProvider public abstract interface javax.management.remote.JMXConnectorProvider}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.management.remote.JMXConnectorProviderClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JMXConnectorProviderTests<SUT extends JMXConnectorProvider>
extends RepositoryTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.JMXConnectorProvider]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link JMXConnectorProvider#newJMXConnector(JMXServiceURL, Map) public abstract
     * javax.management.remote.JMXConnector
     * javax.management.remote.JMXConnectorProvider.newJMXConnector(javax.management.remote.JMXServiceURL,java.util.Map<java.lang.String,
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
    public default void test_newJMXConnector_JMXServiceURL_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.remote.JMXConnectorProvider]

}
