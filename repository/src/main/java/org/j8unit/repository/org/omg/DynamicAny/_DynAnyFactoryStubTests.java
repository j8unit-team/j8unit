package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.omg.DynamicAny._DynAnyFactoryStub;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link _DynAnyFactoryStub public class org.omg.DynamicAny._DynAnyFactoryStub}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.org.omg.DynamicAny._DynAnyFactoryStubClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface _DynAnyFactoryStubTests<SUT extends _DynAnyFactoryStub>
extends org.j8unit.repository.org.omg.DynamicAny.DynAnyFactoryTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.ObjectImplTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.DynamicAny._DynAnyFactoryStub]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.DynamicAny._DynAnyFactoryStub#create_dyn_any_from_type_code(org.omg.CORBA.TypeCode) public
     * org.omg.DynamicAny.DynAny
     * org.omg.DynamicAny._DynAnyFactoryStub.create_dyn_any_from_type_code(org.omg.CORBA.TypeCode) throws
     * org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_create_dyn_any_from_type_code_TypeCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.DynamicAny._DynAnyFactoryStub#create_dyn_any(org.omg.CORBA.Any) public org.omg.DynamicAny.DynAny
     * org.omg.DynamicAny._DynAnyFactoryStub.create_dyn_any(org.omg.CORBA.Any) throws
     * org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for the hereby targeted method-under-test {@link org.omg.DynamicAny._DynAnyFactoryStub#_ids() public
     * java.lang.String[] org.omg.DynamicAny._DynAnyFactoryStub._ids()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test__ids()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.DynamicAny._DynAnyFactoryStub]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.DynamicAny._DynAnyFactoryStub]
}
