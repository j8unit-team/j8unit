package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.beans.beancontext.BeanContextServiceAvailableEvent class
 * java.beans.beancontext.BeanContextServiceAvailableEvent}. The complementary j8unit test interface containing the
 * class relevant aspects is {@link BeanContextServiceAvailableEventClassTests}.
 * </p>
 *
 * @see java.beans.beancontext.BeanContextServiceAvailableEvent class
 *      java.beans.beancontext.BeanContextServiceAvailableEvent (the hereby targeted class-under-test class)
 * @see BeanContextServiceAvailableEventClassTests BeanContextServiceAvailableEventClassTests (the complementary j8unit
 *      test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BeanContextServiceAvailableEventTests<SUT extends java.beans.beancontext.BeanContextServiceAvailableEvent>
extends BeanContextEventTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServiceAvailableEvent#getServiceClass() public
     * java.lang.Class java.beans.beancontext.BeanContextServiceAvailableEvent.getServiceClass()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServiceAvailableEvent#getServiceClass() public
     * java.lang.Class java.beans.beancontext.BeanContextServiceAvailableEvent.getServiceClass()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextServiceAvailableEvent#getServiceClass() public java.lang.Class
     *      java.beans.beancontext.BeanContextServiceAvailableEvent.getServiceClass() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getServiceClass()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServiceAvailableEvent#getCurrentServiceSelectors()
     * public java.util.Iterator java.beans.beancontext.BeanContextServiceAvailableEvent.getCurrentServiceSelectors()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServiceAvailableEvent#getCurrentServiceSelectors()
     * public java.util.Iterator java.beans.beancontext.BeanContextServiceAvailableEvent.getCurrentServiceSelectors()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextServiceAvailableEvent#getCurrentServiceSelectors() public
     *      java.util.Iterator java.beans.beancontext.BeanContextServiceAvailableEvent.getCurrentServiceSelectors() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCurrentServiceSelectors()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServiceAvailableEvent#getSourceAsBeanContextServices()
     * public java.beans.beancontext.BeanContextServices
     * java.beans.beancontext.BeanContextServiceAvailableEvent.getSourceAsBeanContextServices()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServiceAvailableEvent#getSourceAsBeanContextServices()
     * public java.beans.beancontext.BeanContextServices
     * java.beans.beancontext.BeanContextServiceAvailableEvent.getSourceAsBeanContextServices()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextServiceAvailableEvent#getSourceAsBeanContextServices() public
     *      java.beans.beancontext.BeanContextServices
     *      java.beans.beancontext.BeanContextServiceAvailableEvent.getSourceAsBeanContextServices() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSourceAsBeanContextServices()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
