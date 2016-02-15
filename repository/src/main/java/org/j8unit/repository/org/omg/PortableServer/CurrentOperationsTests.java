package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.CurrentOperations interface
 * org.omg.PortableServer.CurrentOperations}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link CurrentOperationsClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.CurrentOperations interface org.omg.PortableServer.CurrentOperations (the hereby targeted
 *      class-under-test class)
 * @see CurrentOperationsClassTests CurrentOperationsClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CurrentOperationsTests<SUT extends org.omg.PortableServer.CurrentOperations>
extends org.j8unit.repository.org.omg.CORBA.CurrentOperationsTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.CurrentOperations#get_POA() public abstract
     * org.omg.PortableServer.POA org.omg.PortableServer.CurrentOperations.get_POA() throws
     * org.omg.PortableServer.CurrentPackage.NoContext}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.CurrentOperations#get_POA() public abstract
     * org.omg.PortableServer.POA org.omg.PortableServer.CurrentOperations.get_POA() throws
     * org.omg.PortableServer.CurrentPackage.NoContext}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.CurrentOperations#get_POA() public abstract org.omg.PortableServer.POA
     *      org.omg.PortableServer.CurrentOperations.get_POA() throws org.omg.PortableServer.CurrentPackage.NoContext
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_POA()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.CurrentOperations#get_object_id() public abstract byte[]
     * org.omg.PortableServer.CurrentOperations.get_object_id() throws org.omg.PortableServer.CurrentPackage.NoContext}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.CurrentOperations#get_object_id() public abstract byte[]
     * org.omg.PortableServer.CurrentOperations.get_object_id() throws org.omg.PortableServer.CurrentPackage.NoContext}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.CurrentOperations#get_object_id() public abstract byte[]
     *      org.omg.PortableServer.CurrentOperations.get_object_id() throws
     *      org.omg.PortableServer.CurrentPackage.NoContext (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_object_id()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
