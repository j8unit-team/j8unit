package org.j8unit.repository.java.rmi.server;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.rmi.server.Skeleton interface java.rmi.server.Skeleton}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.rmi.server.SkeletonClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SkeletonTests<SUT extends java.rmi.server.Skeleton>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.server.Skeleton#dispatch(java.rmi.Remote,java.rmi.server.RemoteCall,int,long)
     * public abstract void java.rmi.server.Skeleton.dispatch(java.rmi.Remote,java.rmi.server.RemoteCall,int,long)
     * throws java.lang.Exception}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dispatch_Remote_RemoteCall_int_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.Skeleton#getOperations() public abstract java.rmi.server.Operation[]
     * java.rmi.server.Skeleton.getOperations()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOperations()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
