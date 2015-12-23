package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.beans.beancontext.BeanContextServiceProvider interface
 * java.beans.beancontext.BeanContextServiceProvider}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.beans.beancontext.BeanContextServiceProviderTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.beans.beancontext.BeanContextServiceProviderClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.beans.beancontext.BeanContextServiceProvider
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BeanContextServiceProviderTests<SUT extends java.beans.beancontext.BeanContextServiceProvider>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServiceProvider#getCurrentServiceSelectors(java.beans.beancontext.BeanContextServices, java.lang.Class)
     * public abstract java.util.Iterator
     * java.beans.beancontext.BeanContextServiceProvider.getCurrentServiceSelectors(java.beans.beancontext.BeanContextServices,java.lang.Class)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContextServiceProvider#getCurrentServiceSelectors(java.beans.beancontext.
     *             BeanContextServices, java.lang.Class)
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

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServiceProvider#getService(java.beans.beancontext.BeanContextServices, java.lang.Object, java.lang.Class, java.lang.Object)
     * public abstract java.lang.Object
     * java.beans.beancontext.BeanContextServiceProvider.getService(java.beans.beancontext.BeanContextServices,java.lang.Object,java.lang.Class,java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContextServiceProvider#getService(java.beans.beancontext.
     *             BeanContextServices, java.lang.Object, java.lang.Class, java.lang.Object)
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
     * Test method for
     * {@link java.beans.beancontext.BeanContextServiceProvider#releaseService(java.beans.beancontext.BeanContextServices, java.lang.Object, java.lang.Object)
     * public abstract void
     * java.beans.beancontext.BeanContextServiceProvider.releaseService(java.beans.beancontext.BeanContextServices,java.lang.Object,java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContextServiceProvider#releaseService(java.beans.beancontext.
     *             BeanContextServices, java.lang.Object, java.lang.Object)
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

}
