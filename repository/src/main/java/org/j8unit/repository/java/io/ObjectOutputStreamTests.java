package org.j8unit.repository.java.io;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.io.ObjectOutputStream class java.io.ObjectOutputStream}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ObjectOutputStreamClassTests}.
 * </p>
 *
 * @see java.io.ObjectOutputStream class java.io.ObjectOutputStream (the hereby targeted class-under-test class)
 * @see ObjectOutputStreamClassTests ObjectOutputStreamClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ObjectOutputStreamTests<SUT extends java.io.ObjectOutputStream>
extends ObjectOutputTests<SUT>, ObjectStreamConstantsTests<SUT>, OutputStreamTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#defaultWriteObject() public void
     * java.io.ObjectOutputStream.defaultWriteObject() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#defaultWriteObject() public void
     * java.io.ObjectOutputStream.defaultWriteObject() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#defaultWriteObject() public void java.io.ObjectOutputStream.defaultWriteObject()
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_defaultWriteObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeShort(int) public void
     * java.io.ObjectOutputStream.writeShort(int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeShort(int) public void
     * java.io.ObjectOutputStream.writeShort(int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#writeShort(int) public void java.io.ObjectOutputStream.writeShort(int) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_writeShort_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeChars(String) public void
     * java.io.ObjectOutputStream.writeChars(java.lang.String) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeChars(String) public void
     * java.io.ObjectOutputStream.writeChars(java.lang.String) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#writeChars(String) public void
     *      java.io.ObjectOutputStream.writeChars(java.lang.String) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_writeChars_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeUTF(String) public void
     * java.io.ObjectOutputStream.writeUTF(java.lang.String) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeUTF(String) public void
     * java.io.ObjectOutputStream.writeUTF(java.lang.String) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#writeUTF(String) public void
     *      java.io.ObjectOutputStream.writeUTF(java.lang.String) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_writeUTF_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#reset() public void java.io.ObjectOutputStream.reset() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#reset() public void java.io.ObjectOutputStream.reset() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#reset() public void java.io.ObjectOutputStream.reset() throws java.io.IOException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.io.ObjectOutputStream#writeBoolean(boolean) public void
     * java.io.ObjectOutputStream.writeBoolean(boolean) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeBoolean(boolean) public void
     * java.io.ObjectOutputStream.writeBoolean(boolean) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#writeBoolean(boolean) public void
     *      java.io.ObjectOutputStream.writeBoolean(boolean) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_writeBoolean_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#putFields() public java.io.ObjectOutputStream$PutField
     * java.io.ObjectOutputStream.putFields() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#putFields() public java.io.ObjectOutputStream$PutField
     * java.io.ObjectOutputStream.putFields() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#putFields() public java.io.ObjectOutputStream$PutField
     *      java.io.ObjectOutputStream.putFields() throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_putFields()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeDouble(double) public void
     * java.io.ObjectOutputStream.writeDouble(double) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeDouble(double) public void
     * java.io.ObjectOutputStream.writeDouble(double) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#writeDouble(double) public void java.io.ObjectOutputStream.writeDouble(double)
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_writeDouble_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#write(int) public void java.io.ObjectOutputStream.write(int)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#write(int) public void java.io.ObjectOutputStream.write(int)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#write(int) public void java.io.ObjectOutputStream.write(int) throws
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
     * Test method for {@link java.io.ObjectOutputStream#write(byte[]) public void
     * java.io.ObjectOutputStream.write(byte[]) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#write(byte[]) public void
     * java.io.ObjectOutputStream.write(byte[]) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#write(byte[]) public void java.io.ObjectOutputStream.write(byte[]) throws
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
     * Test method for {@link java.io.ObjectOutputStream#write(byte[], int, int) public void
     * java.io.ObjectOutputStream.write(byte[],int,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#write(byte[], int, int) public void
     * java.io.ObjectOutputStream.write(byte[],int,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#write(byte[], int, int) public void
     *      java.io.ObjectOutputStream.write(byte[],int,int) throws java.io.IOException (the hereby targeted
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
     * Test method for {@link java.io.ObjectOutputStream#close() public void java.io.ObjectOutputStream.close() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#close() public void java.io.ObjectOutputStream.close() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#close() public void java.io.ObjectOutputStream.close() throws java.io.IOException
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
     * Test method for {@link java.io.ObjectOutputStream#writeLong(long) public void
     * java.io.ObjectOutputStream.writeLong(long) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeLong(long) public void
     * java.io.ObjectOutputStream.writeLong(long) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#writeLong(long) public void java.io.ObjectOutputStream.writeLong(long) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_writeLong_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeBytes(String) public void
     * java.io.ObjectOutputStream.writeBytes(java.lang.String) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeBytes(String) public void
     * java.io.ObjectOutputStream.writeBytes(java.lang.String) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#writeBytes(String) public void
     *      java.io.ObjectOutputStream.writeBytes(java.lang.String) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_writeBytes_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeUnshared(Object) public void
     * java.io.ObjectOutputStream.writeUnshared(java.lang.Object) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeUnshared(Object) public void
     * java.io.ObjectOutputStream.writeUnshared(java.lang.Object) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#writeUnshared(Object) public void
     *      java.io.ObjectOutputStream.writeUnshared(java.lang.Object) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeUnshared_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeChar(int) public void
     * java.io.ObjectOutputStream.writeChar(int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeChar(int) public void
     * java.io.ObjectOutputStream.writeChar(int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#writeChar(int) public void java.io.ObjectOutputStream.writeChar(int) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_writeChar_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#flush() public void java.io.ObjectOutputStream.flush() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#flush() public void java.io.ObjectOutputStream.flush() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#flush() public void java.io.ObjectOutputStream.flush() throws java.io.IOException
     *      (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeFloat(float) public void
     * java.io.ObjectOutputStream.writeFloat(float) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeFloat(float) public void
     * java.io.ObjectOutputStream.writeFloat(float) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#writeFloat(float) public void java.io.ObjectOutputStream.writeFloat(float) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_writeFloat_float()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#useProtocolVersion(int) public void
     * java.io.ObjectOutputStream.useProtocolVersion(int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#useProtocolVersion(int) public void
     * java.io.ObjectOutputStream.useProtocolVersion(int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#useProtocolVersion(int) public void
     *      java.io.ObjectOutputStream.useProtocolVersion(int) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_useProtocolVersion_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeByte(int) public void
     * java.io.ObjectOutputStream.writeByte(int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeByte(int) public void
     * java.io.ObjectOutputStream.writeByte(int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#writeByte(int) public void java.io.ObjectOutputStream.writeByte(int) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_writeByte_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeInt(int) public void
     * java.io.ObjectOutputStream.writeInt(int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeInt(int) public void
     * java.io.ObjectOutputStream.writeInt(int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#writeInt(int) public void java.io.ObjectOutputStream.writeInt(int) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_writeInt_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeObject(Object) public final void
     * java.io.ObjectOutputStream.writeObject(java.lang.Object) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeObject(Object) public final void
     * java.io.ObjectOutputStream.writeObject(java.lang.Object) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#writeObject(Object) public final void
     *      java.io.ObjectOutputStream.writeObject(java.lang.Object) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.io.ObjectOutputStream#writeFields() public void
     * java.io.ObjectOutputStream.writeFields() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectOutputStream#writeFields() public void
     * java.io.ObjectOutputStream.writeFields() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectOutputStream#writeFields() public void java.io.ObjectOutputStream.writeFields() throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeFields()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.io.ObjectOutputStream.PutField class
     * java.io.ObjectOutputStream$PutField}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link ObjectOutputStreamClassTests.PutFieldClassTests}.
     * </p>
     *
     * @see java.io.ObjectOutputStream.PutField class java.io.ObjectOutputStream$PutField (the hereby targeted
     *      class-under-test class)
     * @see ObjectOutputStreamClassTests.PutFieldClassTests ObjectOutputStreamClassTests.PutFieldClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PutFieldTests<SUT extends java.io.ObjectOutputStream.PutField>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.io.ObjectOutputStream.PutField#put(String, float) public abstract void
         * java.io.ObjectOutputStream$PutField.put(java.lang.String,float)}.
         *
         * <p>
         * Test method for {@link java.io.ObjectOutputStream.PutField#put(String, float) public abstract void
         * java.io.ObjectOutputStream$PutField.put(java.lang.String,float)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.io.ObjectOutputStream.PutField#put(String, float) public abstract void
         *      java.io.ObjectOutputStream$PutField.put(java.lang.String,float) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_put_String_float()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.io.ObjectOutputStream.PutField#put(String, long) public abstract void
         * java.io.ObjectOutputStream$PutField.put(java.lang.String,long)}.
         *
         * <p>
         * Test method for {@link java.io.ObjectOutputStream.PutField#put(String, long) public abstract void
         * java.io.ObjectOutputStream$PutField.put(java.lang.String,long)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.io.ObjectOutputStream.PutField#put(String, long) public abstract void
         *      java.io.ObjectOutputStream$PutField.put(java.lang.String,long) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_put_String_long()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.io.ObjectOutputStream.PutField#put(String, int) public abstract void
         * java.io.ObjectOutputStream$PutField.put(java.lang.String,int)}.
         *
         * <p>
         * Test method for {@link java.io.ObjectOutputStream.PutField#put(String, int) public abstract void
         * java.io.ObjectOutputStream$PutField.put(java.lang.String,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.io.ObjectOutputStream.PutField#put(String, int) public abstract void
         *      java.io.ObjectOutputStream$PutField.put(java.lang.String,int) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_put_String_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.io.ObjectOutputStream.PutField#put(String, double) public abstract void
         * java.io.ObjectOutputStream$PutField.put(java.lang.String,double)}.
         *
         * <p>
         * Test method for {@link java.io.ObjectOutputStream.PutField#put(String, double) public abstract void
         * java.io.ObjectOutputStream$PutField.put(java.lang.String,double)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.io.ObjectOutputStream.PutField#put(String, double) public abstract void
         *      java.io.ObjectOutputStream$PutField.put(java.lang.String,double) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_put_String_double()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.io.ObjectOutputStream.PutField#put(String, Object) public abstract void
         * java.io.ObjectOutputStream$PutField.put(java.lang.String,java.lang.Object)}.
         *
         * <p>
         * Test method for {@link java.io.ObjectOutputStream.PutField#put(String, Object) public abstract void
         * java.io.ObjectOutputStream$PutField.put(java.lang.String,java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.io.ObjectOutputStream.PutField#put(String, Object) public abstract void
         *      java.io.ObjectOutputStream$PutField.put(java.lang.String,java.lang.Object) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_put_String_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.io.ObjectOutputStream.PutField#put(String, boolean) public abstract void
         * java.io.ObjectOutputStream$PutField.put(java.lang.String,boolean)}.
         *
         * <p>
         * Test method for {@link java.io.ObjectOutputStream.PutField#put(String, boolean) public abstract void
         * java.io.ObjectOutputStream$PutField.put(java.lang.String,boolean)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.io.ObjectOutputStream.PutField#put(String, boolean) public abstract void
         *      java.io.ObjectOutputStream$PutField.put(java.lang.String,boolean) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_put_String_boolean()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.io.ObjectOutputStream.PutField#put(String, byte) public abstract void
         * java.io.ObjectOutputStream$PutField.put(java.lang.String,byte)}.
         *
         * <p>
         * Test method for {@link java.io.ObjectOutputStream.PutField#put(String, byte) public abstract void
         * java.io.ObjectOutputStream$PutField.put(java.lang.String,byte)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.io.ObjectOutputStream.PutField#put(String, byte) public abstract void
         *      java.io.ObjectOutputStream$PutField.put(java.lang.String,byte) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_put_String_byte()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.io.ObjectOutputStream.PutField#put(String, char) public abstract void
         * java.io.ObjectOutputStream$PutField.put(java.lang.String,char)}.
         *
         * <p>
         * Test method for {@link java.io.ObjectOutputStream.PutField#put(String, char) public abstract void
         * java.io.ObjectOutputStream$PutField.put(java.lang.String,char)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.io.ObjectOutputStream.PutField#put(String, char) public abstract void
         *      java.io.ObjectOutputStream$PutField.put(java.lang.String,char) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_put_String_char()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.io.ObjectOutputStream.PutField#put(String, short) public abstract void
         * java.io.ObjectOutputStream$PutField.put(java.lang.String,short)}.
         *
         * <p>
         * Test method for {@link java.io.ObjectOutputStream.PutField#put(String, short) public abstract void
         * java.io.ObjectOutputStream$PutField.put(java.lang.String,short)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.io.ObjectOutputStream.PutField#put(String, short) public abstract void
         *      java.io.ObjectOutputStream$PutField.put(java.lang.String,short) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_put_String_short()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.io.ObjectOutputStream.PutField#write(java.io.ObjectOutput) public abstract void
         * java.io.ObjectOutputStream$PutField.write(java.io.ObjectOutput) throws java.io.IOException}.
         *
         * <p>
         * Test method for {@link java.io.ObjectOutputStream.PutField#write(java.io.ObjectOutput) public abstract void
         * java.io.ObjectOutputStream$PutField.write(java.io.ObjectOutput) throws java.io.IOException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.io.ObjectOutputStream.PutField#write(java.io.ObjectOutput) public abstract void
         *      java.io.ObjectOutputStream$PutField.write(java.io.ObjectOutput) throws java.io.IOException (the hereby
         *      targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_write_ObjectOutput()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
