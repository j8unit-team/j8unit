package org.j8unit.repository.java.rmi.server;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.server.Skeleton interface java.rmi.server.Skeleton}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SkeletonClassTests}.
 * </p>
 *
 * @see java.rmi.server.Skeleton interface java.rmi.server.Skeleton (the hereby targeted class-under-test class)
 * @see SkeletonClassTests SkeletonClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SkeletonTests<SUT extends java.rmi.server.Skeleton>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.server.Skeleton#dispatch(java.rmi.Remote, java.rmi.server.RemoteCall, int, long)
     * public abstract void java.rmi.server.Skeleton.dispatch(java.rmi.Remote,java.rmi.server.RemoteCall,int,long)
     * throws java.lang.Exception}.
     *
     * <p>
     * Test method for {@link java.rmi.server.Skeleton#dispatch(java.rmi.Remote, java.rmi.server.RemoteCall, int, long)
     * public abstract void java.rmi.server.Skeleton.dispatch(java.rmi.Remote,java.rmi.server.RemoteCall,int,long)
     * throws java.lang.Exception}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.Skeleton#dispatch(java.rmi.Remote, java.rmi.server.RemoteCall, int, long) public abstract
     *      void java.rmi.server.Skeleton.dispatch(java.rmi.Remote,java.rmi.server.RemoteCall,int,long) throws
     *      java.lang.Exception (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link java.rmi.server.Skeleton#getOperations() public abstract java.rmi.server.Operation[]
     * java.rmi.server.Skeleton.getOperations()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.Skeleton#getOperations() public abstract java.rmi.server.Operation[]
     *      java.rmi.server.Skeleton.getOperations() (the hereby targeted method-under-test)
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
