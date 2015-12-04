package org.j8unit.repository.java.rmi.registry;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.rmi.registry.RegistryHandler interface java.rmi.registry.RegistryHandler}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.rmi.registry.RegistryHandlerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RegistryHandlerTests<SUT extends java.rmi.registry.RegistryHandler>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.registry.RegistryHandler#registryImpl(int) public abstract
     * java.rmi.registry.Registry java.rmi.registry.RegistryHandler.registryImpl(int) throws java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_registryImpl_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.registry.RegistryHandler#registryStub(java.lang.String,int) public abstract
     * java.rmi.registry.Registry java.rmi.registry.RegistryHandler.registryStub(java.lang.String,int) throws
     * java.rmi.RemoteException,java.rmi.UnknownHostException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_registryStub_String_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
