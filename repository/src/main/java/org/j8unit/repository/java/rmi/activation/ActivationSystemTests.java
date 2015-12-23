package org.j8unit.repository.java.rmi.activation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.rmi.activation.ActivationSystem interface
 * java.rmi.activation.ActivationSystem}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.rmi.activation.ActivationSystemTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.rmi.activation.ActivationSystemClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.rmi.activation.ActivationSystem
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ActivationSystemTests<SUT extends java.rmi.activation.ActivationSystem>
extends org.j8unit.repository.java.rmi.RemoteTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.rmi.activation.ActivationSystem#activeGroup(java.rmi.activation.ActivationGroupID, java.rmi.activation.ActivationInstantiator, long)
     * public abstract java.rmi.activation.ActivationMonitor
     * java.rmi.activation.ActivationSystem.activeGroup(java.rmi.activation.ActivationGroupID,java.rmi.activation.ActivationInstantiator,long)
     * throws
     * java.rmi.activation.UnknownGroupException,java.rmi.activation.ActivationException,java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.rmi.activation.ActivationSystem#activeGroup(java.rmi.activation.ActivationGroupID,
     *             java.rmi.activation.ActivationInstantiator, long)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_activeGroup_ActivationGroupID_ActivationInstantiator_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.activation.ActivationSystem#getActivationDesc(java.rmi.activation.ActivationID)
     * public abstract java.rmi.activation.ActivationDesc
     * java.rmi.activation.ActivationSystem.getActivationDesc(java.rmi.activation.ActivationID) throws
     * java.rmi.activation.ActivationException,java.rmi.activation.UnknownObjectException,java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.rmi.activation.ActivationSystem#getActivationDesc(java.rmi.activation.ActivationID)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getActivationDesc_ActivationID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.rmi.activation.ActivationSystem#getActivationGroupDesc(java.rmi.activation.ActivationGroupID) public
     * abstract java.rmi.activation.ActivationGroupDesc
     * java.rmi.activation.ActivationSystem.getActivationGroupDesc(java.rmi.activation.ActivationGroupID) throws
     * java.rmi.activation.ActivationException,java.rmi.activation.UnknownGroupException,java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.rmi.activation.ActivationSystem#getActivationGroupDesc(java.rmi.activation.ActivationGroupID)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getActivationGroupDesc_ActivationGroupID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.rmi.activation.ActivationSystem#registerGroup(java.rmi.activation.ActivationGroupDesc) public
     * abstract java.rmi.activation.ActivationGroupID
     * java.rmi.activation.ActivationSystem.registerGroup(java.rmi.activation.ActivationGroupDesc) throws
     * java.rmi.activation.ActivationException,java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.rmi.activation.ActivationSystem#registerGroup(java.rmi.activation.ActivationGroupDesc)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_registerGroup_ActivationGroupDesc()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.activation.ActivationSystem#registerObject(java.rmi.activation.ActivationDesc)
     * public abstract java.rmi.activation.ActivationID
     * java.rmi.activation.ActivationSystem.registerObject(java.rmi.activation.ActivationDesc) throws
     * java.rmi.activation.ActivationException,java.rmi.activation.UnknownGroupException,java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.rmi.activation.ActivationSystem#registerObject(java.rmi.activation.ActivationDesc)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_registerObject_ActivationDesc()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.rmi.activation.ActivationSystem#setActivationDesc(java.rmi.activation.ActivationID, java.rmi.activation.ActivationDesc)
     * public abstract java.rmi.activation.ActivationDesc
     * java.rmi.activation.ActivationSystem.setActivationDesc(java.rmi.activation.ActivationID,java.rmi.activation.ActivationDesc)
     * throws
     * java.rmi.activation.ActivationException,java.rmi.activation.UnknownObjectException,java.rmi.activation.UnknownGroupException,java.rmi.RemoteException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.rmi.activation.ActivationSystem#setActivationDesc(java.rmi.activation.ActivationID,
     *             java.rmi.activation.ActivationDesc)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setActivationDesc_ActivationID_ActivationDesc()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.rmi.activation.ActivationSystem#setActivationGroupDesc(java.rmi.activation.ActivationGroupID, java.rmi.activation.ActivationGroupDesc)
     * public abstract java.rmi.activation.ActivationGroupDesc
     * java.rmi.activation.ActivationSystem.setActivationGroupDesc(java.rmi.activation.ActivationGroupID,java.rmi.activation.ActivationGroupDesc)
     * throws
     * java.rmi.activation.ActivationException,java.rmi.activation.UnknownGroupException,java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.rmi.activation.ActivationSystem#setActivationGroupDesc(java.rmi.activation.ActivationGroupID,
     *             java.rmi.activation.ActivationGroupDesc)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setActivationGroupDesc_ActivationGroupID_ActivationGroupDesc()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.activation.ActivationSystem#shutdown() public abstract void
     * java.rmi.activation.ActivationSystem.shutdown() throws java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.rmi.activation.ActivationSystem#shutdown()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_shutdown()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.rmi.activation.ActivationSystem#unregisterGroup(java.rmi.activation.ActivationGroupID) public
     * abstract void java.rmi.activation.ActivationSystem.unregisterGroup(java.rmi.activation.ActivationGroupID) throws
     * java.rmi.activation.ActivationException,java.rmi.activation.UnknownGroupException,java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.rmi.activation.ActivationSystem#unregisterGroup(java.rmi.activation.ActivationGroupID)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unregisterGroup_ActivationGroupID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.activation.ActivationSystem#unregisterObject(java.rmi.activation.ActivationID)
     * public abstract void java.rmi.activation.ActivationSystem.unregisterObject(java.rmi.activation.ActivationID)
     * throws
     * java.rmi.activation.ActivationException,java.rmi.activation.UnknownObjectException,java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.rmi.activation.ActivationSystem#unregisterObject(java.rmi.activation.ActivationID)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unregisterObject_ActivationID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
