package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableInterceptor.CurrentOperations interface
 * org.omg.PortableInterceptor.CurrentOperations}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link CurrentOperationsClassTests}.
 * </p>
 *
 * @see org.omg.PortableInterceptor.CurrentOperations interface org.omg.PortableInterceptor.CurrentOperations (the
 *      hereby targeted class-under-test class)
 * @see CurrentOperationsClassTests CurrentOperationsClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CurrentOperationsTests<SUT extends org.omg.PortableInterceptor.CurrentOperations>
extends org.j8unit.repository.org.omg.CORBA.CurrentOperationsTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.CurrentOperations#set_slot(int, org.omg.CORBA.Any) public
     * abstract void org.omg.PortableInterceptor.CurrentOperations.set_slot(int,org.omg.CORBA.Any) throws
     * org.omg.PortableInterceptor.InvalidSlot}.
     *
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.CurrentOperations#set_slot(int, org.omg.CORBA.Any) public
     * abstract void org.omg.PortableInterceptor.CurrentOperations.set_slot(int,org.omg.CORBA.Any) throws
     * org.omg.PortableInterceptor.InvalidSlot}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableInterceptor.CurrentOperations#set_slot(int, org.omg.CORBA.Any) public abstract void
     *      org.omg.PortableInterceptor.CurrentOperations.set_slot(int,org.omg.CORBA.Any) throws
     *      org.omg.PortableInterceptor.InvalidSlot (the hereby targeted method-under-test)
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
     * Test method for {@link org.omg.PortableInterceptor.CurrentOperations#get_slot(int) public abstract
     * org.omg.CORBA.Any org.omg.PortableInterceptor.CurrentOperations.get_slot(int) throws
     * org.omg.PortableInterceptor.InvalidSlot}.
     *
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.CurrentOperations#get_slot(int) public abstract
     * org.omg.CORBA.Any org.omg.PortableInterceptor.CurrentOperations.get_slot(int) throws
     * org.omg.PortableInterceptor.InvalidSlot}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableInterceptor.CurrentOperations#get_slot(int) public abstract org.omg.CORBA.Any
     *      org.omg.PortableInterceptor.CurrentOperations.get_slot(int) throws org.omg.PortableInterceptor.InvalidSlot
     *      (the hereby targeted method-under-test)
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

}
