package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CosNaming._NamingContextExtStub class
 * org.omg.CosNaming._NamingContextExtStub}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link _NamingContextExtStubClassTests}.
 * </p>
 *
 * @see org.omg.CosNaming._NamingContextExtStub class org.omg.CosNaming._NamingContextExtStub (the hereby targeted
 *      class-under-test class)
 * @see _NamingContextExtStubClassTests _NamingContextExtStubClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface _NamingContextExtStubTests<SUT extends org.omg.CosNaming._NamingContextExtStub>
extends NamingContextExtTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.ObjectImplTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.omg.CosNaming._NamingContextExtStub#bind_context(org.omg.CosNaming.NameComponent[], org.omg.CosNaming.NamingContext)
     * public void
     * org.omg.CosNaming._NamingContextExtStub.bind_context(org.omg.CosNaming.NameComponent[],org.omg.CosNaming.NamingContext)
     * throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName,org.omg.CosNaming.NamingContextPackage.AlreadyBound}
     * .
     *
     * <p>
     * Test method for
     * {@link org.omg.CosNaming._NamingContextExtStub#bind_context(org.omg.CosNaming.NameComponent[], org.omg.CosNaming.NamingContext)
     * public void
     * org.omg.CosNaming._NamingContextExtStub.bind_context(org.omg.CosNaming.NameComponent[],org.omg.CosNaming.NamingContext)
     * throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName,org.omg.CosNaming.NamingContextPackage.AlreadyBound}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming._NamingContextExtStub#bind_context(org.omg.CosNaming.NameComponent[],
     *      org.omg.CosNaming.NamingContext) public void
     *      org.omg.CosNaming._NamingContextExtStub.bind_context(org.omg.CosNaming.NameComponent[],org.omg.CosNaming.
     *      NamingContext) throws
     *      org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg
     *      .CosNaming.NamingContextPackage.InvalidName,org.omg.CosNaming.NamingContextPackage.AlreadyBound (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_bind_context_NameComponentArray_NamingContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.CosNaming._NamingContextExtStub#bind(org.omg.CosNaming.NameComponent[], org.omg.CORBA.Object)
     * public void org.omg.CosNaming._NamingContextExtStub.bind(org.omg.CosNaming.NameComponent[],org.omg.CORBA.Object)
     * throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName,org.omg.CosNaming.NamingContextPackage.AlreadyBound}
     * .
     *
     * <p>
     * Test method for
     * {@link org.omg.CosNaming._NamingContextExtStub#bind(org.omg.CosNaming.NameComponent[], org.omg.CORBA.Object)
     * public void org.omg.CosNaming._NamingContextExtStub.bind(org.omg.CosNaming.NameComponent[],org.omg.CORBA.Object)
     * throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName,org.omg.CosNaming.NamingContextPackage.AlreadyBound}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming._NamingContextExtStub#bind(org.omg.CosNaming.NameComponent[], org.omg.CORBA.Object) public
     *      void org.omg.CosNaming._NamingContextExtStub.bind(org.omg.CosNaming.NameComponent[],org.omg.CORBA.Object)
     *      throws
     *      org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg
     *      .CosNaming.NamingContextPackage.InvalidName,org.omg.CosNaming.NamingContextPackage.AlreadyBound (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_bind_NameComponentArray_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming._NamingContextExtStub#to_url(String, String) public java.lang.String
     * org.omg.CosNaming._NamingContextExtStub.to_url(java.lang.String,java.lang.String) throws
     * org.omg.CosNaming.NamingContextExtPackage.InvalidAddress,org.omg.CosNaming.NamingContextPackage.InvalidName}.
     *
     * <p>
     * Test method for {@link org.omg.CosNaming._NamingContextExtStub#to_url(String, String) public java.lang.String
     * org.omg.CosNaming._NamingContextExtStub.to_url(java.lang.String,java.lang.String) throws
     * org.omg.CosNaming.NamingContextExtPackage.InvalidAddress,org.omg.CosNaming.NamingContextPackage.InvalidName}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming._NamingContextExtStub#to_url(String, String) public java.lang.String
     *      org.omg.CosNaming._NamingContextExtStub.to_url(java.lang.String,java.lang.String) throws
     *      org.omg.CosNaming.NamingContextExtPackage.InvalidAddress,org.omg.CosNaming.NamingContextPackage.InvalidName
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_to_url_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.CosNaming._NamingContextExtStub#rebind_context(org.omg.CosNaming.NameComponent[], org.omg.CosNaming.NamingContext)
     * public void
     * org.omg.CosNaming._NamingContextExtStub.rebind_context(org.omg.CosNaming.NameComponent[],org.omg.CosNaming.NamingContext)
     * throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * <p>
     * Test method for
     * {@link org.omg.CosNaming._NamingContextExtStub#rebind_context(org.omg.CosNaming.NameComponent[], org.omg.CosNaming.NamingContext)
     * public void
     * org.omg.CosNaming._NamingContextExtStub.rebind_context(org.omg.CosNaming.NameComponent[],org.omg.CosNaming.NamingContext)
     * throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming._NamingContextExtStub#rebind_context(org.omg.CosNaming.NameComponent[],
     *      org.omg.CosNaming.NamingContext) public void
     *      org.omg.CosNaming._NamingContextExtStub.rebind_context(org.omg.CosNaming.NameComponent[],org.omg.CosNaming.
     *      NamingContext) throws
     *      org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg
     *      .CosNaming.NamingContextPackage.InvalidName (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_rebind_context_NameComponentArray_NamingContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming._NamingContextExtStub#resolve_str(String) public org.omg.CORBA.Object
     * org.omg.CosNaming._NamingContextExtStub.resolve_str(java.lang.String) throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * <p>
     * Test method for {@link org.omg.CosNaming._NamingContextExtStub#resolve_str(String) public org.omg.CORBA.Object
     * org.omg.CosNaming._NamingContextExtStub.resolve_str(java.lang.String) throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming._NamingContextExtStub#resolve_str(String) public org.omg.CORBA.Object
     *      org.omg.CosNaming._NamingContextExtStub.resolve_str(java.lang.String) throws
     *      org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg
     *      .CosNaming.NamingContextPackage.InvalidName (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_resolve_str_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.CosNaming._NamingContextExtStub#rebind(org.omg.CosNaming.NameComponent[], org.omg.CORBA.Object)
     * public void
     * org.omg.CosNaming._NamingContextExtStub.rebind(org.omg.CosNaming.NameComponent[],org.omg.CORBA.Object) throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * <p>
     * Test method for
     * {@link org.omg.CosNaming._NamingContextExtStub#rebind(org.omg.CosNaming.NameComponent[], org.omg.CORBA.Object)
     * public void
     * org.omg.CosNaming._NamingContextExtStub.rebind(org.omg.CosNaming.NameComponent[],org.omg.CORBA.Object) throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming._NamingContextExtStub#rebind(org.omg.CosNaming.NameComponent[], org.omg.CORBA.Object)
     *      public void
     *      org.omg.CosNaming._NamingContextExtStub.rebind(org.omg.CosNaming.NameComponent[],org.omg.CORBA.Object)
     *      throws
     *      org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg
     *      .CosNaming.NamingContextPackage.InvalidName (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_rebind_NameComponentArray_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming._NamingContextExtStub#unbind(org.omg.CosNaming.NameComponent[]) public
     * void org.omg.CosNaming._NamingContextExtStub.unbind(org.omg.CosNaming.NameComponent[]) throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * <p>
     * Test method for {@link org.omg.CosNaming._NamingContextExtStub#unbind(org.omg.CosNaming.NameComponent[]) public
     * void org.omg.CosNaming._NamingContextExtStub.unbind(org.omg.CosNaming.NameComponent[]) throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming._NamingContextExtStub#unbind(org.omg.CosNaming.NameComponent[]) public void
     *      org.omg.CosNaming._NamingContextExtStub.unbind(org.omg.CosNaming.NameComponent[]) throws
     *      org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg
     *      .CosNaming.NamingContextPackage.InvalidName (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_unbind_NameComponentArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming._NamingContextExtStub#_ids() public java.lang.String[]
     * org.omg.CosNaming._NamingContextExtStub._ids()}.
     *
     * <p>
     * Test method for {@link org.omg.CosNaming._NamingContextExtStub#_ids() public java.lang.String[]
     * org.omg.CosNaming._NamingContextExtStub._ids()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming._NamingContextExtStub#_ids() public java.lang.String[]
     *      org.omg.CosNaming._NamingContextExtStub._ids() (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for
     * {@link org.omg.CosNaming._NamingContextExtStub#bind_new_context(org.omg.CosNaming.NameComponent[]) public
     * org.omg.CosNaming.NamingContext
     * org.omg.CosNaming._NamingContextExtStub.bind_new_context(org.omg.CosNaming.NameComponent[]) throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.AlreadyBound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * <p>
     * Test method for
     * {@link org.omg.CosNaming._NamingContextExtStub#bind_new_context(org.omg.CosNaming.NameComponent[]) public
     * org.omg.CosNaming.NamingContext
     * org.omg.CosNaming._NamingContextExtStub.bind_new_context(org.omg.CosNaming.NameComponent[]) throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.AlreadyBound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming._NamingContextExtStub#bind_new_context(org.omg.CosNaming.NameComponent[]) public
     *      org.omg.CosNaming.NamingContext
     *      org.omg.CosNaming._NamingContextExtStub.bind_new_context(org.omg.CosNaming.NameComponent[]) throws
     *      org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.AlreadyBound,org.omg.
     *      CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_bind_new_context_NameComponentArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming._NamingContextExtStub#to_string(org.omg.CosNaming.NameComponent[])
     * public java.lang.String org.omg.CosNaming._NamingContextExtStub.to_string(org.omg.CosNaming.NameComponent[])
     * throws org.omg.CosNaming.NamingContextPackage.InvalidName}.
     *
     * <p>
     * Test method for {@link org.omg.CosNaming._NamingContextExtStub#to_string(org.omg.CosNaming.NameComponent[])
     * public java.lang.String org.omg.CosNaming._NamingContextExtStub.to_string(org.omg.CosNaming.NameComponent[])
     * throws org.omg.CosNaming.NamingContextPackage.InvalidName}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming._NamingContextExtStub#to_string(org.omg.CosNaming.NameComponent[]) public java.lang.String
     *      org.omg.CosNaming._NamingContextExtStub.to_string(org.omg.CosNaming.NameComponent[]) throws
     *      org.omg.CosNaming.NamingContextPackage.InvalidName (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_to_string_NameComponentArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming._NamingContextExtStub#resolve(org.omg.CosNaming.NameComponent[]) public
     * org.omg.CORBA.Object org.omg.CosNaming._NamingContextExtStub.resolve(org.omg.CosNaming.NameComponent[]) throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * <p>
     * Test method for {@link org.omg.CosNaming._NamingContextExtStub#resolve(org.omg.CosNaming.NameComponent[]) public
     * org.omg.CORBA.Object org.omg.CosNaming._NamingContextExtStub.resolve(org.omg.CosNaming.NameComponent[]) throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming._NamingContextExtStub#resolve(org.omg.CosNaming.NameComponent[]) public
     *      org.omg.CORBA.Object org.omg.CosNaming._NamingContextExtStub.resolve(org.omg.CosNaming.NameComponent[])
     *      throws
     *      org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg
     *      .CosNaming.NamingContextPackage.InvalidName (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_resolve_NameComponentArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming._NamingContextExtStub#new_context() public
     * org.omg.CosNaming.NamingContext org.omg.CosNaming._NamingContextExtStub.new_context()}.
     *
     * <p>
     * Test method for {@link org.omg.CosNaming._NamingContextExtStub#new_context() public
     * org.omg.CosNaming.NamingContext org.omg.CosNaming._NamingContextExtStub.new_context()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming._NamingContextExtStub#new_context() public org.omg.CosNaming.NamingContext
     *      org.omg.CosNaming._NamingContextExtStub.new_context() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_new_context()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming._NamingContextExtStub#to_name(String) public
     * org.omg.CosNaming.NameComponent[] org.omg.CosNaming._NamingContextExtStub.to_name(java.lang.String) throws
     * org.omg.CosNaming.NamingContextPackage.InvalidName}.
     *
     * <p>
     * Test method for {@link org.omg.CosNaming._NamingContextExtStub#to_name(String) public
     * org.omg.CosNaming.NameComponent[] org.omg.CosNaming._NamingContextExtStub.to_name(java.lang.String) throws
     * org.omg.CosNaming.NamingContextPackage.InvalidName}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming._NamingContextExtStub#to_name(String) public org.omg.CosNaming.NameComponent[]
     *      org.omg.CosNaming._NamingContextExtStub.to_name(java.lang.String) throws
     *      org.omg.CosNaming.NamingContextPackage.InvalidName (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_to_name_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming._NamingContextExtStub#destroy() public void
     * org.omg.CosNaming._NamingContextExtStub.destroy() throws org.omg.CosNaming.NamingContextPackage.NotEmpty}.
     *
     * <p>
     * Test method for {@link org.omg.CosNaming._NamingContextExtStub#destroy() public void
     * org.omg.CosNaming._NamingContextExtStub.destroy() throws org.omg.CosNaming.NamingContextPackage.NotEmpty}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming._NamingContextExtStub#destroy() public void
     *      org.omg.CosNaming._NamingContextExtStub.destroy() throws org.omg.CosNaming.NamingContextPackage.NotEmpty
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_destroy()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.CosNaming._NamingContextExtStub#list(int, org.omg.CosNaming.BindingListHolder, org.omg.CosNaming.BindingIteratorHolder)
     * public void
     * org.omg.CosNaming._NamingContextExtStub.list(int,org.omg.CosNaming.BindingListHolder,org.omg.CosNaming.BindingIteratorHolder)}
     * .
     *
     * <p>
     * Test method for
     * {@link org.omg.CosNaming._NamingContextExtStub#list(int, org.omg.CosNaming.BindingListHolder, org.omg.CosNaming.BindingIteratorHolder)
     * public void
     * org.omg.CosNaming._NamingContextExtStub.list(int,org.omg.CosNaming.BindingListHolder,org.omg.CosNaming.BindingIteratorHolder)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming._NamingContextExtStub#list(int, org.omg.CosNaming.BindingListHolder,
     *      org.omg.CosNaming.BindingIteratorHolder) public void
     *      org.omg.CosNaming._NamingContextExtStub.list(int,org.omg.CosNaming.BindingListHolder,org.omg.CosNaming.
     *      BindingIteratorHolder) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_list_int_BindingListHolder_BindingIteratorHolder()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain org.omg.CORBA.portable.ObjectImpl#_is_equivalent(org.omg.CORBA.Object) class
     * org.omg.CORBA.portable.ObjectImpl}</li>
     * <li>{@linkplain org.omg.CORBA.Object#_is_equivalent(org.omg.CORBA.Object) interface org.omg.CORBA.Object}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test__is_equivalent_Object()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain org.omg.CORBA.portable.ObjectImpl#_create_request(org.omg.CORBA.Context, String, org.omg.CORBA.NVList, org.omg.CORBA.NamedValue, org.omg.CORBA.ExceptionList, org.omg.CORBA.ContextList)
     * class org.omg.CORBA.portable.ObjectImpl}</li>
     * <li>
     * {@linkplain org.omg.CORBA.Object#_create_request(org.omg.CORBA.Context, String, org.omg.CORBA.NVList, org.omg.CORBA.NamedValue, org.omg.CORBA.ExceptionList, org.omg.CORBA.ContextList)
     * interface org.omg.CORBA.Object}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test__create_request_Context_String_NVList_NamedValue_ExceptionList_ContextList()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain org.omg.CORBA.portable.ObjectImpl#_create_request(org.omg.CORBA.Context, String, org.omg.CORBA.NVList, org.omg.CORBA.NamedValue)
     * class org.omg.CORBA.portable.ObjectImpl}</li>
     * <li>
     * {@linkplain org.omg.CORBA.Object#_create_request(org.omg.CORBA.Context, String, org.omg.CORBA.NVList, org.omg.CORBA.NamedValue)
     * interface org.omg.CORBA.Object}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test__create_request_Context_String_NVList_NamedValue()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain org.omg.CORBA.portable.ObjectImpl#_hash(int) class org.omg.CORBA.portable.ObjectImpl}</li>
     * <li>{@linkplain org.omg.CORBA.Object#_hash(int) interface org.omg.CORBA.Object}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test__hash_int()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain org.omg.CORBA.portable.ObjectImpl#_is_a(String) class org.omg.CORBA.portable.ObjectImpl}</li>
     * <li>{@linkplain org.omg.CORBA.Object#_is_a(String) interface org.omg.CORBA.Object}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test__is_a_String()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain org.omg.CORBA.portable.ObjectImpl#_get_policy(int) class org.omg.CORBA.portable.ObjectImpl}</li>
     * <li>{@linkplain org.omg.CORBA.Object#_get_policy(int) interface org.omg.CORBA.Object}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test__get_policy_int()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain org.omg.CORBA.portable.ObjectImpl#_get_domain_managers() class org.omg.CORBA.portable.ObjectImpl}
     * </li>
     * <li>{@linkplain org.omg.CORBA.Object#_get_domain_managers() interface org.omg.CORBA.Object}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test__get_domain_managers()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain org.omg.CORBA.portable.ObjectImpl#_non_existent() class org.omg.CORBA.portable.ObjectImpl}</li>
     * <li>{@linkplain org.omg.CORBA.Object#_non_existent() interface org.omg.CORBA.Object}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test__non_existent()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain org.omg.CORBA.portable.ObjectImpl#_request(String) class org.omg.CORBA.portable.ObjectImpl}</li>
     * <li>{@linkplain org.omg.CORBA.Object#_request(String) interface org.omg.CORBA.Object}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test__request_String()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain org.omg.CORBA.portable.ObjectImpl#_duplicate() class org.omg.CORBA.portable.ObjectImpl}</li>
     * <li>{@linkplain org.omg.CORBA.Object#_duplicate() interface org.omg.CORBA.Object}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test__duplicate()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain org.omg.CORBA.portable.ObjectImpl#_set_policy_override(org.omg.CORBA.Policy[], org.omg.CORBA.SetOverrideType)
     * class org.omg.CORBA.portable.ObjectImpl}</li>
     * <li>{@linkplain org.omg.CORBA.Object#_set_policy_override(org.omg.CORBA.Policy[], org.omg.CORBA.SetOverrideType)
     * interface org.omg.CORBA.Object}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test__set_policy_override_PolicyArray_SetOverrideType()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain org.omg.CORBA.portable.ObjectImpl#_release() class org.omg.CORBA.portable.ObjectImpl}</li>
     * <li>{@linkplain org.omg.CORBA.Object#_release() interface org.omg.CORBA.Object}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test__release()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain org.omg.CORBA.portable.ObjectImpl#_get_interface_def() class org.omg.CORBA.portable.ObjectImpl}
     * </li>
     * <li>{@linkplain org.omg.CORBA.Object#_get_interface_def() interface org.omg.CORBA.Object}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test__get_interface_def()
    throws Exception {
    }

}
