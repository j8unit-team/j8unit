package org.j8unit.repository.javax.management.modelmbean;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.modelmbean.ModelMBeanAttributeInfo class
 * javax.management.modelmbean.ModelMBeanAttributeInfo}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.modelmbean.ModelMBeanAttributeInfoClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ModelMBeanAttributeInfoTests<SUT extends javax.management.modelmbean.ModelMBeanAttributeInfo>
extends org.j8unit.repository.javax.management.DescriptorAccessTests<SUT>, org.j8unit.repository.javax.management.MBeanAttributeInfoTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanAttributeInfo#clone() public java.lang.Object
     * javax.management.modelmbean.ModelMBeanAttributeInfo.clone()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanAttributeInfo#getDescriptor() public
     * javax.management.Descriptor javax.management.modelmbean.ModelMBeanAttributeInfo.getDescriptor()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getDescriptor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanAttributeInfo#setDescriptor(javax.management.Descriptor) public void
     * javax.management.modelmbean.ModelMBeanAttributeInfo.setDescriptor(javax.management.Descriptor)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_setDescriptor_Descriptor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanAttributeInfo#toString() public java.lang.String
     * javax.management.modelmbean.ModelMBeanAttributeInfo.toString()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
