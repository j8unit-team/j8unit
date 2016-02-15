package org.j8unit.repository.java.rmi.dgc;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.dgc.DGC interface java.rmi.dgc.DGC}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link DGCClassTests}.
 * </p>
 *
 * @see java.rmi.dgc.DGC interface java.rmi.dgc.DGC (the hereby targeted class-under-test class)
 * @see DGCClassTests DGCClassTests (the complementary j8unit test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DGCTests<SUT extends java.rmi.dgc.DGC>
extends org.j8unit.repository.java.rmi.RemoteTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.dgc.DGC#dirty(java.rmi.server.ObjID[], long, java.rmi.dgc.Lease) public abstract
     * java.rmi.dgc.Lease java.rmi.dgc.DGC.dirty(java.rmi.server.ObjID[],long,java.rmi.dgc.Lease) throws
     * java.rmi.RemoteException}.
     *
     * <p>
     * Test method for {@link java.rmi.dgc.DGC#dirty(java.rmi.server.ObjID[], long, java.rmi.dgc.Lease) public abstract
     * java.rmi.dgc.Lease java.rmi.dgc.DGC.dirty(java.rmi.server.ObjID[],long,java.rmi.dgc.Lease) throws
     * java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.dgc.DGC#dirty(java.rmi.server.ObjID[], long, java.rmi.dgc.Lease) public abstract java.rmi.dgc.Lease
     *      java.rmi.dgc.DGC.dirty(java.rmi.server.ObjID[],long,java.rmi.dgc.Lease) throws java.rmi.RemoteException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dirty_ObjIDArray_long_Lease()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.dgc.DGC#clean(java.rmi.server.ObjID[], long, java.rmi.dgc.VMID, boolean) public
     * abstract void java.rmi.dgc.DGC.clean(java.rmi.server.ObjID[],long,java.rmi.dgc.VMID,boolean) throws
     * java.rmi.RemoteException}.
     *
     * <p>
     * Test method for {@link java.rmi.dgc.DGC#clean(java.rmi.server.ObjID[], long, java.rmi.dgc.VMID, boolean) public
     * abstract void java.rmi.dgc.DGC.clean(java.rmi.server.ObjID[],long,java.rmi.dgc.VMID,boolean) throws
     * java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.dgc.DGC#clean(java.rmi.server.ObjID[], long, java.rmi.dgc.VMID, boolean) public abstract void
     *      java.rmi.dgc.DGC.clean(java.rmi.server.ObjID[],long,java.rmi.dgc.VMID,boolean) throws
     *      java.rmi.RemoteException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clean_ObjIDArray_long_VMID_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
