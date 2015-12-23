package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.PortableServer.ServantLocatorOperations interface
 * org.omg.PortableServer.ServantLocatorOperations}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.org.omg.PortableServer.ServantLocatorOperationsTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.PortableServer.ServantLocatorOperationsClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.PortableServer.ServantLocatorOperations
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServantLocatorOperationsTests<SUT extends org.omg.PortableServer.ServantLocatorOperations>
extends org.j8unit.repository.org.omg.PortableServer.ServantManagerOperationsTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.ServantLocatorOperations#postinvoke(byte[], org.omg.PortableServer.POA, java.lang.String, java.lang.Object, org.omg.PortableServer.Servant)
     * public abstract void
     * org.omg.PortableServer.ServantLocatorOperations.postinvoke(byte[],org.omg.PortableServer.POA,java.lang.String,java.lang.Object,org.omg.PortableServer.Servant)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.PortableServer.ServantLocatorOperations#postinvoke(byte[], org.omg.PortableServer.POA,
     *             java.lang.String, java.lang.Object, org.omg.PortableServer.Servant)
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

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.ServantLocatorOperations#preinvoke(byte[], org.omg.PortableServer.POA, java.lang.String, org.omg.PortableServer.ServantLocatorPackage.CookieHolder)
     * public abstract org.omg.PortableServer.Servant
     * org.omg.PortableServer.ServantLocatorOperations.preinvoke(byte[],org.omg.PortableServer.POA,java.lang.String,org.omg.PortableServer.ServantLocatorPackage.CookieHolder)
     * throws org.omg.PortableServer.ForwardRequest}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.PortableServer.ServantLocatorOperations#preinvoke(byte[], org.omg.PortableServer.POA,
     *             java.lang.String, org.omg.PortableServer.ServantLocatorPackage.CookieHolder)
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

}
