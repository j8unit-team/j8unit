package org.j8unit.repository.javax.management.remote.rmi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.remote.rmi.RMIConnector class
 * javax.management.remote.rmi.RMIConnector}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link RMIConnectorClassTests}.
 * </p>
 *
 * @see javax.management.remote.rmi.RMIConnector class javax.management.remote.rmi.RMIConnector (the hereby targeted
 *      class-under-test class)
 * @see RMIConnectorClassTests RMIConnectorClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RMIConnectorTests<SUT extends javax.management.remote.rmi.RMIConnector>
extends org.j8unit.repository.javax.management.remote.JMXConnectorTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.javax.management.remote.JMXAddressableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnector#removeConnectionNotificationListener(javax.management.NotificationListener)
     * public void
     * javax.management.remote.rmi.RMIConnector.removeConnectionNotificationListener(javax.management.NotificationListener)
     * throws javax.management.ListenerNotFoundException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnector#removeConnectionNotificationListener(javax.management.NotificationListener)
     * public void
     * javax.management.remote.rmi.RMIConnector.removeConnectionNotificationListener(javax.management.NotificationListener)
     * throws javax.management.ListenerNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.rmi.RMIConnector#removeConnectionNotificationListener(javax.management.NotificationListener)
     *      public void javax.management.remote.rmi.RMIConnector.removeConnectionNotificationListener(javax.management.
     *      NotificationListener) throws javax.management.ListenerNotFoundException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeConnectionNotificationListener_NotificationListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnector#removeConnectionNotificationListener(javax.management.NotificationListener, javax.management.NotificationFilter, Object)
     * public void
     * javax.management.remote.rmi.RMIConnector.removeConnectionNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * throws javax.management.ListenerNotFoundException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnector#removeConnectionNotificationListener(javax.management.NotificationListener, javax.management.NotificationFilter, Object)
     * public void
     * javax.management.remote.rmi.RMIConnector.removeConnectionNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * throws javax.management.ListenerNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.rmi.RMIConnector#removeConnectionNotificationListener(javax.management.NotificationListener,
     *      javax.management.NotificationFilter, Object) public void
     *      javax.management.remote.rmi.RMIConnector.removeConnectionNotificationListener(javax.management.
     *      NotificationListener,javax.management.NotificationFilter,java.lang.Object) throws
     *      javax.management.ListenerNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeConnectionNotificationListener_NotificationListener_NotificationFilter_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnector#toString() public java.lang.String
     * javax.management.remote.rmi.RMIConnector.toString()}.
     *
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnector#toString() public java.lang.String
     * javax.management.remote.rmi.RMIConnector.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.rmi.RMIConnector#toString() public java.lang.String
     *      javax.management.remote.rmi.RMIConnector.toString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnector#getAddress() public
     * javax.management.remote.JMXServiceURL javax.management.remote.rmi.RMIConnector.getAddress()}.
     *
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnector#getAddress() public
     * javax.management.remote.JMXServiceURL javax.management.remote.rmi.RMIConnector.getAddress()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.rmi.RMIConnector#getAddress() public javax.management.remote.JMXServiceURL
     *      javax.management.remote.rmi.RMIConnector.getAddress() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAddress()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnector#close() public synchronized void
     * javax.management.remote.rmi.RMIConnector.close() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnector#close() public synchronized void
     * javax.management.remote.rmi.RMIConnector.close() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.rmi.RMIConnector#close() public synchronized void
     *      javax.management.remote.rmi.RMIConnector.close() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnector#getConnectionId() public synchronized
     * java.lang.String javax.management.remote.rmi.RMIConnector.getConnectionId() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnector#getConnectionId() public synchronized
     * java.lang.String javax.management.remote.rmi.RMIConnector.getConnectionId() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.rmi.RMIConnector#getConnectionId() public synchronized java.lang.String
     *      javax.management.remote.rmi.RMIConnector.getConnectionId() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getConnectionId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnector#connect() public void
     * javax.management.remote.rmi.RMIConnector.connect() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnector#connect() public void
     * javax.management.remote.rmi.RMIConnector.connect() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.rmi.RMIConnector#connect() public void
     *      javax.management.remote.rmi.RMIConnector.connect() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_connect()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnector#connect(java.util.Map) public synchronized void
     * javax.management.remote.rmi.RMIConnector.connect(java.util.Map<java.lang.String, ?>) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnector#connect(java.util.Map) public synchronized void
     * javax.management.remote.rmi.RMIConnector.connect(java.util.Map) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.rmi.RMIConnector#connect(java.util.Map) public synchronized void
     *      javax.management.remote.rmi.RMIConnector.connect(java.util.Map) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_connect_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnector#addConnectionNotificationListener(javax.management.NotificationListener, javax.management.NotificationFilter, Object)
     * public void
     * javax.management.remote.rmi.RMIConnector.addConnectionNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnector#addConnectionNotificationListener(javax.management.NotificationListener, javax.management.NotificationFilter, Object)
     * public void
     * javax.management.remote.rmi.RMIConnector.addConnectionNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.rmi.RMIConnector#addConnectionNotificationListener(javax.management.NotificationListener,
     *      javax.management.NotificationFilter, Object) public void
     *      javax.management.remote.rmi.RMIConnector.addConnectionNotificationListener(javax.management.
     *      NotificationListener,javax.management.NotificationFilter,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addConnectionNotificationListener_NotificationListener_NotificationFilter_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnector#getMBeanServerConnection() public synchronized
     * javax.management.MBeanServerConnection javax.management.remote.rmi.RMIConnector.getMBeanServerConnection() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnector#getMBeanServerConnection() public synchronized
     * javax.management.MBeanServerConnection javax.management.remote.rmi.RMIConnector.getMBeanServerConnection() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.rmi.RMIConnector#getMBeanServerConnection() public synchronized
     *      javax.management.MBeanServerConnection javax.management.remote.rmi.RMIConnector.getMBeanServerConnection()
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMBeanServerConnection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnector#getMBeanServerConnection(javax.security.auth.Subject) public
     * synchronized javax.management.MBeanServerConnection
     * javax.management.remote.rmi.RMIConnector.getMBeanServerConnection(javax.security.auth.Subject) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnector#getMBeanServerConnection(javax.security.auth.Subject) public
     * synchronized javax.management.MBeanServerConnection
     * javax.management.remote.rmi.RMIConnector.getMBeanServerConnection(javax.security.auth.Subject) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.rmi.RMIConnector#getMBeanServerConnection(javax.security.auth.Subject) public
     *      synchronized javax.management.MBeanServerConnection
     *      javax.management.remote.rmi.RMIConnector.getMBeanServerConnection(javax.security.auth.Subject) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMBeanServerConnection_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
