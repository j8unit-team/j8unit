package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CORBA.DynStruct interface org.omg.CORBA.DynStruct}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.DynStructTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CORBA.DynStructClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CORBA.DynStruct
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynStructTests<SUT extends org.omg.CORBA.DynStruct>
extends org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>, org.j8unit.repository.org.omg.CORBA.DynAnyTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.DynStruct#current_member_kind() public abstract org.omg.CORBA.TCKind
     * org.omg.CORBA.DynStruct.current_member_kind()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA.DynStruct#current_member_kind()
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
     * Test method for {@link org.omg.CORBA.DynStruct#current_member_name() public abstract java.lang.String
     * org.omg.CORBA.DynStruct.current_member_name()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA.DynStruct#current_member_name()
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
     * Test method for {@link org.omg.CORBA.DynStruct#get_members() public abstract org.omg.CORBA.NameValuePair[]
     * org.omg.CORBA.DynStruct.get_members()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA.DynStruct#get_members()
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA.DynStruct#set_members(org.omg.CORBA.NameValuePair[])
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
