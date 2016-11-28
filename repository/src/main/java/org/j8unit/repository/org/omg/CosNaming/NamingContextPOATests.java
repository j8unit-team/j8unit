package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.org.omg.CORBA.portable.InvokeHandlerTests;
import org.j8unit.repository.org.omg.PortableServer.ServantTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.omg.CosNaming.NamingContextPOA;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link NamingContextPOA public abstract class org.omg.CosNaming.NamingContextPOA}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.org.omg.CosNaming.NamingContextPOAClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NamingContextPOATests<SUT extends NamingContextPOA>
extends NamingContextOperationsTests<SUT>, InvokeHandlerTests<SUT>, ServantTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming.NamingContextPOA]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.CosNaming.NamingContextPOA#_invoke(String, org.omg.CORBA.portable.InputStream, org.omg.CORBA.portable.ResponseHandler)
     * public org.omg.CORBA.portable.OutputStream
     * org.omg.CosNaming.NamingContextPOA._invoke(java.lang.String,org.omg.CORBA.portable.InputStream,org.omg.CORBA.portable.ResponseHandler)}.
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
    public default void test__invoke_String_InputStream_ResponseHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.CosNaming.NamingContextPOA#_all_interfaces(org.omg.PortableServer.POA, byte[]) public
     * java.lang.String[] org.omg.CosNaming.NamingContextPOA._all_interfaces(org.omg.PortableServer.POA,byte[])}.
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
    public default void test__all_interfaces_POA_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.omg.CosNaming.NamingContextPOA#_this() public
     * org.omg.CosNaming.NamingContext org.omg.CosNaming.NamingContextPOA._this()}.
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
    public default void test__this()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.CosNaming.NamingContextPOA#_this(org.omg.CORBA.ORB) public org.omg.CosNaming.NamingContext
     * org.omg.CosNaming.NamingContextPOA._this(org.omg.CORBA.ORB)}.
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
    public default void test__this_ORB()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CosNaming.NamingContextPOA]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CosNaming.NamingContextPOA]

}
