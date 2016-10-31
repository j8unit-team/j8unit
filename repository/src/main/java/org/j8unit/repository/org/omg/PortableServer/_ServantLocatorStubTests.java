package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.omg.PortableServer._ServantLocatorStub;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link _ServantLocatorStub public class org.omg.PortableServer._ServantLocatorStub}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.org.omg.PortableServer._ServantLocatorStubClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface _ServantLocatorStubTests<SUT extends _ServantLocatorStub>
extends org.j8unit.repository.org.omg.PortableServer.ServantLocatorTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.ObjectImplTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer._ServantLocatorStub]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.PortableServer._ServantLocatorStub#postinvoke(byte[], org.omg.PortableServer.POA, String, Object, org.omg.PortableServer.Servant)
     * public void
     * org.omg.PortableServer._ServantLocatorStub.postinvoke(byte[],org.omg.PortableServer.POA,java.lang.String,java.lang.Object,org.omg.PortableServer.Servant)}.
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
    public default void test_postinvoke_byteArray_POA_String_Object_Servant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.PortableServer._ServantLocatorStub#preinvoke(byte[], org.omg.PortableServer.POA, String, org.omg.PortableServer.ServantLocatorPackage.CookieHolder)
     * public org.omg.PortableServer.Servant
     * org.omg.PortableServer._ServantLocatorStub.preinvoke(byte[],org.omg.PortableServer.POA,java.lang.String,org.omg.PortableServer.ServantLocatorPackage.CookieHolder)
     * throws org.omg.PortableServer.ForwardRequest}.
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
    public default void test_preinvoke_byteArray_POA_String_CookieHolder()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.omg.PortableServer._ServantLocatorStub#_ids()
     * public java.lang.String[] org.omg.PortableServer._ServantLocatorStub._ids()}.
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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer._ServantLocatorStub]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer._ServantLocatorStub]
}
