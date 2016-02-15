package org.j8unit.repository.javax.management.modelmbean;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.modelmbean.ModelMBeanNotificationBroadcaster interface
 * javax.management.modelmbean.ModelMBeanNotificationBroadcaster}. The complementary j8unit test interface containing
 * the class relevant aspects is {@link ModelMBeanNotificationBroadcasterClassTests}.
 * </p>
 *
 * @see javax.management.modelmbean.ModelMBeanNotificationBroadcaster interface
 *      javax.management.modelmbean.ModelMBeanNotificationBroadcaster (the hereby targeted class-under-test class)
 * @see ModelMBeanNotificationBroadcasterClassTests ModelMBeanNotificationBroadcasterClassTests (the complementary
 *      j8unit test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ModelMBeanNotificationBroadcasterTests<SUT extends javax.management.modelmbean.ModelMBeanNotificationBroadcaster>
extends org.j8unit.repository.javax.management.NotificationBroadcasterTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanNotificationBroadcaster#addAttributeChangeNotificationListener(javax.management.NotificationListener, String, Object)
     * public abstract void
     * javax.management.modelmbean.ModelMBeanNotificationBroadcaster.addAttributeChangeNotificationListener(javax.management.NotificationListener,java.lang.String,java.lang.Object)
     * throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException,java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanNotificationBroadcaster#addAttributeChangeNotificationListener(javax.management.NotificationListener, String, Object)
     * public abstract void
     * javax.management.modelmbean.ModelMBeanNotificationBroadcaster.addAttributeChangeNotificationListener(javax.management.NotificationListener,java.lang.String,java.lang.Object)
     * throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException,java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanNotificationBroadcaster#addAttributeChangeNotificationListener(javax.management.NotificationListener,
     *      String, Object) public abstract void
     *      javax.management.modelmbean.ModelMBeanNotificationBroadcaster.addAttributeChangeNotificationListener(javax.
     *      management.NotificationListener,java.lang.String,java.lang.Object) throws
     *      javax.management.MBeanException,javax.management.RuntimeOperationsException,java.lang.
     *      IllegalArgumentException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addAttributeChangeNotificationListener_NotificationListener_String_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanNotificationBroadcaster#removeAttributeChangeNotificationListener(javax.management.NotificationListener, String)
     * public abstract void
     * javax.management.modelmbean.ModelMBeanNotificationBroadcaster.removeAttributeChangeNotificationListener(javax.management.NotificationListener,java.lang.String)
     * throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException,javax.management.ListenerNotFoundException}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanNotificationBroadcaster#removeAttributeChangeNotificationListener(javax.management.NotificationListener, String)
     * public abstract void
     * javax.management.modelmbean.ModelMBeanNotificationBroadcaster.removeAttributeChangeNotificationListener(javax.management.NotificationListener,java.lang.String)
     * throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException,javax.management.ListenerNotFoundException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanNotificationBroadcaster#removeAttributeChangeNotificationListener(javax.management.NotificationListener,
     *      String) public abstract void
     *      javax.management.modelmbean.ModelMBeanNotificationBroadcaster.removeAttributeChangeNotificationListener(
     *      javax.management.NotificationListener,java.lang.String) throws
     *      javax.management.MBeanException,javax.management.RuntimeOperationsException,javax.management.
     *      ListenerNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeAttributeChangeNotificationListener_NotificationListener_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanNotificationBroadcaster#sendNotification(String)
     * public abstract void
     * javax.management.modelmbean.ModelMBeanNotificationBroadcaster.sendNotification(java.lang.String) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanNotificationBroadcaster#sendNotification(String)
     * public abstract void
     * javax.management.modelmbean.ModelMBeanNotificationBroadcaster.sendNotification(java.lang.String) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanNotificationBroadcaster#sendNotification(String) public abstract void
     *      javax.management.modelmbean.ModelMBeanNotificationBroadcaster.sendNotification(java.lang.String) throws
     *      javax.management.MBeanException,javax.management.RuntimeOperationsException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sendNotification_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanNotificationBroadcaster#sendNotification(javax.management.Notification)
     * public abstract void
     * javax.management.modelmbean.ModelMBeanNotificationBroadcaster.sendNotification(javax.management.Notification)
     * throws javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanNotificationBroadcaster#sendNotification(javax.management.Notification)
     * public abstract void
     * javax.management.modelmbean.ModelMBeanNotificationBroadcaster.sendNotification(javax.management.Notification)
     * throws javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanNotificationBroadcaster#sendNotification(javax.management.Notification)
     *      public abstract void
     *      javax.management.modelmbean.ModelMBeanNotificationBroadcaster.sendNotification(javax.management.
     *      Notification) throws javax.management.MBeanException,javax.management.RuntimeOperationsException (the hereby
     *      targeted method-under-test)
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
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanNotificationBroadcaster#sendAttributeChangeNotification(javax.management.Attribute, javax.management.Attribute)
     * public abstract void
     * javax.management.modelmbean.ModelMBeanNotificationBroadcaster.sendAttributeChangeNotification(javax.management.Attribute,javax.management.Attribute)
     * throws javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanNotificationBroadcaster#sendAttributeChangeNotification(javax.management.Attribute, javax.management.Attribute)
     * public abstract void
     * javax.management.modelmbean.ModelMBeanNotificationBroadcaster.sendAttributeChangeNotification(javax.management.Attribute,javax.management.Attribute)
     * throws javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanNotificationBroadcaster#sendAttributeChangeNotification(javax.management.Attribute,
     *      javax.management.Attribute) public abstract void
     *      javax.management.modelmbean.ModelMBeanNotificationBroadcaster.sendAttributeChangeNotification(javax.
     *      management.Attribute,javax.management.Attribute) throws
     *      javax.management.MBeanException,javax.management.RuntimeOperationsException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sendAttributeChangeNotification_Attribute_Attribute()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanNotificationBroadcaster#sendAttributeChangeNotification(javax.management.AttributeChangeNotification)
     * public abstract void
     * javax.management.modelmbean.ModelMBeanNotificationBroadcaster.sendAttributeChangeNotification(javax.management.AttributeChangeNotification)
     * throws javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanNotificationBroadcaster#sendAttributeChangeNotification(javax.management.AttributeChangeNotification)
     * public abstract void
     * javax.management.modelmbean.ModelMBeanNotificationBroadcaster.sendAttributeChangeNotification(javax.management.AttributeChangeNotification)
     * throws javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanNotificationBroadcaster#sendAttributeChangeNotification(javax.management.AttributeChangeNotification)
     *      public abstract void
     *      javax.management.modelmbean.ModelMBeanNotificationBroadcaster.sendAttributeChangeNotification(javax.
     *      management.AttributeChangeNotification) throws
     *      javax.management.MBeanException,javax.management.RuntimeOperationsException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sendAttributeChangeNotification_AttributeChangeNotification()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
