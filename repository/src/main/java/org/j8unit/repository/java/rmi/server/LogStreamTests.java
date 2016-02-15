package org.j8unit.repository.java.rmi.server;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.server.LogStream class java.rmi.server.LogStream}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link LogStreamClassTests}.
 * </p>
 *
 * @see java.rmi.server.LogStream class java.rmi.server.LogStream (the hereby targeted class-under-test class)
 * @see LogStreamClassTests LogStreamClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LogStreamTests<SUT extends java.rmi.server.LogStream>
extends org.j8unit.repository.java.io.PrintStreamTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.server.LogStream#setOutputStream(java.io.OutputStream) public synchronized void
     * java.rmi.server.LogStream.setOutputStream(java.io.OutputStream)}.
     *
     * <p>
     * Test method for {@link java.rmi.server.LogStream#setOutputStream(java.io.OutputStream) public synchronized void
     * java.rmi.server.LogStream.setOutputStream(java.io.OutputStream)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.LogStream#setOutputStream(java.io.OutputStream) public synchronized void
     *      java.rmi.server.LogStream.setOutputStream(java.io.OutputStream) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setOutputStream_OutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.LogStream#toString() public java.lang.String
     * java.rmi.server.LogStream.toString()}.
     *
     * <p>
     * Test method for {@link java.rmi.server.LogStream#toString() public java.lang.String
     * java.rmi.server.LogStream.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.LogStream#toString() public java.lang.String java.rmi.server.LogStream.toString() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.rmi.server.LogStream#getOutputStream() public synchronized java.io.OutputStream
     * java.rmi.server.LogStream.getOutputStream()}.
     *
     * <p>
     * Test method for {@link java.rmi.server.LogStream#getOutputStream() public synchronized java.io.OutputStream
     * java.rmi.server.LogStream.getOutputStream()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.LogStream#getOutputStream() public synchronized java.io.OutputStream
     *      java.rmi.server.LogStream.getOutputStream() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.LogStream#write(byte[], int, int) public void
     * java.rmi.server.LogStream.write(byte[],int,int)}.
     *
     * <p>
     * Test method for {@link java.rmi.server.LogStream#write(byte[], int, int) public void
     * java.rmi.server.LogStream.write(byte[],int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.LogStream#write(byte[], int, int) public void
     *      java.rmi.server.LogStream.write(byte[],int,int) (the hereby targeted method-under-test)
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
     * Test method for {@link java.rmi.server.LogStream#write(int) public void java.rmi.server.LogStream.write(int)}.
     *
     * <p>
     * Test method for {@link java.rmi.server.LogStream#write(int) public void java.rmi.server.LogStream.write(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.LogStream#write(int) public void java.rmi.server.LogStream.write(int) (the hereby targeted
     *      method-under-test)
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

}
