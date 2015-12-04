package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableInterceptor.ORBInitializerOperations interface
 * org.omg.PortableInterceptor.ORBInitializerOperations}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableInterceptor.ORBInitializerOperationsClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ORBInitializerOperationsTests<SUT extends org.omg.PortableInterceptor.ORBInitializerOperations>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableInterceptor.ORBInitializerOperations#post_init(org.omg.PortableInterceptor.ORBInitInfo)
     * public abstract void
     * org.omg.PortableInterceptor.ORBInitializerOperations.post_init(org.omg.PortableInterceptor.ORBInitInfo)}.
     * </p>
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
     * </p>
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
