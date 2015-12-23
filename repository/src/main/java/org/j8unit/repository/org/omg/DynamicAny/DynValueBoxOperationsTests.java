package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.DynamicAny.DynValueBoxOperations interface
 * org.omg.DynamicAny.DynValueBoxOperations}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.DynamicAny.DynValueBoxOperationsTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.DynamicAny.DynValueBoxOperationsClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.DynamicAny.DynValueBoxOperations
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynValueBoxOperationsTests<SUT extends org.omg.DynamicAny.DynValueBoxOperations>
extends org.j8unit.repository.org.omg.DynamicAny.DynValueCommonOperationsTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynValueBoxOperations#get_boxed_value() public abstract
     * org.omg.CORBA.Any org.omg.DynamicAny.DynValueBoxOperations.get_boxed_value() throws
     * org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.DynamicAny.DynValueBoxOperations#get_boxed_value()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_boxed_value()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynValueBoxOperations#get_boxed_value_as_dyn_any() public abstract
     * org.omg.DynamicAny.DynAny org.omg.DynamicAny.DynValueBoxOperations.get_boxed_value_as_dyn_any() throws
     * org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.DynamicAny.DynValueBoxOperations#get_boxed_value_as_dyn_any()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_boxed_value_as_dyn_any()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynValueBoxOperations#set_boxed_value(org.omg.CORBA.Any) public
     * abstract void org.omg.DynamicAny.DynValueBoxOperations.set_boxed_value(org.omg.CORBA.Any) throws
     * org.omg.DynamicAny.DynAnyPackage.TypeMismatch}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.DynamicAny.DynValueBoxOperations#set_boxed_value(org.omg.CORBA.Any)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_boxed_value_Any()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.DynamicAny.DynValueBoxOperations#set_boxed_value_as_dyn_any(org.omg.DynamicAny.DynAny) public
     * abstract void org.omg.DynamicAny.DynValueBoxOperations.set_boxed_value_as_dyn_any(org.omg.DynamicAny.DynAny)
     * throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.DynamicAny.DynValueBoxOperations#set_boxed_value_as_dyn_any(org.omg.DynamicAny.DynAny)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_boxed_value_as_dyn_any_DynAny()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
