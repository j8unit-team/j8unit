package org.j8unit.repository.javax.management.modelmbean;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.modelmbean.ModelMBeanAttributeInfo class
 * javax.management.modelmbean.ModelMBeanAttributeInfo}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.management.modelmbean.ModelMBeanAttributeInfoTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.modelmbean.ModelMBeanAttributeInfoClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.modelmbean.ModelMBeanAttributeInfo
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ModelMBeanAttributeInfoTests<SUT extends javax.management.modelmbean.ModelMBeanAttributeInfo>
extends org.j8unit.repository.javax.management.DescriptorAccessTests<SUT>, org.j8unit.repository.javax.management.MBeanAttributeInfoTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBeanAttributeInfo#clone() public java.lang.Object
     * javax.management.modelmbean.ModelMBeanAttributeInfo.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.modelmbean.ModelMBeanAttributeInfo#clone()
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.modelmbean.ModelMBeanAttributeInfo#getDescriptor()
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.modelmbean.ModelMBeanAttributeInfo#setDescriptor(javax.management.Descriptor)
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.modelmbean.ModelMBeanAttributeInfo#toString()
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
