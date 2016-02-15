package org.j8unit.repository.javax.management.remote;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.remote.JMXConnectorServer class
 * javax.management.remote.JMXConnectorServer}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link JMXConnectorServerClassTests}.
 * </p>
 *
 * @see javax.management.remote.JMXConnectorServer class javax.management.remote.JMXConnectorServer (the hereby targeted
 *      class-under-test class)
 * @see JMXConnectorServerClassTests JMXConnectorServerClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JMXConnectorServerTests<SUT extends javax.management.remote.JMXConnectorServer>
extends JMXConnectorServerMBeanTests<SUT>, org.j8unit.repository.javax.management.MBeanRegistrationTests<SUT>, JMXAddressableTests<SUT>,
org.j8unit.repository.javax.management.NotificationBroadcasterSupportTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.remote.JMXConnectorServer#getConnectionIds() public java.lang.String[]
     * javax.management.remote.JMXConnectorServer.getConnectionIds()}.
     *
     * <p>
     * Test method for {@link javax.management.remote.JMXConnectorServer#getConnectionIds() public java.lang.String[]
     * javax.management.remote.JMXConnectorServer.getConnectionIds()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXConnectorServer#getConnectionIds() public java.lang.String[]
     *      javax.management.remote.JMXConnectorServer.getConnectionIds() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getConnectionIds()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.JMXConnectorServer#preRegister(javax.management.MBeanServer, javax.management.ObjectName)
     * public synchronized javax.management.ObjectName
     * javax.management.remote.JMXConnectorServer.preRegister(javax.management.MBeanServer,javax.management.ObjectName)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.management.remote.JMXConnectorServer#preRegister(javax.management.MBeanServer, javax.management.ObjectName)
     * public synchronized javax.management.ObjectName
     * javax.management.remote.JMXConnectorServer.preRegister(javax.management.MBeanServer,javax.management.ObjectName)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXConnectorServer#preRegister(javax.management.MBeanServer,
     *      javax.management.ObjectName) public synchronized javax.management.ObjectName
     *      javax.management.remote.JMXConnectorServer.preRegister(javax.management.MBeanServer,javax.management.
     *      ObjectName) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_preRegister_MBeanServer_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.JMXConnectorServer#getNotificationInfo() public
     * javax.management.MBeanNotificationInfo[] javax.management.remote.JMXConnectorServer.getNotificationInfo()}.
     *
     * <p>
     * Test method for {@link javax.management.remote.JMXConnectorServer#getNotificationInfo() public
     * javax.management.MBeanNotificationInfo[] javax.management.remote.JMXConnectorServer.getNotificationInfo()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXConnectorServer#getNotificationInfo() public
     *      javax.management.MBeanNotificationInfo[] javax.management.remote.JMXConnectorServer.getNotificationInfo()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getNotificationInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.JMXConnectorServer#toJMXConnector(java.util.Map) public
     * javax.management.remote.JMXConnector
     * javax.management.remote.JMXConnectorServer.toJMXConnector(java.util.Map<java.lang.String, ?>) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.remote.JMXConnectorServer#toJMXConnector(java.util.Map) public
     * javax.management.remote.JMXConnector javax.management.remote.JMXConnectorServer.toJMXConnector(java.util.Map)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXConnectorServer#toJMXConnector(java.util.Map) public
     *      javax.management.remote.JMXConnector
     *      javax.management.remote.JMXConnectorServer.toJMXConnector(java.util.Map) throws java.io.IOException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toJMXConnector_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.JMXConnectorServer#postRegister(Boolean) public void
     * javax.management.remote.JMXConnectorServer.postRegister(java.lang.Boolean)}.
     *
     * <p>
     * Test method for {@link javax.management.remote.JMXConnectorServer#postRegister(Boolean) public void
     * javax.management.remote.JMXConnectorServer.postRegister(java.lang.Boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXConnectorServer#postRegister(Boolean) public void
     *      javax.management.remote.JMXConnectorServer.postRegister(java.lang.Boolean) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_postRegister_Boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.JMXConnectorServer#getMBeanServer() public synchronized
     * javax.management.MBeanServer javax.management.remote.JMXConnectorServer.getMBeanServer()}.
     *
     * <p>
     * Test method for {@link javax.management.remote.JMXConnectorServer#getMBeanServer() public synchronized
     * javax.management.MBeanServer javax.management.remote.JMXConnectorServer.getMBeanServer()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXConnectorServer#getMBeanServer() public synchronized javax.management.MBeanServer
     *      javax.management.remote.JMXConnectorServer.getMBeanServer() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMBeanServer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.JMXConnectorServer#postDeregister() public void
     * javax.management.remote.JMXConnectorServer.postDeregister()}.
     *
     * <p>
     * Test method for {@link javax.management.remote.JMXConnectorServer#postDeregister() public void
     * javax.management.remote.JMXConnectorServer.postDeregister()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXConnectorServer#postDeregister() public void
     *      javax.management.remote.JMXConnectorServer.postDeregister() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_postDeregister()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.JMXConnectorServer#preDeregister() public synchronized void
     * javax.management.remote.JMXConnectorServer.preDeregister() throws java.lang.Exception}.
     *
     * <p>
     * Test method for {@link javax.management.remote.JMXConnectorServer#preDeregister() public synchronized void
     * javax.management.remote.JMXConnectorServer.preDeregister() throws java.lang.Exception}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXConnectorServer#preDeregister() public synchronized void
     *      javax.management.remote.JMXConnectorServer.preDeregister() throws java.lang.Exception (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_preDeregister()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.JMXConnectorServer#setMBeanServerForwarder(javax.management.remote.MBeanServerForwarder)
     * public synchronized void
     * javax.management.remote.JMXConnectorServer.setMBeanServerForwarder(javax.management.remote.MBeanServerForwarder)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.management.remote.JMXConnectorServer#setMBeanServerForwarder(javax.management.remote.MBeanServerForwarder)
     * public synchronized void
     * javax.management.remote.JMXConnectorServer.setMBeanServerForwarder(javax.management.remote.MBeanServerForwarder)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXConnectorServer#setMBeanServerForwarder(javax.management.remote.MBeanServerForwarder)
     *      public synchronized void
     *      javax.management.remote.JMXConnectorServer.setMBeanServerForwarder(javax.management.remote.
     *      MBeanServerForwarder) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setMBeanServerForwarder_MBeanServerForwarder()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.management.remote.JMXConnectorServerMBean#getAddress() interface
     * javax.management.remote.JMXConnectorServerMBean}</li>
     * <li>{@linkplain javax.management.remote.JMXAddressable#getAddress() interface
     * javax.management.remote.JMXAddressable}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAddress()
    throws Exception {
    }

}
