package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.DynamicAny.DynFixedOperations interface
 * org.omg.DynamicAny.DynFixedOperations}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link DynFixedOperationsClassTests}.
 * </p>
 *
 * @see org.omg.DynamicAny.DynFixedOperations interface org.omg.DynamicAny.DynFixedOperations (the hereby targeted
 *      class-under-test class)
 * @see DynFixedOperationsClassTests DynFixedOperationsClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynFixedOperationsTests<SUT extends org.omg.DynamicAny.DynFixedOperations>
extends DynAnyOperationsTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynFixedOperations#get_value() public abstract java.lang.String
     * org.omg.DynamicAny.DynFixedOperations.get_value()}.
     *
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynFixedOperations#get_value() public abstract java.lang.String
     * org.omg.DynamicAny.DynFixedOperations.get_value()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.DynamicAny.DynFixedOperations#get_value() public abstract java.lang.String
     *      org.omg.DynamicAny.DynFixedOperations.get_value() (the hereby targeted method-under-test)
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
     * Test method for {@link org.omg.DynamicAny.DynFixedOperations#set_value(String) public abstract boolean
     * org.omg.DynamicAny.DynFixedOperations.set_value(java.lang.String) throws
     * org.omg.DynamicAny.DynAnyPackage.TypeMismatch,org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     *
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynFixedOperations#set_value(String) public abstract boolean
     * org.omg.DynamicAny.DynFixedOperations.set_value(java.lang.String) throws
     * org.omg.DynamicAny.DynAnyPackage.TypeMismatch,org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.DynamicAny.DynFixedOperations#set_value(String) public abstract boolean
     *      org.omg.DynamicAny.DynFixedOperations.set_value(java.lang.String) throws
     *      org.omg.DynamicAny.DynAnyPackage.TypeMismatch,org.omg.DynamicAny.DynAnyPackage.InvalidValue (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_value_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
