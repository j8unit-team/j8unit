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

@RunWith(J8Unit4.class)
public class ReentrantReadWriteLockClassTest
implements org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockClassTests<ReentrantReadWriteLock> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.locks.ReentrantReadWriteLock]

    @Override
    public Class<ReentrantReadWriteLock> createNewSUT() {
        return ReentrantReadWriteLock.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link ReentrantReadWriteLock#ReentrantReadWriteLock()
     * public java.util.concurrent.locks.ReentrantReadWriteLock()}.
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
        final ReentrantReadWriteLock sut = new ReentrantReadWriteLock();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link ReentrantReadWriteLock#ReentrantReadWriteLock(boolean) public
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

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.locks.ReentrantReadWriteLock]

    @RunWith(J8Unit4.class)
    public static class ReadLockClassTest
    implements org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockClassTests.ReadLockClassTests<ReadLock> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock]

        @Override
        public Class<ReadLock> createNewSUT() {
            return ReadLock.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock]

    }

    @RunWith(J8Unit4.class)
    public static class WriteLockClassTest
    implements org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockClassTests.WriteLockClassTests<WriteLock> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock]

        @Override
        public Class<WriteLock> createNewSUT() {
            return WriteLock.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock]

    }

}
