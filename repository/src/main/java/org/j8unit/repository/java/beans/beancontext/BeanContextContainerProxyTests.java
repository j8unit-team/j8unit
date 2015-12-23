package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.beans.beancontext.BeanContextContainerProxy interface
 * java.beans.beancontext.BeanContextContainerProxy}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.beans.beancontext.BeanContextContainerProxyTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.beans.beancontext.BeanContextContainerProxyClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.beans.beancontext.BeanContextContainerProxy
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BeanContextContainerProxyTests<SUT extends java.beans.beancontext.BeanContextContainerProxy>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextContainerProxy#getContainer() public abstract
     * java.awt.Container java.beans.beancontext.BeanContextContainerProxy.getContainer()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContextContainerProxy#getContainer()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContainer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
