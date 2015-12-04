package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.beans.beancontext.BeanContextProxy interface java.beans.beancontext.BeanContextProxy},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.beans.beancontext.BeanContextProxyClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BeanContextProxyTests<SUT extends java.beans.beancontext.BeanContextProxy>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextProxy#getBeanContextProxy() public abstract
     * java.beans.beancontext.BeanContextChild java.beans.beancontext.BeanContextProxy.getBeanContextProxy()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBeanContextProxy()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
