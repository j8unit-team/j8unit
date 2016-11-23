package org.j8unit.repository.java.lang.ref;

import java.lang.ref.ReferenceQueue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ReferenceQueue} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.ref.ReferenceQueueClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ReferenceQueueClassTest
implements ReferenceQueueClassTests<ReferenceQueue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.ref.ReferenceQueue]

    @Override
    public Class<ReferenceQueue> createNewSUT() {
        return ReferenceQueue.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.lang.ref.ReferenceQueue#ReferenceQueue()
     * public java.lang.ref.ReferenceQueue()}.
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
    public void create_ReferenceQueue()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ReferenceQueue sut = new ReferenceQueue();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.ref.ReferenceQueue]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.ref.ReferenceQueue]

}
