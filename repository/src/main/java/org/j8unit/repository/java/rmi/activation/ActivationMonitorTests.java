package org.j8unit.repository.java.rmi.activation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.rmi.activation.ActivationMonitor interface java.rmi.activation.ActivationMonitor},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.rmi.activation.ActivationMonitorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ActivationMonitorTests<SUT extends java.rmi.activation.ActivationMonitor>
extends org.j8unit.repository.java.rmi.RemoteTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.rmi.activation.ActivationMonitor#inactiveGroup(java.rmi.activation.ActivationGroupID,long) public
     * abstract void java.rmi.activation.ActivationMonitor.inactiveGroup(java.rmi.activation.ActivationGroupID,long)
     * throws java.rmi.activation.UnknownGroupException,java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_inactiveGroup_ActivationGroupID_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.rmi.activation.ActivationMonitor#activeObject(java.rmi.activation.ActivationID,java.rmi.MarshalledObject)
     * public abstract void
     * java.rmi.activation.ActivationMonitor.activeObject(java.rmi.activation.ActivationID,java.rmi.MarshalledObject)
     * throws java.rmi.activation.UnknownObjectException,java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_activeObject_ActivationID_MarshalledObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.activation.ActivationMonitor#inactiveObject(java.rmi.activation.ActivationID)
     * public abstract void java.rmi.activation.ActivationMonitor.inactiveObject(java.rmi.activation.ActivationID)
     * throws java.rmi.activation.UnknownObjectException,java.rmi.RemoteException}.
     * </p>
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

}
