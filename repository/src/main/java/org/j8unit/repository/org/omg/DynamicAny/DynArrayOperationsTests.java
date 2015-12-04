package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.DynamicAny.DynArrayOperations interface org.omg.DynamicAny.DynArrayOperations},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.DynamicAny.DynArrayOperationsClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynArrayOperationsTests<SUT extends org.omg.DynamicAny.DynArrayOperations>
extends org.j8unit.repository.org.omg.DynamicAny.DynAnyOperationsTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynArrayOperations#get_elements() public abstract org.omg.CORBA.Any[]
     * org.omg.DynamicAny.DynArrayOperations.get_elements()}.
     * </p>
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
     * Test method for {@link org.omg.DynamicAny.DynArrayOperations#get_elements_as_dyn_any() public abstract
     * org.omg.DynamicAny.DynAny[] org.omg.DynamicAny.DynArrayOperations.get_elements_as_dyn_any()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_elements_as_dyn_any()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynArrayOperations#set_elements(org.omg.CORBA.Any[]) public abstract
     * void org.omg.DynamicAny.DynArrayOperations.set_elements(org.omg.CORBA.Any[]) throws
     * org.omg.DynamicAny.DynAnyPackage.TypeMismatch,org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     * </p>
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

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynArrayOperations#set_elements_as_dyn_any(org.omg.DynamicAny.DynAny[])
     * public abstract void org.omg.DynamicAny.DynArrayOperations.set_elements_as_dyn_any(org.omg.DynamicAny.DynAny[])
     * throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch,org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_elements_as_dyn_any_DynAnyArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
