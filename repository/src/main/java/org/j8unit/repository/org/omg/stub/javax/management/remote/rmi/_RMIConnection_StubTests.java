package org.j8unit.repository.org.omg.stub.javax.management.remote.rmi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.javax.management.remote.rmi.RMIConnectionTests;
import org.j8unit.repository.javax.rmi.CORBA.StubTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link _RMIConnection_Stub public class org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.org.omg.stub.javax.management.remote.rmi._RMIConnection_StubClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
@SuppressWarnings("restriction")
public abstract interface _RMIConnection_StubTests<SUT extends _RMIConnection_Stub>
extends RMIConnectionTests<SUT>, StubTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#queryNames(javax.management.ObjectName, java.rmi.MarshalledObject, javax.security.auth.Subject)
     * public java.util.Set
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.queryNames(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
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
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#getAttributes(javax.management.ObjectName, String[], javax.security.auth.Subject)
     * public javax.management.AttributeList
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.getAttributes(javax.management.ObjectName,java.lang.String[],javax.security.auth.Subject)
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
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#createMBean(String, javax.management.ObjectName, java.rmi.MarshalledObject, String[], javax.security.auth.Subject)
     * public javax.management.ObjectInstance
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.createMBean(java.lang.String,javax.management.ObjectName,java.rmi.MarshalledObject,java.lang.String[],javax.security.auth.Subject)
     * throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,java.io.IOException}.
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
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#createMBean(String, javax.management.ObjectName, javax.management.ObjectName, java.rmi.MarshalledObject, String[], javax.security.auth.Subject)
     * public javax.management.ObjectInstance
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.createMBean(java.lang.String,javax.management.ObjectName,javax.management.ObjectName,java.rmi.MarshalledObject,java.lang.String[],javax.security.auth.Subject)
     * throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,javax.management.InstanceNotFoundException,java.io.IOException}.
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
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#createMBean(String, javax.management.ObjectName, javax.management.ObjectName, javax.security.auth.Subject)
     * public javax.management.ObjectInstance
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.createMBean(java.lang.String,javax.management.ObjectName,javax.management.ObjectName,javax.security.auth.Subject)
     * throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,javax.management.InstanceNotFoundException,java.io.IOException}.
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
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#createMBean(String, javax.management.ObjectName, javax.security.auth.Subject)
     * public javax.management.ObjectInstance
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.createMBean(java.lang.String,javax.management.ObjectName,javax.security.auth.Subject)
     * throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,java.io.IOException}.
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
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#getDefaultDomain(javax.security.auth.Subject)
     * public java.lang.String
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.getDefaultDomain(javax.security.auth.Subject) throws
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
    public default void test_getDefaultDomain_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#getObjectInstance(javax.management.ObjectName, javax.security.auth.Subject)
     * public javax.management.ObjectInstance
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.getObjectInstance(javax.management.ObjectName,javax.security.auth.Subject)
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
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#getDomains(javax.security.auth.Subject)
     * public java.lang.String[]
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.getDomains(javax.security.auth.Subject) throws
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
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#addNotificationListener(javax.management.ObjectName, javax.management.ObjectName, java.rmi.MarshalledObject, java.rmi.MarshalledObject, javax.security.auth.Subject)
     * public void
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.addNotificationListener(javax.management.ObjectName,javax.management.ObjectName,java.rmi.MarshalledObject,java.rmi.MarshalledObject,javax.security.auth.Subject)
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
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#fetchNotifications(long, int, long) public
     * javax.management.remote.NotificationResult
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.fetchNotifications(long,int,long) throws
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
    public default void test_fetchNotifications_long_int_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#queryMBeans(javax.management.ObjectName, java.rmi.MarshalledObject, javax.security.auth.Subject)
     * public java.util.Set
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.queryMBeans(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
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
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#isRegistered(javax.management.ObjectName, javax.security.auth.Subject)
     * public boolean
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.isRegistered(javax.management.ObjectName,javax.security.auth.Subject)
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
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#isInstanceOf(javax.management.ObjectName, String, javax.security.auth.Subject)
     * public boolean
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.isInstanceOf(javax.management.ObjectName,java.lang.String,javax.security.auth.Subject)
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
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#getMBeanInfo(javax.management.ObjectName, javax.security.auth.Subject)
     * public javax.management.MBeanInfo
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.getMBeanInfo(javax.management.ObjectName,javax.security.auth.Subject)
     * throws
     * javax.management.InstanceNotFoundException,javax.management.IntrospectionException,javax.management.ReflectionException,java.io.IOException}.
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
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#removeNotificationListener(javax.management.ObjectName, javax.management.ObjectName, javax.security.auth.Subject)
     * public void
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.removeNotificationListener(javax.management.ObjectName,javax.management.ObjectName,javax.security.auth.Subject)
     * throws
     * javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException,java.io.IOException}.
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
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#removeNotificationListener(javax.management.ObjectName, javax.management.ObjectName, java.rmi.MarshalledObject, java.rmi.MarshalledObject, javax.security.auth.Subject)
     * public void
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.removeNotificationListener(javax.management.ObjectName,javax.management.ObjectName,java.rmi.MarshalledObject,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * throws
     * javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException,java.io.IOException}.
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
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#unregisterMBean(javax.management.ObjectName, javax.security.auth.Subject)
     * public void
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.unregisterMBean(javax.management.ObjectName,javax.security.auth.Subject)
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

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#invoke(javax.management.ObjectName, String, java.rmi.MarshalledObject, String[], javax.security.auth.Subject)
     * public java.lang.Object
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.invoke(javax.management.ObjectName,java.lang.String,java.rmi.MarshalledObject,java.lang.String[],javax.security.auth.Subject)
     * throws
     * javax.management.InstanceNotFoundException,javax.management.MBeanException,javax.management.ReflectionException,java.io.IOException}.
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
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#setAttributes(javax.management.ObjectName, java.rmi.MarshalledObject, javax.security.auth.Subject)
     * public javax.management.AttributeList
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.setAttributes(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
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
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#setAttribute(javax.management.ObjectName, java.rmi.MarshalledObject, javax.security.auth.Subject)
     * public void
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.setAttribute(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * throws
     * javax.management.InstanceNotFoundException,javax.management.AttributeNotFoundException,javax.management.InvalidAttributeValueException,javax.management.MBeanException,javax.management.ReflectionException,java.io.IOException}.
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
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#getAttribute(javax.management.ObjectName, String, javax.security.auth.Subject)
     * public java.lang.Object
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.getAttribute(javax.management.ObjectName,java.lang.String,javax.security.auth.Subject)
     * throws
     * javax.management.MBeanException,javax.management.AttributeNotFoundException,javax.management.InstanceNotFoundException,javax.management.ReflectionException,java.io.IOException}.
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
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#_ids() public java.lang.String[]
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub._ids()}.
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
    public default void test__ids()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#getMBeanCount(javax.security.auth.Subject)
     * public java.lang.Integer
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.getMBeanCount(javax.security.auth.Subject) throws
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
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#addNotificationListeners(javax.management.ObjectName[], java.rmi.MarshalledObject[], javax.security.auth.Subject[])
     * public java.lang.Integer[]
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.addNotificationListeners(javax.management.ObjectName[],java.rmi.MarshalledObject[],javax.security.auth.Subject[])
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
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#removeNotificationListeners(javax.management.ObjectName, Integer[], javax.security.auth.Subject)
     * public void
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.removeNotificationListeners(javax.management.ObjectName,java.lang.Integer[],javax.security.auth.Subject)
     * throws
     * javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException,java.io.IOException}.
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
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#close() public void
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.close() throws java.io.IOException}.
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
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#getConnectionId() public java.lang.String
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub.getConnectionId() throws java.io.IOException}.
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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub]

}
