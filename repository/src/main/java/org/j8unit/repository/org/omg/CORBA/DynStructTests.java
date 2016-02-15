package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.DynStruct interface org.omg.CORBA.DynStruct}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link DynStructClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.DynStruct interface org.omg.CORBA.DynStruct (the hereby targeted class-under-test class)
 * @see DynStructClassTests DynStructClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynStructTests<SUT extends org.omg.CORBA.DynStruct>
extends ObjectTests<SUT>, DynAnyTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.DynStruct#current_member_name() public abstract java.lang.String
     * org.omg.CORBA.DynStruct.current_member_name()}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.DynStruct#current_member_name() public abstract java.lang.String
     * org.omg.CORBA.DynStruct.current_member_name()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.DynStruct#current_member_name() public abstract java.lang.String
     *      org.omg.CORBA.DynStruct.current_member_name() (the hereby targeted method-under-test)
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
     * Test method for {@link org.omg.CORBA.DynStruct#current_member_kind() public abstract org.omg.CORBA.TCKind
     * org.omg.CORBA.DynStruct.current_member_kind()}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.DynStruct#current_member_kind() public abstract org.omg.CORBA.TCKind
     * org.omg.CORBA.DynStruct.current_member_kind()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.DynStruct#current_member_kind() public abstract org.omg.CORBA.TCKind
     *      org.omg.CORBA.DynStruct.current_member_kind() (the hereby targeted method-under-test)
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
     * Test method for {@link org.omg.CORBA.DynStruct#get_members() public abstract org.omg.CORBA.NameValuePair[]
     * org.omg.CORBA.DynStruct.get_members()}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.DynStruct#get_members() public abstract org.omg.CORBA.NameValuePair[]
     * org.omg.CORBA.DynStruct.get_members()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.DynStruct#get_members() public abstract org.omg.CORBA.NameValuePair[]
     *      org.omg.CORBA.DynStruct.get_members() (the hereby targeted method-under-test)
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
     * Test method for {@link org.omg.CORBA.DynStruct#set_members(org.omg.CORBA.NameValuePair[]) public abstract void
     * org.omg.CORBA.DynStruct.set_members(org.omg.CORBA.NameValuePair[]) throws org.omg.CORBA.DynAnyPackage.InvalidSeq}
     * .
     *
     * <p>
     * Test method for {@link org.omg.CORBA.DynStruct#set_members(org.omg.CORBA.NameValuePair[]) public abstract void
     * org.omg.CORBA.DynStruct.set_members(org.omg.CORBA.NameValuePair[]) throws org.omg.CORBA.DynAnyPackage.InvalidSeq}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.DynStruct#set_members(org.omg.CORBA.NameValuePair[]) public abstract void
     *      org.omg.CORBA.DynStruct.set_members(org.omg.CORBA.NameValuePair[]) throws
     *      org.omg.CORBA.DynAnyPackage.InvalidSeq (the hereby targeted method-under-test)
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
