package org.j8unit.repository.java.rmi.activation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.activation.ActivationGroup class
 * java.rmi.activation.ActivationGroup}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link ActivationGroupClassTests}.
 * </p>
 *
 * @see java.rmi.activation.ActivationGroup class java.rmi.activation.ActivationGroup (the hereby targeted
 *      class-under-test class)
 * @see ActivationGroupClassTests ActivationGroupClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ActivationGroupTests<SUT extends java.rmi.activation.ActivationGroup>
extends ActivationInstantiatorTests<SUT>, org.j8unit.repository.java.rmi.server.UnicastRemoteObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.activation.ActivationGroup#inactiveObject(java.rmi.activation.ActivationID)
     * public boolean java.rmi.activation.ActivationGroup.inactiveObject(java.rmi.activation.ActivationID) throws
     * java.rmi.activation.ActivationException,java.rmi.activation.UnknownObjectException,java.rmi.RemoteException}.
     *
     * <p>
     * Test method for {@link java.rmi.activation.ActivationGroup#inactiveObject(java.rmi.activation.ActivationID)
     * public boolean java.rmi.activation.ActivationGroup.inactiveObject(java.rmi.activation.ActivationID) throws
     * java.rmi.activation.ActivationException,java.rmi.activation.UnknownObjectException,java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.activation.ActivationGroup#inactiveObject(java.rmi.activation.ActivationID) public boolean
     *      java.rmi.activation.ActivationGroup.inactiveObject(java.rmi.activation.ActivationID) throws
     *      java.rmi.activation.ActivationException,java.rmi.activation.UnknownObjectException,java.rmi.RemoteException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_inactiveObject_ActivationID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.rmi.activation.ActivationGroup#activeObject(java.rmi.activation.ActivationID, java.rmi.Remote) public
     * abstract void java.rmi.activation.ActivationGroup.activeObject(java.rmi.activation.ActivationID,java.rmi.Remote)
     * throws
     * java.rmi.activation.ActivationException,java.rmi.activation.UnknownObjectException,java.rmi.RemoteException}.
     *
     * <p>
     * Test method for
     * {@link java.rmi.activation.ActivationGroup#activeObject(java.rmi.activation.ActivationID, java.rmi.Remote) public
     * abstract void java.rmi.activation.ActivationGroup.activeObject(java.rmi.activation.ActivationID,java.rmi.Remote)
     * throws
     * java.rmi.activation.ActivationException,java.rmi.activation.UnknownObjectException,java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.activation.ActivationGroup#activeObject(java.rmi.activation.ActivationID, java.rmi.Remote) public
     *      abstract void
     *      java.rmi.activation.ActivationGroup.activeObject(java.rmi.activation.ActivationID,java.rmi.Remote) throws
     *      java.rmi.activation.ActivationException,java.rmi.activation.UnknownObjectException,java.rmi.RemoteException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_activeObject_ActivationID_Remote()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
