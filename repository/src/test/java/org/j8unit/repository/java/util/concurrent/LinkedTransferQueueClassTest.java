package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.LinkedTransferQueue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LinkedTransferQueue} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.LinkedTransferQueueClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class LinkedTransferQueueClassTest
implements LinkedTransferQueueClassTests<LinkedTransferQueue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.LinkedTransferQueue]

    @Override
    public Class<LinkedTransferQueue> createNewSUT() {
        return LinkedTransferQueue.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.LinkedTransferQueue#LinkedTransferQueue() public
     * java.util.concurrent.LinkedTransferQueue()}.
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
    public void create_LinkedTransferQueue()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LinkedTransferQueue sut = new LinkedTransferQueue();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.LinkedTransferQueue#LinkedTransferQueue(java.util.Collection) public
     * java.util.concurrent.LinkedTransferQueue(java.util.Collection<? extends E>)}.
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
    public void create_LinkedTransferQueue_Collection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LinkedTransferQueue sut = null; // = new LinkedTransferQueue(java.util.Collection);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.LinkedTransferQueue]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.LinkedTransferQueue]

}
