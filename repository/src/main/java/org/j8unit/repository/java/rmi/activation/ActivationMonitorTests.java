package org.j8unit.repository.java.rmi.activation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.activation.ActivationMonitor interface
 * java.rmi.activation.ActivationMonitor}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link ActivationMonitorClassTests}.
 * </p>
 *
 * @see java.rmi.activation.ActivationMonitor interface java.rmi.activation.ActivationMonitor (the hereby targeted
 *      class-under-test class)
 * @see ActivationMonitorClassTests ActivationMonitorClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ActivationMonitorTests<SUT extends java.rmi.activation.ActivationMonitor>
extends org.j8unit.repository.java.rmi.RemoteTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.rmi.activation.ActivationMonitor#inactiveGroup(java.rmi.activation.ActivationGroupID, long) public
     * abstract void java.rmi.activation.ActivationMonitor.inactiveGroup(java.rmi.activation.ActivationGroupID,long)
     * throws java.rmi.activation.UnknownGroupException,java.rmi.RemoteException}.
     *
     * <p>
     * Test method for
     * {@link java.rmi.activation.ActivationMonitor#inactiveGroup(java.rmi.activation.ActivationGroupID, long) public
     * abstract void java.rmi.activation.ActivationMonitor.inactiveGroup(java.rmi.activation.ActivationGroupID,long)
     * throws java.rmi.activation.UnknownGroupException,java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.activation.ActivationMonitor#inactiveGroup(java.rmi.activation.ActivationGroupID, long) public
     *      abstract void
     *      java.rmi.activation.ActivationMonitor.inactiveGroup(java.rmi.activation.ActivationGroupID,long) throws
     *      java.rmi.activation.UnknownGroupException,java.rmi.RemoteException (the hereby targeted method-under-test)
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
     * {@link java.rmi.activation.ActivationMonitor#activeObject(java.rmi.activation.ActivationID, java.rmi.MarshalledObject)
     * public abstract void
     * java.rmi.activation.ActivationMonitor.activeObject(java.rmi.activation.ActivationID,java.rmi.MarshalledObject<?
     * extends java.rmi.Remote>) throws java.rmi.activation.UnknownObjectException,java.rmi.RemoteException}.
     *
     * <p>
     * Test method for
     * {@link java.rmi.activation.ActivationMonitor#activeObject(java.rmi.activation.ActivationID, java.rmi.MarshalledObject)
     * public abstract void
     * java.rmi.activation.ActivationMonitor.activeObject(java.rmi.activation.ActivationID,java.rmi.MarshalledObject)
     * throws java.rmi.activation.UnknownObjectException,java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.activation.ActivationMonitor#activeObject(java.rmi.activation.ActivationID,
     *      java.rmi.MarshalledObject) public abstract void
     *      java.rmi.activation.ActivationMonitor.activeObject(java.rmi.activation.ActivationID,java.rmi.
     *      MarshalledObject) throws java.rmi.activation.UnknownObjectException,java.rmi.RemoteException (the hereby
     *      targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link java.rmi.activation.ActivationMonitor#inactiveObject(java.rmi.activation.ActivationID)
     * public abstract void java.rmi.activation.ActivationMonitor.inactiveObject(java.rmi.activation.ActivationID)
     * throws java.rmi.activation.UnknownObjectException,java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.activation.ActivationMonitor#inactiveObject(java.rmi.activation.ActivationID) public abstract void
     *      java.rmi.activation.ActivationMonitor.inactiveObject(java.rmi.activation.ActivationID) throws
     *      java.rmi.activation.UnknownObjectException,java.rmi.RemoteException (the hereby targeted method-under-test)
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
