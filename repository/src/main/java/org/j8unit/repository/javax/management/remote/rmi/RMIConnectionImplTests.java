package org.j8unit.repository.javax.management.remote.rmi;

import java.rmi.MarshalledObject;
import javax.management.ObjectName;
import javax.management.remote.rmi.RMIConnectionImpl;
import javax.security.auth.Subject;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link RMIConnectionImpl public class javax.management.remote.rmi.RMIConnectionImpl}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.management.remote.rmi.RMIConnectionImplClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RMIConnectionImplTests<SUT extends RMIConnectionImpl>
extends org.j8unit.repository.javax.management.remote.rmi.RMIConnectionTests<SUT>, org.j8unit.repository.java.rmi.server.UnreferencedTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.rmi.RMIConnectionImpl]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link RMIConnectionImpl#isRegistered(ObjectName, Subject)
     * public boolean
     * javax.management.remote.rmi.RMIConnectionImpl.isRegistered(javax.management.ObjectName,javax.security.auth.Subject)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isRegistered_ObjectName_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link RMIConnectionImpl#toString() public java.lang.String
     * javax.management.remote.rmi.RMIConnectionImpl.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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
     * Test method for the hereby targeted method-under-test
     * {@link RMIConnectionImpl#isInstanceOf(ObjectName, String, Subject) public boolean
     * javax.management.remote.rmi.RMIConnectionImpl.isInstanceOf(javax.management.ObjectName,java.lang.String,javax.security.auth.Subject)
     * throws javax.management.InstanceNotFoundException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isInstanceOf_ObjectName_String_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link RMIConnectionImpl#getMBeanInfo(ObjectName, Subject)
     * public javax.management.MBeanInfo
     * javax.management.remote.rmi.RMIConnectionImpl.getMBeanInfo(javax.management.ObjectName,javax.security.auth.Subject)
     * throws
     * javax.management.InstanceNotFoundException,javax.management.IntrospectionException,javax.management.ReflectionException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMBeanInfo_ObjectName_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link RMIConnectionImpl#removeNotificationListener(ObjectName, ObjectName, MarshalledObject, MarshalledObject, Subject)
     * public void
     * javax.management.remote.rmi.RMIConnectionImpl.removeNotificationListener(javax.management.ObjectName,javax.management.ObjectName,java.rmi.MarshalledObject,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * throws javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeNotificationListener_ObjectName_ObjectName_MarshalledObject_MarshalledObject_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link RMIConnectionImpl#removeNotificationListener(ObjectName, ObjectName, Subject) public void
     * javax.management.remote.rmi.RMIConnectionImpl.removeNotificationListener(javax.management.ObjectName,javax.management.ObjectName,javax.security.auth.Subject)
     * throws javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeNotificationListener_ObjectName_ObjectName_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link RMIConnectionImpl#getDomains(Subject) public
     * java.lang.String[] javax.management.remote.rmi.RMIConnectionImpl.getDomains(javax.security.auth.Subject) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getDomains_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link RMIConnectionImpl#fetchNotifications(long, int, long) public javax.management.remote.NotificationResult
     * javax.management.remote.rmi.RMIConnectionImpl.fetchNotifications(long,int,long) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_fetchNotifications_long_int_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link RMIConnectionImpl#addNotificationListener(ObjectName, ObjectName, MarshalledObject, MarshalledObject, Subject)
     * public void
     * javax.management.remote.rmi.RMIConnectionImpl.addNotificationListener(javax.management.ObjectName,javax.management.ObjectName,java.rmi.MarshalledObject,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * throws javax.management.InstanceNotFoundException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addNotificationListener_ObjectName_ObjectName_MarshalledObject_MarshalledObject_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link RMIConnectionImpl#queryMBeans(ObjectName, MarshalledObject, Subject) public java.util.Set
     * <javax.management.ObjectInstance>
     * javax.management.remote.rmi.RMIConnectionImpl.queryMBeans(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_queryMBeans_ObjectName_MarshalledObject_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link RMIConnectionImpl#getAttributes(ObjectName, String[], Subject) public javax.management.AttributeList
     * javax.management.remote.rmi.RMIConnectionImpl.getAttributes(javax.management.ObjectName,java.lang.String[],javax.security.auth.Subject)
     * throws javax.management.InstanceNotFoundException,javax.management.ReflectionException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAttributes_ObjectName_StringArray_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link RMIConnectionImpl#queryNames(ObjectName, MarshalledObject, Subject) public java.util.Set
     * <javax.management.ObjectName>
     * javax.management.remote.rmi.RMIConnectionImpl.queryNames(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_queryNames_ObjectName_MarshalledObject_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link RMIConnectionImpl#createMBean(String, ObjectName, MarshalledObject, String[], Subject) public
     * javax.management.ObjectInstance
     * javax.management.remote.rmi.RMIConnectionImpl.createMBean(java.lang.String,javax.management.ObjectName,java.rmi.MarshalledObject,java.lang.String[],javax.security.auth.Subject)
     * throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_createMBean_String_ObjectName_MarshalledObject_StringArray_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link RMIConnectionImpl#createMBean(String, ObjectName, ObjectName, MarshalledObject, String[], Subject) public
     * javax.management.ObjectInstance
     * javax.management.remote.rmi.RMIConnectionImpl.createMBean(java.lang.String,javax.management.ObjectName,javax.management.ObjectName,java.rmi.MarshalledObject,java.lang.String[],javax.security.auth.Subject)
     * throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,javax.management.InstanceNotFoundException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_createMBean_String_ObjectName_ObjectName_MarshalledObject_StringArray_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link RMIConnectionImpl#createMBean(String, ObjectName, Subject) public javax.management.ObjectInstance
     * javax.management.remote.rmi.RMIConnectionImpl.createMBean(java.lang.String,javax.management.ObjectName,javax.security.auth.Subject)
     * throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_createMBean_String_ObjectName_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link RMIConnectionImpl#createMBean(String, ObjectName, ObjectName, Subject) public
     * javax.management.ObjectInstance
     * javax.management.remote.rmi.RMIConnectionImpl.createMBean(java.lang.String,javax.management.ObjectName,javax.management.ObjectName,javax.security.auth.Subject)
     * throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,javax.management.InstanceNotFoundException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_createMBean_String_ObjectName_ObjectName_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link RMIConnectionImpl#getObjectInstance(ObjectName, Subject) public javax.management.ObjectInstance
     * javax.management.remote.rmi.RMIConnectionImpl.getObjectInstance(javax.management.ObjectName,javax.security.auth.Subject)
     * throws javax.management.InstanceNotFoundException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getObjectInstance_ObjectName_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link RMIConnectionImpl#getDefaultDomain(Subject) public
     * java.lang.String javax.management.remote.rmi.RMIConnectionImpl.getDefaultDomain(javax.security.auth.Subject)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getDefaultDomain_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link RMIConnectionImpl#addNotificationListeners(ObjectName[], MarshalledObject[], Subject[]) public
     * java.lang.Integer[]
     * javax.management.remote.rmi.RMIConnectionImpl.addNotificationListeners(javax.management.ObjectName[],java.rmi.MarshalledObject[],javax.security.auth.Subject[])
     * throws javax.management.InstanceNotFoundException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addNotificationListeners_ObjectNameArray_MarshalledObjectArray_SubjectArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link RMIConnectionImpl#getMBeanCount(Subject) public
     * java.lang.Integer javax.management.remote.rmi.RMIConnectionImpl.getMBeanCount(javax.security.auth.Subject) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMBeanCount_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link RMIConnectionImpl#getConnectionId() public
     * java.lang.String javax.management.remote.rmi.RMIConnectionImpl.getConnectionId() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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
     * Test method for the hereby targeted method-under-test {@link RMIConnectionImpl#close() public void
     * javax.management.remote.rmi.RMIConnectionImpl.close() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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
     * Test method for the hereby targeted method-under-test
     * {@link RMIConnectionImpl#removeNotificationListeners(ObjectName, Integer[], Subject) public void
     * javax.management.remote.rmi.RMIConnectionImpl.removeNotificationListeners(javax.management.ObjectName,java.lang.Integer[],javax.security.auth.Subject)
     * throws javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeNotificationListeners_ObjectName_IntegerArray_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link RMIConnectionImpl#getAttribute(ObjectName, String, Subject) public java.lang.Object
     * javax.management.remote.rmi.RMIConnectionImpl.getAttribute(javax.management.ObjectName,java.lang.String,javax.security.auth.Subject)
     * throws
     * javax.management.MBeanException,javax.management.AttributeNotFoundException,javax.management.InstanceNotFoundException,javax.management.ReflectionException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAttribute_ObjectName_String_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link RMIConnectionImpl#setAttribute(ObjectName, MarshalledObject, Subject) public void
     * javax.management.remote.rmi.RMIConnectionImpl.setAttribute(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * throws
     * javax.management.InstanceNotFoundException,javax.management.AttributeNotFoundException,javax.management.InvalidAttributeValueException,javax.management.MBeanException,javax.management.ReflectionException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setAttribute_ObjectName_MarshalledObject_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link RMIConnectionImpl#unreferenced() public void
     * javax.management.remote.rmi.RMIConnectionImpl.unreferenced()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_unreferenced()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link RMIConnectionImpl#setAttributes(ObjectName, MarshalledObject, Subject) public
     * javax.management.AttributeList
     * javax.management.remote.rmi.RMIConnectionImpl.setAttributes(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * throws javax.management.InstanceNotFoundException,javax.management.ReflectionException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setAttributes_ObjectName_MarshalledObject_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link RMIConnectionImpl#invoke(ObjectName, String, MarshalledObject, String[], Subject) public java.lang.Object
     * javax.management.remote.rmi.RMIConnectionImpl.invoke(javax.management.ObjectName,java.lang.String,java.rmi.MarshalledObject,java.lang.String[],javax.security.auth.Subject)
     * throws
     * javax.management.InstanceNotFoundException,javax.management.MBeanException,javax.management.ReflectionException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_invoke_ObjectName_String_MarshalledObject_StringArray_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link RMIConnectionImpl#unregisterMBean(ObjectName, Subject) public void
     * javax.management.remote.rmi.RMIConnectionImpl.unregisterMBean(javax.management.ObjectName,javax.security.auth.Subject)
     * throws
     * javax.management.InstanceNotFoundException,javax.management.MBeanRegistrationException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_unregisterMBean_ObjectName_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.remote.rmi.RMIConnectionImpl]

}
