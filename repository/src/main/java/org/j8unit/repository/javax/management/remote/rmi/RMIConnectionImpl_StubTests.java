package org.j8unit.repository.javax.management.remote.rmi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.remote.rmi.RMIConnectionImpl_Stub class
 * javax.management.remote.rmi.RMIConnectionImpl_Stub}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.remote.rmi.RMIConnectionImpl_StubClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RMIConnectionImpl_StubTests<SUT extends javax.management.remote.rmi.RMIConnectionImpl_Stub>
extends org.j8unit.repository.javax.management.remote.rmi.RMIConnectionTests<SUT>, org.j8unit.repository.java.rmi.server.RemoteStubTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#addNotificationListener(javax.management.ObjectName,javax.management.ObjectName,java.rmi.MarshalledObject,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * public void
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.addNotificationListener(javax.management.ObjectName,javax.management.ObjectName,java.rmi.MarshalledObject,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * throws java.io.IOException,javax.management.InstanceNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_addNotificationListener_ObjectName_ObjectName_MarshalledObject_MarshalledObject_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#addNotificationListeners(javax.management.ObjectName[],java.rmi.MarshalledObject[],javax.security.auth.Subject[])
     * public java.lang.Integer[]
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.addNotificationListeners(javax.management.ObjectName[],java.rmi.MarshalledObject[],javax.security.auth.Subject[])
     * throws java.io.IOException,javax.management.InstanceNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_addNotificationListeners_ObjectNameArray_MarshalledObjectArray_SubjectArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#close() public void
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.close() throws java.io.IOException}.
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
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#createMBean(java.lang.String,javax.management.ObjectName,java.rmi.MarshalledObject,java.lang.String[],javax.security.auth.Subject)
     * public javax.management.ObjectInstance
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.createMBean(java.lang.String,javax.management.ObjectName,java.rmi.MarshalledObject,java.lang.String[],javax.security.auth.Subject)
     * throws
     * java.io.IOException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanException,javax.management.MBeanRegistrationException,javax.management.NotCompliantMBeanException,javax.management.ReflectionException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createMBean_String_ObjectName_MarshalledObject_StringArray_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#createMBean(java.lang.String,javax.management.ObjectName,javax.management.ObjectName,java.rmi.MarshalledObject,java.lang.String[],javax.security.auth.Subject)
     * public javax.management.ObjectInstance
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.createMBean(java.lang.String,javax.management.ObjectName,javax.management.ObjectName,java.rmi.MarshalledObject,java.lang.String[],javax.security.auth.Subject)
     * throws
     * java.io.IOException,javax.management.InstanceAlreadyExistsException,javax.management.InstanceNotFoundException,javax.management.MBeanException,javax.management.MBeanRegistrationException,javax.management.NotCompliantMBeanException,javax.management.ReflectionException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createMBean_String_ObjectName_ObjectName_MarshalledObject_StringArray_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#createMBean(java.lang.String,javax.management.ObjectName,javax.management.ObjectName,javax.security.auth.Subject)
     * public javax.management.ObjectInstance
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.createMBean(java.lang.String,javax.management.ObjectName,javax.management.ObjectName,javax.security.auth.Subject)
     * throws
     * java.io.IOException,javax.management.InstanceAlreadyExistsException,javax.management.InstanceNotFoundException,javax.management.MBeanException,javax.management.MBeanRegistrationException,javax.management.NotCompliantMBeanException,javax.management.ReflectionException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createMBean_String_ObjectName_ObjectName_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#createMBean(java.lang.String,javax.management.ObjectName,javax.security.auth.Subject)
     * public javax.management.ObjectInstance
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.createMBean(java.lang.String,javax.management.ObjectName,javax.security.auth.Subject)
     * throws
     * java.io.IOException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanException,javax.management.MBeanRegistrationException,javax.management.NotCompliantMBeanException,javax.management.ReflectionException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createMBean_String_ObjectName_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#fetchNotifications(long,int,long)
     * public javax.management.remote.NotificationResult
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.fetchNotifications(long,int,long) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_fetchNotifications_long_int_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#getAttribute(javax.management.ObjectName,java.lang.String,javax.security.auth.Subject)
     * public java.lang.Object
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.getAttribute(javax.management.ObjectName,java.lang.String,javax.security.auth.Subject)
     * throws
     * java.io.IOException,javax.management.AttributeNotFoundException,javax.management.InstanceNotFoundException,javax.management.MBeanException,javax.management.ReflectionException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getAttribute_ObjectName_String_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#getAttributes(javax.management.ObjectName,java.lang.String[],javax.security.auth.Subject)
     * public javax.management.AttributeList
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.getAttributes(javax.management.ObjectName,java.lang.String[],javax.security.auth.Subject)
     * throws java.io.IOException,javax.management.InstanceNotFoundException,javax.management.ReflectionException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getAttributes_ObjectName_StringArray_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#getConnectionId() public
     * java.lang.String javax.management.remote.rmi.RMIConnectionImpl_Stub.getConnectionId() throws java.io.IOException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getConnectionId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#getDefaultDomain(javax.security.auth.Subject) public
     * java.lang.String javax.management.remote.rmi.RMIConnectionImpl_Stub.getDefaultDomain(javax.security.auth.Subject)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getDefaultDomain_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#getDomains(javax.security.auth.Subject)
     * public java.lang.String[]
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.getDomains(javax.security.auth.Subject) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getDomains_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#getMBeanCount(javax.security.auth.Subject) public
     * java.lang.Integer javax.management.remote.rmi.RMIConnectionImpl_Stub.getMBeanCount(javax.security.auth.Subject)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getMBeanCount_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#getMBeanInfo(javax.management.ObjectName,javax.security.auth.Subject)
     * public javax.management.MBeanInfo
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.getMBeanInfo(javax.management.ObjectName,javax.security.auth.Subject)
     * throws
     * java.io.IOException,javax.management.InstanceNotFoundException,javax.management.IntrospectionException,javax.management.ReflectionException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getMBeanInfo_ObjectName_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#getObjectInstance(javax.management.ObjectName,javax.security.auth.Subject)
     * public javax.management.ObjectInstance
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.getObjectInstance(javax.management.ObjectName,javax.security.auth.Subject)
     * throws java.io.IOException,javax.management.InstanceNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getObjectInstance_ObjectName_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#invoke(javax.management.ObjectName,java.lang.String,java.rmi.MarshalledObject,java.lang.String[],javax.security.auth.Subject)
     * public java.lang.Object
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.invoke(javax.management.ObjectName,java.lang.String,java.rmi.MarshalledObject,java.lang.String[],javax.security.auth.Subject)
     * throws
     * java.io.IOException,javax.management.InstanceNotFoundException,javax.management.MBeanException,javax.management.ReflectionException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_invoke_ObjectName_String_MarshalledObject_StringArray_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#isInstanceOf(javax.management.ObjectName,java.lang.String,javax.security.auth.Subject)
     * public boolean
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.isInstanceOf(javax.management.ObjectName,java.lang.String,javax.security.auth.Subject)
     * throws java.io.IOException,javax.management.InstanceNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isInstanceOf_ObjectName_String_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#isRegistered(javax.management.ObjectName,javax.security.auth.Subject)
     * public boolean
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.isRegistered(javax.management.ObjectName,javax.security.auth.Subject)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isRegistered_ObjectName_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#queryMBeans(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * public java.util.Set
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.queryMBeans(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_queryMBeans_ObjectName_MarshalledObject_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#queryNames(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * public java.util.Set
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.queryNames(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_queryNames_ObjectName_MarshalledObject_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#removeNotificationListener(javax.management.ObjectName,javax.management.ObjectName,java.rmi.MarshalledObject,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * public void
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.removeNotificationListener(javax.management.ObjectName,javax.management.ObjectName,java.rmi.MarshalledObject,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * throws java.io.IOException,javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_removeNotificationListener_ObjectName_ObjectName_MarshalledObject_MarshalledObject_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#removeNotificationListener(javax.management.ObjectName,javax.management.ObjectName,javax.security.auth.Subject)
     * public void
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.removeNotificationListener(javax.management.ObjectName,javax.management.ObjectName,javax.security.auth.Subject)
     * throws java.io.IOException,javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_removeNotificationListener_ObjectName_ObjectName_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#removeNotificationListeners(javax.management.ObjectName,java.lang.Integer[],javax.security.auth.Subject)
     * public void
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.removeNotificationListeners(javax.management.ObjectName,java.lang.Integer[],javax.security.auth.Subject)
     * throws java.io.IOException,javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_removeNotificationListeners_ObjectName_IntegerArray_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#setAttribute(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * public void
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.setAttribute(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * throws
     * java.io.IOException,javax.management.AttributeNotFoundException,javax.management.InstanceNotFoundException,javax.management.InvalidAttributeValueException,javax.management.MBeanException,javax.management.ReflectionException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_setAttribute_ObjectName_MarshalledObject_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#setAttributes(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * public javax.management.AttributeList
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.setAttributes(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * throws java.io.IOException,javax.management.InstanceNotFoundException,javax.management.ReflectionException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_setAttributes_ObjectName_MarshalledObject_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnectionImpl_Stub#unregisterMBean(javax.management.ObjectName,javax.security.auth.Subject)
     * public void
     * javax.management.remote.rmi.RMIConnectionImpl_Stub.unregisterMBean(javax.management.ObjectName,javax.security.auth.Subject)
     * throws
     * java.io.IOException,javax.management.InstanceNotFoundException,javax.management.MBeanRegistrationException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_unregisterMBean_ObjectName_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
