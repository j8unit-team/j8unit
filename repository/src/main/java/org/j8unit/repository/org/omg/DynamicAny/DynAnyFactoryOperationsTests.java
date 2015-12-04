package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.DynamicAny.DynAnyFactoryOperations interface
 * org.omg.DynamicAny.DynAnyFactoryOperations}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.DynamicAny.DynAnyFactoryOperationsClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynAnyFactoryOperationsTests<SUT extends org.omg.DynamicAny.DynAnyFactoryOperations>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynAnyFactoryOperations#create_dyn_any(org.omg.CORBA.Any) public
     * abstract org.omg.DynamicAny.DynAny org.omg.DynamicAny.DynAnyFactoryOperations.create_dyn_any(org.omg.CORBA.Any)
     * throws org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode}.
     * </p>
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
     * </p>
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
