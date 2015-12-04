package org.j8unit.repository.java.beans;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.beans.BeanDescriptor class java.beans.BeanDescriptor}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.beans.BeanDescriptorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BeanDescriptorTests<SUT extends java.beans.BeanDescriptor>
extends org.j8unit.repository.java.beans.FeatureDescriptorTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.BeanDescriptor#getBeanClass() public java.lang.Class
     * java.beans.BeanDescriptor.getBeanClass()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBeanClass()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.BeanDescriptor#getCustomizerClass() public java.lang.Class
     * java.beans.BeanDescriptor.getCustomizerClass()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCustomizerClass()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
