package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CORBA.DynArray interface org.omg.CORBA.DynArray}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.DynArrayTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CORBA.DynArrayClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CORBA.DynArray
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynArrayTests<SUT extends org.omg.CORBA.DynArray>
extends org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>, org.j8unit.repository.org.omg.CORBA.DynAnyTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.DynArray#get_elements() public abstract org.omg.CORBA.Any[]
     * org.omg.CORBA.DynArray.get_elements()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA.DynArray#get_elements()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_elements()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.DynArray#set_elements(org.omg.CORBA.Any[]) public abstract void
     * org.omg.CORBA.DynArray.set_elements(org.omg.CORBA.Any[]) throws org.omg.CORBA.DynAnyPackage.InvalidSeq}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA.DynArray#set_elements(org.omg.CORBA.Any[])
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_elements_AnyArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
