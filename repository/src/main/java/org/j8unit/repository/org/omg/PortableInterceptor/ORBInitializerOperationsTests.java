package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableInterceptor.ORBInitializerOperations interface
 * org.omg.PortableInterceptor.ORBInitializerOperations}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link ORBInitializerOperationsClassTests}.
 * </p>
 *
 * @see org.omg.PortableInterceptor.ORBInitializerOperations interface
 *      org.omg.PortableInterceptor.ORBInitializerOperations (the hereby targeted class-under-test class)
 * @see ORBInitializerOperationsClassTests ORBInitializerOperationsClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ORBInitializerOperationsTests<SUT extends org.omg.PortableInterceptor.ORBInitializerOperations>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableInterceptor.ORBInitializerOperations#post_init(org.omg.PortableInterceptor.ORBInitInfo)
     * public abstract void
     * org.omg.PortableInterceptor.ORBInitializerOperations.post_init(org.omg.PortableInterceptor.ORBInitInfo)}.
     *
     * <p>
     * Test method for
     * {@link org.omg.PortableInterceptor.ORBInitializerOperations#post_init(org.omg.PortableInterceptor.ORBInitInfo)
     * public abstract void
     * org.omg.PortableInterceptor.ORBInitializerOperations.post_init(org.omg.PortableInterceptor.ORBInitInfo)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableInterceptor.ORBInitializerOperations#post_init(org.omg.PortableInterceptor.ORBInitInfo)
     *      public abstract void
     *      org.omg.PortableInterceptor.ORBInitializerOperations.post_init(org.omg.PortableInterceptor.ORBInitInfo) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_post_init_ORBInitInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableInterceptor.ORBInitializerOperations#pre_init(org.omg.PortableInterceptor.ORBInitInfo)
     * public abstract void
     * org.omg.PortableInterceptor.ORBInitializerOperations.pre_init(org.omg.PortableInterceptor.ORBInitInfo)}.
     *
     * <p>
     * Test method for
     * {@link org.omg.PortableInterceptor.ORBInitializerOperations#pre_init(org.omg.PortableInterceptor.ORBInitInfo)
     * public abstract void
     * org.omg.PortableInterceptor.ORBInitializerOperations.pre_init(org.omg.PortableInterceptor.ORBInitInfo)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableInterceptor.ORBInitializerOperations#pre_init(org.omg.PortableInterceptor.ORBInitInfo)
     *      public abstract void
     *      org.omg.PortableInterceptor.ORBInitializerOperations.pre_init(org.omg.PortableInterceptor.ORBInitInfo) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_pre_init_ORBInitInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
