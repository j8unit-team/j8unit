package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.beans.beancontext.BeanContextServiceAvailableEvent class
 * java.beans.beancontext.BeanContextServiceAvailableEvent}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
 * class relevant test methods is
 * {@link org.j8unit.repository.java.beans.beancontext.BeanContextServiceAvailableEventTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.beans.beancontext.BeanContextServiceAvailableEventClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.beans.beancontext.BeanContextServiceAvailableEvent
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BeanContextServiceAvailableEventTests<SUT extends java.beans.beancontext.BeanContextServiceAvailableEvent>
extends org.j8unit.repository.java.beans.beancontext.BeanContextEventTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServiceAvailableEvent#getCurrentServiceSelectors()
     * public java.util.Iterator java.beans.beancontext.BeanContextServiceAvailableEvent.getCurrentServiceSelectors()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContextServiceAvailableEvent#getCurrentServiceSelectors()
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
     * Test method for {@link java.beans.beancontext.BeanContextServiceAvailableEvent#getServiceClass() public
     * java.lang.Class java.beans.beancontext.BeanContextServiceAvailableEvent.getServiceClass()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContextServiceAvailableEvent#getServiceClass()
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
     * Test method for {@link java.beans.beancontext.BeanContextServiceAvailableEvent#getSourceAsBeanContextServices()
     * public java.beans.beancontext.BeanContextServices
     * java.beans.beancontext.BeanContextServiceAvailableEvent.getSourceAsBeanContextServices()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContextServiceAvailableEvent#getSourceAsBeanContextServices()
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
