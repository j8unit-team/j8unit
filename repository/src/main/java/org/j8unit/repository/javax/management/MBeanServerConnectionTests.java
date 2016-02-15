package org.j8unit.repository.javax.management;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.MBeanServerConnection interface
 * javax.management.MBeanServerConnection}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link MBeanServerConnectionClassTests}.
 * </p>
 *
 * @see javax.management.MBeanServerConnection interface javax.management.MBeanServerConnection (the hereby targeted
 *      class-under-test class)
 * @see MBeanServerConnectionClassTests MBeanServerConnectionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MBeanServerConnectionTests<SUT extends javax.management.MBeanServerConnection>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#getAttributes(javax.management.ObjectName, String[]) public
     * abstract javax.management.AttributeList
     * javax.management.MBeanServerConnection.getAttributes(javax.management.ObjectName,java.lang.String[]) throws
     * javax.management.InstanceNotFoundException,javax.management.ReflectionException,java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#getAttributes(javax.management.ObjectName, String[]) public
     * abstract javax.management.AttributeList
     * javax.management.MBeanServerConnection.getAttributes(javax.management.ObjectName,java.lang.String[]) throws
     * javax.management.InstanceNotFoundException,javax.management.ReflectionException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#getAttributes(javax.management.ObjectName, String[]) public abstract
     *      javax.management.AttributeList
     *      javax.management.MBeanServerConnection.getAttributes(javax.management.ObjectName,java.lang.String[]) throws
     *      javax.management.InstanceNotFoundException,javax.management.ReflectionException,java.io.IOException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributes_ObjectName_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#queryNames(javax.management.ObjectName, javax.management.QueryExp)
     * public abstract java.util.Set<javax.management.ObjectName>
     * javax.management.MBeanServerConnection.queryNames(javax.management.ObjectName,javax.management.QueryExp) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#queryNames(javax.management.ObjectName, javax.management.QueryExp)
     * public abstract java.util.Set
     * javax.management.MBeanServerConnection.queryNames(javax.management.ObjectName,javax.management.QueryExp) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#queryNames(javax.management.ObjectName, javax.management.QueryExp)
     *      public abstract java.util.Set
     *      javax.management.MBeanServerConnection.queryNames(javax.management.ObjectName,javax.management.QueryExp)
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_queryNames_ObjectName_QueryExp()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#createMBean(String, javax.management.ObjectName, Object[], String[])
     * public abstract javax.management.ObjectInstance
     * javax.management.MBeanServerConnection.createMBean(java.lang.String,javax.management.ObjectName,java.lang.Object[],java.lang.String[])
     * throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,java.io.IOException}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#createMBean(String, javax.management.ObjectName, Object[], String[])
     * public abstract javax.management.ObjectInstance
     * javax.management.MBeanServerConnection.createMBean(java.lang.String,javax.management.ObjectName,java.lang.Object[],java.lang.String[])
     * throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#createMBean(String, javax.management.ObjectName, Object[], String[])
     *      public abstract javax.management.ObjectInstance
     *      javax.management.MBeanServerConnection.createMBean(java.lang.String,javax.management.ObjectName,java.lang.
     *      Object[],java.lang.String[]) throws
     *      javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.
     *      MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,java.
     *      io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createMBean_String_ObjectName_ObjectArray_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#createMBean(String, javax.management.ObjectName, javax.management.ObjectName)
     * public abstract javax.management.ObjectInstance
     * javax.management.MBeanServerConnection.createMBean(java.lang.String,javax.management.ObjectName,javax.management.ObjectName)
     * throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,javax.management.InstanceNotFoundException,java.io.IOException}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#createMBean(String, javax.management.ObjectName, javax.management.ObjectName)
     * public abstract javax.management.ObjectInstance
     * javax.management.MBeanServerConnection.createMBean(java.lang.String,javax.management.ObjectName,javax.management.ObjectName)
     * throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,javax.management.InstanceNotFoundException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#createMBean(String, javax.management.ObjectName,
     *      javax.management.ObjectName) public abstract javax.management.ObjectInstance
     *      javax.management.MBeanServerConnection.createMBean(java.lang.String,javax.management.ObjectName,javax.
     *      management.ObjectName) throws
     *      javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.
     *      MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,javax
     *      .management.InstanceNotFoundException,java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createMBean_String_ObjectName_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerConnection#createMBean(String, javax.management.ObjectName)
     * public abstract javax.management.ObjectInstance
     * javax.management.MBeanServerConnection.createMBean(java.lang.String,javax.management.ObjectName) throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,java.io.IOException}
     * .
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerConnection#createMBean(String, javax.management.ObjectName)
     * public abstract javax.management.ObjectInstance
     * javax.management.MBeanServerConnection.createMBean(java.lang.String,javax.management.ObjectName) throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#createMBean(String, javax.management.ObjectName) public abstract
     *      javax.management.ObjectInstance
     *      javax.management.MBeanServerConnection.createMBean(java.lang.String,javax.management.ObjectName) throws
     *      javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.
     *      MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,java.
     *      io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createMBean_String_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#createMBean(String, javax.management.ObjectName, javax.management.ObjectName, Object[], String[])
     * public abstract javax.management.ObjectInstance
     * javax.management.MBeanServerConnection.createMBean(java.lang.String,javax.management.ObjectName,javax.management.ObjectName,java.lang.Object[],java.lang.String[])
     * throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,javax.management.InstanceNotFoundException,java.io.IOException}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#createMBean(String, javax.management.ObjectName, javax.management.ObjectName, Object[], String[])
     * public abstract javax.management.ObjectInstance
     * javax.management.MBeanServerConnection.createMBean(java.lang.String,javax.management.ObjectName,javax.management.ObjectName,java.lang.Object[],java.lang.String[])
     * throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,javax.management.InstanceNotFoundException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#createMBean(String, javax.management.ObjectName,
     *      javax.management.ObjectName, Object[], String[]) public abstract javax.management.ObjectInstance
     *      javax.management.MBeanServerConnection.createMBean(java.lang.String,javax.management.ObjectName,javax.
     *      management.ObjectName,java.lang.Object[],java.lang.String[]) throws
     *      javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.
     *      MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,javax
     *      .management.InstanceNotFoundException,java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createMBean_String_ObjectName_ObjectName_ObjectArray_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerConnection#getDefaultDomain() public abstract java.lang.String
     * javax.management.MBeanServerConnection.getDefaultDomain() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerConnection#getDefaultDomain() public abstract java.lang.String
     * javax.management.MBeanServerConnection.getDefaultDomain() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#getDefaultDomain() public abstract java.lang.String
     *      javax.management.MBeanServerConnection.getDefaultDomain() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultDomain()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerConnection#getObjectInstance(javax.management.ObjectName)
     * public abstract javax.management.ObjectInstance
     * javax.management.MBeanServerConnection.getObjectInstance(javax.management.ObjectName) throws
     * javax.management.InstanceNotFoundException,java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerConnection#getObjectInstance(javax.management.ObjectName)
     * public abstract javax.management.ObjectInstance
     * javax.management.MBeanServerConnection.getObjectInstance(javax.management.ObjectName) throws
     * javax.management.InstanceNotFoundException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#getObjectInstance(javax.management.ObjectName) public abstract
     *      javax.management.ObjectInstance
     *      javax.management.MBeanServerConnection.getObjectInstance(javax.management.ObjectName) throws
     *      javax.management.InstanceNotFoundException,java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObjectInstance_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerConnection#getDomains() public abstract java.lang.String[]
     * javax.management.MBeanServerConnection.getDomains() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerConnection#getDomains() public abstract java.lang.String[]
     * javax.management.MBeanServerConnection.getDomains() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#getDomains() public abstract java.lang.String[]
     *      javax.management.MBeanServerConnection.getDomains() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDomains()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#addNotificationListener(javax.management.ObjectName, javax.management.NotificationListener, javax.management.NotificationFilter, Object)
     * public abstract void
     * javax.management.MBeanServerConnection.addNotificationListener(javax.management.ObjectName,javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * throws javax.management.InstanceNotFoundException,java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#addNotificationListener(javax.management.ObjectName, javax.management.NotificationListener, javax.management.NotificationFilter, Object)
     * public abstract void
     * javax.management.MBeanServerConnection.addNotificationListener(javax.management.ObjectName,javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * throws javax.management.InstanceNotFoundException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#addNotificationListener(javax.management.ObjectName,
     *      javax.management.NotificationListener, javax.management.NotificationFilter, Object) public abstract void
     *      javax.management.MBeanServerConnection.addNotificationListener(javax.management.ObjectName,javax.management.
     *      NotificationListener,javax.management.NotificationFilter,java.lang.Object) throws
     *      javax.management.InstanceNotFoundException,java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addNotificationListener_ObjectName_NotificationListener_NotificationFilter_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#addNotificationListener(javax.management.ObjectName, javax.management.ObjectName, javax.management.NotificationFilter, Object)
     * public abstract void
     * javax.management.MBeanServerConnection.addNotificationListener(javax.management.ObjectName,javax.management.ObjectName,javax.management.NotificationFilter,java.lang.Object)
     * throws javax.management.InstanceNotFoundException,java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#addNotificationListener(javax.management.ObjectName, javax.management.ObjectName, javax.management.NotificationFilter, Object)
     * public abstract void
     * javax.management.MBeanServerConnection.addNotificationListener(javax.management.ObjectName,javax.management.ObjectName,javax.management.NotificationFilter,java.lang.Object)
     * throws javax.management.InstanceNotFoundException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#addNotificationListener(javax.management.ObjectName,
     *      javax.management.ObjectName, javax.management.NotificationFilter, Object) public abstract void
     *      javax.management.MBeanServerConnection.addNotificationListener(javax.management.ObjectName,javax.management.
     *      ObjectName,javax.management.NotificationFilter,java.lang.Object) throws
     *      javax.management.InstanceNotFoundException,java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addNotificationListener_ObjectName_ObjectName_NotificationFilter_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#queryMBeans(javax.management.ObjectName, javax.management.QueryExp)
     * public abstract java.util.Set<javax.management.ObjectInstance>
     * javax.management.MBeanServerConnection.queryMBeans(javax.management.ObjectName,javax.management.QueryExp) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#queryMBeans(javax.management.ObjectName, javax.management.QueryExp)
     * public abstract java.util.Set
     * javax.management.MBeanServerConnection.queryMBeans(javax.management.ObjectName,javax.management.QueryExp) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#queryMBeans(javax.management.ObjectName, javax.management.QueryExp)
     *      public abstract java.util.Set
     *      javax.management.MBeanServerConnection.queryMBeans(javax.management.ObjectName,javax.management.QueryExp)
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_queryMBeans_ObjectName_QueryExp()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerConnection#isRegistered(javax.management.ObjectName) public
     * abstract boolean javax.management.MBeanServerConnection.isRegistered(javax.management.ObjectName) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerConnection#isRegistered(javax.management.ObjectName) public
     * abstract boolean javax.management.MBeanServerConnection.isRegistered(javax.management.ObjectName) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#isRegistered(javax.management.ObjectName) public abstract boolean
     *      javax.management.MBeanServerConnection.isRegistered(javax.management.ObjectName) throws java.io.IOException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isRegistered_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerConnection#isInstanceOf(javax.management.ObjectName, String)
     * public abstract boolean
     * javax.management.MBeanServerConnection.isInstanceOf(javax.management.ObjectName,java.lang.String) throws
     * javax.management.InstanceNotFoundException,java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerConnection#isInstanceOf(javax.management.ObjectName, String)
     * public abstract boolean
     * javax.management.MBeanServerConnection.isInstanceOf(javax.management.ObjectName,java.lang.String) throws
     * javax.management.InstanceNotFoundException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#isInstanceOf(javax.management.ObjectName, String) public abstract
     *      boolean javax.management.MBeanServerConnection.isInstanceOf(javax.management.ObjectName,java.lang.String)
     *      throws javax.management.InstanceNotFoundException,java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isInstanceOf_ObjectName_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerConnection#getMBeanInfo(javax.management.ObjectName) public
     * abstract javax.management.MBeanInfo
     * javax.management.MBeanServerConnection.getMBeanInfo(javax.management.ObjectName) throws
     * javax.management.InstanceNotFoundException,javax.management.IntrospectionException,javax.management.ReflectionException,java.io.IOException}
     * .
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerConnection#getMBeanInfo(javax.management.ObjectName) public
     * abstract javax.management.MBeanInfo
     * javax.management.MBeanServerConnection.getMBeanInfo(javax.management.ObjectName) throws
     * javax.management.InstanceNotFoundException,javax.management.IntrospectionException,javax.management.ReflectionException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#getMBeanInfo(javax.management.ObjectName) public abstract
     *      javax.management.MBeanInfo javax.management.MBeanServerConnection.getMBeanInfo(javax.management.ObjectName)
     *      throws javax.management.InstanceNotFoundException,javax.management.IntrospectionException,javax.management.
     *      ReflectionException,java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMBeanInfo_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#removeNotificationListener(javax.management.ObjectName, javax.management.NotificationListener, javax.management.NotificationFilter, Object)
     * public abstract void
     * javax.management.MBeanServerConnection.removeNotificationListener(javax.management.ObjectName,javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * throws javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException,java.io.IOException}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#removeNotificationListener(javax.management.ObjectName, javax.management.NotificationListener, javax.management.NotificationFilter, Object)
     * public abstract void
     * javax.management.MBeanServerConnection.removeNotificationListener(javax.management.ObjectName,javax.management.NotificationListener,javax.management.NotificationFilter,java.lang.Object)
     * throws javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#removeNotificationListener(javax.management.ObjectName,
     *      javax.management.NotificationListener, javax.management.NotificationFilter, Object) public abstract void
     *      javax.management.MBeanServerConnection.removeNotificationListener(javax.management.ObjectName,javax.
     *      management.NotificationListener,javax.management.NotificationFilter,java.lang.Object) throws
     *      javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException,java.io.IOException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeNotificationListener_ObjectName_NotificationListener_NotificationFilter_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#removeNotificationListener(javax.management.ObjectName, javax.management.ObjectName)
     * public abstract void
     * javax.management.MBeanServerConnection.removeNotificationListener(javax.management.ObjectName,javax.management.ObjectName)
     * throws javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException,java.io.IOException}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#removeNotificationListener(javax.management.ObjectName, javax.management.ObjectName)
     * public abstract void
     * javax.management.MBeanServerConnection.removeNotificationListener(javax.management.ObjectName,javax.management.ObjectName)
     * throws javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#removeNotificationListener(javax.management.ObjectName,
     *      javax.management.ObjectName) public abstract void
     *      javax.management.MBeanServerConnection.removeNotificationListener(javax.management.ObjectName,javax.
     *      management.ObjectName) throws
     *      javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException,java.io.IOException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeNotificationListener_ObjectName_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#removeNotificationListener(javax.management.ObjectName, javax.management.NotificationListener)
     * public abstract void
     * javax.management.MBeanServerConnection.removeNotificationListener(javax.management.ObjectName,javax.management.NotificationListener)
     * throws javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException,java.io.IOException}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#removeNotificationListener(javax.management.ObjectName, javax.management.NotificationListener)
     * public abstract void
     * javax.management.MBeanServerConnection.removeNotificationListener(javax.management.ObjectName,javax.management.NotificationListener)
     * throws javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#removeNotificationListener(javax.management.ObjectName,
     *      javax.management.NotificationListener) public abstract void
     *      javax.management.MBeanServerConnection.removeNotificationListener(javax.management.ObjectName,javax.
     *      management.NotificationListener) throws
     *      javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException,java.io.IOException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeNotificationListener_ObjectName_NotificationListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#removeNotificationListener(javax.management.ObjectName, javax.management.ObjectName, javax.management.NotificationFilter, Object)
     * public abstract void
     * javax.management.MBeanServerConnection.removeNotificationListener(javax.management.ObjectName,javax.management.ObjectName,javax.management.NotificationFilter,java.lang.Object)
     * throws javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException,java.io.IOException}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#removeNotificationListener(javax.management.ObjectName, javax.management.ObjectName, javax.management.NotificationFilter, Object)
     * public abstract void
     * javax.management.MBeanServerConnection.removeNotificationListener(javax.management.ObjectName,javax.management.ObjectName,javax.management.NotificationFilter,java.lang.Object)
     * throws javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#removeNotificationListener(javax.management.ObjectName,
     *      javax.management.ObjectName, javax.management.NotificationFilter, Object) public abstract void
     *      javax.management.MBeanServerConnection.removeNotificationListener(javax.management.ObjectName,javax.
     *      management.ObjectName,javax.management.NotificationFilter,java.lang.Object) throws
     *      javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException,java.io.IOException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeNotificationListener_ObjectName_ObjectName_NotificationFilter_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerConnection#unregisterMBean(javax.management.ObjectName) public
     * abstract void javax.management.MBeanServerConnection.unregisterMBean(javax.management.ObjectName) throws
     * javax.management.InstanceNotFoundException,javax.management.MBeanRegistrationException,java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerConnection#unregisterMBean(javax.management.ObjectName) public
     * abstract void javax.management.MBeanServerConnection.unregisterMBean(javax.management.ObjectName) throws
     * javax.management.InstanceNotFoundException,javax.management.MBeanRegistrationException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#unregisterMBean(javax.management.ObjectName) public abstract void
     *      javax.management.MBeanServerConnection.unregisterMBean(javax.management.ObjectName) throws
     *      javax.management.InstanceNotFoundException,javax.management.MBeanRegistrationException,java.io.IOException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unregisterMBean_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#setAttributes(javax.management.ObjectName, javax.management.AttributeList)
     * public abstract javax.management.AttributeList
     * javax.management.MBeanServerConnection.setAttributes(javax.management.ObjectName,javax.management.AttributeList)
     * throws javax.management.InstanceNotFoundException,javax.management.ReflectionException,java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#setAttributes(javax.management.ObjectName, javax.management.AttributeList)
     * public abstract javax.management.AttributeList
     * javax.management.MBeanServerConnection.setAttributes(javax.management.ObjectName,javax.management.AttributeList)
     * throws javax.management.InstanceNotFoundException,javax.management.ReflectionException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#setAttributes(javax.management.ObjectName,
     *      javax.management.AttributeList) public abstract javax.management.AttributeList
     *      javax.management.MBeanServerConnection.setAttributes(javax.management.ObjectName,javax.management.
     *      AttributeList) throws
     *      javax.management.InstanceNotFoundException,javax.management.ReflectionException,java.io.IOException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAttributes_ObjectName_AttributeList()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#invoke(javax.management.ObjectName, String, Object[], String[])
     * public abstract java.lang.Object
     * javax.management.MBeanServerConnection.invoke(javax.management.ObjectName,java.lang.String,java.lang.Object[],java.lang.String[])
     * throws
     * javax.management.InstanceNotFoundException,javax.management.MBeanException,javax.management.ReflectionException,java.io.IOException}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#invoke(javax.management.ObjectName, String, Object[], String[])
     * public abstract java.lang.Object
     * javax.management.MBeanServerConnection.invoke(javax.management.ObjectName,java.lang.String,java.lang.Object[],java.lang.String[])
     * throws
     * javax.management.InstanceNotFoundException,javax.management.MBeanException,javax.management.ReflectionException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#invoke(javax.management.ObjectName, String, Object[], String[])
     *      public abstract java.lang.Object
     *      javax.management.MBeanServerConnection.invoke(javax.management.ObjectName,java.lang.String,java.lang.Object[
     *      ],java.lang.String[]) throws
     *      javax.management.InstanceNotFoundException,javax.management.MBeanException,javax.management.
     *      ReflectionException,java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invoke_ObjectName_String_ObjectArray_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerConnection#getAttribute(javax.management.ObjectName, String)
     * public abstract java.lang.Object
     * javax.management.MBeanServerConnection.getAttribute(javax.management.ObjectName,java.lang.String) throws
     * javax.management.MBeanException,javax.management.AttributeNotFoundException,javax.management.InstanceNotFoundException,javax.management.ReflectionException,java.io.IOException}
     * .
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerConnection#getAttribute(javax.management.ObjectName, String)
     * public abstract java.lang.Object
     * javax.management.MBeanServerConnection.getAttribute(javax.management.ObjectName,java.lang.String) throws
     * javax.management.MBeanException,javax.management.AttributeNotFoundException,javax.management.InstanceNotFoundException,javax.management.ReflectionException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#getAttribute(javax.management.ObjectName, String) public abstract
     *      java.lang.Object
     *      javax.management.MBeanServerConnection.getAttribute(javax.management.ObjectName,java.lang.String) throws
     *      javax.management.MBeanException,javax.management.AttributeNotFoundException,javax.management.
     *      InstanceNotFoundException,javax.management.ReflectionException,java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttribute_ObjectName_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#setAttribute(javax.management.ObjectName, javax.management.Attribute)
     * public abstract void
     * javax.management.MBeanServerConnection.setAttribute(javax.management.ObjectName,javax.management.Attribute)
     * throws
     * javax.management.InstanceNotFoundException,javax.management.AttributeNotFoundException,javax.management.InvalidAttributeValueException,javax.management.MBeanException,javax.management.ReflectionException,java.io.IOException}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerConnection#setAttribute(javax.management.ObjectName, javax.management.Attribute)
     * public abstract void
     * javax.management.MBeanServerConnection.setAttribute(javax.management.ObjectName,javax.management.Attribute)
     * throws
     * javax.management.InstanceNotFoundException,javax.management.AttributeNotFoundException,javax.management.InvalidAttributeValueException,javax.management.MBeanException,javax.management.ReflectionException,java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#setAttribute(javax.management.ObjectName, javax.management.Attribute)
     *      public abstract void
     *      javax.management.MBeanServerConnection.setAttribute(javax.management.ObjectName,javax.management.Attribute)
     *      throws
     *      javax.management.InstanceNotFoundException,javax.management.AttributeNotFoundException,javax.management.
     *      InvalidAttributeValueException,javax.management.MBeanException,javax.management.ReflectionException,java.io.
     *      IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAttribute_ObjectName_Attribute()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerConnection#getMBeanCount() public abstract java.lang.Integer
     * javax.management.MBeanServerConnection.getMBeanCount() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerConnection#getMBeanCount() public abstract java.lang.Integer
     * javax.management.MBeanServerConnection.getMBeanCount() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerConnection#getMBeanCount() public abstract java.lang.Integer
     *      javax.management.MBeanServerConnection.getMBeanCount() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMBeanCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
