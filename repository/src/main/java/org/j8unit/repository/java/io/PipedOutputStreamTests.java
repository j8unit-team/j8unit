package org.j8unit.repository.java.io;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.io.PipedOutputStream class java.io.PipedOutputStream}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PipedOutputStreamClassTests}.
 * </p>
 *
 * @see java.io.PipedOutputStream class java.io.PipedOutputStream (the hereby targeted class-under-test class)
 * @see PipedOutputStreamClassTests PipedOutputStreamClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PipedOutputStreamTests<SUT extends java.io.PipedOutputStream>
extends OutputStreamTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.io.PipedOutputStream#connect(java.io.PipedInputStream) public synchronized void
     * java.io.PipedOutputStream.connect(java.io.PipedInputStream) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.PipedOutputStream#connect(java.io.PipedInputStream) public synchronized void
     * java.io.PipedOutputStream.connect(java.io.PipedInputStream) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.PipedOutputStream#connect(java.io.PipedInputStream) public synchronized void
     *      java.io.PipedOutputStream.connect(java.io.PipedInputStream) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_connect_PipedInputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.PipedOutputStream#write(int) public void java.io.PipedOutputStream.write(int)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.PipedOutputStream#write(int) public void java.io.PipedOutputStream.write(int)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.PipedOutputStream#write(int) public void java.io.PipedOutputStream.write(int) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_write_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.PipedOutputStream#write(byte[], int, int) public void
     * java.io.PipedOutputStream.write(byte[],int,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.PipedOutputStream#write(byte[], int, int) public void
     * java.io.PipedOutputStream.write(byte[],int,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.PipedOutputStream#write(byte[], int, int) public void
     *      java.io.PipedOutputStream.write(byte[],int,int) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_write_byteArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.PipedOutputStream#close() public void java.io.PipedOutputStream.close() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.PipedOutputStream#close() public void java.io.PipedOutputStream.close() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.PipedOutputStream#close() public void java.io.PipedOutputStream.close() throws java.io.IOException
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.io.PipedOutputStream#flush() public synchronized void
     * java.io.PipedOutputStream.flush() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.PipedOutputStream#flush() public synchronized void
     * java.io.PipedOutputStream.flush() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.PipedOutputStream#flush() public synchronized void java.io.PipedOutputStream.flush() throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_flush()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
