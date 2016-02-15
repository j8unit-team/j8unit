package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.beans.beancontext.BeanContextEvent class
 * java.beans.beancontext.BeanContextEvent}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link BeanContextEventClassTests}.
 * </p>
 *
 * @see java.beans.beancontext.BeanContextEvent class java.beans.beancontext.BeanContextEvent (the hereby targeted
 *      class-under-test class)
 * @see BeanContextEventClassTests BeanContextEventClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BeanContextEventTests<SUT extends java.beans.beancontext.BeanContextEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextEvent#isPropagated() public synchronized boolean
     * java.beans.beancontext.BeanContextEvent.isPropagated()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextEvent#isPropagated() public synchronized boolean
     * java.beans.beancontext.BeanContextEvent.isPropagated()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextEvent#isPropagated() public synchronized boolean
     *      java.beans.beancontext.BeanContextEvent.isPropagated() (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextEvent#setPropagatedFrom(java.beans.beancontext.BeanContext) public
     * synchronized void java.beans.beancontext.BeanContextEvent.setPropagatedFrom(java.beans.beancontext.BeanContext)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextEvent#setPropagatedFrom(java.beans.beancontext.BeanContext) public
     *      synchronized void
     *      java.beans.beancontext.BeanContextEvent.setPropagatedFrom(java.beans.beancontext.BeanContext) (the hereby
     *      targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextEvent#getPropagatedFrom() public synchronized
     * java.beans.beancontext.BeanContext java.beans.beancontext.BeanContextEvent.getPropagatedFrom()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextEvent#getPropagatedFrom() public synchronized
     *      java.beans.beancontext.BeanContext java.beans.beancontext.BeanContextEvent.getPropagatedFrom() (the hereby
     *      targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextEvent#getBeanContext() public
     * java.beans.beancontext.BeanContext java.beans.beancontext.BeanContextEvent.getBeanContext()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextEvent#getBeanContext() public java.beans.beancontext.BeanContext
     *      java.beans.beancontext.BeanContextEvent.getBeanContext() (the hereby targeted method-under-test)
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
