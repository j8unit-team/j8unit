package org.j8unit.repository.java.rmi.registry;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.rmi.registry.Registry interface java.rmi.registry.Registry}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.rmi.registry.RegistryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RegistryTests<SUT extends java.rmi.registry.Registry>
extends org.j8unit.repository.java.rmi.RemoteTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.registry.Registry#bind(java.lang.String,java.rmi.Remote) public abstract void
     * java.rmi.registry.Registry.bind(java.lang.String,java.rmi.Remote) throws
     * java.rmi.RemoteException,java.rmi.AlreadyBoundException,java.rmi.AccessException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_bind_String_Remote()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.registry.Registry#list() public abstract java.lang.String[]
     * java.rmi.registry.Registry.list() throws java.rmi.RemoteException,java.rmi.AccessException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_list()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.registry.Registry#lookup(java.lang.String) public abstract java.rmi.Remote
     * java.rmi.registry.Registry.lookup(java.lang.String) throws
     * java.rmi.RemoteException,java.rmi.NotBoundException,java.rmi.AccessException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lookup_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.registry.Registry#rebind(java.lang.String,java.rmi.Remote) public abstract void
     * java.rmi.registry.Registry.rebind(java.lang.String,java.rmi.Remote) throws
     * java.rmi.RemoteException,java.rmi.AccessException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_rebind_String_Remote()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.registry.Registry#unbind(java.lang.String) public abstract void
     * java.rmi.registry.Registry.unbind(java.lang.String) throws
     * java.rmi.RemoteException,java.rmi.NotBoundException,java.rmi.AccessException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unbind_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
