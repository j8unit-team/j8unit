package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableInterceptor.InterceptorOperations interface
 * org.omg.PortableInterceptor.InterceptorOperations}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableInterceptor.InterceptorOperationsClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface InterceptorOperationsTests<SUT extends org.omg.PortableInterceptor.InterceptorOperations>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.InterceptorOperations#destroy() public abstract void
     * org.omg.PortableInterceptor.InterceptorOperations.destroy()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_destroy()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.InterceptorOperations#name() public abstract java.lang.String
     * org.omg.PortableInterceptor.InterceptorOperations.name()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_name()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
