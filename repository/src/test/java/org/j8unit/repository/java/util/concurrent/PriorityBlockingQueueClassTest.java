package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.PriorityBlockingQueue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PriorityBlockingQueue} (by simply reusing
 * the J8Unit test interface {@link PriorityBlockingQueueClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class PriorityBlockingQueueClassTest
implements PriorityBlockingQueueClassTests<PriorityBlockingQueue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.PriorityBlockingQueue]

    @Override
    public Class<PriorityBlockingQueue> createNewSUT() {
        return PriorityBlockingQueue.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.PriorityBlockingQueue#PriorityBlockingQueue() public
     * java.util.concurrent.PriorityBlockingQueue()}.
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
    public void create_PriorityBlockingQueue()
    throws Exception {
        // create new instance
        final PriorityBlockingQueue sut = new PriorityBlockingQueue();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.PriorityBlockingQueue#PriorityBlockingQueue(java.util.Collection) public
     * java.util.concurrent.PriorityBlockingQueue(java.util.Collection<? extends E>)}.
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
    public void create_PriorityBlockingQueue_Collection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PriorityBlockingQueue sut = null; // = new PriorityBlockingQueue(java.util.Collection);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.PriorityBlockingQueue#PriorityBlockingQueue(int) public
     * java.util.concurrent.PriorityBlockingQueue(int)}.
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
    public void create_PriorityBlockingQueue_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PriorityBlockingQueue sut = null; // = new PriorityBlockingQueue(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.PriorityBlockingQueue#PriorityBlockingQueue(int, java.util.Comparator) public
     * java.util.concurrent.PriorityBlockingQueue(int,java.util.Comparator<? super E>)}.
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
    public void create_PriorityBlockingQueue_int_Comparator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PriorityBlockingQueue sut = null; // = new PriorityBlockingQueue(int, java.util.Comparator);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.PriorityBlockingQueue]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.PriorityBlockingQueue]

}
