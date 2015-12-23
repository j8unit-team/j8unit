package org.j8unit.repository.javax.management.modelmbean;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.modelmbean.ModelMBeanNotificationBroadcaster
 * interface javax.management.modelmbean.ModelMBeanNotificationBroadcaster}, containing all instance relevant test
 * methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing
 * the class relevant test methods is
 * {@link org.j8unit.repository.javax.management.modelmbean.ModelMBeanNotificationBroadcasterTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.modelmbean.ModelMBeanNotificationBroadcasterClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.modelmbean.ModelMBeanNotificationBroadcaster
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ModelMBeanNotificationBroadcasterTests<SUT extends javax.management.modelmbean.ModelMBeanNotificationBroadcaster>
extends org.j8unit.repository.javax.management.NotificationBroadcasterTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanNotificationBroadcaster#addAttributeChangeNotificationListener(javax.management.NotificationListener, java.lang.String, java.lang.Object)
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
     * @j8unit.aim javax.management.modelmbean.ModelMBeanNotificationBroadcaster#addAttributeChangeNotificationListener(
     *             javax.management.NotificationListener, java.lang.String, java.lang.Object)
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
     * {@link javax.management.modelmbean.ModelMBeanNotificationBroadcaster#removeAttributeChangeNotificationListener(javax.management.NotificationListener, java.lang.String)
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
     * @j8unit.aim javax.management.modelmbean.ModelMBeanNotificationBroadcaster#
     *             removeAttributeChangeNotificationListener(javax.management.NotificationListener, java.lang.String)
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
     * @j8unit.aim javax.management.modelmbean.ModelMBeanNotificationBroadcaster#sendAttributeChangeNotification(javax.
     *             management.Attribute, javax.management.Attribute)
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.modelmbean.ModelMBeanNotificationBroadcaster#sendAttributeChangeNotification(javax.
     *             management.AttributeChangeNotification)
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

    /**
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
     * @j8unit.aim javax.management.modelmbean.ModelMBeanNotificationBroadcaster#sendNotification(javax.management.
     *             Notification)
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
     * {@link javax.management.modelmbean.ModelMBeanNotificationBroadcaster#sendNotification(java.lang.String) public
     * abstract void javax.management.modelmbean.ModelMBeanNotificationBroadcaster.sendNotification(java.lang.String)
     * throws javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.modelmbean.ModelMBeanNotificationBroadcaster#sendNotification(java.lang.String)
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

}
