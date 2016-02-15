package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableInterceptor.IORInterceptorOperations interface
 * org.omg.PortableInterceptor.IORInterceptorOperations}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link IORInterceptorOperationsClassTests}.
 * </p>
 *
 * @see org.omg.PortableInterceptor.IORInterceptorOperations interface
 *      org.omg.PortableInterceptor.IORInterceptorOperations (the hereby targeted class-under-test class)
 * @see IORInterceptorOperationsClassTests IORInterceptorOperationsClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IORInterceptorOperationsTests<SUT extends org.omg.PortableInterceptor.IORInterceptorOperations>
extends InterceptorOperationsTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableInterceptor.IORInterceptorOperations#establish_components(org.omg.PortableInterceptor.IORInfo)
     * public abstract void
     * org.omg.PortableInterceptor.IORInterceptorOperations.establish_components(org.omg.PortableInterceptor.IORInfo)}.
     *
     * <p>
     * Test method for
     * {@link org.omg.PortableInterceptor.IORInterceptorOperations#establish_components(org.omg.PortableInterceptor.IORInfo)
     * public abstract void
     * org.omg.PortableInterceptor.IORInterceptorOperations.establish_components(org.omg.PortableInterceptor.IORInfo)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableInterceptor.IORInterceptorOperations#establish_components(org.omg.PortableInterceptor.IORInfo)
     *      public abstract void
     *      org.omg.PortableInterceptor.IORInterceptorOperations.establish_components(org.omg.PortableInterceptor.
     *      IORInfo) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_establish_components_IORInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
