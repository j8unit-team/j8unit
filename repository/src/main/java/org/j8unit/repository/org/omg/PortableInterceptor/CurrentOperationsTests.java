package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.omg.PortableInterceptor.CurrentOperations;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link CurrentOperations public abstract interface org.omg.PortableInterceptor.CurrentOperations}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.CurrentOperationsClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CurrentOperationsTests<SUT extends CurrentOperations>
extends org.j8unit.repository.org.omg.CORBA.CurrentOperationsTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.CurrentOperations]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.PortableInterceptor.CurrentOperations#set_slot(int, org.omg.CORBA.Any) public abstract void
     * org.omg.PortableInterceptor.CurrentOperations.set_slot(int,org.omg.CORBA.Any) throws
     * org.omg.PortableInterceptor.InvalidSlot}.
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
    public default void test_set_slot_int_Any()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.PortableInterceptor.CurrentOperations#get_slot(int) public abstract org.omg.CORBA.Any
     * org.omg.PortableInterceptor.CurrentOperations.get_slot(int) throws org.omg.PortableInterceptor.InvalidSlot}.
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
    public default void test_get_slot_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableInterceptor.CurrentOperations]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableInterceptor.CurrentOperations]

}
