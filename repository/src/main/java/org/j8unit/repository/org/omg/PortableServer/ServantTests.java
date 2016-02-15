package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.Servant class org.omg.PortableServer.Servant}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ServantClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.Servant class org.omg.PortableServer.Servant (the hereby targeted class-under-test class)
 * @see ServantClassTests ServantClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServantTests<SUT extends org.omg.PortableServer.Servant>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_all_interfaces(org.omg.PortableServer.POA, byte[]) public
     * abstract java.lang.String[] org.omg.PortableServer.Servant._all_interfaces(org.omg.PortableServer.POA,byte[])}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_all_interfaces(org.omg.PortableServer.POA, byte[]) public
     * abstract java.lang.String[] org.omg.PortableServer.Servant._all_interfaces(org.omg.PortableServer.POA,byte[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.Servant#_all_interfaces(org.omg.PortableServer.POA, byte[]) public abstract
     *      java.lang.String[] org.omg.PortableServer.Servant._all_interfaces(org.omg.PortableServer.POA,byte[]) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.omg.PortableServer.Servant#_default_POA() public org.omg.PortableServer.POA
     * org.omg.PortableServer.Servant._default_POA()}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_default_POA() public org.omg.PortableServer.POA
     * org.omg.PortableServer.Servant._default_POA()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.Servant#_default_POA() public org.omg.PortableServer.POA
     *      org.omg.PortableServer.Servant._default_POA() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test__default_POA()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_is_a(String) public boolean
     * org.omg.PortableServer.Servant._is_a(java.lang.String)}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_is_a(String) public boolean
     * org.omg.PortableServer.Servant._is_a(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.Servant#_is_a(String) public boolean
     *      org.omg.PortableServer.Servant._is_a(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test__is_a_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_object_id() public final byte[]
     * org.omg.PortableServer.Servant._object_id()}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_object_id() public final byte[]
     * org.omg.PortableServer.Servant._object_id()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.Servant#_object_id() public final byte[] org.omg.PortableServer.Servant._object_id()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test__object_id()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_set_delegate(org.omg.PortableServer.portable.Delegate)
     * public final void org.omg.PortableServer.Servant._set_delegate(org.omg.PortableServer.portable.Delegate)}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_set_delegate(org.omg.PortableServer.portable.Delegate)
     * public final void org.omg.PortableServer.Servant._set_delegate(org.omg.PortableServer.portable.Delegate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.Servant#_set_delegate(org.omg.PortableServer.portable.Delegate) public final void
     *      org.omg.PortableServer.Servant._set_delegate(org.omg.PortableServer.portable.Delegate) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test__set_delegate_Delegate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_get_delegate() public final
     * org.omg.PortableServer.portable.Delegate org.omg.PortableServer.Servant._get_delegate()}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_get_delegate() public final
     * org.omg.PortableServer.portable.Delegate org.omg.PortableServer.Servant._get_delegate()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.Servant#_get_delegate() public final org.omg.PortableServer.portable.Delegate
     *      org.omg.PortableServer.Servant._get_delegate() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test__get_delegate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_get_interface_def() public org.omg.CORBA.Object
     * org.omg.PortableServer.Servant._get_interface_def()}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_get_interface_def() public org.omg.CORBA.Object
     * org.omg.PortableServer.Servant._get_interface_def()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.Servant#_get_interface_def() public org.omg.CORBA.Object
     *      org.omg.PortableServer.Servant._get_interface_def() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test__get_interface_def()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_poa() public final org.omg.PortableServer.POA
     * org.omg.PortableServer.Servant._poa()}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_poa() public final org.omg.PortableServer.POA
     * org.omg.PortableServer.Servant._poa()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.Servant#_poa() public final org.omg.PortableServer.POA
     *      org.omg.PortableServer.Servant._poa() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test__poa()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_non_existent() public boolean
     * org.omg.PortableServer.Servant._non_existent()}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_non_existent() public boolean
     * org.omg.PortableServer.Servant._non_existent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.Servant#_non_existent() public boolean org.omg.PortableServer.Servant._non_existent()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test__non_existent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_this_object() public final org.omg.CORBA.Object
     * org.omg.PortableServer.Servant._this_object()}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_this_object() public final org.omg.CORBA.Object
     * org.omg.PortableServer.Servant._this_object()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.Servant#_this_object() public final org.omg.CORBA.Object
     *      org.omg.PortableServer.Servant._this_object() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test__this_object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_this_object(org.omg.CORBA.ORB) public final
     * org.omg.CORBA.Object org.omg.PortableServer.Servant._this_object(org.omg.CORBA.ORB)}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_this_object(org.omg.CORBA.ORB) public final
     * org.omg.CORBA.Object org.omg.PortableServer.Servant._this_object(org.omg.CORBA.ORB)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.Servant#_this_object(org.omg.CORBA.ORB) public final org.omg.CORBA.Object
     *      org.omg.PortableServer.Servant._this_object(org.omg.CORBA.ORB) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test__this_object_ORB()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_orb() public final org.omg.CORBA.ORB
     * org.omg.PortableServer.Servant._orb()}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.Servant#_orb() public final org.omg.CORBA.ORB
     * org.omg.PortableServer.Servant._orb()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.Servant#_orb() public final org.omg.CORBA.ORB org.omg.PortableServer.Servant._orb()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test__orb()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
