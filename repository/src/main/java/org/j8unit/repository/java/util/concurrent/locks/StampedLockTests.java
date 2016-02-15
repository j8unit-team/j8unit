package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.locks.StampedLock class
 * java.util.concurrent.locks.StampedLock}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link StampedLockClassTests}.
 * </p>
 *
 * @see java.util.concurrent.locks.StampedLock class java.util.concurrent.locks.StampedLock (the hereby targeted
 *      class-under-test class)
 * @see StampedLockClassTests StampedLockClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StampedLockTests<SUT extends java.util.concurrent.locks.StampedLock>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#tryUnlockRead() public boolean
     * java.util.concurrent.locks.StampedLock.tryUnlockRead()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#tryUnlockRead() public boolean
     * java.util.concurrent.locks.StampedLock.tryUnlockRead()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#tryUnlockRead() public boolean
     *      java.util.concurrent.locks.StampedLock.tryUnlockRead() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryUnlockRead()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#unlockRead(long) public void
     * java.util.concurrent.locks.StampedLock.unlockRead(long)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#unlockRead(long) public void
     * java.util.concurrent.locks.StampedLock.unlockRead(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#unlockRead(long) public void
     *      java.util.concurrent.locks.StampedLock.unlockRead(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unlockRead_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#toString() public java.lang.String
     * java.util.concurrent.locks.StampedLock.toString()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#toString() public java.lang.String
     * java.util.concurrent.locks.StampedLock.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#toString() public java.lang.String
     *      java.util.concurrent.locks.StampedLock.toString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#tryOptimisticRead() public long
     * java.util.concurrent.locks.StampedLock.tryOptimisticRead()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#tryOptimisticRead() public long
     * java.util.concurrent.locks.StampedLock.tryOptimisticRead()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#tryOptimisticRead() public long
     *      java.util.concurrent.locks.StampedLock.tryOptimisticRead() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryOptimisticRead()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#tryConvertToWriteLock(long) public long
     * java.util.concurrent.locks.StampedLock.tryConvertToWriteLock(long)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#tryConvertToWriteLock(long) public long
     * java.util.concurrent.locks.StampedLock.tryConvertToWriteLock(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#tryConvertToWriteLock(long) public long
     *      java.util.concurrent.locks.StampedLock.tryConvertToWriteLock(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryConvertToWriteLock_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#tryReadLock(long, java.util.concurrent.TimeUnit)
     * public long java.util.concurrent.locks.StampedLock.tryReadLock(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#tryReadLock(long, java.util.concurrent.TimeUnit)
     * public long java.util.concurrent.locks.StampedLock.tryReadLock(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#tryReadLock(long, java.util.concurrent.TimeUnit) public long
     *      java.util.concurrent.locks.StampedLock.tryReadLock(long,java.util.concurrent.TimeUnit) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryReadLock_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#tryReadLock() public long
     * java.util.concurrent.locks.StampedLock.tryReadLock()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#tryReadLock() public long
     * java.util.concurrent.locks.StampedLock.tryReadLock()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#tryReadLock() public long
     *      java.util.concurrent.locks.StampedLock.tryReadLock() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryReadLock()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#tryUnlockWrite() public boolean
     * java.util.concurrent.locks.StampedLock.tryUnlockWrite()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#tryUnlockWrite() public boolean
     * java.util.concurrent.locks.StampedLock.tryUnlockWrite()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#tryUnlockWrite() public boolean
     *      java.util.concurrent.locks.StampedLock.tryUnlockWrite() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryUnlockWrite()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#getReadLockCount() public int
     * java.util.concurrent.locks.StampedLock.getReadLockCount()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#getReadLockCount() public int
     * java.util.concurrent.locks.StampedLock.getReadLockCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#getReadLockCount() public int
     *      java.util.concurrent.locks.StampedLock.getReadLockCount() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReadLockCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#readLock() public long
     * java.util.concurrent.locks.StampedLock.readLock()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#readLock() public long
     * java.util.concurrent.locks.StampedLock.readLock()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#readLock() public long
     *      java.util.concurrent.locks.StampedLock.readLock() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.locks.StampedLock#asReadWriteLock() public
     * java.util.concurrent.locks.ReadWriteLock java.util.concurrent.locks.StampedLock.asReadWriteLock()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#asReadWriteLock() public
     * java.util.concurrent.locks.ReadWriteLock java.util.concurrent.locks.StampedLock.asReadWriteLock()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#asReadWriteLock() public java.util.concurrent.locks.ReadWriteLock
     *      java.util.concurrent.locks.StampedLock.asReadWriteLock() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_asReadWriteLock()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#unlock(long) public void
     * java.util.concurrent.locks.StampedLock.unlock(long)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#unlock(long) public void
     * java.util.concurrent.locks.StampedLock.unlock(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#unlock(long) public void
     *      java.util.concurrent.locks.StampedLock.unlock(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unlock_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#writeLockInterruptibly() public long
     * java.util.concurrent.locks.StampedLock.writeLockInterruptibly() throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#writeLockInterruptibly() public long
     * java.util.concurrent.locks.StampedLock.writeLockInterruptibly() throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#writeLockInterruptibly() public long
     *      java.util.concurrent.locks.StampedLock.writeLockInterruptibly() throws java.lang.InterruptedException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeLockInterruptibly()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#tryConvertToReadLock(long) public long
     * java.util.concurrent.locks.StampedLock.tryConvertToReadLock(long)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#tryConvertToReadLock(long) public long
     * java.util.concurrent.locks.StampedLock.tryConvertToReadLock(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#tryConvertToReadLock(long) public long
     *      java.util.concurrent.locks.StampedLock.tryConvertToReadLock(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryConvertToReadLock_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#validate(long) public boolean
     * java.util.concurrent.locks.StampedLock.validate(long)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#validate(long) public boolean
     * java.util.concurrent.locks.StampedLock.validate(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#validate(long) public boolean
     *      java.util.concurrent.locks.StampedLock.validate(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_validate_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#readLockInterruptibly() public long
     * java.util.concurrent.locks.StampedLock.readLockInterruptibly() throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#readLockInterruptibly() public long
     * java.util.concurrent.locks.StampedLock.readLockInterruptibly() throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#readLockInterruptibly() public long
     *      java.util.concurrent.locks.StampedLock.readLockInterruptibly() throws java.lang.InterruptedException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readLockInterruptibly()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#isWriteLocked() public boolean
     * java.util.concurrent.locks.StampedLock.isWriteLocked()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#isWriteLocked() public boolean
     * java.util.concurrent.locks.StampedLock.isWriteLocked()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#isWriteLocked() public boolean
     *      java.util.concurrent.locks.StampedLock.isWriteLocked() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isWriteLocked()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#asWriteLock() public
     * java.util.concurrent.locks.Lock java.util.concurrent.locks.StampedLock.asWriteLock()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#asWriteLock() public
     * java.util.concurrent.locks.Lock java.util.concurrent.locks.StampedLock.asWriteLock()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#asWriteLock() public java.util.concurrent.locks.Lock
     *      java.util.concurrent.locks.StampedLock.asWriteLock() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_asWriteLock()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#isReadLocked() public boolean
     * java.util.concurrent.locks.StampedLock.isReadLocked()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#isReadLocked() public boolean
     * java.util.concurrent.locks.StampedLock.isReadLocked()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#isReadLocked() public boolean
     *      java.util.concurrent.locks.StampedLock.isReadLocked() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isReadLocked()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#unlockWrite(long) public void
     * java.util.concurrent.locks.StampedLock.unlockWrite(long)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#unlockWrite(long) public void
     * java.util.concurrent.locks.StampedLock.unlockWrite(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#unlockWrite(long) public void
     *      java.util.concurrent.locks.StampedLock.unlockWrite(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unlockWrite_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#tryWriteLock() public long
     * java.util.concurrent.locks.StampedLock.tryWriteLock()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#tryWriteLock() public long
     * java.util.concurrent.locks.StampedLock.tryWriteLock()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#tryWriteLock() public long
     *      java.util.concurrent.locks.StampedLock.tryWriteLock() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryWriteLock()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#tryWriteLock(long, java.util.concurrent.TimeUnit)
     * public long java.util.concurrent.locks.StampedLock.tryWriteLock(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#tryWriteLock(long, java.util.concurrent.TimeUnit)
     * public long java.util.concurrent.locks.StampedLock.tryWriteLock(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#tryWriteLock(long, java.util.concurrent.TimeUnit) public long
     *      java.util.concurrent.locks.StampedLock.tryWriteLock(long,java.util.concurrent.TimeUnit) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryWriteLock_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#tryConvertToOptimisticRead(long) public long
     * java.util.concurrent.locks.StampedLock.tryConvertToOptimisticRead(long)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#tryConvertToOptimisticRead(long) public long
     * java.util.concurrent.locks.StampedLock.tryConvertToOptimisticRead(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#tryConvertToOptimisticRead(long) public long
     *      java.util.concurrent.locks.StampedLock.tryConvertToOptimisticRead(long) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryConvertToOptimisticRead_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#writeLock() public long
     * java.util.concurrent.locks.StampedLock.writeLock()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#writeLock() public long
     * java.util.concurrent.locks.StampedLock.writeLock()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#writeLock() public long
     *      java.util.concurrent.locks.StampedLock.writeLock() (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#asReadLock() public java.util.concurrent.locks.Lock
     * java.util.concurrent.locks.StampedLock.asReadLock()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.locks.StampedLock#asReadLock() public java.util.concurrent.locks.Lock
     * java.util.concurrent.locks.StampedLock.asReadLock()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.locks.StampedLock#asReadLock() public java.util.concurrent.locks.Lock
     *      java.util.concurrent.locks.StampedLock.asReadLock() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_asReadLock()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
