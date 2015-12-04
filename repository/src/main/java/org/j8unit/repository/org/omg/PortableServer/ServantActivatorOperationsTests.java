package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableServer.ServantActivatorOperations interface
 * org.omg.PortableServer.ServantActivatorOperations}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableServer.ServantActivatorOperationsClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServantActivatorOperationsTests<SUT extends org.omg.PortableServer.ServantActivatorOperations>
extends org.j8unit.repository.org.omg.PortableServer.ServantManagerOperationsTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.ServantActivatorOperations#etherealize(byte[],org.omg.PortableServer.POA,org.omg.PortableServer.Servant,boolean,boolean)
     * public abstract void
     * org.omg.PortableServer.ServantActivatorOperations.etherealize(byte[],org.omg.PortableServer.POA,org.omg.PortableServer.Servant,boolean,boolean)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_etherealize_byteArray_POA_Servant_boolean_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.ServantActivatorOperations#incarnate(byte[],org.omg.PortableServer.POA) public
     * abstract org.omg.PortableServer.Servant
     * org.omg.PortableServer.ServantActivatorOperations.incarnate(byte[],org.omg.PortableServer.POA) throws
     * org.omg.PortableServer.ForwardRequest}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_incarnate_byteArray_POA()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
