package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.DynamicAny.DynAnyFactoryOperations interface
 * org.omg.DynamicAny.DynAnyFactoryOperations}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link DynAnyFactoryOperationsClassTests}.
 * </p>
 *
 * @see org.omg.DynamicAny.DynAnyFactoryOperations interface org.omg.DynamicAny.DynAnyFactoryOperations (the hereby
 *      targeted class-under-test class)
 * @see DynAnyFactoryOperationsClassTests DynAnyFactoryOperationsClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynAnyFactoryOperationsTests<SUT extends org.omg.DynamicAny.DynAnyFactoryOperations>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynAnyFactoryOperations#create_dyn_any(org.omg.CORBA.Any) public
     * abstract org.omg.DynamicAny.DynAny org.omg.DynamicAny.DynAnyFactoryOperations.create_dyn_any(org.omg.CORBA.Any)
     * throws org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode}.
     *
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynAnyFactoryOperations#create_dyn_any(org.omg.CORBA.Any) public
     * abstract org.omg.DynamicAny.DynAny org.omg.DynamicAny.DynAnyFactoryOperations.create_dyn_any(org.omg.CORBA.Any)
     * throws org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.DynamicAny.DynAnyFactoryOperations#create_dyn_any(org.omg.CORBA.Any) public abstract
     *      org.omg.DynamicAny.DynAny org.omg.DynamicAny.DynAnyFactoryOperations.create_dyn_any(org.omg.CORBA.Any)
     *      throws org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_dyn_any_Any()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.DynamicAny.DynAnyFactoryOperations#create_dyn_any_from_type_code(org.omg.CORBA.TypeCode) public
     * abstract org.omg.DynamicAny.DynAny
     * org.omg.DynamicAny.DynAnyFactoryOperations.create_dyn_any_from_type_code(org.omg.CORBA.TypeCode) throws
     * org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode}.
     *
     * <p>
     * Test method for
     * {@link org.omg.DynamicAny.DynAnyFactoryOperations#create_dyn_any_from_type_code(org.omg.CORBA.TypeCode) public
     * abstract org.omg.DynamicAny.DynAny
     * org.omg.DynamicAny.DynAnyFactoryOperations.create_dyn_any_from_type_code(org.omg.CORBA.TypeCode) throws
     * org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.DynamicAny.DynAnyFactoryOperations#create_dyn_any_from_type_code(org.omg.CORBA.TypeCode) public
     *      abstract org.omg.DynamicAny.DynAny
     *      org.omg.DynamicAny.DynAnyFactoryOperations.create_dyn_any_from_type_code(org.omg.CORBA.TypeCode) throws
     *      org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_dyn_any_from_type_code_TypeCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
