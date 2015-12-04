package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableInterceptor.CurrentOperations interface
 * org.omg.PortableInterceptor.CurrentOperations}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableInterceptor.CurrentOperationsClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CurrentOperationsTests<SUT extends org.omg.PortableInterceptor.CurrentOperations>
extends org.j8unit.repository.org.omg.CORBA.CurrentOperationsTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.CurrentOperations#get_slot(int) public abstract
     * org.omg.CORBA.Any org.omg.PortableInterceptor.CurrentOperations.get_slot(int) throws
     * org.omg.PortableInterceptor.InvalidSlot}.
     * </p>
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

    /**
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.CurrentOperations#set_slot(int,org.omg.CORBA.Any) public
     * abstract void org.omg.PortableInterceptor.CurrentOperations.set_slot(int,org.omg.CORBA.Any) throws
     * org.omg.PortableInterceptor.InvalidSlot}.
     * </p>
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

}
