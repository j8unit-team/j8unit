package org.j8unit.repository.java.rmi.server;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.rmi.server.UnicastRemoteObject class
 * java.rmi.server.UnicastRemoteObject}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.rmi.server.UnicastRemoteObjectTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.rmi.server.UnicastRemoteObjectClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.rmi.server.UnicastRemoteObject
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnicastRemoteObjectTests<SUT extends java.rmi.server.UnicastRemoteObject>
extends org.j8unit.repository.java.rmi.server.RemoteServerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.server.UnicastRemoteObject#clone() public java.lang.Object
     * java.rmi.server.UnicastRemoteObject.clone() throws java.lang.CloneNotSupportedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.rmi.server.UnicastRemoteObject#clone()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
