package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.beans.beancontext.BeanContextChildComponentProxy interface
 * java.beans.beancontext.BeanContextChildComponentProxy}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.beans.beancontext.BeanContextChildComponentProxyClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BeanContextChildComponentProxyTests<SUT extends java.beans.beancontext.BeanContextChildComponentProxy>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextChildComponentProxy#getComponent() public abstract
     * java.awt.Component java.beans.beancontext.BeanContextChildComponentProxy.getComponent()}.
     * </p>
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
