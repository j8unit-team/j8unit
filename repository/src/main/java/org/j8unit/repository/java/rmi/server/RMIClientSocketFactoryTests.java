package org.j8unit.repository.java.rmi.server;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.rmi.server.RMIClientSocketFactory interface java.rmi.server.RMIClientSocketFactory},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.rmi.server.RMIClientSocketFactoryClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RMIClientSocketFactoryTests<SUT extends java.rmi.server.RMIClientSocketFactory>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.server.RMIClientSocketFactory#createSocket(java.lang.String,int) public abstract
     * java.net.Socket java.rmi.server.RMIClientSocketFactory.createSocket(java.lang.String,int) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createSocket_String_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
