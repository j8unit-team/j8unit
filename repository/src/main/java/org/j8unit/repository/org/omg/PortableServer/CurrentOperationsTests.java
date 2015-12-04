package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableServer.CurrentOperations interface org.omg.PortableServer.CurrentOperations},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableServer.CurrentOperationsClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CurrentOperationsTests<SUT extends org.omg.PortableServer.CurrentOperations>
extends org.j8unit.repository.org.omg.CORBA.CurrentOperationsTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.CurrentOperations#get_object_id() public abstract byte[]
     * org.omg.PortableServer.CurrentOperations.get_object_id() throws org.omg.PortableServer.CurrentPackage.NoContext}.
     * </p>
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

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.CurrentOperations#get_POA() public abstract
     * org.omg.PortableServer.POA org.omg.PortableServer.CurrentOperations.get_POA() throws
     * org.omg.PortableServer.CurrentPackage.NoContext}.
     * </p>
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

}
