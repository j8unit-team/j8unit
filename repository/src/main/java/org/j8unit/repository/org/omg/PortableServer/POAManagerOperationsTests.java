package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableServer.POAManagerOperations interface
 * org.omg.PortableServer.POAManagerOperations}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableServer.POAManagerOperationsClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface POAManagerOperationsTests<SUT extends org.omg.PortableServer.POAManagerOperations>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAManagerOperations#activate() public abstract void
     * org.omg.PortableServer.POAManagerOperations.activate() throws
     * org.omg.PortableServer.POAManagerPackage.AdapterInactive}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_activate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAManagerOperations#deactivate(boolean,boolean) public abstract
     * void org.omg.PortableServer.POAManagerOperations.deactivate(boolean,boolean) throws
     * org.omg.PortableServer.POAManagerPackage.AdapterInactive}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_deactivate_boolean_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAManagerOperations#discard_requests(boolean) public abstract void
     * org.omg.PortableServer.POAManagerOperations.discard_requests(boolean) throws
     * org.omg.PortableServer.POAManagerPackage.AdapterInactive}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_discard_requests_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAManagerOperations#get_state() public abstract
     * org.omg.PortableServer.POAManagerPackage.State org.omg.PortableServer.POAManagerOperations.get_state()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_state()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.POAManagerOperations#hold_requests(boolean) public abstract void
     * org.omg.PortableServer.POAManagerOperations.hold_requests(boolean) throws
     * org.omg.PortableServer.POAManagerPackage.AdapterInactive}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hold_requests_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
