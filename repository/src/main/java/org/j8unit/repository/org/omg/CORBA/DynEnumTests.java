package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.DynEnum interface org.omg.CORBA.DynEnum}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link DynEnumClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.DynEnum interface org.omg.CORBA.DynEnum (the hereby targeted class-under-test class)
 * @see DynEnumClassTests DynEnumClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynEnumTests<SUT extends org.omg.CORBA.DynEnum>
extends ObjectTests<SUT>, DynAnyTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.DynEnum#value_as_ulong(int) public abstract void
     * org.omg.CORBA.DynEnum.value_as_ulong(int)}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.DynEnum#value_as_ulong(int) public abstract void
     * org.omg.CORBA.DynEnum.value_as_ulong(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.DynEnum#value_as_ulong(int) public abstract void org.omg.CORBA.DynEnum.value_as_ulong(int)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_value_as_ulong_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.DynEnum#value_as_ulong() public abstract int
     * org.omg.CORBA.DynEnum.value_as_ulong()}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.DynEnum#value_as_ulong() public abstract int
     * org.omg.CORBA.DynEnum.value_as_ulong()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.DynEnum#value_as_ulong() public abstract int org.omg.CORBA.DynEnum.value_as_ulong() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_value_as_ulong()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.DynEnum#value_as_string() public abstract java.lang.String
     * org.omg.CORBA.DynEnum.value_as_string()}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.DynEnum#value_as_string() public abstract java.lang.String
     * org.omg.CORBA.DynEnum.value_as_string()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.DynEnum#value_as_string() public abstract java.lang.String
     *      org.omg.CORBA.DynEnum.value_as_string() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_value_as_string()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.DynEnum#value_as_string(String) public abstract void
     * org.omg.CORBA.DynEnum.value_as_string(java.lang.String)}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.DynEnum#value_as_string(String) public abstract void
     * org.omg.CORBA.DynEnum.value_as_string(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.DynEnum#value_as_string(String) public abstract void
     *      org.omg.CORBA.DynEnum.value_as_string(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_value_as_string_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
