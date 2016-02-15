package org.j8unit.repository.javax.management.remote;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.remote.JMXConnector interface
 * javax.management.remote.JMXConnector}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link JMXConnectorClassTests}.
 * </p>
 *
 * @see javax.management.remote.JMXConnector interface javax.management.remote.JMXConnector (the hereby targeted
 *      class-under-test class)
 * @see JMXConnectorClassTests JMXConnectorClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JMXConnectorTests<SUT extends javax.management.remote.JMXConnector>
extends org.j8unit.repository.java.io.CloseableTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.remote.JMXConnector#close() public abstract void
     * javax.management.remote.JMXConnector.close() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.remote.JMXConnector#close() public abstract void
     * javax.management.remote.JMXConnector.close() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXConnector#close() public abstract void
     *      javax.management.remote.JMXConnector.close() throws java.io.IOException (the hereby targeted
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
     * Test method for {@link javax.management.remote.JMXConnector#getConnectionId() public abstract java.lang.String
     * javax.management.remote.JMXConnector.getConnectionId() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.remote.JMXConnector#getConnectionId() public abstract java.lang.String
     * javax.management.remote.JMXConnector.getConnectionId() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXConnector#getConnectionId() public abstract java.lang.String
     *      javax.management.remote.JMXConnector.getConnectionId() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.management.remote.JMXConnector#connect() public abstract void
     * javax.management.remote.JMXConnector.connect() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.remote.JMXConnector#connect() public abstract void
     * javax.management.remote.JMXConnector.connect() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXConnector#connect() public abstract void
     *      javax.management.remote.JMXConnector.connect() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.management.remote.JMXConnector#connect(java.util.Map) public abstract void
     * javax.management.remote.JMXConnector.connect(java.util.Map<java.lang.String, ?>) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.remote.JMXConnector#connect(java.util.Map) public abstract void
     * javax.management.remote.JMXConnector.connect(java.util.Map) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXConnector#connect(java.util.Map) public abstract void
     *      javax.management.remote.JMXConnector.connect(java.util.Map) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * {@link javax.management.remote.JMXConnector#removeConnectionNotificationListener(javax.management.NotificationListener, javax.management.NotificationFilter, Object)
     * public abstract void
     * javax.management.remote.JMXConnector.removeConnectionNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * throws javax.management.ListenerNotFoundException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.remote.JMXConnector#removeConnectionNotificationListener(javax.management.NotificationListener, javax.management.NotificationFilter, Object)
     * public abstract void
     * javax.management.remote.JMXConnector.removeConnectionNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * throws javax.management.ListenerNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXConnector#removeConnectionNotificationListener(javax.management.NotificationListener,
     *      javax.management.NotificationFilter, Object) public abstract void
     *      javax.management.remote.JMXConnector.removeConnectionNotificationListener(javax.management.
     *      NotificationListener,javax.management.NotificationFilter,java.lang.Object) throws
     *      javax.management.ListenerNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for
     * {@link javax.management.remote.JMXConnector#removeConnectionNotificationListener(javax.management.NotificationListener)
     * public abstract void
     * javax.management.remote.JMXConnector.removeConnectionNotificationListener(javax.management.NotificationListener)
     * throws javax.management.ListenerNotFoundException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.remote.JMXConnector#removeConnectionNotificationListener(javax.management.NotificationListener)
     * public abstract void
     * javax.management.remote.JMXConnector.removeConnectionNotificationListener(javax.management.NotificationListener)
     * throws javax.management.ListenerNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXConnector#removeConnectionNotificationListener(javax.management.NotificationListener)
     *      public abstract void
     *      javax.management.remote.JMXConnector.removeConnectionNotificationListener(javax.management.
     *      NotificationListener) throws javax.management.ListenerNotFoundException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * {@link javax.management.remote.JMXConnector#addConnectionNotificationListener(javax.management.NotificationListener, javax.management.NotificationFilter, Object)
     * public abstract void
     * javax.management.remote.JMXConnector.addConnectionNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.management.remote.JMXConnector#addConnectionNotificationListener(javax.management.NotificationListener, javax.management.NotificationFilter, Object)
     * public abstract void
     * javax.management.remote.JMXConnector.addConnectionNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXConnector#addConnectionNotificationListener(javax.management.NotificationListener,
     *      javax.management.NotificationFilter, Object) public abstract void
     *      javax.management.remote.JMXConnector.addConnectionNotificationListener(javax.management.NotificationListener
     *      ,javax.management.NotificationFilter,java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.management.remote.JMXConnector#getMBeanServerConnection(javax.security.auth.Subject)
     * public abstract javax.management.MBeanServerConnection
     * javax.management.remote.JMXConnector.getMBeanServerConnection(javax.security.auth.Subject) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.remote.JMXConnector#getMBeanServerConnection(javax.security.auth.Subject)
     * public abstract javax.management.MBeanServerConnection
     * javax.management.remote.JMXConnector.getMBeanServerConnection(javax.security.auth.Subject) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXConnector#getMBeanServerConnection(javax.security.auth.Subject) public abstract
     *      javax.management.MBeanServerConnection
     *      javax.management.remote.JMXConnector.getMBeanServerConnection(javax.security.auth.Subject) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMBeanServerConnection_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.JMXConnector#getMBeanServerConnection() public abstract
     * javax.management.MBeanServerConnection javax.management.remote.JMXConnector.getMBeanServerConnection() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.remote.JMXConnector#getMBeanServerConnection() public abstract
     * javax.management.MBeanServerConnection javax.management.remote.JMXConnector.getMBeanServerConnection() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXConnector#getMBeanServerConnection() public abstract
     *      javax.management.MBeanServerConnection javax.management.remote.JMXConnector.getMBeanServerConnection()
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMBeanServerConnection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
