package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.beans.beancontext.BeanContextServiceProvider interface
 * java.beans.beancontext.BeanContextServiceProvider}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.beans.beancontext.BeanContextServiceProviderClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BeanContextServiceProviderTests<SUT extends java.beans.beancontext.BeanContextServiceProvider>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServiceProvider#getCurrentServiceSelectors(java.beans.beancontext.BeanContextServices,java.lang.Class)
     * public abstract java.util.Iterator
     * java.beans.beancontext.BeanContextServiceProvider.getCurrentServiceSelectors(java.beans.beancontext.BeanContextServices,java.lang.Class)}
     * .
     * </p>
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
     * {@link java.beans.beancontext.BeanContextServiceProvider#getService(java.beans.beancontext.BeanContextServices,java.lang.Object,java.lang.Class,java.lang.Object)
     * public abstract java.lang.Object
     * java.beans.beancontext.BeanContextServiceProvider.getService(java.beans.beancontext.BeanContextServices,java.lang.Object,java.lang.Class,java.lang.Object)}
     * .
     * </p>
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
     * {@link java.beans.beancontext.BeanContextServiceProvider#releaseService(java.beans.beancontext.BeanContextServices,java.lang.Object,java.lang.Object)
     * public abstract void
     * java.beans.beancontext.BeanContextServiceProvider.releaseService(java.beans.beancontext.BeanContextServices,java.lang.Object,java.lang.Object)}
     * .
     * </p>
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
