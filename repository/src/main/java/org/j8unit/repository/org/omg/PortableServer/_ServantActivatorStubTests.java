package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.org.omg.CORBA.portable.ObjectImplTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.omg.PortableServer._ServantActivatorStub;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link _ServantActivatorStub public class org.omg.PortableServer._ServantActivatorStub}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.org.omg.PortableServer._ServantActivatorStubClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface _ServantActivatorStubTests<SUT extends _ServantActivatorStub>
extends ServantActivatorTests<SUT>, ObjectImplTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer._ServantActivatorStub]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.PortableServer._ServantActivatorStub#incarnate(byte[], org.omg.PortableServer.POA) public
     * org.omg.PortableServer.Servant
     * org.omg.PortableServer._ServantActivatorStub.incarnate(byte[],org.omg.PortableServer.POA) throws
     * org.omg.PortableServer.ForwardRequest}.
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
    public default void test_incarnate_byteArray_POA()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.PortableServer._ServantActivatorStub#etherealize(byte[], org.omg.PortableServer.POA, org.omg.PortableServer.Servant, boolean, boolean)
     * public void
     * org.omg.PortableServer._ServantActivatorStub.etherealize(byte[],org.omg.PortableServer.POA,org.omg.PortableServer.Servant,boolean,boolean)}.
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
    public default void test_etherealize_byteArray_POA_Servant_boolean_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.omg.PortableServer._ServantActivatorStub#_ids()
     * public java.lang.String[] org.omg.PortableServer._ServantActivatorStub._ids()}.
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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer._ServantActivatorStub]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer._ServantActivatorStub]

}
