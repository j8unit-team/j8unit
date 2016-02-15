package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.locks.ReadWriteLock interface
 * java.util.concurrent.locks.ReadWriteLock}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ReadWriteLockClassTests}.
 * </p>
 *
 * @see java.util.concurrent.locks.ReadWriteLock interface java.util.concurrent.locks.ReadWriteLock (the hereby targeted
 *      class-under-test class)
 * @see ReadWriteLockClassTests ReadWriteLockClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ReadWriteLockTests<SUT extends java.util.concurrent.locks.ReadWriteLock>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReadWriteLock#readLock() public abstract
     * java.util.concurrent.locks.Lock java.util.concurrent.locks.ReadWriteLock.readLock()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReadWriteLock#readLock() public abstract
     * java.util.concurrent.locks.Lock java.util.concurrent.locks.ReadWriteLock.readLock()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReadWriteLock#readLock() public abstract java.util.concurrent.locks.Lock
     *      java.util.concurrent.locks.ReadWriteLock.readLock() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readLock()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReadWriteLock#writeLock() public abstract
     * java.util.concurrent.locks.Lock java.util.concurrent.locks.ReadWriteLock.writeLock()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReadWriteLock#writeLock() public abstract
     * java.util.concurrent.locks.Lock java.util.concurrent.locks.ReadWriteLock.writeLock()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.ReadWriteLock#writeLock() public abstract java.util.concurrent.locks.Lock
     *      java.util.concurrent.locks.ReadWriteLock.writeLock() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeLock()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
