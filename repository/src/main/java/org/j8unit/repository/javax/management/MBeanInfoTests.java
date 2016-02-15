package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.MBeanInfo class javax.management.MBeanInfo}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link MBeanInfoClassTests}.
 * </p>
 *
 * @see javax.management.MBeanInfo class javax.management.MBeanInfo (the hereby targeted class-under-test class)
 * @see MBeanInfoClassTests MBeanInfoClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MBeanInfoTests<SUT extends javax.management.MBeanInfo>
extends org.j8unit.repository.java.lang.CloneableTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>, DescriptorReadTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.MBeanInfo#getDescription() public java.lang.String
     * javax.management.MBeanInfo.getDescription()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanInfo#getDescription() public java.lang.String
     * javax.management.MBeanInfo.getDescription()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanInfo#getDescription() public java.lang.String
     *      javax.management.MBeanInfo.getDescription() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDescription()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanInfo#clone() public java.lang.Object
     * javax.management.MBeanInfo.clone()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanInfo#clone() public java.lang.Object
     * javax.management.MBeanInfo.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanInfo#clone() public java.lang.Object javax.management.MBeanInfo.clone() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.management.MBeanInfo#getClassName() public java.lang.String
     * javax.management.MBeanInfo.getClassName()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanInfo#getClassName() public java.lang.String
     * javax.management.MBeanInfo.getClassName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanInfo#getClassName() public java.lang.String javax.management.MBeanInfo.getClassName()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getClassName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanInfo#toString() public java.lang.String
     * javax.management.MBeanInfo.toString()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanInfo#toString() public java.lang.String
     * javax.management.MBeanInfo.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanInfo#toString() public java.lang.String javax.management.MBeanInfo.toString() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link javax.management.MBeanInfo#getConstructors() public
     * javax.management.MBeanConstructorInfo[] javax.management.MBeanInfo.getConstructors()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanInfo#getConstructors() public
     * javax.management.MBeanConstructorInfo[] javax.management.MBeanInfo.getConstructors()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanInfo#getConstructors() public javax.management.MBeanConstructorInfo[]
     *      javax.management.MBeanInfo.getConstructors() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getConstructors()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanInfo#getNotifications() public
     * javax.management.MBeanNotificationInfo[] javax.management.MBeanInfo.getNotifications()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanInfo#getNotifications() public
     * javax.management.MBeanNotificationInfo[] javax.management.MBeanInfo.getNotifications()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanInfo#getNotifications() public javax.management.MBeanNotificationInfo[]
     *      javax.management.MBeanInfo.getNotifications() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNotifications()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanInfo#equals(Object) public boolean
     * javax.management.MBeanInfo.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanInfo#equals(Object) public boolean
     * javax.management.MBeanInfo.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanInfo#equals(Object) public boolean javax.management.MBeanInfo.equals(java.lang.Object)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanInfo#hashCode() public int javax.management.MBeanInfo.hashCode()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanInfo#hashCode() public int javax.management.MBeanInfo.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanInfo#hashCode() public int javax.management.MBeanInfo.hashCode() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanInfo#getDescriptor() public javax.management.Descriptor
     * javax.management.MBeanInfo.getDescriptor()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanInfo#getDescriptor() public javax.management.Descriptor
     * javax.management.MBeanInfo.getDescriptor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanInfo#getDescriptor() public javax.management.Descriptor
     *      javax.management.MBeanInfo.getDescriptor() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.management.MBeanInfo#getAttributes() public javax.management.MBeanAttributeInfo[]
     * javax.management.MBeanInfo.getAttributes()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanInfo#getAttributes() public javax.management.MBeanAttributeInfo[]
     * javax.management.MBeanInfo.getAttributes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanInfo#getAttributes() public javax.management.MBeanAttributeInfo[]
     *      javax.management.MBeanInfo.getAttributes() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.MBeanInfo#getOperations() public javax.management.MBeanOperationInfo[]
     * javax.management.MBeanInfo.getOperations()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanInfo#getOperations() public javax.management.MBeanOperationInfo[]
     * javax.management.MBeanInfo.getOperations()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanInfo#getOperations() public javax.management.MBeanOperationInfo[]
     *      javax.management.MBeanInfo.getOperations() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOperations()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
