package org.j8unit.repository.javax.management.modelmbean;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.management.modelmbean.ModelMBeanNotificationBroadcaster interface javax.management.modelmbean.ModelMBeanNotificationBroadcaster},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.modelmbean.ModelMBeanNotificationBroadcasterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ModelMBeanNotificationBroadcasterTests<SUT extends javax.management.modelmbean.ModelMBeanNotificationBroadcaster>
extends org.j8unit.repository.javax.management.NotificationBroadcasterTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanNotificationBroadcaster#addAttributeChangeNotificationListener(javax.management.NotificationListener,java.lang.String,java.lang.Object) public abstract void javax.management.modelmbean.ModelMBeanNotificationBroadcaster.addAttributeChangeNotificationListener(javax.management.NotificationListener,java.lang.String,java.lang.Object) throws javax.management.MBeanException,javax.management.RuntimeOperationsException,java.lang.IllegalArgumentException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addAttributeChangeNotificationListener_NotificationListener_String_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanNotificationBroadcaster#removeAttributeChangeNotificationListener(javax.management.NotificationListener,java.lang.String) public abstract void javax.management.modelmbean.ModelMBeanNotificationBroadcaster.removeAttributeChangeNotificationListener(javax.management.NotificationListener,java.lang.String) throws javax.management.MBeanException,javax.management.RuntimeOperationsException,javax.management.ListenerNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeAttributeChangeNotificationListener_NotificationListener_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanNotificationBroadcaster#sendNotification(javax.management.Notification) public abstract void javax.management.modelmbean.ModelMBeanNotificationBroadcaster.sendNotification(javax.management.Notification) throws javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sendNotification_Notification() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanNotificationBroadcaster#sendNotification(java.lang.String) public abstract void javax.management.modelmbean.ModelMBeanNotificationBroadcaster.sendNotification(java.lang.String) throws javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sendNotification_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanNotificationBroadcaster#sendAttributeChangeNotification(javax.management.AttributeChangeNotification) public abstract void javax.management.modelmbean.ModelMBeanNotificationBroadcaster.sendAttributeChangeNotification(javax.management.AttributeChangeNotification) throws javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sendAttributeChangeNotification_AttributeChangeNotification() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanNotificationBroadcaster#sendAttributeChangeNotification(javax.management.Attribute,javax.management.Attribute) public abstract void javax.management.modelmbean.ModelMBeanNotificationBroadcaster.sendAttributeChangeNotification(javax.management.Attribute,javax.management.Attribute) throws javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sendAttributeChangeNotification_Attribute_Attribute() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
