package org.j8unit.repository.java.util.concurrent.locks;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ReentrantReadWriteLock} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockClassTests}).
 */

@RunWith(J8Unit4.class)
public class ReentrantReadWriteLockClassTest
implements ReentrantReadWriteLockClassTests<ReentrantReadWriteLock> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.locks.ReentrantReadWriteLock]

    @Override
    public Class<ReentrantReadWriteLock> createNewSUT() {
        return ReentrantReadWriteLock.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.locks.ReentrantReadWriteLock#ReentrantReadWriteLock(boolean) public
     * java.util.concurrent.locks.ReentrantReadWriteLock(boolean)}.
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
    public void create_ReentrantReadWriteLock_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ReentrantReadWriteLock sut = null; // = new ReentrantReadWriteLock(boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.locks.ReentrantReadWriteLock#ReentrantReadWriteLock() public
     * java.util.concurrent.locks.ReentrantReadWriteLock()}.
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
    public void create_ReentrantReadWriteLock()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ReentrantReadWriteLock sut = new ReentrantReadWriteLock();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.locks.ReentrantReadWriteLock]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.locks.ReentrantReadWriteLock]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link ReadLock} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockClassTests.ReadLockClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ReadLockClassTest
    implements ReadLockClassTests<ReadLock> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock]

        @Override
        public Class<ReadLock> createNewSUT() {
            return ReadLock.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link WriteLock} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockClassTests.WriteLockClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class WriteLockClassTest
    implements WriteLockClassTests<WriteLock> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock]

        @Override
        public Class<WriteLock> createNewSUT() {
            return WriteLock.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock]

    }

}
