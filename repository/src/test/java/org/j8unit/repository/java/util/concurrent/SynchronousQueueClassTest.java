package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.SynchronousQueue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SynchronousQueue} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.SynchronousQueueClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SynchronousQueueClassTest
implements SynchronousQueueClassTests<SynchronousQueue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.SynchronousQueue]

    @Override
    public Class<SynchronousQueue> createNewSUT() {
        return SynchronousQueue.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.SynchronousQueue#SynchronousQueue() public java.util.concurrent.SynchronousQueue()}.
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
    public void create_SynchronousQueue()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SynchronousQueue sut = new SynchronousQueue();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.SynchronousQueue#SynchronousQueue(boolean) public
     * java.util.concurrent.SynchronousQueue(boolean)}.
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
    public void create_SynchronousQueue_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SynchronousQueue sut = null; // = new SynchronousQueue(boolean);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.SynchronousQueue]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.SynchronousQueue]

}
