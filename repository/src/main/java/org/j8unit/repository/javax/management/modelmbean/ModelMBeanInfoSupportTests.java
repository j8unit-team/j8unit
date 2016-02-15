package org.j8unit.repository.javax.management.modelmbean;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.modelmbean.ModelMBeanInfoSupport class
 * javax.management.modelmbean.ModelMBeanInfoSupport}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link ModelMBeanInfoSupportClassTests}.
 * </p>
 *
 * @see javax.management.modelmbean.ModelMBeanInfoSupport class javax.management.modelmbean.ModelMBeanInfoSupport (the
 *      hereby targeted class-under-test class)
 * @see ModelMBeanInfoSupportClassTests ModelMBeanInfoSupportClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ModelMBeanInfoSupportTests<SUT extends javax.management.modelmbean.ModelMBeanInfoSupport>
extends ModelMBeanInfoTests<SUT>, org.j8unit.repository.javax.management.MBeanInfoTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanInfoSupport#getMBeanDescriptor() public
     * javax.management.Descriptor javax.management.modelmbean.ModelMBeanInfoSupport.getMBeanDescriptor() throws
     * javax.management.MBeanException}.
     *
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanInfoSupport#getMBeanDescriptor() public
     * javax.management.Descriptor javax.management.modelmbean.ModelMBeanInfoSupport.getMBeanDescriptor() throws
     * javax.management.MBeanException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanInfoSupport#getMBeanDescriptor() public javax.management.Descriptor
     *      javax.management.modelmbean.ModelMBeanInfoSupport.getMBeanDescriptor() throws
     *      javax.management.MBeanException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMBeanDescriptor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanInfoSupport#getConstructor(String) public
     * javax.management.modelmbean.ModelMBeanConstructorInfo
     * javax.management.modelmbean.ModelMBeanInfoSupport.getConstructor(java.lang.String) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanInfoSupport#getConstructor(String) public
     * javax.management.modelmbean.ModelMBeanConstructorInfo
     * javax.management.modelmbean.ModelMBeanInfoSupport.getConstructor(java.lang.String) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanInfoSupport#getConstructor(String) public
     *      javax.management.modelmbean.ModelMBeanConstructorInfo
     *      javax.management.modelmbean.ModelMBeanInfoSupport.getConstructor(java.lang.String) throws
     *      javax.management.MBeanException,javax.management.RuntimeOperationsException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getConstructor_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanInfoSupport#getNotification(String) public
     * javax.management.modelmbean.ModelMBeanNotificationInfo
     * javax.management.modelmbean.ModelMBeanInfoSupport.getNotification(java.lang.String) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanInfoSupport#getNotification(String) public
     * javax.management.modelmbean.ModelMBeanNotificationInfo
     * javax.management.modelmbean.ModelMBeanInfoSupport.getNotification(java.lang.String) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanInfoSupport#getNotification(String) public
     *      javax.management.modelmbean.ModelMBeanNotificationInfo
     *      javax.management.modelmbean.ModelMBeanInfoSupport.getNotification(java.lang.String) throws
     *      javax.management.MBeanException,javax.management.RuntimeOperationsException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getNotification_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanInfoSupport#getDescriptors(String) public
     * javax.management.Descriptor[] javax.management.modelmbean.ModelMBeanInfoSupport.getDescriptors(java.lang.String)
     * throws javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanInfoSupport#getDescriptors(String) public
     * javax.management.Descriptor[] javax.management.modelmbean.ModelMBeanInfoSupport.getDescriptors(java.lang.String)
     * throws javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanInfoSupport#getDescriptors(String) public
     *      javax.management.Descriptor[]
     *      javax.management.modelmbean.ModelMBeanInfoSupport.getDescriptors(java.lang.String) throws
     *      javax.management.MBeanException,javax.management.RuntimeOperationsException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getDescriptors_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanInfoSupport#setMBeanDescriptor(javax.management.Descriptor) public
     * void javax.management.modelmbean.ModelMBeanInfoSupport.setMBeanDescriptor(javax.management.Descriptor) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanInfoSupport#setMBeanDescriptor(javax.management.Descriptor) public
     * void javax.management.modelmbean.ModelMBeanInfoSupport.setMBeanDescriptor(javax.management.Descriptor) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanInfoSupport#setMBeanDescriptor(javax.management.Descriptor) public
     *      void javax.management.modelmbean.ModelMBeanInfoSupport.setMBeanDescriptor(javax.management.Descriptor)
     *      throws javax.management.MBeanException,javax.management.RuntimeOperationsException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setMBeanDescriptor_Descriptor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanInfoSupport#getDescriptor() public
     * javax.management.Descriptor javax.management.modelmbean.ModelMBeanInfoSupport.getDescriptor()}.
     *
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanInfoSupport#getDescriptor() public
     * javax.management.Descriptor javax.management.modelmbean.ModelMBeanInfoSupport.getDescriptor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanInfoSupport#getDescriptor() public javax.management.Descriptor
     *      javax.management.modelmbean.ModelMBeanInfoSupport.getDescriptor() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getDescriptor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanInfoSupport#getDescriptor(String, String) public
     * javax.management.Descriptor
     * javax.management.modelmbean.ModelMBeanInfoSupport.getDescriptor(java.lang.String,java.lang.String) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanInfoSupport#getDescriptor(String, String) public
     * javax.management.Descriptor
     * javax.management.modelmbean.ModelMBeanInfoSupport.getDescriptor(java.lang.String,java.lang.String) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanInfoSupport#getDescriptor(String, String) public
     *      javax.management.Descriptor
     *      javax.management.modelmbean.ModelMBeanInfoSupport.getDescriptor(java.lang.String,java.lang.String) throws
     *      javax.management.MBeanException,javax.management.RuntimeOperationsException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getDescriptor_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanInfoSupport#getDescriptor(String) public
     * javax.management.Descriptor javax.management.modelmbean.ModelMBeanInfoSupport.getDescriptor(java.lang.String)
     * throws javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanInfoSupport#getDescriptor(String) public
     * javax.management.Descriptor javax.management.modelmbean.ModelMBeanInfoSupport.getDescriptor(java.lang.String)
     * throws javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanInfoSupport#getDescriptor(String) public javax.management.Descriptor
     *      javax.management.modelmbean.ModelMBeanInfoSupport.getDescriptor(java.lang.String) throws
     *      javax.management.MBeanException,javax.management.RuntimeOperationsException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDescriptor_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanInfoSupport#getOperation(String) public
     * javax.management.modelmbean.ModelMBeanOperationInfo
     * javax.management.modelmbean.ModelMBeanInfoSupport.getOperation(java.lang.String) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanInfoSupport#getOperation(String) public
     * javax.management.modelmbean.ModelMBeanOperationInfo
     * javax.management.modelmbean.ModelMBeanInfoSupport.getOperation(java.lang.String) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanInfoSupport#getOperation(String) public
     *      javax.management.modelmbean.ModelMBeanOperationInfo
     *      javax.management.modelmbean.ModelMBeanInfoSupport.getOperation(java.lang.String) throws
     *      javax.management.MBeanException,javax.management.RuntimeOperationsException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getOperation_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanInfoSupport#clone() public java.lang.Object
     * javax.management.modelmbean.ModelMBeanInfoSupport.clone()}.
     *
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanInfoSupport#clone() public java.lang.Object
     * javax.management.modelmbean.ModelMBeanInfoSupport.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanInfoSupport#clone() public java.lang.Object
     *      javax.management.modelmbean.ModelMBeanInfoSupport.clone() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanInfoSupport#setDescriptor(javax.management.Descriptor, String)
     * public void
     * javax.management.modelmbean.ModelMBeanInfoSupport.setDescriptor(javax.management.Descriptor,java.lang.String)
     * throws javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanInfoSupport#setDescriptor(javax.management.Descriptor, String)
     * public void
     * javax.management.modelmbean.ModelMBeanInfoSupport.setDescriptor(javax.management.Descriptor,java.lang.String)
     * throws javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanInfoSupport#setDescriptor(javax.management.Descriptor, String) public
     *      void javax.management.modelmbean.ModelMBeanInfoSupport.setDescriptor(javax.management.Descriptor,java.lang.
     *      String) throws javax.management.MBeanException,javax.management.RuntimeOperationsException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setDescriptor_Descriptor_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanInfoSupport#setDescriptors(javax.management.Descriptor[]) public
     * void javax.management.modelmbean.ModelMBeanInfoSupport.setDescriptors(javax.management.Descriptor[]) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanInfoSupport#setDescriptors(javax.management.Descriptor[]) public
     * void javax.management.modelmbean.ModelMBeanInfoSupport.setDescriptors(javax.management.Descriptor[]) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanInfoSupport#setDescriptors(javax.management.Descriptor[]) public void
     *      javax.management.modelmbean.ModelMBeanInfoSupport.setDescriptors(javax.management.Descriptor[]) throws
     *      javax.management.MBeanException,javax.management.RuntimeOperationsException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setDescriptors_DescriptorArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanInfoSupport#getAttribute(String) public
     * javax.management.modelmbean.ModelMBeanAttributeInfo
     * javax.management.modelmbean.ModelMBeanInfoSupport.getAttribute(java.lang.String) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanInfoSupport#getAttribute(String) public
     * javax.management.modelmbean.ModelMBeanAttributeInfo
     * javax.management.modelmbean.ModelMBeanInfoSupport.getAttribute(java.lang.String) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanInfoSupport#getAttribute(String) public
     *      javax.management.modelmbean.ModelMBeanAttributeInfo
     *      javax.management.modelmbean.ModelMBeanInfoSupport.getAttribute(java.lang.String) throws
     *      javax.management.MBeanException,javax.management.RuntimeOperationsException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAttribute_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.management.MBeanInfo#getDescription() class javax.management.MBeanInfo}</li>
     * <li>{@linkplain javax.management.modelmbean.ModelMBeanInfo#getDescription() interface
     * javax.management.modelmbean.ModelMBeanInfo}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getDescription()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.management.MBeanInfo#getClassName() class javax.management.MBeanInfo}</li>
     * <li>{@linkplain javax.management.modelmbean.ModelMBeanInfo#getClassName() interface
     * javax.management.modelmbean.ModelMBeanInfo}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getClassName()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.management.MBeanInfo#getConstructors() class javax.management.MBeanInfo}</li>
     * <li>{@linkplain javax.management.modelmbean.ModelMBeanInfo#getConstructors() interface
     * javax.management.modelmbean.ModelMBeanInfo}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getConstructors()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.management.MBeanInfo#getNotifications() class javax.management.MBeanInfo}</li>
     * <li>{@linkplain javax.management.modelmbean.ModelMBeanInfo#getNotifications() interface
     * javax.management.modelmbean.ModelMBeanInfo}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getNotifications()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.management.MBeanInfo#getAttributes() class javax.management.MBeanInfo}</li>
     * <li>{@linkplain javax.management.modelmbean.ModelMBeanInfo#getAttributes() interface
     * javax.management.modelmbean.ModelMBeanInfo}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAttributes()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.management.MBeanInfo#getOperations() class javax.management.MBeanInfo}</li>
     * <li>{@linkplain javax.management.modelmbean.ModelMBeanInfo#getOperations() interface
     * javax.management.modelmbean.ModelMBeanInfo}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getOperations()
    throws Exception {
    }

}
