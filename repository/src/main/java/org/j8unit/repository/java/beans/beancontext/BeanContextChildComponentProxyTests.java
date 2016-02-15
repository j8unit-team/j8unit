package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.beans.beancontext.BeanContextChildComponentProxy interface
 * java.beans.beancontext.BeanContextChildComponentProxy}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link BeanContextChildComponentProxyClassTests}.
 * </p>
 *
 * @see java.beans.beancontext.BeanContextChildComponentProxy interface
 *      java.beans.beancontext.BeanContextChildComponentProxy (the hereby targeted class-under-test class)
 * @see BeanContextChildComponentProxyClassTests BeanContextChildComponentProxyClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BeanContextChildComponentProxyTests<SUT extends java.beans.beancontext.BeanContextChildComponentProxy>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextChildComponentProxy#getComponent() public abstract
     * java.awt.Component java.beans.beancontext.BeanContextChildComponentProxy.getComponent()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextChildComponentProxy#getComponent() public abstract
     * java.awt.Component java.beans.beancontext.BeanContextChildComponentProxy.getComponent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextChildComponentProxy#getComponent() public abstract java.awt.Component
     *      java.beans.beancontext.BeanContextChildComponentProxy.getComponent() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
