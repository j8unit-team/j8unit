package org.j8unit.repository.java.io;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.io.ByteArrayInputStream class java.io.ByteArrayInputStream}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ByteArrayInputStreamClassTests}.
 * </p>
 *
 * @see java.io.ByteArrayInputStream class java.io.ByteArrayInputStream (the hereby targeted class-under-test class)
 * @see ByteArrayInputStreamClassTests ByteArrayInputStreamClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ByteArrayInputStreamTests<SUT extends java.io.ByteArrayInputStream>
extends InputStreamTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.io.ByteArrayInputStream#markSupported() public boolean
     * java.io.ByteArrayInputStream.markSupported()}.
     *
     * <p>
     * Test method for {@link java.io.ByteArrayInputStream#markSupported() public boolean
     * java.io.ByteArrayInputStream.markSupported()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ByteArrayInputStream#markSupported() public boolean java.io.ByteArrayInputStream.markSupported()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_markSupported()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ByteArrayInputStream#read(byte[], int, int) public synchronized int
     * java.io.ByteArrayInputStream.read(byte[],int,int)}.
     *
     * <p>
     * Test method for {@link java.io.ByteArrayInputStream#read(byte[], int, int) public synchronized int
     * java.io.ByteArrayInputStream.read(byte[],int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ByteArrayInputStream#read(byte[], int, int) public synchronized int
     *      java.io.ByteArrayInputStream.read(byte[],int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_read_byteArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ByteArrayInputStream#read() public synchronized int
     * java.io.ByteArrayInputStream.read()}.
     *
     * <p>
     * Test method for {@link java.io.ByteArrayInputStream#read() public synchronized int
     * java.io.ByteArrayInputStream.read()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ByteArrayInputStream#read() public synchronized int java.io.ByteArrayInputStream.read() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_read()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ByteArrayInputStream#close() public void java.io.ByteArrayInputStream.close()
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ByteArrayInputStream#close() public void java.io.ByteArrayInputStream.close()
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ByteArrayInputStream#close() public void java.io.ByteArrayInputStream.close() throws
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
     * Test method for {@link java.io.ByteArrayInputStream#mark(int) public void java.io.ByteArrayInputStream.mark(int)}
     * .
     *
     * <p>
     * Test method for {@link java.io.ByteArrayInputStream#mark(int) public void java.io.ByteArrayInputStream.mark(int)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ByteArrayInputStream#mark(int) public void java.io.ByteArrayInputStream.mark(int) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_mark_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ByteArrayInputStream#available() public synchronized int
     * java.io.ByteArrayInputStream.available()}.
     *
     * <p>
     * Test method for {@link java.io.ByteArrayInputStream#available() public synchronized int
     * java.io.ByteArrayInputStream.available()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ByteArrayInputStream#available() public synchronized int java.io.ByteArrayInputStream.available()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_available()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ByteArrayInputStream#reset() public synchronized void
     * java.io.ByteArrayInputStream.reset()}.
     *
     * <p>
     * Test method for {@link java.io.ByteArrayInputStream#reset() public synchronized void
     * java.io.ByteArrayInputStream.reset()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ByteArrayInputStream#reset() public synchronized void java.io.ByteArrayInputStream.reset() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_reset()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ByteArrayInputStream#skip(long) public synchronized long
     * java.io.ByteArrayInputStream.skip(long)}.
     *
     * <p>
     * Test method for {@link java.io.ByteArrayInputStream#skip(long) public synchronized long
     * java.io.ByteArrayInputStream.skip(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ByteArrayInputStream#skip(long) public synchronized long java.io.ByteArrayInputStream.skip(long)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_skip_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
