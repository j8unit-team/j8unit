package org.j8unit.repository.java.util.concurrent;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ConcurrentLinkedQueueClassTest
implements org.j8unit.repository.java.util.concurrent.ConcurrentLinkedQueueClassTests<ConcurrentLinkedQueue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ConcurrentLinkedQueue]

    @Override
    public Class<ConcurrentLinkedQueue> createNewSUT() {
        return ConcurrentLinkedQueue.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link ConcurrentLinkedQueue#ConcurrentLinkedQueue()
     * public java.util.concurrent.ConcurrentLinkedQueue()}.
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
    public void create_ConcurrentLinkedQueue()
    throws Exception {
        // create new instance
        final ConcurrentLinkedQueue sut = new ConcurrentLinkedQueue();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link ConcurrentLinkedQueue#ConcurrentLinkedQueue(Collection) public
     * java.util.concurrent.ConcurrentLinkedQueue(java.util.Collection<? extends E>)}.
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
    public void create_ConcurrentLinkedQueue_Collection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ConcurrentLinkedQueue sut = null; // = new ConcurrentLinkedQueue(Collection);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ConcurrentLinkedQueue]

}
