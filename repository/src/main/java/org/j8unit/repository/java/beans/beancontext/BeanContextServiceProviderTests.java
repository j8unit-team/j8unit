package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextServiceProvider;
import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link BeanContextServiceProvider public abstract interface java.beans.beancontext.BeanContextServiceProvider}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.beans.beancontext.BeanContextServiceProviderClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BeanContextServiceProviderTests<SUT extends BeanContextServiceProvider>
extends RepositoryTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.beancontext.BeanContextServiceProvider]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.beans.beancontext.BeanContextServiceProvider#getService(java.beans.beancontext.BeanContextServices, Object, Class, Object)
     * public abstract java.lang.Object
     * java.beans.beancontext.BeanContextServiceProvider.getService(java.beans.beancontext.BeanContextServices,java.lang.Object,java.lang.Class,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getService_BeanContextServices_Object_Class_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.beans.beancontext.BeanContextServiceProvider#releaseService(java.beans.beancontext.BeanContextServices, Object, Object)
     * public abstract void
     * java.beans.beancontext.BeanContextServiceProvider.releaseService(java.beans.beancontext.BeanContextServices,java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_releaseService_BeanContextServices_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.beans.beancontext.BeanContextServiceProvider#getCurrentServiceSelectors(java.beans.beancontext.BeanContextServices, Class)
     * public abstract java.util.Iterator
     * java.beans.beancontext.BeanContextServiceProvider.getCurrentServiceSelectors(java.beans.beancontext.BeanContextServices,java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCurrentServiceSelectors_BeanContextServices_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.beancontext.BeanContextServiceProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.beancontext.BeanContextServiceProvider]

}
