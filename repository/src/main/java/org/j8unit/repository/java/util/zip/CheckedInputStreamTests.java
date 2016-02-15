package org.j8unit.repository.java.util.zip;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.zip.CheckedInputStream class java.util.zip.CheckedInputStream}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link CheckedInputStreamClassTests}
 * .
 * </p>
 *
 * @see java.util.zip.CheckedInputStream class java.util.zip.CheckedInputStream (the hereby targeted class-under-test
 *      class)
 * @see CheckedInputStreamClassTests CheckedInputStreamClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CheckedInputStreamTests<SUT extends java.util.zip.CheckedInputStream>
extends org.j8unit.repository.java.io.FilterInputStreamTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.zip.CheckedInputStream#read(byte[], int, int) public int
     * java.util.zip.CheckedInputStream.read(byte[],int,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.util.zip.CheckedInputStream#read(byte[], int, int) public int
     * java.util.zip.CheckedInputStream.read(byte[],int,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.zip.CheckedInputStream#read(byte[], int, int) public int
     *      java.util.zip.CheckedInputStream.read(byte[],int,int) throws java.io.IOException (the hereby targeted
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
     * Test method for {@link java.util.zip.CheckedInputStream#read() public int java.util.zip.CheckedInputStream.read()
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.util.zip.CheckedInputStream#read() public int java.util.zip.CheckedInputStream.read()
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.zip.CheckedInputStream#read() public int java.util.zip.CheckedInputStream.read() throws
     *      java.io.IOException (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.zip.CheckedInputStream#skip(long) public long
     * java.util.zip.CheckedInputStream.skip(long) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.util.zip.CheckedInputStream#skip(long) public long
     * java.util.zip.CheckedInputStream.skip(long) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.zip.CheckedInputStream#skip(long) public long java.util.zip.CheckedInputStream.skip(long) throws
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
     * Test method for {@link java.util.zip.CheckedInputStream#getChecksum() public java.util.zip.Checksum
     * java.util.zip.CheckedInputStream.getChecksum()}.
     *
     * <p>
     * Test method for {@link java.util.zip.CheckedInputStream#getChecksum() public java.util.zip.Checksum
     * java.util.zip.CheckedInputStream.getChecksum()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.zip.CheckedInputStream#getChecksum() public java.util.zip.Checksum
     *      java.util.zip.CheckedInputStream.getChecksum() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getChecksum()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
