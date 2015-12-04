package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.CosNaming.NamingContextExtPOA class org.omg.CosNaming.NamingContextExtPOA}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.CosNaming.NamingContextExtPOAClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface NamingContextExtPOATests<SUT extends org.omg.CosNaming.NamingContextExtPOA>
extends org.j8unit.repository.org.omg.CosNaming.NamingContextExtOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.InvokeHandlerTests<SUT>,
org.j8unit.repository.org.omg.PortableServer.ServantTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextExtPOA#_this() public org.omg.CosNaming.NamingContextExt
     * org.omg.CosNaming.NamingContextExtPOA._this()}.
     * </p>
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
     * </p>
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
     * {@link org.omg.CosNaming.NamingContextExtPOA#_invoke(java.lang.String,org.omg.CORBA.portable.InputStream,org.omg.CORBA.portable.ResponseHandler)
     * public org.omg.CORBA.portable.OutputStream
     * org.omg.CosNaming.NamingContextExtPOA._invoke(java.lang.String,org.omg.CORBA.portable.InputStream,org.omg.CORBA.portable.ResponseHandler)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test__invoke_String_InputStream_ResponseHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextExtPOA#_all_interfaces(org.omg.PortableServer.POA,byte[])
     * public java.lang.String[]
     * org.omg.CosNaming.NamingContextExtPOA._all_interfaces(org.omg.PortableServer.POA,byte[])}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test__all_interfaces_POA_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
