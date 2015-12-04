package org.j8unit.repository.javax.management;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.management.StandardEmitterMBean class javax.management.StandardEmitterMBean},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.StandardEmitterMBeanClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface StandardEmitterMBeanTests<SUT extends javax.management.StandardEmitterMBean>
extends org.j8unit.repository.javax.management.NotificationEmitterTests<SUT>,
        org.j8unit.repository.javax.management.StandardMBeanTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.management.StandardEmitterMBean#addNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object) public void javax.management.StandardEmitterMBean.addNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_addNotificationListener_NotificationListener_NotificationFilter_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.StandardEmitterMBean#sendNotification(javax.management.Notification) public void javax.management.StandardEmitterMBean.sendNotification(javax.management.Notification)}.
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
     * Test method for {@link javax.management.StandardEmitterMBean#removeNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object) public void javax.management.StandardEmitterMBean.removeNotificationListener(javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object) throws javax.management.ListenerNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_removeNotificationListener_NotificationListener_NotificationFilter_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.StandardEmitterMBean#removeNotificationListener(javax.management.NotificationListener) public void javax.management.StandardEmitterMBean.removeNotificationListener(javax.management.NotificationListener) throws javax.management.ListenerNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_removeNotificationListener_NotificationListener() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.StandardEmitterMBean#getNotificationInfo() public javax.management.MBeanNotificationInfo[] javax.management.StandardEmitterMBean.getNotificationInfo()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getNotificationInfo() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
