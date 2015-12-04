package org.j8unit.repository.javax.management.remote;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.remote.JMXConnector interface javax.management.remote.JMXConnector},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.remote.JMXConnectorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface JMXConnectorTests<SUT extends javax.management.remote.JMXConnector>
extends org.j8unit.repository.java.io.CloseableTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.remote.JMXConnector#close() public abstract void
     * javax.management.remote.JMXConnector.close() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
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
     * </p>
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
     * </p>
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
     * javax.management.remote.JMXConnector.connect(java.util.Map) throws java.io.IOException}.
     * </p>
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
     * {@link javax.management.remote.JMXConnector#removeConnectionNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * public abstract void
     * javax.management.remote.JMXConnector.removeConnectionNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * throws javax.management.ListenerNotFoundException}.
     * </p>
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
     * </p>
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
     * {@link javax.management.remote.JMXConnector#addConnectionNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * public abstract void
     * javax.management.remote.JMXConnector.addConnectionNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)}
     * .
     * </p>
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
     * Test method for {@link javax.management.remote.JMXConnector#getMBeanServerConnection() public abstract
     * javax.management.MBeanServerConnection javax.management.remote.JMXConnector.getMBeanServerConnection() throws
     * java.io.IOException}.
     * </p>
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

    /**
     * <p>
     * Test method for {@link javax.management.remote.JMXConnector#getMBeanServerConnection(javax.security.auth.Subject)
     * public abstract javax.management.MBeanServerConnection
     * javax.management.remote.JMXConnector.getMBeanServerConnection(javax.security.auth.Subject) throws
     * java.io.IOException}.
     * </p>
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

}
