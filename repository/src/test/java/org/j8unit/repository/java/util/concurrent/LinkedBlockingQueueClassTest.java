package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.LinkedBlockingQueue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LinkedBlockingQueue} (by simply reusing
 * the J8Unit test interface {@link LinkedBlockingQueueClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class LinkedBlockingQueueClassTest
implements LinkedBlockingQueueClassTests<LinkedBlockingQueue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.LinkedBlockingQueue]

    @Override
    public Class<LinkedBlockingQueue> createNewSUT() {
        return LinkedBlockingQueue.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.LinkedBlockingQueue#LinkedBlockingQueue() public
     * java.util.concurrent.LinkedBlockingQueue()}.
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
    public void create_LinkedBlockingQueue()
    throws Exception {
        // create new instance
        final LinkedBlockingQueue sut = new LinkedBlockingQueue();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.LinkedBlockingQueue#LinkedBlockingQueue(int) public
     * java.util.concurrent.LinkedBlockingQueue(int)}.
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
    public void create_LinkedBlockingQueue_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LinkedBlockingQueue sut = null; // = new LinkedBlockingQueue(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.LinkedBlockingQueue#LinkedBlockingQueue(java.util.Collection) public
     * java.util.concurrent.LinkedBlockingQueue(java.util.Collection<? extends E>)}.
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
    public void create_LinkedBlockingQueue_Collection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LinkedBlockingQueue sut = null; // = new LinkedBlockingQueue(java.util.Collection);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.LinkedBlockingQueue]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.LinkedBlockingQueue]

}
