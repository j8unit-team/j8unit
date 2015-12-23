package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.PortableServer.ServantLocatorPOA class
 * org.omg.PortableServer.ServantLocatorPOA}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.PortableServer.ServantLocatorPOATests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.PortableServer.ServantLocatorPOAClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.PortableServer.ServantLocatorPOA
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServantLocatorPOATests<SUT extends org.omg.PortableServer.ServantLocatorPOA>
extends org.j8unit.repository.org.omg.PortableServer.ServantLocatorOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.InvokeHandlerTests<SUT>,
org.j8unit.repository.org.omg.PortableServer.ServantTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.ServantLocatorPOA#_all_interfaces(org.omg.PortableServer.POA, byte[]) public
     * java.lang.String[] org.omg.PortableServer.ServantLocatorPOA._all_interfaces(org.omg.PortableServer.POA,byte[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.PortableServer.ServantLocatorPOA#_all_interfaces(org.omg.PortableServer.POA, byte[])
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

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableServer.ServantLocatorPOA#_invoke(java.lang.String, org.omg.CORBA.portable.InputStream, org.omg.CORBA.portable.ResponseHandler)
     * public org.omg.CORBA.portable.OutputStream
     * org.omg.PortableServer.ServantLocatorPOA._invoke(java.lang.String,org.omg.CORBA.portable.InputStream,org.omg.CORBA.portable.ResponseHandler)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.PortableServer.ServantLocatorPOA#_invoke(java.lang.String,
     *             org.omg.CORBA.portable.InputStream, org.omg.CORBA.portable.ResponseHandler)
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
     * Test method for {@link org.omg.PortableServer.ServantLocatorPOA#_this() public
     * org.omg.PortableServer.ServantLocator org.omg.PortableServer.ServantLocatorPOA._this()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.PortableServer.ServantLocatorPOA#_this()
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
     * Test method for {@link org.omg.PortableServer.ServantLocatorPOA#_this(org.omg.CORBA.ORB) public
     * org.omg.PortableServer.ServantLocator org.omg.PortableServer.ServantLocatorPOA._this(org.omg.CORBA.ORB)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.PortableServer.ServantLocatorPOA#_this(org.omg.CORBA.ORB)
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

}
