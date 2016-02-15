package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CosNaming.NamingContextExtPOA class
 * org.omg.CosNaming.NamingContextExtPOA}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link NamingContextExtPOAClassTests}.
 * </p>
 *
 * @see org.omg.CosNaming.NamingContextExtPOA class org.omg.CosNaming.NamingContextExtPOA (the hereby targeted
 *      class-under-test class)
 * @see NamingContextExtPOAClassTests NamingContextExtPOAClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NamingContextExtPOATests<SUT extends org.omg.CosNaming.NamingContextExtPOA>
extends NamingContextExtOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.InvokeHandlerTests<SUT>,
org.j8unit.repository.org.omg.PortableServer.ServantTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextExtPOA#_this() public org.omg.CosNaming.NamingContextExt
     * org.omg.CosNaming.NamingContextExtPOA._this()}.
     *
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextExtPOA#_this() public org.omg.CosNaming.NamingContextExt
     * org.omg.CosNaming.NamingContextExtPOA._this()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming.NamingContextExtPOA#_this() public org.omg.CosNaming.NamingContextExt
     *      org.omg.CosNaming.NamingContextExtPOA._this() (the hereby targeted method-under-test)
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
     * Test method for {@link org.omg.CosNaming.NamingContextExtPOA#_this(org.omg.CORBA.ORB) public
     * org.omg.CosNaming.NamingContextExt org.omg.CosNaming.NamingContextExtPOA._this(org.omg.CORBA.ORB)}.
     *
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextExtPOA#_this(org.omg.CORBA.ORB) public
     * org.omg.CosNaming.NamingContextExt org.omg.CosNaming.NamingContextExtPOA._this(org.omg.CORBA.ORB)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming.NamingContextExtPOA#_this(org.omg.CORBA.ORB) public org.omg.CosNaming.NamingContextExt
     *      org.omg.CosNaming.NamingContextExtPOA._this(org.omg.CORBA.ORB) (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for
     * {@link org.omg.CosNaming.NamingContextExtPOA#_invoke(String, org.omg.CORBA.portable.InputStream, org.omg.CORBA.portable.ResponseHandler)
     * public org.omg.CORBA.portable.OutputStream
     * org.omg.CosNaming.NamingContextExtPOA._invoke(java.lang.String,org.omg.CORBA.portable.InputStream,org.omg.CORBA.portable.ResponseHandler)}
     * .
     *
     * <p>
     * Test method for
     * {@link org.omg.CosNaming.NamingContextExtPOA#_invoke(String, org.omg.CORBA.portable.InputStream, org.omg.CORBA.portable.ResponseHandler)
     * public org.omg.CORBA.portable.OutputStream
     * org.omg.CosNaming.NamingContextExtPOA._invoke(java.lang.String,org.omg.CORBA.portable.InputStream,org.omg.CORBA.portable.ResponseHandler)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming.NamingContextExtPOA#_invoke(String, org.omg.CORBA.portable.InputStream,
     *      org.omg.CORBA.portable.ResponseHandler) public org.omg.CORBA.portable.OutputStream
     *      org.omg.CosNaming.NamingContextExtPOA._invoke(java.lang.String,org.omg.CORBA.portable.InputStream,org.omg.
     *      CORBA.portable.ResponseHandler) (the hereby targeted method-under-test)
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
     * Test method for {@link org.omg.CosNaming.NamingContextExtPOA#_all_interfaces(org.omg.PortableServer.POA, byte[])
     * public java.lang.String[]
     * org.omg.CosNaming.NamingContextExtPOA._all_interfaces(org.omg.PortableServer.POA,byte[])}.
     *
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextExtPOA#_all_interfaces(org.omg.PortableServer.POA, byte[])
     * public java.lang.String[]
     * org.omg.CosNaming.NamingContextExtPOA._all_interfaces(org.omg.PortableServer.POA,byte[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming.NamingContextExtPOA#_all_interfaces(org.omg.PortableServer.POA, byte[]) public
     *      java.lang.String[] org.omg.CosNaming.NamingContextExtPOA._all_interfaces(org.omg.PortableServer.POA,byte[])
     *      (the hereby targeted method-under-test)
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

}
