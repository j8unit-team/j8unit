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
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.AdapterActivatorOperations interface
 * org.omg.PortableServer.AdapterActivatorOperations}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link AdapterActivatorOperationsClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.AdapterActivatorOperations interface org.omg.PortableServer.AdapterActivatorOperations
 *      (the hereby targeted class-under-test class)
 * @see AdapterActivatorOperationsClassTests AdapterActivatorOperationsClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AdapterActivatorOperationsTests<SUT extends org.omg.PortableServer.AdapterActivatorOperations>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.AdapterActivatorOperations#unknown_adapter(org.omg.PortableServer.POA, String)
     * public abstract boolean
     * org.omg.PortableServer.AdapterActivatorOperations.unknown_adapter(org.omg.PortableServer.POA,java.lang.String)}.
     *
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.AdapterActivatorOperations#unknown_adapter(org.omg.PortableServer.POA, String)
     * public abstract boolean
     * org.omg.PortableServer.AdapterActivatorOperations.unknown_adapter(org.omg.PortableServer.POA,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.AdapterActivatorOperations#unknown_adapter(org.omg.PortableServer.POA, String) public
     *      abstract boolean
     *      org.omg.PortableServer.AdapterActivatorOperations.unknown_adapter(org.omg.PortableServer.POA,java.lang.
     *      String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unknown_adapter_POA_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
