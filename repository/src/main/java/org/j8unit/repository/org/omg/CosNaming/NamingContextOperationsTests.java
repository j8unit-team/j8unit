package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CosNaming.NamingContextOperations interface
 * org.omg.CosNaming.NamingContextOperations}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link NamingContextOperationsClassTests}.
 * </p>
 *
 * @see org.omg.CosNaming.NamingContextOperations interface org.omg.CosNaming.NamingContextOperations (the hereby
 *      targeted class-under-test class)
 * @see NamingContextOperationsClassTests NamingContextOperationsClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NamingContextOperationsTests<SUT extends org.omg.CosNaming.NamingContextOperations>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.omg.CosNaming.NamingContextOperations#rebind(org.omg.CosNaming.NameComponent[], org.omg.CORBA.Object)
     * public abstract void
     * org.omg.CosNaming.NamingContextOperations.rebind(org.omg.CosNaming.NameComponent[],org.omg.CORBA.Object) throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * <p>
     * Test method for
     * {@link org.omg.CosNaming.NamingContextOperations#rebind(org.omg.CosNaming.NameComponent[], org.omg.CORBA.Object)
     * public abstract void
     * org.omg.CosNaming.NamingContextOperations.rebind(org.omg.CosNaming.NameComponent[],org.omg.CORBA.Object) throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming.NamingContextOperations#rebind(org.omg.CosNaming.NameComponent[], org.omg.CORBA.Object)
     *      public abstract void
     *      org.omg.CosNaming.NamingContextOperations.rebind(org.omg.CosNaming.NameComponent[],org.omg.CORBA.Object)
     *      throws
     *      org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg
     *      .CosNaming.NamingContextPackage.InvalidName (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.omg.CosNaming.NamingContextOperations#unbind(org.omg.CosNaming.NameComponent[]) public
     * abstract void org.omg.CosNaming.NamingContextOperations.unbind(org.omg.CosNaming.NameComponent[]) throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextOperations#unbind(org.omg.CosNaming.NameComponent[]) public
     * abstract void org.omg.CosNaming.NamingContextOperations.unbind(org.omg.CosNaming.NameComponent[]) throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming.NamingContextOperations#unbind(org.omg.CosNaming.NameComponent[]) public abstract void
     *      org.omg.CosNaming.NamingContextOperations.unbind(org.omg.CosNaming.NameComponent[]) throws
     *      org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg
     *      .CosNaming.NamingContextPackage.InvalidName (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.omg.CosNaming.NamingContextOperations#resolve(org.omg.CosNaming.NameComponent[])
     * public abstract org.omg.CORBA.Object
     * org.omg.CosNaming.NamingContextOperations.resolve(org.omg.CosNaming.NameComponent[]) throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextOperations#resolve(org.omg.CosNaming.NameComponent[])
     * public abstract org.omg.CORBA.Object
     * org.omg.CosNaming.NamingContextOperations.resolve(org.omg.CosNaming.NameComponent[]) throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming.NamingContextOperations#resolve(org.omg.CosNaming.NameComponent[]) public abstract
     *      org.omg.CORBA.Object org.omg.CosNaming.NamingContextOperations.resolve(org.omg.CosNaming.NameComponent[])
     *      throws
     *      org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg
     *      .CosNaming.NamingContextPackage.InvalidName (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.omg.CosNaming.NamingContextOperations#new_context() public abstract
     * org.omg.CosNaming.NamingContext org.omg.CosNaming.NamingContextOperations.new_context()}.
     *
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextOperations#new_context() public abstract
     * org.omg.CosNaming.NamingContext org.omg.CosNaming.NamingContextOperations.new_context()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming.NamingContextOperations#new_context() public abstract org.omg.CosNaming.NamingContext
     *      org.omg.CosNaming.NamingContextOperations.new_context() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for
     * {@link org.omg.CosNaming.NamingContextOperations#rebind_context(org.omg.CosNaming.NameComponent[], org.omg.CosNaming.NamingContext)
     * public abstract void
     * org.omg.CosNaming.NamingContextOperations.rebind_context(org.omg.CosNaming.NameComponent[],org.omg.CosNaming.NamingContext)
     * throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * <p>
     * Test method for
     * {@link org.omg.CosNaming.NamingContextOperations#rebind_context(org.omg.CosNaming.NameComponent[], org.omg.CosNaming.NamingContext)
     * public abstract void
     * org.omg.CosNaming.NamingContextOperations.rebind_context(org.omg.CosNaming.NameComponent[],org.omg.CosNaming.NamingContext)
     * throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming.NamingContextOperations#rebind_context(org.omg.CosNaming.NameComponent[],
     *      org.omg.CosNaming.NamingContext) public abstract void
     *      org.omg.CosNaming.NamingContextOperations.rebind_context(org.omg.CosNaming.NameComponent[],org.omg.CosNaming
     *      .NamingContext) throws
     *      org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg
     *      .CosNaming.NamingContextPackage.InvalidName (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for
     * {@link org.omg.CosNaming.NamingContextOperations#bind(org.omg.CosNaming.NameComponent[], org.omg.CORBA.Object)
     * public abstract void
     * org.omg.CosNaming.NamingContextOperations.bind(org.omg.CosNaming.NameComponent[],org.omg.CORBA.Object) throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName,org.omg.CosNaming.NamingContextPackage.AlreadyBound}
     * .
     *
     * <p>
     * Test method for
     * {@link org.omg.CosNaming.NamingContextOperations#bind(org.omg.CosNaming.NameComponent[], org.omg.CORBA.Object)
     * public abstract void
     * org.omg.CosNaming.NamingContextOperations.bind(org.omg.CosNaming.NameComponent[],org.omg.CORBA.Object) throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName,org.omg.CosNaming.NamingContextPackage.AlreadyBound}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming.NamingContextOperations#bind(org.omg.CosNaming.NameComponent[], org.omg.CORBA.Object)
     *      public abstract void
     *      org.omg.CosNaming.NamingContextOperations.bind(org.omg.CosNaming.NameComponent[],org.omg.CORBA.Object)
     *      throws
     *      org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg
     *      .CosNaming.NamingContextPackage.InvalidName,org.omg.CosNaming.NamingContextPackage.AlreadyBound (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for
     * {@link org.omg.CosNaming.NamingContextOperations#bind_context(org.omg.CosNaming.NameComponent[], org.omg.CosNaming.NamingContext)
     * public abstract void
     * org.omg.CosNaming.NamingContextOperations.bind_context(org.omg.CosNaming.NameComponent[],org.omg.CosNaming.NamingContext)
     * throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName,org.omg.CosNaming.NamingContextPackage.AlreadyBound}
     * .
     *
     * <p>
     * Test method for
     * {@link org.omg.CosNaming.NamingContextOperations#bind_context(org.omg.CosNaming.NameComponent[], org.omg.CosNaming.NamingContext)
     * public abstract void
     * org.omg.CosNaming.NamingContextOperations.bind_context(org.omg.CosNaming.NameComponent[],org.omg.CosNaming.NamingContext)
     * throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName,org.omg.CosNaming.NamingContextPackage.AlreadyBound}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming.NamingContextOperations#bind_context(org.omg.CosNaming.NameComponent[],
     *      org.omg.CosNaming.NamingContext) public abstract void
     *      org.omg.CosNaming.NamingContextOperations.bind_context(org.omg.CosNaming.NameComponent[],org.omg.CosNaming.
     *      NamingContext) throws
     *      org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg
     *      .CosNaming.NamingContextPackage.InvalidName,org.omg.CosNaming.NamingContextPackage.AlreadyBound (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * {@link org.omg.CosNaming.NamingContextOperations#bind_new_context(org.omg.CosNaming.NameComponent[]) public
     * abstract org.omg.CosNaming.NamingContext
     * org.omg.CosNaming.NamingContextOperations.bind_new_context(org.omg.CosNaming.NameComponent[]) throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.AlreadyBound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * <p>
     * Test method for
     * {@link org.omg.CosNaming.NamingContextOperations#bind_new_context(org.omg.CosNaming.NameComponent[]) public
     * abstract org.omg.CosNaming.NamingContext
     * org.omg.CosNaming.NamingContextOperations.bind_new_context(org.omg.CosNaming.NameComponent[]) throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.AlreadyBound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming.NamingContextOperations#bind_new_context(org.omg.CosNaming.NameComponent[]) public
     *      abstract org.omg.CosNaming.NamingContext
     *      org.omg.CosNaming.NamingContextOperations.bind_new_context(org.omg.CosNaming.NameComponent[]) throws
     *      org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.AlreadyBound,org.omg.
     *      CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for
     * {@link org.omg.CosNaming.NamingContextOperations#list(int, org.omg.CosNaming.BindingListHolder, org.omg.CosNaming.BindingIteratorHolder)
     * public abstract void
     * org.omg.CosNaming.NamingContextOperations.list(int,org.omg.CosNaming.BindingListHolder,org.omg.CosNaming.BindingIteratorHolder)}
     * .
     *
     * <p>
     * Test method for
     * {@link org.omg.CosNaming.NamingContextOperations#list(int, org.omg.CosNaming.BindingListHolder, org.omg.CosNaming.BindingIteratorHolder)
     * public abstract void
     * org.omg.CosNaming.NamingContextOperations.list(int,org.omg.CosNaming.BindingListHolder,org.omg.CosNaming.BindingIteratorHolder)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming.NamingContextOperations#list(int, org.omg.CosNaming.BindingListHolder,
     *      org.omg.CosNaming.BindingIteratorHolder) public abstract void
     *      org.omg.CosNaming.NamingContextOperations.list(int,org.omg.CosNaming.BindingListHolder,org.omg.CosNaming.
     *      BindingIteratorHolder) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.omg.CosNaming.NamingContextOperations#destroy() public abstract void
     * org.omg.CosNaming.NamingContextOperations.destroy() throws org.omg.CosNaming.NamingContextPackage.NotEmpty}.
     *
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextOperations#destroy() public abstract void
     * org.omg.CosNaming.NamingContextOperations.destroy() throws org.omg.CosNaming.NamingContextPackage.NotEmpty}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming.NamingContextOperations#destroy() public abstract void
     *      org.omg.CosNaming.NamingContextOperations.destroy() throws org.omg.CosNaming.NamingContextPackage.NotEmpty
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_destroy()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
