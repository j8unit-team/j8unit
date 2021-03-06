package org.j8unit.repository.javax.management.remote;

import static org.junit.Assert.fail;
import javax.management.remote.JMXConnectorServer;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JMXConnectorServer} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.remote.JMXConnectorServerClassTests}).
 */
@RunWith(J8Unit4.class)
public class JMXConnectorServerClassTest
implements JMXConnectorServerClassTests<JMXConnectorServer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.JMXConnectorServer]

    @Override
    public Class<JMXConnectorServer> createNewSUT() {
        return JMXConnectorServer.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.remote.JMXConnectorServer#JMXConnectorServer() public
     * javax.management.remote.JMXConnectorServer()}.
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
    public void create_JMXConnectorServer()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.remote.JMXConnectorServer#JMXConnectorServer(javax.management.MBeanServer) public
     * javax.management.remote.JMXConnectorServer(javax.management.MBeanServer)}.
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
    public void create_JMXConnectorServer_MBeanServer()
    throws Exception {
        Assert.fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.JMXConnectorServer]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.JMXConnectorServer]

}
