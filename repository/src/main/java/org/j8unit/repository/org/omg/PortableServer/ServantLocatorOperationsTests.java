package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.Servant;
import org.omg.PortableServer.ServantLocatorOperations;
import org.omg.PortableServer.ServantLocatorPackage.CookieHolder;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link ServantLocatorOperations public abstract interface org.omg.PortableServer.ServantLocatorOperations}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.org.omg.PortableServer.ServantLocatorOperationsClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServantLocatorOperationsTests<SUT extends ServantLocatorOperations>
extends org.j8unit.repository.org.omg.PortableServer.ServantManagerOperationsTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.ServantLocatorOperations]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link ServantLocatorOperations#preinvoke(byte[], POA, String, CookieHolder) public abstract
     * org.omg.PortableServer.Servant
     * org.omg.PortableServer.ServantLocatorOperations.preinvoke(byte[],org.omg.PortableServer.POA,java.lang.String,org.omg.PortableServer.ServantLocatorPackage.CookieHolder)
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
     * Test method for the hereby targeted method-under-test
     * {@link ServantLocatorOperations#postinvoke(byte[], POA, String, Object, Servant) public abstract void
     * org.omg.PortableServer.ServantLocatorOperations.postinvoke(byte[],org.omg.PortableServer.POA,java.lang.String,java.lang.Object,org.omg.PortableServer.Servant)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_postinvoke_byteArray_POA_String_Object_Servant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.ServantLocatorOperations]

}
