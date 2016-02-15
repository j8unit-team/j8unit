package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.DynamicAny.DynUnionOperations interface
 * org.omg.DynamicAny.DynUnionOperations}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link DynUnionOperationsClassTests}.
 * </p>
 *
 * @see org.omg.DynamicAny.DynUnionOperations interface org.omg.DynamicAny.DynUnionOperations (the hereby targeted
 *      class-under-test class)
 * @see DynUnionOperationsClassTests DynUnionOperationsClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynUnionOperationsTests<SUT extends org.omg.DynamicAny.DynUnionOperations>
extends DynAnyOperationsTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynUnionOperations#set_discriminator(org.omg.DynamicAny.DynAny) public
     * abstract void org.omg.DynamicAny.DynUnionOperations.set_discriminator(org.omg.DynamicAny.DynAny) throws
     * org.omg.DynamicAny.DynAnyPackage.TypeMismatch}.
     *
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynUnionOperations#set_discriminator(org.omg.DynamicAny.DynAny) public
     * abstract void org.omg.DynamicAny.DynUnionOperations.set_discriminator(org.omg.DynamicAny.DynAny) throws
     * org.omg.DynamicAny.DynAnyPackage.TypeMismatch}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.DynamicAny.DynUnionOperations#set_discriminator(org.omg.DynamicAny.DynAny) public abstract void
     *      org.omg.DynamicAny.DynUnionOperations.set_discriminator(org.omg.DynamicAny.DynAny) throws
     *      org.omg.DynamicAny.DynAnyPackage.TypeMismatch (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_discriminator_DynAny()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynUnionOperations#set_to_default_member() public abstract void
     * org.omg.DynamicAny.DynUnionOperations.set_to_default_member() throws
     * org.omg.DynamicAny.DynAnyPackage.TypeMismatch}.
     *
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynUnionOperations#set_to_default_member() public abstract void
     * org.omg.DynamicAny.DynUnionOperations.set_to_default_member() throws
     * org.omg.DynamicAny.DynAnyPackage.TypeMismatch}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.DynamicAny.DynUnionOperations#set_to_default_member() public abstract void
     *      org.omg.DynamicAny.DynUnionOperations.set_to_default_member() throws
     *      org.omg.DynamicAny.DynAnyPackage.TypeMismatch (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_to_default_member()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynUnionOperations#member_kind() public abstract org.omg.CORBA.TCKind
     * org.omg.DynamicAny.DynUnionOperations.member_kind() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     *
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynUnionOperations#member_kind() public abstract org.omg.CORBA.TCKind
     * org.omg.DynamicAny.DynUnionOperations.member_kind() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.DynamicAny.DynUnionOperations#member_kind() public abstract org.omg.CORBA.TCKind
     *      org.omg.DynamicAny.DynUnionOperations.member_kind() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_member_kind()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynUnionOperations#get_discriminator() public abstract
     * org.omg.DynamicAny.DynAny org.omg.DynamicAny.DynUnionOperations.get_discriminator()}.
     *
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynUnionOperations#get_discriminator() public abstract
     * org.omg.DynamicAny.DynAny org.omg.DynamicAny.DynUnionOperations.get_discriminator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.DynamicAny.DynUnionOperations#get_discriminator() public abstract org.omg.DynamicAny.DynAny
     *      org.omg.DynamicAny.DynUnionOperations.get_discriminator() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_discriminator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynUnionOperations#has_no_active_member() public abstract boolean
     * org.omg.DynamicAny.DynUnionOperations.has_no_active_member()}.
     *
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynUnionOperations#has_no_active_member() public abstract boolean
     * org.omg.DynamicAny.DynUnionOperations.has_no_active_member()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.DynamicAny.DynUnionOperations#has_no_active_member() public abstract boolean
     *      org.omg.DynamicAny.DynUnionOperations.has_no_active_member() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_has_no_active_member()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynUnionOperations#discriminator_kind() public abstract
     * org.omg.CORBA.TCKind org.omg.DynamicAny.DynUnionOperations.discriminator_kind()}.
     *
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynUnionOperations#discriminator_kind() public abstract
     * org.omg.CORBA.TCKind org.omg.DynamicAny.DynUnionOperations.discriminator_kind()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.DynamicAny.DynUnionOperations#discriminator_kind() public abstract org.omg.CORBA.TCKind
     *      org.omg.DynamicAny.DynUnionOperations.discriminator_kind() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_discriminator_kind()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynUnionOperations#set_to_no_active_member() public abstract void
     * org.omg.DynamicAny.DynUnionOperations.set_to_no_active_member() throws
     * org.omg.DynamicAny.DynAnyPackage.TypeMismatch}.
     *
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynUnionOperations#set_to_no_active_member() public abstract void
     * org.omg.DynamicAny.DynUnionOperations.set_to_no_active_member() throws
     * org.omg.DynamicAny.DynAnyPackage.TypeMismatch}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.DynamicAny.DynUnionOperations#set_to_no_active_member() public abstract void
     *      org.omg.DynamicAny.DynUnionOperations.set_to_no_active_member() throws
     *      org.omg.DynamicAny.DynAnyPackage.TypeMismatch (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_to_no_active_member()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynUnionOperations#member_name() public abstract java.lang.String
     * org.omg.DynamicAny.DynUnionOperations.member_name() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     *
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynUnionOperations#member_name() public abstract java.lang.String
     * org.omg.DynamicAny.DynUnionOperations.member_name() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.DynamicAny.DynUnionOperations#member_name() public abstract java.lang.String
     *      org.omg.DynamicAny.DynUnionOperations.member_name() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_member_name()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynUnionOperations#member() public abstract org.omg.DynamicAny.DynAny
     * org.omg.DynamicAny.DynUnionOperations.member() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     *
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynUnionOperations#member() public abstract org.omg.DynamicAny.DynAny
     * org.omg.DynamicAny.DynUnionOperations.member() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.DynamicAny.DynUnionOperations#member() public abstract org.omg.DynamicAny.DynAny
     *      org.omg.DynamicAny.DynUnionOperations.member() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_member()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
