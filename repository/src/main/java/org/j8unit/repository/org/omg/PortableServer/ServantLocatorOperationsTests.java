package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.PortableServer.ServantLocatorOperations interface org.omg.PortableServer.ServantLocatorOperations},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableServer.ServantLocatorOperationsClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ServantLocatorOperationsTests<SUT extends org.omg.PortableServer.ServantLocatorOperations>
extends org.j8unit.repository.org.omg.PortableServer.ServantManagerOperationsTests<SUT>
{

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.ServantLocatorOperations#preinvoke(byte[],org.omg.PortableServer.POA,java.lang.String,org.omg.PortableServer.ServantLocatorPackage.CookieHolder) public abstract org.omg.PortableServer.Servant org.omg.PortableServer.ServantLocatorOperations.preinvoke(byte[],org.omg.PortableServer.POA,java.lang.String,org.omg.PortableServer.ServantLocatorPackage.CookieHolder) throws org.omg.PortableServer.ForwardRequest}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_preinvoke_byteArray_POA_String_CookieHolder() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.ServantLocatorOperations#postinvoke(byte[],org.omg.PortableServer.POA,java.lang.String,java.lang.Object,org.omg.PortableServer.Servant) public abstract void org.omg.PortableServer.ServantLocatorOperations.postinvoke(byte[],org.omg.PortableServer.POA,java.lang.String,java.lang.Object,org.omg.PortableServer.Servant)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_postinvoke_byteArray_POA_String_Object_Servant() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
