package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.MBeanServerDelegate class
 * javax.management.MBeanServerDelegate}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link MBeanServerDelegateClassTests}.
 * </p>
 *
 * @see javax.management.MBeanServerDelegate class javax.management.MBeanServerDelegate (the hereby targeted
 *      class-under-test class)
 * @see MBeanServerDelegateClassTests MBeanServerDelegateClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MBeanServerDelegateTests<SUT extends javax.management.MBeanServerDelegate>
extends MBeanServerDelegateMBeanTests<SUT>, NotificationEmitterTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerDelegate#addNotificationListener(javax.management.NotificationListener, javax.management.NotificationFilter, Object)
     * public synchronized void
     * javax.management.MBeanServerDelegate.addNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * throws java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerDelegate#addNotificationListener(javax.management.NotificationListener, javax.management.NotificationFilter, Object)
     * public synchronized void
     * javax.management.MBeanServerDelegate.addNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * throws java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerDelegate#addNotificationListener(javax.management.NotificationListener,
     *      javax.management.NotificationFilter, Object) public synchronized void
     *      javax.management.MBeanServerDelegate.addNotificationListener(javax.management.NotificationListener,javax.
     *      management.NotificationFilter,java.lang.Object) throws java.lang.IllegalArgumentException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addNotificationListener_NotificationListener_NotificationFilter_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerDelegate#sendNotification(javax.management.Notification)
     * public void javax.management.MBeanServerDelegate.sendNotification(javax.management.Notification)}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerDelegate#sendNotification(javax.management.Notification)
     * public void javax.management.MBeanServerDelegate.sendNotification(javax.management.Notification)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerDelegate#sendNotification(javax.management.Notification) public void
     *      javax.management.MBeanServerDelegate.sendNotification(javax.management.Notification) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sendNotification_Notification()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerDelegate#getSpecificationVersion() public java.lang.String
     * javax.management.MBeanServerDelegate.getSpecificationVersion()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerDelegate#getSpecificationVersion() public java.lang.String
     * javax.management.MBeanServerDelegate.getSpecificationVersion()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerDelegate#getSpecificationVersion() public java.lang.String
     *      javax.management.MBeanServerDelegate.getSpecificationVersion() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getSpecificationVersion()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerDelegate#getImplementationVendor() public java.lang.String
     * javax.management.MBeanServerDelegate.getImplementationVendor()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerDelegate#getImplementationVendor() public java.lang.String
     * javax.management.MBeanServerDelegate.getImplementationVendor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerDelegate#getImplementationVendor() public java.lang.String
     *      javax.management.MBeanServerDelegate.getImplementationVendor() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getImplementationVendor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerDelegate#getSpecificationName() public java.lang.String
     * javax.management.MBeanServerDelegate.getSpecificationName()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerDelegate#getSpecificationName() public java.lang.String
     * javax.management.MBeanServerDelegate.getSpecificationName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerDelegate#getSpecificationName() public java.lang.String
     *      javax.management.MBeanServerDelegate.getSpecificationName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getSpecificationName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerDelegate#removeNotificationListener(javax.management.NotificationListener, javax.management.NotificationFilter, Object)
     * public synchronized void
     * javax.management.MBeanServerDelegate.removeNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * throws javax.management.ListenerNotFoundException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerDelegate#removeNotificationListener(javax.management.NotificationListener, javax.management.NotificationFilter, Object)
     * public synchronized void
     * javax.management.MBeanServerDelegate.removeNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * throws javax.management.ListenerNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerDelegate#removeNotificationListener(javax.management.NotificationListener,
     *      javax.management.NotificationFilter, Object) public synchronized void
     *      javax.management.MBeanServerDelegate.removeNotificationListener(javax.management.NotificationListener,javax.
     *      management.NotificationFilter,java.lang.Object) throws javax.management.ListenerNotFoundException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeNotificationListener_NotificationListener_NotificationFilter_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerDelegate#removeNotificationListener(javax.management.NotificationListener)
     * public synchronized void
     * javax.management.MBeanServerDelegate.removeNotificationListener(javax.management.NotificationListener) throws
     * javax.management.ListenerNotFoundException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerDelegate#removeNotificationListener(javax.management.NotificationListener)
     * public synchronized void
     * javax.management.MBeanServerDelegate.removeNotificationListener(javax.management.NotificationListener) throws
     * javax.management.ListenerNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerDelegate#removeNotificationListener(javax.management.NotificationListener)
     *      public synchronized void
     *      javax.management.MBeanServerDelegate.removeNotificationListener(javax.management.NotificationListener)
     *      throws javax.management.ListenerNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeNotificationListener_NotificationListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerDelegate#getImplementationVersion() public java.lang.String
     * javax.management.MBeanServerDelegate.getImplementationVersion()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerDelegate#getImplementationVersion() public java.lang.String
     * javax.management.MBeanServerDelegate.getImplementationVersion()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerDelegate#getImplementationVersion() public java.lang.String
     *      javax.management.MBeanServerDelegate.getImplementationVersion() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getImplementationVersion()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerDelegate#getSpecificationVendor() public java.lang.String
     * javax.management.MBeanServerDelegate.getSpecificationVendor()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerDelegate#getSpecificationVendor() public java.lang.String
     * javax.management.MBeanServerDelegate.getSpecificationVendor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerDelegate#getSpecificationVendor() public java.lang.String
     *      javax.management.MBeanServerDelegate.getSpecificationVendor() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getSpecificationVendor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerDelegate#getNotificationInfo() public
     * javax.management.MBeanNotificationInfo[] javax.management.MBeanServerDelegate.getNotificationInfo()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerDelegate#getNotificationInfo() public
     * javax.management.MBeanNotificationInfo[] javax.management.MBeanServerDelegate.getNotificationInfo()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerDelegate#getNotificationInfo() public javax.management.MBeanNotificationInfo[]
     *      javax.management.MBeanServerDelegate.getNotificationInfo() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.management.MBeanServerDelegate#getMBeanServerId() public synchronized
     * java.lang.String javax.management.MBeanServerDelegate.getMBeanServerId()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerDelegate#getMBeanServerId() public synchronized
     * java.lang.String javax.management.MBeanServerDelegate.getMBeanServerId()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerDelegate#getMBeanServerId() public synchronized java.lang.String
     *      javax.management.MBeanServerDelegate.getMBeanServerId() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMBeanServerId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerDelegate#getImplementationName() public java.lang.String
     * javax.management.MBeanServerDelegate.getImplementationName()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerDelegate#getImplementationName() public java.lang.String
     * javax.management.MBeanServerDelegate.getImplementationName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerDelegate#getImplementationName() public java.lang.String
     *      javax.management.MBeanServerDelegate.getImplementationName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getImplementationName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
