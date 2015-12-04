package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.MBeanServer interface javax.management.MBeanServer}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.MBeanServerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MBeanServerTests<SUT extends javax.management.MBeanServer>
extends org.j8unit.repository.javax.management.MBeanServerConnectionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServer#getAttribute(javax.management.ObjectName,java.lang.String)
     * public abstract java.lang.Object
     * javax.management.MBeanServer.getAttribute(javax.management.ObjectName,java.lang.String) throws
     * javax.management.MBeanException,javax.management.AttributeNotFoundException,javax.management.InstanceNotFoundException,javax.management.ReflectionException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getAttribute_ObjectName_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServer#setAttribute(javax.management.ObjectName,javax.management.Attribute) public
     * abstract void javax.management.MBeanServer.setAttribute(javax.management.ObjectName,javax.management.Attribute)
     * throws
     * javax.management.InstanceNotFoundException,javax.management.AttributeNotFoundException,javax.management.InvalidAttributeValueException,javax.management.MBeanException,javax.management.ReflectionException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_setAttribute_ObjectName_Attribute()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServer#getClassLoaderFor(javax.management.ObjectName) public
     * abstract java.lang.ClassLoader javax.management.MBeanServer.getClassLoaderFor(javax.management.ObjectName) throws
     * javax.management.InstanceNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getClassLoaderFor_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServer#deserialize(java.lang.String,javax.management.ObjectName,byte[]) public
     * abstract java.io.ObjectInputStream
     * javax.management.MBeanServer.deserialize(java.lang.String,javax.management.ObjectName,byte[]) throws
     * javax.management.InstanceNotFoundException,javax.management.OperationsException,javax.management.ReflectionException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_deserialize_String_ObjectName_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServer#deserialize(javax.management.ObjectName,byte[]) public
     * abstract java.io.ObjectInputStream javax.management.MBeanServer.deserialize(javax.management.ObjectName,byte[])
     * throws javax.management.InstanceNotFoundException,javax.management.OperationsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_deserialize_ObjectName_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServer#deserialize(java.lang.String,byte[]) public abstract
     * java.io.ObjectInputStream javax.management.MBeanServer.deserialize(java.lang.String,byte[]) throws
     * javax.management.OperationsException,javax.management.ReflectionException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_deserialize_String_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServer#getMBeanCount() public abstract java.lang.Integer
     * javax.management.MBeanServer.getMBeanCount()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getMBeanCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServer#unregisterMBean(javax.management.ObjectName) public abstract
     * void javax.management.MBeanServer.unregisterMBean(javax.management.ObjectName) throws
     * javax.management.InstanceNotFoundException,javax.management.MBeanRegistrationException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_unregisterMBean_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServer#instantiate(java.lang.String) public abstract
     * java.lang.Object javax.management.MBeanServer.instantiate(java.lang.String) throws
     * javax.management.ReflectionException,javax.management.MBeanException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_instantiate_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServer#instantiate(java.lang.String,javax.management.ObjectName,java.lang.Object[],java.lang.String[])
     * public abstract java.lang.Object
     * javax.management.MBeanServer.instantiate(java.lang.String,javax.management.ObjectName,java.lang.Object[],java.lang.String[])
     * throws
     * javax.management.ReflectionException,javax.management.MBeanException,javax.management.InstanceNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_instantiate_String_ObjectName_ObjectArray_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServer#instantiate(java.lang.String,java.lang.Object[],java.lang.String[]) public
     * abstract java.lang.Object
     * javax.management.MBeanServer.instantiate(java.lang.String,java.lang.Object[],java.lang.String[]) throws
     * javax.management.ReflectionException,javax.management.MBeanException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_instantiate_String_ObjectArray_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServer#instantiate(java.lang.String,javax.management.ObjectName)
     * public abstract java.lang.Object
     * javax.management.MBeanServer.instantiate(java.lang.String,javax.management.ObjectName) throws
     * javax.management.ReflectionException,javax.management.MBeanException,javax.management.InstanceNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_instantiate_String_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServer#setAttributes(javax.management.ObjectName,javax.management.AttributeList)
     * public abstract javax.management.AttributeList
     * javax.management.MBeanServer.setAttributes(javax.management.ObjectName,javax.management.AttributeList) throws
     * javax.management.InstanceNotFoundException,javax.management.ReflectionException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_setAttributes_ObjectName_AttributeList()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServer#invoke(javax.management.ObjectName,java.lang.String,java.lang.Object[],java.lang.String[])
     * public abstract java.lang.Object
     * javax.management.MBeanServer.invoke(javax.management.ObjectName,java.lang.String,java.lang.Object[],java.lang.String[])
     * throws
     * javax.management.InstanceNotFoundException,javax.management.MBeanException,javax.management.ReflectionException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_invoke_ObjectName_String_ObjectArray_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServer#getClassLoader(javax.management.ObjectName) public abstract
     * java.lang.ClassLoader javax.management.MBeanServer.getClassLoader(javax.management.ObjectName) throws
     * javax.management.InstanceNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getClassLoader_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServer#registerMBean(java.lang.Object,javax.management.ObjectName)
     * public abstract javax.management.ObjectInstance
     * javax.management.MBeanServer.registerMBean(java.lang.Object,javax.management.ObjectName) throws
     * javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.NotCompliantMBeanException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_registerMBean_Object_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServer#getClassLoaderRepository() public abstract
     * javax.management.loading.ClassLoaderRepository javax.management.MBeanServer.getClassLoaderRepository()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getClassLoaderRepository()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServer#getMBeanInfo(javax.management.ObjectName) public abstract
     * javax.management.MBeanInfo javax.management.MBeanServer.getMBeanInfo(javax.management.ObjectName) throws
     * javax.management.InstanceNotFoundException,javax.management.IntrospectionException,javax.management.ReflectionException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getMBeanInfo_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServer#removeNotificationListener(javax.management.ObjectName,javax.management.ObjectName)
     * public abstract void
     * javax.management.MBeanServer.removeNotificationListener(javax.management.ObjectName,javax.management.ObjectName)
     * throws javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_removeNotificationListener_ObjectName_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServer#removeNotificationListener(javax.management.ObjectName,javax.management.NotificationListener)
     * public abstract void
     * javax.management.MBeanServer.removeNotificationListener(javax.management.ObjectName,javax.management.NotificationListener)
     * throws javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_removeNotificationListener_ObjectName_NotificationListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServer#removeNotificationListener(javax.management.ObjectName,javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * public abstract void
     * javax.management.MBeanServer.removeNotificationListener(javax.management.ObjectName,javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * throws javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_removeNotificationListener_ObjectName_NotificationListener_NotificationFilter_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServer#removeNotificationListener(javax.management.ObjectName,javax.management.ObjectName,javax.management.NotificationFilter,java.lang.Object)
     * public abstract void
     * javax.management.MBeanServer.removeNotificationListener(javax.management.ObjectName,javax.management.ObjectName,javax.management.NotificationFilter,java.lang.Object)
     * throws javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_removeNotificationListener_ObjectName_ObjectName_NotificationFilter_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServer#isRegistered(javax.management.ObjectName) public abstract
     * boolean javax.management.MBeanServer.isRegistered(javax.management.ObjectName)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isRegistered_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServer#isInstanceOf(javax.management.ObjectName,java.lang.String)
     * public abstract boolean javax.management.MBeanServer.isInstanceOf(javax.management.ObjectName,java.lang.String)
     * throws javax.management.InstanceNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isInstanceOf_ObjectName_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServer#getDefaultDomain() public abstract java.lang.String
     * javax.management.MBeanServer.getDefaultDomain()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getDefaultDomain()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServer#getObjectInstance(javax.management.ObjectName) public
     * abstract javax.management.ObjectInstance
     * javax.management.MBeanServer.getObjectInstance(javax.management.ObjectName) throws
     * javax.management.InstanceNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getObjectInstance_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServer#getAttributes(javax.management.ObjectName,java.lang.String[])
     * public abstract javax.management.AttributeList
     * javax.management.MBeanServer.getAttributes(javax.management.ObjectName,java.lang.String[]) throws
     * javax.management.InstanceNotFoundException,javax.management.ReflectionException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getAttributes_ObjectName_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServer#queryNames(javax.management.ObjectName,javax.management.QueryExp) public
     * abstract java.util.Set
     * javax.management.MBeanServer.queryNames(javax.management.ObjectName,javax.management.QueryExp)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_queryNames_ObjectName_QueryExp()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServer#createMBean(java.lang.String,javax.management.ObjectName)
     * public abstract javax.management.ObjectInstance
     * javax.management.MBeanServer.createMBean(java.lang.String,javax.management.ObjectName) throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createMBean_String_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServer#createMBean(java.lang.String,javax.management.ObjectName,java.lang.Object[],java.lang.String[])
     * public abstract javax.management.ObjectInstance
     * javax.management.MBeanServer.createMBean(java.lang.String,javax.management.ObjectName,java.lang.Object[],java.lang.String[])
     * throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createMBean_String_ObjectName_ObjectArray_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServer#createMBean(java.lang.String,javax.management.ObjectName,javax.management.ObjectName,java.lang.Object[],java.lang.String[])
     * public abstract javax.management.ObjectInstance
     * javax.management.MBeanServer.createMBean(java.lang.String,javax.management.ObjectName,javax.management.ObjectName,java.lang.Object[],java.lang.String[])
     * throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,javax.management.InstanceNotFoundException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createMBean_String_ObjectName_ObjectName_ObjectArray_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServer#createMBean(java.lang.String,javax.management.ObjectName,javax.management.ObjectName)
     * public abstract javax.management.ObjectInstance
     * javax.management.MBeanServer.createMBean(java.lang.String,javax.management.ObjectName,javax.management.ObjectName)
     * throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,javax.management.InstanceNotFoundException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createMBean_String_ObjectName_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServer#queryMBeans(javax.management.ObjectName,javax.management.QueryExp) public
     * abstract java.util.Set
     * javax.management.MBeanServer.queryMBeans(javax.management.ObjectName,javax.management.QueryExp)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_queryMBeans_ObjectName_QueryExp()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServer#getDomains() public abstract java.lang.String[]
     * javax.management.MBeanServer.getDomains()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getDomains()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServer#addNotificationListener(javax.management.ObjectName,javax.management.ObjectName,javax.management.NotificationFilter,java.lang.Object)
     * public abstract void
     * javax.management.MBeanServer.addNotificationListener(javax.management.ObjectName,javax.management.ObjectName,javax.management.NotificationFilter,java.lang.Object)
     * throws javax.management.InstanceNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_addNotificationListener_ObjectName_ObjectName_NotificationFilter_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServer#addNotificationListener(javax.management.ObjectName,javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * public abstract void
     * javax.management.MBeanServer.addNotificationListener(javax.management.ObjectName,javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * throws javax.management.InstanceNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_addNotificationListener_ObjectName_NotificationListener_NotificationFilter_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
