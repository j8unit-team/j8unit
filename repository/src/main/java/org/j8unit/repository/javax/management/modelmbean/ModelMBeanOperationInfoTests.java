package org.j8unit.repository.javax.management.modelmbean;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.modelmbean.ModelMBeanOperationInfo class
 * javax.management.modelmbean.ModelMBeanOperationInfo}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link ModelMBeanOperationInfoClassTests}.
 * </p>
 *
 * @see javax.management.modelmbean.ModelMBeanOperationInfo class javax.management.modelmbean.ModelMBeanOperationInfo
 *      (the hereby targeted class-under-test class)
 * @see ModelMBeanOperationInfoClassTests ModelMBeanOperationInfoClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ModelMBeanOperationInfoTests<SUT extends javax.management.modelmbean.ModelMBeanOperationInfo>
extends org.j8unit.repository.javax.management.DescriptorAccessTests<SUT>, org.j8unit.repository.javax.management.MBeanOperationInfoTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanOperationInfo#getDescriptor() public
     * javax.management.Descriptor javax.management.modelmbean.ModelMBeanOperationInfo.getDescriptor()}.
     *
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanOperationInfo#getDescriptor() public
     * javax.management.Descriptor javax.management.modelmbean.ModelMBeanOperationInfo.getDescriptor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanOperationInfo#getDescriptor() public javax.management.Descriptor
     *      javax.management.modelmbean.ModelMBeanOperationInfo.getDescriptor() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.management.modelmbean.ModelMBeanOperationInfo#toString() public java.lang.String
     * javax.management.modelmbean.ModelMBeanOperationInfo.toString()}.
     *
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanOperationInfo#toString() public java.lang.String
     * javax.management.modelmbean.ModelMBeanOperationInfo.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanOperationInfo#toString() public java.lang.String
     *      javax.management.modelmbean.ModelMBeanOperationInfo.toString() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.management.modelmbean.ModelMBeanOperationInfo#clone() public java.lang.Object
     * javax.management.modelmbean.ModelMBeanOperationInfo.clone()}.
     *
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanOperationInfo#clone() public java.lang.Object
     * javax.management.modelmbean.ModelMBeanOperationInfo.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanOperationInfo#clone() public java.lang.Object
     *      javax.management.modelmbean.ModelMBeanOperationInfo.clone() (the hereby targeted method-under-test)
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
     * {@link javax.management.modelmbean.ModelMBeanOperationInfo#setDescriptor(javax.management.Descriptor) public void
     * javax.management.modelmbean.ModelMBeanOperationInfo.setDescriptor(javax.management.Descriptor)}.
     *
     * <p>
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanOperationInfo#setDescriptor(javax.management.Descriptor) public void
     * javax.management.modelmbean.ModelMBeanOperationInfo.setDescriptor(javax.management.Descriptor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBeanOperationInfo#setDescriptor(javax.management.Descriptor) public void
     *      javax.management.modelmbean.ModelMBeanOperationInfo.setDescriptor(javax.management.Descriptor) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setDescriptor_Descriptor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
