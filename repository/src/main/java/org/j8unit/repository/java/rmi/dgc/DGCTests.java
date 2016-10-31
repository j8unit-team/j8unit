package org.j8unit.repository.java.rmi.dgc;

import java.rmi.dgc.DGC;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link DGC public
 * abstract interface java.rmi.dgc.DGC}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.rmi.dgc.DGCClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DGCTests<SUT extends DGC>
extends org.j8unit.repository.java.rmi.RemoteTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.dgc.DGC]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.rmi.dgc.DGC#dirty(java.rmi.server.ObjID[], long, java.rmi.dgc.Lease) public abstract
     * java.rmi.dgc.Lease java.rmi.dgc.DGC.dirty(java.rmi.server.ObjID[],long,java.rmi.dgc.Lease) throws
     * java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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
     * Test method for the hereby targeted method-under-test
     * {@link java.rmi.dgc.DGC#clean(java.rmi.server.ObjID[], long, java.rmi.dgc.VMID, boolean) public abstract void
     * java.rmi.dgc.DGC.clean(java.rmi.server.ObjID[],long,java.rmi.dgc.VMID,boolean) throws java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.dgc.DGC]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.dgc.DGC]
}
