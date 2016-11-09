package org.j8unit.repository.java.util;

import java.util.PriorityQueue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PriorityQueue} (by simply reusing the
 * J8Unit test interface {@link PriorityQueueClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class PriorityQueueClassTest
implements PriorityQueueClassTests<PriorityQueue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.PriorityQueue]

    @Override
    public Class<PriorityQueue> createNewSUT() {
        return PriorityQueue.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.PriorityQueue#PriorityQueue(java.util.Comparator) public
     * java.util.PriorityQueue(java.util.Comparator<? super E>)}.
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
    public void create_PriorityQueue_Comparator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PriorityQueue sut = null; // = new PriorityQueue(java.util.Comparator);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.PriorityQueue#PriorityQueue() public
     * java.util.PriorityQueue()}.
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
    public void create_PriorityQueue()
    throws Exception {
        // create new instance
        final PriorityQueue sut = new PriorityQueue();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.PriorityQueue#PriorityQueue(int)
     * public java.util.PriorityQueue(int)}.
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
    public void create_PriorityQueue_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PriorityQueue sut = null; // = new PriorityQueue(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.PriorityQueue#PriorityQueue(int, java.util.Comparator) public
     * java.util.PriorityQueue(int,java.util.Comparator<? super E>)}.
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
    public void create_PriorityQueue_int_Comparator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PriorityQueue sut = null; // = new PriorityQueue(int, java.util.Comparator);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.PriorityQueue#PriorityQueue(java.util.Collection) public
     * java.util.PriorityQueue(java.util.Collection<? extends E>)}.
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
    public void create_PriorityQueue_Collection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PriorityQueue sut = null; // = new PriorityQueue(java.util.Collection);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.PriorityQueue#PriorityQueue(java.util.PriorityQueue) public
     * java.util.PriorityQueue(java.util.PriorityQueue<? extends E>)}.
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
    public void create_PriorityQueue_PriorityQueue()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PriorityQueue sut = null; // = new PriorityQueue(java.util.PriorityQueue);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.PriorityQueue#PriorityQueue(java.util.SortedSet) public
     * java.util.PriorityQueue(java.util.SortedSet<? extends E>)}.
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
    public void create_PriorityQueue_SortedSet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PriorityQueue sut = null; // = new PriorityQueue(java.util.SortedSet);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.PriorityQueue]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.PriorityQueue]

}
