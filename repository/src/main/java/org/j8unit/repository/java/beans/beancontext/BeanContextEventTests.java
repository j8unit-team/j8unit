package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.beans.beancontext.BeanContextEvent class java.beans.beancontext.BeanContextEvent},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.beans.beancontext.BeanContextEventClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BeanContextEventTests<SUT extends java.beans.beancontext.BeanContextEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextEvent#isPropagated() public synchronized boolean
     * java.beans.beancontext.BeanContextEvent.isPropagated()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isPropagated()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextEvent#setPropagatedFrom(java.beans.beancontext.BeanContext) public
     * synchronized void java.beans.beancontext.BeanContextEvent.setPropagatedFrom(java.beans.beancontext.BeanContext)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPropagatedFrom_BeanContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextEvent#getPropagatedFrom() public synchronized
     * java.beans.beancontext.BeanContext java.beans.beancontext.BeanContextEvent.getPropagatedFrom()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPropagatedFrom()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextEvent#getBeanContext() public
     * java.beans.beancontext.BeanContext java.beans.beancontext.BeanContextEvent.getBeanContext()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBeanContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
