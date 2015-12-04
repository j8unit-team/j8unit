package org.j8unit.repository.java.rmi.dgc;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.rmi.dgc.DGC interface java.rmi.dgc.DGC},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.rmi.dgc.DGCClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DGCTests<SUT extends java.rmi.dgc.DGC>
extends org.j8unit.repository.java.rmi.RemoteTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.rmi.dgc.DGC#dirty(java.rmi.server.ObjID[],long,java.rmi.dgc.Lease) public abstract java.rmi.dgc.Lease java.rmi.dgc.DGC.dirty(java.rmi.server.ObjID[],long,java.rmi.dgc.Lease) throws java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dirty_ObjIDArray_long_Lease() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.dgc.DGC#clean(java.rmi.server.ObjID[],long,java.rmi.dgc.VMID,boolean) public abstract void java.rmi.dgc.DGC.clean(java.rmi.server.ObjID[],long,java.rmi.dgc.VMID,boolean) throws java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clean_ObjIDArray_long_VMID_boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
