package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableServer.DynamicImplementation class
 * org.omg.PortableServer.DynamicImplementation}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableServer.DynamicImplementationClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DynamicImplementationTests<SUT extends org.omg.PortableServer.DynamicImplementation>
extends org.j8unit.repository.org.omg.PortableServer.ServantTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.DynamicImplementation#invoke(org.omg.CORBA.ServerRequest) public
     * abstract void org.omg.PortableServer.DynamicImplementation.invoke(org.omg.CORBA.ServerRequest)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invoke_ServerRequest()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
