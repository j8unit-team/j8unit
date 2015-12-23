package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.PortableInterceptor.CurrentOperations interface
 * org.omg.PortableInterceptor.CurrentOperations}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.org.omg.PortableInterceptor.CurrentOperationsTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.PortableInterceptor.CurrentOperationsClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.PortableInterceptor.CurrentOperations
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.PortableInterceptor.CurrentOperations#get_slot(int)
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
     * Test method for {@link org.omg.PortableInterceptor.CurrentOperations#set_slot(int, org.omg.CORBA.Any) public
     * abstract void org.omg.PortableInterceptor.CurrentOperations.set_slot(int,org.omg.CORBA.Any) throws
     * org.omg.PortableInterceptor.InvalidSlot}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.PortableInterceptor.CurrentOperations#set_slot(int, org.omg.CORBA.Any)
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
