package org.j8unit.repository.java.io;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.io.PushbackInputStream class java.io.PushbackInputStream}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PushbackInputStreamClassTests}.
 * </p>
 *
 * @see java.io.PushbackInputStream class java.io.PushbackInputStream (the hereby targeted class-under-test class)
 * @see PushbackInputStreamClassTests PushbackInputStreamClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PushbackInputStreamTests<SUT extends java.io.PushbackInputStream>
extends FilterInputStreamTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.io.PushbackInputStream#markSupported() public boolean
     * java.io.PushbackInputStream.markSupported()}.
     *
     * <p>
     * Test method for {@link java.io.PushbackInputStream#markSupported() public boolean
     * java.io.PushbackInputStream.markSupported()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.PushbackInputStream#markSupported() public boolean java.io.PushbackInputStream.markSupported() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.io.PushbackInputStream#unread(byte[]) public void
     * java.io.PushbackInputStream.unread(byte[]) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.PushbackInputStream#unread(byte[]) public void
     * java.io.PushbackInputStream.unread(byte[]) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.PushbackInputStream#unread(byte[]) public void java.io.PushbackInputStream.unread(byte[]) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unread_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.PushbackInputStream#unread(int) public void
     * java.io.PushbackInputStream.unread(int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.PushbackInputStream#unread(int) public void
     * java.io.PushbackInputStream.unread(int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.PushbackInputStream#unread(int) public void java.io.PushbackInputStream.unread(int) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unread_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.PushbackInputStream#unread(byte[], int, int) public void
     * java.io.PushbackInputStream.unread(byte[],int,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.PushbackInputStream#unread(byte[], int, int) public void
     * java.io.PushbackInputStream.unread(byte[],int,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.PushbackInputStream#unread(byte[], int, int) public void
     *      java.io.PushbackInputStream.unread(byte[],int,int) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unread_byteArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.PushbackInputStream#read() public int java.io.PushbackInputStream.read() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.PushbackInputStream#read() public int java.io.PushbackInputStream.read() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.PushbackInputStream#read() public int java.io.PushbackInputStream.read() throws java.io.IOException
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.io.PushbackInputStream#read(byte[], int, int) public int
     * java.io.PushbackInputStream.read(byte[],int,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.PushbackInputStream#read(byte[], int, int) public int
     * java.io.PushbackInputStream.read(byte[],int,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.PushbackInputStream#read(byte[], int, int) public int
     *      java.io.PushbackInputStream.read(byte[],int,int) throws java.io.IOException (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.io.PushbackInputStream#mark(int) public synchronized void
     * java.io.PushbackInputStream.mark(int)}.
     *
     * <p>
     * Test method for {@link java.io.PushbackInputStream#mark(int) public synchronized void
     * java.io.PushbackInputStream.mark(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.PushbackInputStream#mark(int) public synchronized void java.io.PushbackInputStream.mark(int) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.io.PushbackInputStream#close() public synchronized void
     * java.io.PushbackInputStream.close() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.PushbackInputStream#close() public synchronized void
     * java.io.PushbackInputStream.close() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.PushbackInputStream#close() public synchronized void java.io.PushbackInputStream.close() throws
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
     * Test method for {@link java.io.PushbackInputStream#skip(long) public long java.io.PushbackInputStream.skip(long)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.PushbackInputStream#skip(long) public long java.io.PushbackInputStream.skip(long)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.PushbackInputStream#skip(long) public long java.io.PushbackInputStream.skip(long) throws
     *      java.io.IOException (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link java.io.PushbackInputStream#reset() public synchronized void
     * java.io.PushbackInputStream.reset() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.PushbackInputStream#reset() public synchronized void
     * java.io.PushbackInputStream.reset() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.PushbackInputStream#reset() public synchronized void java.io.PushbackInputStream.reset() throws
     *      java.io.IOException (the hereby targeted method-under-test)
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
     * Test method for {@link java.io.PushbackInputStream#available() public int java.io.PushbackInputStream.available()
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.PushbackInputStream#available() public int java.io.PushbackInputStream.available()
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.PushbackInputStream#available() public int java.io.PushbackInputStream.available() throws
     *      java.io.IOException (the hereby targeted method-under-test)
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

}
