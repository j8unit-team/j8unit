package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CORBA.DynFixed interface org.omg.CORBA.DynFixed}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.DynFixedTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CORBA.DynFixedClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CORBA.DynFixed
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynFixedTests<SUT extends org.omg.CORBA.DynFixed>
extends org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>, org.j8unit.repository.org.omg.CORBA.DynAnyTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.DynFixed#get_value() public abstract byte[]
     * org.omg.CORBA.DynFixed.get_value()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA.DynFixed#get_value()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_value()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.DynFixed#set_value(byte[]) public abstract void
     * org.omg.CORBA.DynFixed.set_value(byte[]) throws org.omg.CORBA.DynAnyPackage.InvalidValue}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA.DynFixed#set_value(byte[])
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_value_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
