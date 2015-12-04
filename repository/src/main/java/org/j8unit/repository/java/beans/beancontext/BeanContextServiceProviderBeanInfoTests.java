package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.beans.beancontext.BeanContextServiceProviderBeanInfo interface
 * java.beans.beancontext.BeanContextServiceProviderBeanInfo}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.beans.beancontext.BeanContextServiceProviderBeanInfoClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BeanContextServiceProviderBeanInfoTests<SUT extends java.beans.beancontext.BeanContextServiceProviderBeanInfo>
extends org.j8unit.repository.java.beans.BeanInfoTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServiceProviderBeanInfo#getServicesBeanInfo() public
     * abstract java.beans.BeanInfo[] java.beans.beancontext.BeanContextServiceProviderBeanInfo.getServicesBeanInfo()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getServicesBeanInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
