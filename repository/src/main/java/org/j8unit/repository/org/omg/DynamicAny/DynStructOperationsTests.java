package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.DynamicAny.DynStructOperations interface
 * org.omg.DynamicAny.DynStructOperations}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link DynStructOperationsClassTests}.
 * </p>
 *
 * @see org.omg.DynamicAny.DynStructOperations interface org.omg.DynamicAny.DynStructOperations (the hereby targeted
 *      class-under-test class)
 * @see DynStructOperationsClassTests DynStructOperationsClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynStructOperationsTests<SUT extends org.omg.DynamicAny.DynStructOperations>
extends DynAnyOperationsTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynStructOperations#current_member_name() public abstract
     * java.lang.String org.omg.DynamicAny.DynStructOperations.current_member_name() throws
     * org.omg.DynamicAny.DynAnyPackage.TypeMismatch,org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     *
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynStructOperations#current_member_name() public abstract
     * java.lang.String org.omg.DynamicAny.DynStructOperations.current_member_name() throws
     * org.omg.DynamicAny.DynAnyPackage.TypeMismatch,org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.DynamicAny.DynStructOperations#current_member_name() public abstract java.lang.String
     *      org.omg.DynamicAny.DynStructOperations.current_member_name() throws
     *      org.omg.DynamicAny.DynAnyPackage.TypeMismatch,org.omg.DynamicAny.DynAnyPackage.InvalidValue (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_current_member_name()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynStructOperations#get_members_as_dyn_any() public abstract
     * org.omg.DynamicAny.NameDynAnyPair[] org.omg.DynamicAny.DynStructOperations.get_members_as_dyn_any()}.
     *
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynStructOperations#get_members_as_dyn_any() public abstract
     * org.omg.DynamicAny.NameDynAnyPair[] org.omg.DynamicAny.DynStructOperations.get_members_as_dyn_any()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.DynamicAny.DynStructOperations#get_members_as_dyn_any() public abstract
     *      org.omg.DynamicAny.NameDynAnyPair[] org.omg.DynamicAny.DynStructOperations.get_members_as_dyn_any() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_members_as_dyn_any()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynStructOperations#current_member_kind() public abstract
     * org.omg.CORBA.TCKind org.omg.DynamicAny.DynStructOperations.current_member_kind() throws
     * org.omg.DynamicAny.DynAnyPackage.TypeMismatch,org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     *
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynStructOperations#current_member_kind() public abstract
     * org.omg.CORBA.TCKind org.omg.DynamicAny.DynStructOperations.current_member_kind() throws
     * org.omg.DynamicAny.DynAnyPackage.TypeMismatch,org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.DynamicAny.DynStructOperations#current_member_kind() public abstract org.omg.CORBA.TCKind
     *      org.omg.DynamicAny.DynStructOperations.current_member_kind() throws
     *      org.omg.DynamicAny.DynAnyPackage.TypeMismatch,org.omg.DynamicAny.DynAnyPackage.InvalidValue (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_current_member_kind()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynStructOperations#get_members() public abstract
     * org.omg.DynamicAny.NameValuePair[] org.omg.DynamicAny.DynStructOperations.get_members()}.
     *
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynStructOperations#get_members() public abstract
     * org.omg.DynamicAny.NameValuePair[] org.omg.DynamicAny.DynStructOperations.get_members()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.DynamicAny.DynStructOperations#get_members() public abstract org.omg.DynamicAny.NameValuePair[]
     *      org.omg.DynamicAny.DynStructOperations.get_members() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_members()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.DynamicAny.DynStructOperations#set_members_as_dyn_any(org.omg.DynamicAny.NameDynAnyPair[]) public
     * abstract void org.omg.DynamicAny.DynStructOperations.set_members_as_dyn_any(org.omg.DynamicAny.NameDynAnyPair[])
     * throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch,org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     *
     * <p>
     * Test method for
     * {@link org.omg.DynamicAny.DynStructOperations#set_members_as_dyn_any(org.omg.DynamicAny.NameDynAnyPair[]) public
     * abstract void org.omg.DynamicAny.DynStructOperations.set_members_as_dyn_any(org.omg.DynamicAny.NameDynAnyPair[])
     * throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch,org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.DynamicAny.DynStructOperations#set_members_as_dyn_any(org.omg.DynamicAny.NameDynAnyPair[]) public
     *      abstract void
     *      org.omg.DynamicAny.DynStructOperations.set_members_as_dyn_any(org.omg.DynamicAny.NameDynAnyPair[]) throws
     *      org.omg.DynamicAny.DynAnyPackage.TypeMismatch,org.omg.DynamicAny.DynAnyPackage.InvalidValue (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_members_as_dyn_any_NameDynAnyPairArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynStructOperations#set_members(org.omg.DynamicAny.NameValuePair[])
     * public abstract void org.omg.DynamicAny.DynStructOperations.set_members(org.omg.DynamicAny.NameValuePair[])
     * throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch,org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     *
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynStructOperations#set_members(org.omg.DynamicAny.NameValuePair[])
     * public abstract void org.omg.DynamicAny.DynStructOperations.set_members(org.omg.DynamicAny.NameValuePair[])
     * throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch,org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.DynamicAny.DynStructOperations#set_members(org.omg.DynamicAny.NameValuePair[]) public abstract void
     *      org.omg.DynamicAny.DynStructOperations.set_members(org.omg.DynamicAny.NameValuePair[]) throws
     *      org.omg.DynamicAny.DynAnyPackage.TypeMismatch,org.omg.DynamicAny.DynAnyPackage.InvalidValue (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_members_NameValuePairArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
