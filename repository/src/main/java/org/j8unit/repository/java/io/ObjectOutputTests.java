package org.j8unit.repository.java.io;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.io.ObjectOutput interface java.io.ObjectOutput}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link ObjectOutputClassTests}.
 * </p>
 *
 * @see java.io.ObjectOutput interface java.io.ObjectOutput (the hereby targeted class-under-test class)
 * @see ObjectOutputClassTests ObjectOutputClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ObjectOutputTests<SUT extends java.io.ObjectOutput>
extends DataOutputTests<SUT>, org.j8unit.repository.java.lang.AutoCloseableTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.io.ObjectOutput#writeObject(Object) public abstract void
     * java.io.ObjectOutput.writeObject(java.lang.Object) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutput#writeObject(Object) public abstract void
     * java.io.ObjectOutput.writeObject(java.lang.Object) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutput#writeObject(Object) public abstract void
     *      java.io.ObjectOutput.writeObject(java.lang.Object) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeObject_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectOutput#flush() public abstract void java.io.ObjectOutput.flush() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutput#flush() public abstract void java.io.ObjectOutput.flush() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutput#flush() public abstract void java.io.ObjectOutput.flush() throws java.io.IOException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_flush()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectOutput#write(byte[]) public abstract void java.io.ObjectOutput.write(byte[])
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutput#write(byte[]) public abstract void java.io.ObjectOutput.write(byte[])
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutput#write(byte[]) public abstract void java.io.ObjectOutput.write(byte[]) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_write_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectOutput#write(int) public abstract void java.io.ObjectOutput.write(int)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutput#write(int) public abstract void java.io.ObjectOutput.write(int)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutput#write(int) public abstract void java.io.ObjectOutput.write(int) throws
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
     * Test method for {@link java.io.ObjectOutput#write(byte[], int, int) public abstract void
     * java.io.ObjectOutput.write(byte[],int,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutput#write(byte[], int, int) public abstract void
     * java.io.ObjectOutput.write(byte[],int,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutput#write(byte[], int, int) public abstract void java.io.ObjectOutput.write(byte[],int,int)
     *      throws java.io.IOException (the hereby targeted method-under-test)
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
     * Test method for {@link java.io.ObjectOutput#close() public abstract void java.io.ObjectOutput.close() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutput#close() public abstract void java.io.ObjectOutput.close() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutput#close() public abstract void java.io.ObjectOutput.close() throws java.io.IOException
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

}
