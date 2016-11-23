package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;
import java.util.concurrent.ForkJoinPool.ManagedBlocker;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ForkJoinPool} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.ForkJoinPoolClassTests}).
 */

@RunWith(J8Unit4.class)
public class ForkJoinPoolClassTest
implements ForkJoinPoolClassTests<ForkJoinPool> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ForkJoinPool]

    @Override
    public Class<ForkJoinPool> createNewSUT() {
        return ForkJoinPool.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.ForkJoinPool#ForkJoinPool(int, java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory, Thread.UncaughtExceptionHandler, boolean)
     * public
     * java.util.concurrent.ForkJoinPool(int,java.util.concurrent.ForkJoinPool$ForkJoinWorkerThreadFactory,java.lang.Thread$UncaughtExceptionHandler,boolean)}.
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
    public void create_ForkJoinPool_int_ForkJoinWorkerThreadFactory_UncaughtExceptionHandler_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ForkJoinPool sut = null; // = new ForkJoinPool(int,
                                       // java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory,
                                       // Thread.UncaughtExceptionHandler, boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.ForkJoinPool#ForkJoinPool(int) public java.util.concurrent.ForkJoinPool(int)}.
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
    public void create_ForkJoinPool_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ForkJoinPool sut = null; // = new ForkJoinPool(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.ForkJoinPool#ForkJoinPool() public java.util.concurrent.ForkJoinPool()}.
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
    public void create_ForkJoinPool()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ForkJoinPool sut = new ForkJoinPool();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.concurrent.ForkJoinPool#managedBlock(java.util.concurrent.ForkJoinPool.ManagedBlocker) public
     * static void java.util.concurrent.ForkJoinPool.managedBlock(java.util.concurrent.ForkJoinPool$ManagedBlocker)
     * throws java.lang.InterruptedException}.
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
    public void test_managedBlock_ManagedBlocker()
    throws Exception {
        // write some test for {@link
        // java.util.concurrent.ForkJoinPool#managedBlock(java.util.concurrent.ForkJoinPool.ManagedBlocker)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.concurrent.ForkJoinPool#getCommonPoolParallelism() public static int
     * java.util.concurrent.ForkJoinPool.getCommonPoolParallelism()}.
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
    public void test_getCommonPoolParallelism()
    throws Exception {
        // write some test for {@link java.util.concurrent.ForkJoinPool#getCommonPoolParallelism()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.concurrent.ForkJoinPool#commonPool()
     * public static java.util.concurrent.ForkJoinPool java.util.concurrent.ForkJoinPool.commonPool()}.
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
    public void test_commonPool()
    throws Exception {
        // write some test for {@link java.util.concurrent.ForkJoinPool#commonPool()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.ForkJoinPool]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ForkJoinPool]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link ForkJoinWorkerThreadFactory} (by
     * simply reusing the J8Unit test interface
     * {@link org.j8unit.repository.java.util.concurrent.ForkJoinPoolClassTests.ForkJoinWorkerThreadFactoryClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ForkJoinWorkerThreadFactoryClassTest
    implements ForkJoinWorkerThreadFactoryClassTests<ForkJoinWorkerThreadFactory> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ForkJoinPool$ForkJoinWorkerThreadFactory]

        @Override
        public Class<ForkJoinWorkerThreadFactory> createNewSUT() {
            return ForkJoinWorkerThreadFactory.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.ForkJoinPool$ForkJoinWorkerThreadFactory]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ForkJoinPool$ForkJoinWorkerThreadFactory]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link ManagedBlocker} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.java.util.concurrent.ForkJoinPoolClassTests.ManagedBlockerClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ManagedBlockerClassTest
    implements ManagedBlockerClassTests<ManagedBlocker> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ForkJoinPool$ManagedBlocker]

        @Override
        public Class<ManagedBlocker> createNewSUT() {
            return ManagedBlocker.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.ForkJoinPool$ManagedBlocker]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ForkJoinPool$ManagedBlocker]

    }

}
