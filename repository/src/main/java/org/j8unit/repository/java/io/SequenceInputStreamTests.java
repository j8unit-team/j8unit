package org.j8unit.repository.java.io;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.io.SequenceInputStream class java.io.SequenceInputStream}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SequenceInputStreamClassTests}.
 * </p>
 *
 * @see java.io.SequenceInputStream class java.io.SequenceInputStream (the hereby targeted class-under-test class)
 * @see SequenceInputStreamClassTests SequenceInputStreamClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SequenceInputStreamTests<SUT extends java.io.SequenceInputStream>
extends InputStreamTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.io.SequenceInputStream#read() public int java.io.SequenceInputStream.read() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.SequenceInputStream#read() public int java.io.SequenceInputStream.read() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.SequenceInputStream#read() public int java.io.SequenceInputStream.read() throws java.io.IOException
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
     * Test method for {@link java.io.SequenceInputStream#read(byte[], int, int) public int
     * java.io.SequenceInputStream.read(byte[],int,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.SequenceInputStream#read(byte[], int, int) public int
     * java.io.SequenceInputStream.read(byte[],int,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.SequenceInputStream#read(byte[], int, int) public int
     *      java.io.SequenceInputStream.read(byte[],int,int) throws java.io.IOException (the hereby targeted
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
     * Test method for {@link java.io.SequenceInputStream#close() public void java.io.SequenceInputStream.close() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.SequenceInputStream#close() public void java.io.SequenceInputStream.close() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.SequenceInputStream#close() public void java.io.SequenceInputStream.close() throws
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
     * Test method for {@link java.io.SequenceInputStream#available() public int java.io.SequenceInputStream.available()
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.SequenceInputStream#available() public int java.io.SequenceInputStream.available()
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.SequenceInputStream#available() public int java.io.SequenceInputStream.available() throws
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
