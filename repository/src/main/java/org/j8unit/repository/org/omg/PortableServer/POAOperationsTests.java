package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.POAOperations interface
 * org.omg.PortableServer.POAOperations}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link POAOperationsClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.POAOperations interface org.omg.PortableServer.POAOperations (the hereby targeted
 *      class-under-test class)
 * @see POAOperationsClassTests POAOperationsClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface POAOperationsTests<SUT extends org.omg.PortableServer.POAOperations>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAOperations#create_implicit_activation_policy(org.omg.PortableServer.ImplicitActivationPolicyValue)
     * public abstract org.omg.PortableServer.ImplicitActivationPolicy
     * org.omg.PortableServer.POAOperations.create_implicit_activation_policy(org.omg.PortableServer.ImplicitActivationPolicyValue)}
     * .
     *
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAOperations#create_implicit_activation_policy(org.omg.PortableServer.ImplicitActivationPolicyValue)
     * public abstract org.omg.PortableServer.ImplicitActivationPolicy
     * org.omg.PortableServer.POAOperations.create_implicit_activation_policy(org.omg.PortableServer.ImplicitActivationPolicyValue)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#create_implicit_activation_policy(org.omg.PortableServer.ImplicitActivationPolicyValue)
     *      public abstract org.omg.PortableServer.ImplicitActivationPolicy
     *      org.omg.PortableServer.POAOperations.create_implicit_activation_policy(org.omg.PortableServer.
     *      ImplicitActivationPolicyValue) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_implicit_activation_policy_ImplicitActivationPolicyValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#reference_to_servant(org.omg.CORBA.Object) public
     * abstract org.omg.PortableServer.Servant
     * org.omg.PortableServer.POAOperations.reference_to_servant(org.omg.CORBA.Object) throws
     * org.omg.PortableServer.POAPackage.ObjectNotActive,org.omg.PortableServer.POAPackage.WrongPolicy,org.omg.PortableServer.POAPackage.WrongAdapter}
     * .
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#reference_to_servant(org.omg.CORBA.Object) public
     * abstract org.omg.PortableServer.Servant
     * org.omg.PortableServer.POAOperations.reference_to_servant(org.omg.CORBA.Object) throws
     * org.omg.PortableServer.POAPackage.ObjectNotActive,org.omg.PortableServer.POAPackage.WrongPolicy,org.omg.PortableServer.POAPackage.WrongAdapter}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#reference_to_servant(org.omg.CORBA.Object) public abstract
     *      org.omg.PortableServer.Servant
     *      org.omg.PortableServer.POAOperations.reference_to_servant(org.omg.CORBA.Object) throws
     *      org.omg.PortableServer.POAPackage.ObjectNotActive,org.omg.PortableServer.POAPackage.WrongPolicy,org.omg.
     *      PortableServer.POAPackage.WrongAdapter (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reference_to_servant_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#activate_object(org.omg.PortableServer.Servant)
     * public abstract byte[] org.omg.PortableServer.POAOperations.activate_object(org.omg.PortableServer.Servant)
     * throws org.omg.PortableServer.POAPackage.ServantAlreadyActive,org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#activate_object(org.omg.PortableServer.Servant)
     * public abstract byte[] org.omg.PortableServer.POAOperations.activate_object(org.omg.PortableServer.Servant)
     * throws org.omg.PortableServer.POAPackage.ServantAlreadyActive,org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#activate_object(org.omg.PortableServer.Servant) public abstract byte[]
     *      org.omg.PortableServer.POAOperations.activate_object(org.omg.PortableServer.Servant) throws
     *      org.omg.PortableServer.POAPackage.ServantAlreadyActive,org.omg.PortableServer.POAPackage.WrongPolicy (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_activate_object_Servant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAOperations#set_servant_manager(org.omg.PortableServer.ServantManager) public
     * abstract void org.omg.PortableServer.POAOperations.set_servant_manager(org.omg.PortableServer.ServantManager)
     * throws org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAOperations#set_servant_manager(org.omg.PortableServer.ServantManager) public
     * abstract void org.omg.PortableServer.POAOperations.set_servant_manager(org.omg.PortableServer.ServantManager)
     * throws org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#set_servant_manager(org.omg.PortableServer.ServantManager) public
     *      abstract void
     *      org.omg.PortableServer.POAOperations.set_servant_manager(org.omg.PortableServer.ServantManager) throws
     *      org.omg.PortableServer.POAPackage.WrongPolicy (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_servant_manager_ServantManager()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAOperations#create_id_uniqueness_policy(org.omg.PortableServer.IdUniquenessPolicyValue)
     * public abstract org.omg.PortableServer.IdUniquenessPolicy
     * org.omg.PortableServer.POAOperations.create_id_uniqueness_policy(org.omg.PortableServer.IdUniquenessPolicyValue)}
     * .
     *
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAOperations#create_id_uniqueness_policy(org.omg.PortableServer.IdUniquenessPolicyValue)
     * public abstract org.omg.PortableServer.IdUniquenessPolicy
     * org.omg.PortableServer.POAOperations.create_id_uniqueness_policy(org.omg.PortableServer.IdUniquenessPolicyValue)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#create_id_uniqueness_policy(org.omg.PortableServer.IdUniquenessPolicyValue)
     *      public abstract org.omg.PortableServer.IdUniquenessPolicy
     *      org.omg.PortableServer.POAOperations.create_id_uniqueness_policy(org.omg.PortableServer.
     *      IdUniquenessPolicyValue) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_id_uniqueness_policy_IdUniquenessPolicyValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#id_to_reference(byte[]) public abstract
     * org.omg.CORBA.Object org.omg.PortableServer.POAOperations.id_to_reference(byte[]) throws
     * org.omg.PortableServer.POAPackage.ObjectNotActive,org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#id_to_reference(byte[]) public abstract
     * org.omg.CORBA.Object org.omg.PortableServer.POAOperations.id_to_reference(byte[]) throws
     * org.omg.PortableServer.POAPackage.ObjectNotActive,org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#id_to_reference(byte[]) public abstract org.omg.CORBA.Object
     *      org.omg.PortableServer.POAOperations.id_to_reference(byte[]) throws
     *      org.omg.PortableServer.POAPackage.ObjectNotActive,org.omg.PortableServer.POAPackage.WrongPolicy (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_id_to_reference_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#destroy(boolean, boolean) public abstract void
     * org.omg.PortableServer.POAOperations.destroy(boolean,boolean)}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#destroy(boolean, boolean) public abstract void
     * org.omg.PortableServer.POAOperations.destroy(boolean,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#destroy(boolean, boolean) public abstract void
     *      org.omg.PortableServer.POAOperations.destroy(boolean,boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_destroy_boolean_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#servant_to_id(org.omg.PortableServer.Servant) public
     * abstract byte[] org.omg.PortableServer.POAOperations.servant_to_id(org.omg.PortableServer.Servant) throws
     * org.omg.PortableServer.POAPackage.ServantNotActive,org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#servant_to_id(org.omg.PortableServer.Servant) public
     * abstract byte[] org.omg.PortableServer.POAOperations.servant_to_id(org.omg.PortableServer.Servant) throws
     * org.omg.PortableServer.POAPackage.ServantNotActive,org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#servant_to_id(org.omg.PortableServer.Servant) public abstract byte[]
     *      org.omg.PortableServer.POAOperations.servant_to_id(org.omg.PortableServer.Servant) throws
     *      org.omg.PortableServer.POAPackage.ServantNotActive,org.omg.PortableServer.POAPackage.WrongPolicy (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_servant_to_id_Servant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#servant_to_reference(org.omg.PortableServer.Servant)
     * public abstract org.omg.CORBA.Object
     * org.omg.PortableServer.POAOperations.servant_to_reference(org.omg.PortableServer.Servant) throws
     * org.omg.PortableServer.POAPackage.ServantNotActive,org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#servant_to_reference(org.omg.PortableServer.Servant)
     * public abstract org.omg.CORBA.Object
     * org.omg.PortableServer.POAOperations.servant_to_reference(org.omg.PortableServer.Servant) throws
     * org.omg.PortableServer.POAPackage.ServantNotActive,org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#servant_to_reference(org.omg.PortableServer.Servant) public abstract
     *      org.omg.CORBA.Object
     *      org.omg.PortableServer.POAOperations.servant_to_reference(org.omg.PortableServer.Servant) throws
     *      org.omg.PortableServer.POAPackage.ServantNotActive,org.omg.PortableServer.POAPackage.WrongPolicy (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_servant_to_reference_Servant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#id_to_servant(byte[]) public abstract
     * org.omg.PortableServer.Servant org.omg.PortableServer.POAOperations.id_to_servant(byte[]) throws
     * org.omg.PortableServer.POAPackage.ObjectNotActive,org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#id_to_servant(byte[]) public abstract
     * org.omg.PortableServer.Servant org.omg.PortableServer.POAOperations.id_to_servant(byte[]) throws
     * org.omg.PortableServer.POAPackage.ObjectNotActive,org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#id_to_servant(byte[]) public abstract org.omg.PortableServer.Servant
     *      org.omg.PortableServer.POAOperations.id_to_servant(byte[]) throws
     *      org.omg.PortableServer.POAPackage.ObjectNotActive,org.omg.PortableServer.POAPackage.WrongPolicy (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_id_to_servant_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAOperations#create_thread_policy(org.omg.PortableServer.ThreadPolicyValue) public
     * abstract org.omg.PortableServer.ThreadPolicy
     * org.omg.PortableServer.POAOperations.create_thread_policy(org.omg.PortableServer.ThreadPolicyValue)}.
     *
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAOperations#create_thread_policy(org.omg.PortableServer.ThreadPolicyValue) public
     * abstract org.omg.PortableServer.ThreadPolicy
     * org.omg.PortableServer.POAOperations.create_thread_policy(org.omg.PortableServer.ThreadPolicyValue)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#create_thread_policy(org.omg.PortableServer.ThreadPolicyValue) public
     *      abstract org.omg.PortableServer.ThreadPolicy
     *      org.omg.PortableServer.POAOperations.create_thread_policy(org.omg.PortableServer.ThreadPolicyValue) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_thread_policy_ThreadPolicyValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAOperations#create_lifespan_policy(org.omg.PortableServer.LifespanPolicyValue)
     * public abstract org.omg.PortableServer.LifespanPolicy
     * org.omg.PortableServer.POAOperations.create_lifespan_policy(org.omg.PortableServer.LifespanPolicyValue)}.
     *
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAOperations#create_lifespan_policy(org.omg.PortableServer.LifespanPolicyValue)
     * public abstract org.omg.PortableServer.LifespanPolicy
     * org.omg.PortableServer.POAOperations.create_lifespan_policy(org.omg.PortableServer.LifespanPolicyValue)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#create_lifespan_policy(org.omg.PortableServer.LifespanPolicyValue)
     *      public abstract org.omg.PortableServer.LifespanPolicy
     *      org.omg.PortableServer.POAOperations.create_lifespan_policy(org.omg.PortableServer.LifespanPolicyValue) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_lifespan_policy_LifespanPolicyValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#the_activator() public abstract
     * org.omg.PortableServer.AdapterActivator org.omg.PortableServer.POAOperations.the_activator()}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#the_activator() public abstract
     * org.omg.PortableServer.AdapterActivator org.omg.PortableServer.POAOperations.the_activator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#the_activator() public abstract org.omg.PortableServer.AdapterActivator
     *      org.omg.PortableServer.POAOperations.the_activator() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_the_activator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAOperations#the_activator(org.omg.PortableServer.AdapterActivator) public
     * abstract void org.omg.PortableServer.POAOperations.the_activator(org.omg.PortableServer.AdapterActivator)}.
     *
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAOperations#the_activator(org.omg.PortableServer.AdapterActivator) public
     * abstract void org.omg.PortableServer.POAOperations.the_activator(org.omg.PortableServer.AdapterActivator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#the_activator(org.omg.PortableServer.AdapterActivator) public abstract
     *      void org.omg.PortableServer.POAOperations.the_activator(org.omg.PortableServer.AdapterActivator) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_the_activator_AdapterActivator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#reference_to_id(org.omg.CORBA.Object) public abstract
     * byte[] org.omg.PortableServer.POAOperations.reference_to_id(org.omg.CORBA.Object) throws
     * org.omg.PortableServer.POAPackage.WrongAdapter,org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#reference_to_id(org.omg.CORBA.Object) public abstract
     * byte[] org.omg.PortableServer.POAOperations.reference_to_id(org.omg.CORBA.Object) throws
     * org.omg.PortableServer.POAPackage.WrongAdapter,org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#reference_to_id(org.omg.CORBA.Object) public abstract byte[]
     *      org.omg.PortableServer.POAOperations.reference_to_id(org.omg.CORBA.Object) throws
     *      org.omg.PortableServer.POAPackage.WrongAdapter,org.omg.PortableServer.POAPackage.WrongPolicy (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reference_to_id_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#the_children() public abstract
     * org.omg.PortableServer.POA[] org.omg.PortableServer.POAOperations.the_children()}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#the_children() public abstract
     * org.omg.PortableServer.POA[] org.omg.PortableServer.POAOperations.the_children()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#the_children() public abstract org.omg.PortableServer.POA[]
     *      org.omg.PortableServer.POAOperations.the_children() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_the_children()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#set_servant(org.omg.PortableServer.Servant) public
     * abstract void org.omg.PortableServer.POAOperations.set_servant(org.omg.PortableServer.Servant) throws
     * org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#set_servant(org.omg.PortableServer.Servant) public
     * abstract void org.omg.PortableServer.POAOperations.set_servant(org.omg.PortableServer.Servant) throws
     * org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#set_servant(org.omg.PortableServer.Servant) public abstract void
     *      org.omg.PortableServer.POAOperations.set_servant(org.omg.PortableServer.Servant) throws
     *      org.omg.PortableServer.POAPackage.WrongPolicy (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_servant_Servant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAOperations#create_POA(String, org.omg.PortableServer.POAManager, org.omg.CORBA.Policy[])
     * public abstract org.omg.PortableServer.POA
     * org.omg.PortableServer.POAOperations.create_POA(java.lang.String,org.omg.PortableServer.POAManager,org.omg.CORBA.Policy[])
     * throws org.omg.PortableServer.POAPackage.AdapterAlreadyExists,org.omg.PortableServer.POAPackage.InvalidPolicy}.
     *
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAOperations#create_POA(String, org.omg.PortableServer.POAManager, org.omg.CORBA.Policy[])
     * public abstract org.omg.PortableServer.POA
     * org.omg.PortableServer.POAOperations.create_POA(java.lang.String,org.omg.PortableServer.POAManager,org.omg.CORBA.Policy[])
     * throws org.omg.PortableServer.POAPackage.AdapterAlreadyExists,org.omg.PortableServer.POAPackage.InvalidPolicy}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#create_POA(String, org.omg.PortableServer.POAManager,
     *      org.omg.CORBA.Policy[]) public abstract org.omg.PortableServer.POA
     *      org.omg.PortableServer.POAOperations.create_POA(java.lang.String,org.omg.PortableServer.POAManager,org.omg.
     *      CORBA.Policy[]) throws
     *      org.omg.PortableServer.POAPackage.AdapterAlreadyExists,org.omg.PortableServer.POAPackage.InvalidPolicy (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_POA_String_POAManager_PolicyArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#the_parent() public abstract
     * org.omg.PortableServer.POA org.omg.PortableServer.POAOperations.the_parent()}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#the_parent() public abstract
     * org.omg.PortableServer.POA org.omg.PortableServer.POAOperations.the_parent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#the_parent() public abstract org.omg.PortableServer.POA
     *      org.omg.PortableServer.POAOperations.the_parent() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_the_parent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#deactivate_object(byte[]) public abstract void
     * org.omg.PortableServer.POAOperations.deactivate_object(byte[]) throws
     * org.omg.PortableServer.POAPackage.ObjectNotActive,org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#deactivate_object(byte[]) public abstract void
     * org.omg.PortableServer.POAOperations.deactivate_object(byte[]) throws
     * org.omg.PortableServer.POAPackage.ObjectNotActive,org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#deactivate_object(byte[]) public abstract void
     *      org.omg.PortableServer.POAOperations.deactivate_object(byte[]) throws
     *      org.omg.PortableServer.POAPackage.ObjectNotActive,org.omg.PortableServer.POAPackage.WrongPolicy (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_deactivate_object_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#get_servant() public abstract
     * org.omg.PortableServer.Servant org.omg.PortableServer.POAOperations.get_servant() throws
     * org.omg.PortableServer.POAPackage.NoServant,org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#get_servant() public abstract
     * org.omg.PortableServer.Servant org.omg.PortableServer.POAOperations.get_servant() throws
     * org.omg.PortableServer.POAPackage.NoServant,org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#get_servant() public abstract org.omg.PortableServer.Servant
     *      org.omg.PortableServer.POAOperations.get_servant() throws
     *      org.omg.PortableServer.POAPackage.NoServant,org.omg.PortableServer.POAPackage.WrongPolicy (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_servant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#get_servant_manager() public abstract
     * org.omg.PortableServer.ServantManager org.omg.PortableServer.POAOperations.get_servant_manager() throws
     * org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#get_servant_manager() public abstract
     * org.omg.PortableServer.ServantManager org.omg.PortableServer.POAOperations.get_servant_manager() throws
     * org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#get_servant_manager() public abstract
     *      org.omg.PortableServer.ServantManager org.omg.PortableServer.POAOperations.get_servant_manager() throws
     *      org.omg.PortableServer.POAPackage.WrongPolicy (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_servant_manager()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#the_name() public abstract java.lang.String
     * org.omg.PortableServer.POAOperations.the_name()}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#the_name() public abstract java.lang.String
     * org.omg.PortableServer.POAOperations.the_name()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#the_name() public abstract java.lang.String
     *      org.omg.PortableServer.POAOperations.the_name() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_the_name()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAOperations#activate_object_with_id(byte[], org.omg.PortableServer.Servant)
     * public abstract void
     * org.omg.PortableServer.POAOperations.activate_object_with_id(byte[],org.omg.PortableServer.Servant) throws
     * org.omg.PortableServer.POAPackage.ServantAlreadyActive,org.omg.PortableServer.POAPackage.ObjectAlreadyActive,org.omg.PortableServer.POAPackage.WrongPolicy}
     * .
     *
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAOperations#activate_object_with_id(byte[], org.omg.PortableServer.Servant)
     * public abstract void
     * org.omg.PortableServer.POAOperations.activate_object_with_id(byte[],org.omg.PortableServer.Servant) throws
     * org.omg.PortableServer.POAPackage.ServantAlreadyActive,org.omg.PortableServer.POAPackage.ObjectAlreadyActive,org.omg.PortableServer.POAPackage.WrongPolicy}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#activate_object_with_id(byte[], org.omg.PortableServer.Servant) public
     *      abstract void
     *      org.omg.PortableServer.POAOperations.activate_object_with_id(byte[],org.omg.PortableServer.Servant) throws
     *      org.omg.PortableServer.POAPackage.ServantAlreadyActive,org.omg.PortableServer.POAPackage.ObjectAlreadyActive
     *      ,org.omg.PortableServer.POAPackage.WrongPolicy (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_activate_object_with_id_byteArray_Servant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAOperations#create_id_assignment_policy(org.omg.PortableServer.IdAssignmentPolicyValue)
     * public abstract org.omg.PortableServer.IdAssignmentPolicy
     * org.omg.PortableServer.POAOperations.create_id_assignment_policy(org.omg.PortableServer.IdAssignmentPolicyValue)}
     * .
     *
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAOperations#create_id_assignment_policy(org.omg.PortableServer.IdAssignmentPolicyValue)
     * public abstract org.omg.PortableServer.IdAssignmentPolicy
     * org.omg.PortableServer.POAOperations.create_id_assignment_policy(org.omg.PortableServer.IdAssignmentPolicyValue)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#create_id_assignment_policy(org.omg.PortableServer.IdAssignmentPolicyValue)
     *      public abstract org.omg.PortableServer.IdAssignmentPolicy
     *      org.omg.PortableServer.POAOperations.create_id_assignment_policy(org.omg.PortableServer.
     *      IdAssignmentPolicyValue) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_id_assignment_policy_IdAssignmentPolicyValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#find_POA(String, boolean) public abstract
     * org.omg.PortableServer.POA org.omg.PortableServer.POAOperations.find_POA(java.lang.String,boolean) throws
     * org.omg.PortableServer.POAPackage.AdapterNonExistent}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#find_POA(String, boolean) public abstract
     * org.omg.PortableServer.POA org.omg.PortableServer.POAOperations.find_POA(java.lang.String,boolean) throws
     * org.omg.PortableServer.POAPackage.AdapterNonExistent}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#find_POA(String, boolean) public abstract org.omg.PortableServer.POA
     *      org.omg.PortableServer.POAOperations.find_POA(java.lang.String,boolean) throws
     *      org.omg.PortableServer.POAPackage.AdapterNonExistent (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_find_POA_String_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAOperations#create_request_processing_policy(org.omg.PortableServer.RequestProcessingPolicyValue)
     * public abstract org.omg.PortableServer.RequestProcessingPolicy
     * org.omg.PortableServer.POAOperations.create_request_processing_policy(org.omg.PortableServer.RequestProcessingPolicyValue)}
     * .
     *
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAOperations#create_request_processing_policy(org.omg.PortableServer.RequestProcessingPolicyValue)
     * public abstract org.omg.PortableServer.RequestProcessingPolicy
     * org.omg.PortableServer.POAOperations.create_request_processing_policy(org.omg.PortableServer.RequestProcessingPolicyValue)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#create_request_processing_policy(org.omg.PortableServer.RequestProcessingPolicyValue)
     *      public abstract org.omg.PortableServer.RequestProcessingPolicy
     *      org.omg.PortableServer.POAOperations.create_request_processing_policy(org.omg.PortableServer.
     *      RequestProcessingPolicyValue) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_request_processing_policy_RequestProcessingPolicyValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#the_POAManager() public abstract
     * org.omg.PortableServer.POAManager org.omg.PortableServer.POAOperations.the_POAManager()}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#the_POAManager() public abstract
     * org.omg.PortableServer.POAManager org.omg.PortableServer.POAOperations.the_POAManager()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#the_POAManager() public abstract org.omg.PortableServer.POAManager
     *      org.omg.PortableServer.POAOperations.the_POAManager() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_the_POAManager()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#create_reference(String) public abstract
     * org.omg.CORBA.Object org.omg.PortableServer.POAOperations.create_reference(java.lang.String) throws
     * org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#create_reference(String) public abstract
     * org.omg.CORBA.Object org.omg.PortableServer.POAOperations.create_reference(java.lang.String) throws
     * org.omg.PortableServer.POAPackage.WrongPolicy}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#create_reference(String) public abstract org.omg.CORBA.Object
     *      org.omg.PortableServer.POAOperations.create_reference(java.lang.String) throws
     *      org.omg.PortableServer.POAPackage.WrongPolicy (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_reference_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#id() public abstract byte[]
     * org.omg.PortableServer.POAOperations.id()}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#id() public abstract byte[]
     * org.omg.PortableServer.POAOperations.id()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#id() public abstract byte[] org.omg.PortableServer.POAOperations.id()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_id()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#create_reference_with_id(byte[], String) public
     * abstract org.omg.CORBA.Object
     * org.omg.PortableServer.POAOperations.create_reference_with_id(byte[],java.lang.String)}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.POAOperations#create_reference_with_id(byte[], String) public
     * abstract org.omg.CORBA.Object
     * org.omg.PortableServer.POAOperations.create_reference_with_id(byte[],java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#create_reference_with_id(byte[], String) public abstract
     *      org.omg.CORBA.Object org.omg.PortableServer.POAOperations.create_reference_with_id(byte[],java.lang.String)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_reference_with_id_byteArray_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAOperations#create_servant_retention_policy(org.omg.PortableServer.ServantRetentionPolicyValue)
     * public abstract org.omg.PortableServer.ServantRetentionPolicy
     * org.omg.PortableServer.POAOperations.create_servant_retention_policy(org.omg.PortableServer.ServantRetentionPolicyValue)}
     * .
     *
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.POAOperations#create_servant_retention_policy(org.omg.PortableServer.ServantRetentionPolicyValue)
     * public abstract org.omg.PortableServer.ServantRetentionPolicy
     * org.omg.PortableServer.POAOperations.create_servant_retention_policy(org.omg.PortableServer.ServantRetentionPolicyValue)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.POAOperations#create_servant_retention_policy(org.omg.PortableServer.ServantRetentionPolicyValue)
     *      public abstract org.omg.PortableServer.ServantRetentionPolicy
     *      org.omg.PortableServer.POAOperations.create_servant_retention_policy(org.omg.PortableServer.
     *      ServantRetentionPolicyValue) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_servant_retention_policy_ServantRetentionPolicyValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
