package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.ServantActivatorOperations interface
 * org.omg.PortableServer.ServantActivatorOperations}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link ServantActivatorOperationsClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.ServantActivatorOperations interface org.omg.PortableServer.ServantActivatorOperations
 *      (the hereby targeted class-under-test class)
 * @see ServantActivatorOperationsClassTests ServantActivatorOperationsClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServantActivatorOperationsTests<SUT extends org.omg.PortableServer.ServantActivatorOperations>
extends ServantManagerOperationsTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.ServantActivatorOperations#incarnate(byte[], org.omg.PortableServer.POA) public
     * abstract org.omg.PortableServer.Servant
     * org.omg.PortableServer.ServantActivatorOperations.incarnate(byte[],org.omg.PortableServer.POA) throws
     * org.omg.PortableServer.ForwardRequest}.
     *
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.ServantActivatorOperations#incarnate(byte[], org.omg.PortableServer.POA) public
     * abstract org.omg.PortableServer.Servant
     * org.omg.PortableServer.ServantActivatorOperations.incarnate(byte[],org.omg.PortableServer.POA) throws
     * org.omg.PortableServer.ForwardRequest}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.ServantActivatorOperations#incarnate(byte[], org.omg.PortableServer.POA) public
     *      abstract org.omg.PortableServer.Servant
     *      org.omg.PortableServer.ServantActivatorOperations.incarnate(byte[],org.omg.PortableServer.POA) throws
     *      org.omg.PortableServer.ForwardRequest (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.ServantActivatorOperations#etherealize(byte[], org.omg.PortableServer.POA, org.omg.PortableServer.Servant, boolean, boolean)
     * public abstract void
     * org.omg.PortableServer.ServantActivatorOperations.etherealize(byte[],org.omg.PortableServer.POA,org.omg.PortableServer.Servant,boolean,boolean)}
     * .
     *
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.ServantActivatorOperations#etherealize(byte[], org.omg.PortableServer.POA, org.omg.PortableServer.Servant, boolean, boolean)
     * public abstract void
     * org.omg.PortableServer.ServantActivatorOperations.etherealize(byte[],org.omg.PortableServer.POA,org.omg.PortableServer.Servant,boolean,boolean)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.ServantActivatorOperations#etherealize(byte[], org.omg.PortableServer.POA,
     *      org.omg.PortableServer.Servant, boolean, boolean) public abstract void
     *      org.omg.PortableServer.ServantActivatorOperations.etherealize(byte[],org.omg.PortableServer.POA,org.omg.
     *      PortableServer.Servant,boolean,boolean) (the hereby targeted method-under-test)
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

}
