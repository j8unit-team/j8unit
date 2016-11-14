package org.j8unit.repository.java.nio.channels;

import java.nio.channels.AsynchronousChannelGroup;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AsynchronousChannelGroup} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.nio.channels.AsynchronousChannelGroupClassTests}).
 */

@RunWith(J8Unit4.class)
public class AsynchronousChannelGroupClassTest
implements AsynchronousChannelGroupClassTests<AsynchronousChannelGroup> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.AsynchronousChannelGroup]

    @Override
    public Class<AsynchronousChannelGroup> createNewSUT() {
        return AsynchronousChannelGroup.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.nio.channels.AsynchronousChannelGroup#withCachedThreadPool(java.util.concurrent.ExecutorService, int)
     * public static java.nio.channels.AsynchronousChannelGroup
     * java.nio.channels.AsynchronousChannelGroup.withCachedThreadPool(java.util.concurrent.ExecutorService,int) throws
     * java.io.IOException}.
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
    public void test_withCachedThreadPool_ExecutorService_int()
    throws Exception {
        // write some test for {@link
        // java.nio.channels.AsynchronousChannelGroup#withCachedThreadPool(java.util.concurrent.ExecutorService, int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.nio.channels.AsynchronousChannelGroup#withThreadPool(java.util.concurrent.ExecutorService) public
     * static java.nio.channels.AsynchronousChannelGroup
     * java.nio.channels.AsynchronousChannelGroup.withThreadPool(java.util.concurrent.ExecutorService) throws
     * java.io.IOException}.
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
    public void test_withThreadPool_ExecutorService()
    throws Exception {
        // write some test for {@link
        // java.nio.channels.AsynchronousChannelGroup#withThreadPool(java.util.concurrent.ExecutorService)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.nio.channels.AsynchronousChannelGroup#withFixedThreadPool(int, java.util.concurrent.ThreadFactory)
     * public static java.nio.channels.AsynchronousChannelGroup
     * java.nio.channels.AsynchronousChannelGroup.withFixedThreadPool(int,java.util.concurrent.ThreadFactory) throws
     * java.io.IOException}.
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
    public void test_withFixedThreadPool_int_ThreadFactory()
    throws Exception {
        // write some test for {@link java.nio.channels.AsynchronousChannelGroup#withFixedThreadPool(int,
        // java.util.concurrent.ThreadFactory)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.AsynchronousChannelGroup]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.AsynchronousChannelGroup]

}
