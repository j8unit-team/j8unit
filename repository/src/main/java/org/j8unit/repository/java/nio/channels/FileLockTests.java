package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.channels.FileLock class java.nio.channels.FileLock}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link FileLockClassTests}.
 * </p>
 *
 * @see java.nio.channels.FileLock class java.nio.channels.FileLock (the hereby targeted class-under-test class)
 * @see FileLockClassTests FileLockClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FileLockTests<SUT extends java.nio.channels.FileLock>
extends org.j8unit.repository.java.lang.AutoCloseableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileLock#isShared() public final boolean
     * java.nio.channels.FileLock.isShared()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileLock#isShared() public final boolean
     * java.nio.channels.FileLock.isShared()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileLock#isShared() public final boolean java.nio.channels.FileLock.isShared() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isShared()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileLock#acquiredBy() public java.nio.channels.Channel
     * java.nio.channels.FileLock.acquiredBy()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileLock#acquiredBy() public java.nio.channels.Channel
     * java.nio.channels.FileLock.acquiredBy()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileLock#acquiredBy() public java.nio.channels.Channel
     *      java.nio.channels.FileLock.acquiredBy() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_acquiredBy()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileLock#close() public final void java.nio.channels.FileLock.close()
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileLock#close() public final void java.nio.channels.FileLock.close()
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileLock#close() public final void java.nio.channels.FileLock.close() throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileLock#position() public final long
     * java.nio.channels.FileLock.position()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileLock#position() public final long
     * java.nio.channels.FileLock.position()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileLock#position() public final long java.nio.channels.FileLock.position() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_position()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileLock#toString() public final java.lang.String
     * java.nio.channels.FileLock.toString()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileLock#toString() public final java.lang.String
     * java.nio.channels.FileLock.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileLock#toString() public final java.lang.String java.nio.channels.FileLock.toString()
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.nio.channels.FileLock#channel() public final java.nio.channels.FileChannel
     * java.nio.channels.FileLock.channel()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileLock#channel() public final java.nio.channels.FileChannel
     * java.nio.channels.FileLock.channel()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileLock#channel() public final java.nio.channels.FileChannel
     *      java.nio.channels.FileLock.channel() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_channel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileLock#overlaps(long, long) public final boolean
     * java.nio.channels.FileLock.overlaps(long,long)}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileLock#overlaps(long, long) public final boolean
     * java.nio.channels.FileLock.overlaps(long,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileLock#overlaps(long, long) public final boolean
     *      java.nio.channels.FileLock.overlaps(long,long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_overlaps_long_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileLock#isValid() public abstract boolean
     * java.nio.channels.FileLock.isValid()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileLock#isValid() public abstract boolean
     * java.nio.channels.FileLock.isValid()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileLock#isValid() public abstract boolean java.nio.channels.FileLock.isValid() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isValid()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileLock#release() public abstract void
     * java.nio.channels.FileLock.release() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileLock#release() public abstract void
     * java.nio.channels.FileLock.release() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileLock#release() public abstract void java.nio.channels.FileLock.release() throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_release()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileLock#size() public final long java.nio.channels.FileLock.size()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileLock#size() public final long java.nio.channels.FileLock.size()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileLock#size() public final long java.nio.channels.FileLock.size() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_size()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
