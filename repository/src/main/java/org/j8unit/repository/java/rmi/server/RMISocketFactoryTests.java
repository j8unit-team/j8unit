package org.j8unit.repository.java.rmi.server;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.rmi.server.RMISocketFactory class
 * java.rmi.server.RMISocketFactory}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.rmi.server.RMISocketFactoryTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.rmi.server.RMISocketFactoryClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.rmi.server.RMISocketFactory
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RMISocketFactoryTests<SUT extends java.rmi.server.RMISocketFactory>
extends org.j8unit.repository.java.rmi.server.RMIClientSocketFactoryTests<SUT>, org.j8unit.repository.java.rmi.server.RMIServerSocketFactoryTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.server.RMISocketFactory#createServerSocket(int) public abstract
     * java.net.ServerSocket java.rmi.server.RMISocketFactory.createServerSocket(int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.rmi.server.RMISocketFactory#createServerSocket(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createServerSocket_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.RMISocketFactory#createSocket(java.lang.String, int) public abstract
     * java.net.Socket java.rmi.server.RMISocketFactory.createSocket(java.lang.String,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.rmi.server.RMISocketFactory#createSocket(java.lang.String, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createSocket_String_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
