package org.j8unit.repository.java.io;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.io.ObjectInputStream class java.io.ObjectInputStream}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ObjectInputStreamClassTests}.
 * </p>
 *
 * @see java.io.ObjectInputStream class java.io.ObjectInputStream (the hereby targeted class-under-test class)
 * @see ObjectInputStreamClassTests ObjectInputStreamClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ObjectInputStreamTests<SUT extends java.io.ObjectInputStream>
extends ObjectInputTests<SUT>, ObjectStreamConstantsTests<SUT>, InputStreamTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputStream#defaultReadObject() public void
     * java.io.ObjectInputStream.defaultReadObject() throws java.io.IOException,java.lang.ClassNotFoundException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#defaultReadObject() public void
     * java.io.ObjectInputStream.defaultReadObject() throws java.io.IOException,java.lang.ClassNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#defaultReadObject() public void java.io.ObjectInputStream.defaultReadObject()
     *      throws java.io.IOException,java.lang.ClassNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_defaultReadObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputStream#available() public int java.io.ObjectInputStream.available()
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#available() public int java.io.ObjectInputStream.available()
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#available() public int java.io.ObjectInputStream.available() throws
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

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readLine() public java.lang.String
     * java.io.ObjectInputStream.readLine() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readLine() public java.lang.String
     * java.io.ObjectInputStream.readLine() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#readLine() public java.lang.String java.io.ObjectInputStream.readLine() throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_readLine()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputStream#registerValidation(java.io.ObjectInputValidation, int) public
     * void java.io.ObjectInputStream.registerValidation(java.io.ObjectInputValidation,int) throws
     * java.io.NotActiveException,java.io.InvalidObjectException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#registerValidation(java.io.ObjectInputValidation, int) public
     * void java.io.ObjectInputStream.registerValidation(java.io.ObjectInputValidation,int) throws
     * java.io.NotActiveException,java.io.InvalidObjectException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#registerValidation(java.io.ObjectInputValidation, int) public void
     *      java.io.ObjectInputStream.registerValidation(java.io.ObjectInputValidation,int) throws
     *      java.io.NotActiveException,java.io.InvalidObjectException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_registerValidation_ObjectInputValidation_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readChar() public char java.io.ObjectInputStream.readChar()
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readChar() public char java.io.ObjectInputStream.readChar()
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#readChar() public char java.io.ObjectInputStream.readChar() throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_readChar()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readObject() public final java.lang.Object
     * java.io.ObjectInputStream.readObject() throws java.io.IOException,java.lang.ClassNotFoundException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readObject() public final java.lang.Object
     * java.io.ObjectInputStream.readObject() throws java.io.IOException,java.lang.ClassNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#readObject() public final java.lang.Object java.io.ObjectInputStream.readObject()
     *      throws java.io.IOException,java.lang.ClassNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_readObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputStream#skipBytes(int) public int
     * java.io.ObjectInputStream.skipBytes(int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#skipBytes(int) public int
     * java.io.ObjectInputStream.skipBytes(int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#skipBytes(int) public int java.io.ObjectInputStream.skipBytes(int) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_skipBytes_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readUnshared() public java.lang.Object
     * java.io.ObjectInputStream.readUnshared() throws java.io.IOException,java.lang.ClassNotFoundException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readUnshared() public java.lang.Object
     * java.io.ObjectInputStream.readUnshared() throws java.io.IOException,java.lang.ClassNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#readUnshared() public java.lang.Object java.io.ObjectInputStream.readUnshared()
     *      throws java.io.IOException,java.lang.ClassNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readUnshared()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputStream#read() public int java.io.ObjectInputStream.read() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#read() public int java.io.ObjectInputStream.read() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#read() public int java.io.ObjectInputStream.read() throws java.io.IOException (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.io.ObjectInputStream#read(byte[], int, int) public int
     * java.io.ObjectInputStream.read(byte[],int,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#read(byte[], int, int) public int
     * java.io.ObjectInputStream.read(byte[],int,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#read(byte[], int, int) public int java.io.ObjectInputStream.read(byte[],int,int)
     *      throws java.io.IOException (the hereby targeted method-under-test)
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
     * Test method for {@link java.io.ObjectInputStream#readFloat() public float java.io.ObjectInputStream.readFloat()
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readFloat() public float java.io.ObjectInputStream.readFloat()
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#readFloat() public float java.io.ObjectInputStream.readFloat() throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_readFloat()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readBoolean() public boolean
     * java.io.ObjectInputStream.readBoolean() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readBoolean() public boolean
     * java.io.ObjectInputStream.readBoolean() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#readBoolean() public boolean java.io.ObjectInputStream.readBoolean() throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_readBoolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readInt() public int java.io.ObjectInputStream.readInt() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readInt() public int java.io.ObjectInputStream.readInt() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#readInt() public int java.io.ObjectInputStream.readInt() throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_readInt()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readByte() public byte java.io.ObjectInputStream.readByte()
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readByte() public byte java.io.ObjectInputStream.readByte()
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#readByte() public byte java.io.ObjectInputStream.readByte() throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_readByte()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputStream#close() public void java.io.ObjectInputStream.close() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#close() public void java.io.ObjectInputStream.close() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#close() public void java.io.ObjectInputStream.close() throws java.io.IOException
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
     * Test method for {@link java.io.ObjectInputStream#readUnsignedByte() public int
     * java.io.ObjectInputStream.readUnsignedByte() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readUnsignedByte() public int
     * java.io.ObjectInputStream.readUnsignedByte() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#readUnsignedByte() public int java.io.ObjectInputStream.readUnsignedByte() throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_readUnsignedByte()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readUnsignedShort() public int
     * java.io.ObjectInputStream.readUnsignedShort() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readUnsignedShort() public int
     * java.io.ObjectInputStream.readUnsignedShort() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#readUnsignedShort() public int java.io.ObjectInputStream.readUnsignedShort()
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_readUnsignedShort()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readFields() public java.io.ObjectInputStream$GetField
     * java.io.ObjectInputStream.readFields() throws java.io.IOException,java.lang.ClassNotFoundException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readFields() public java.io.ObjectInputStream$GetField
     * java.io.ObjectInputStream.readFields() throws java.io.IOException,java.lang.ClassNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#readFields() public java.io.ObjectInputStream$GetField
     *      java.io.ObjectInputStream.readFields() throws java.io.IOException,java.lang.ClassNotFoundException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readFields()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readUTF() public java.lang.String
     * java.io.ObjectInputStream.readUTF() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readUTF() public java.lang.String
     * java.io.ObjectInputStream.readUTF() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#readUTF() public java.lang.String java.io.ObjectInputStream.readUTF() throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_readUTF()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readLong() public long java.io.ObjectInputStream.readLong()
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readLong() public long java.io.ObjectInputStream.readLong()
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#readLong() public long java.io.ObjectInputStream.readLong() throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_readLong()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readShort() public short java.io.ObjectInputStream.readShort()
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readShort() public short java.io.ObjectInputStream.readShort()
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#readShort() public short java.io.ObjectInputStream.readShort() throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_readShort()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readFully(byte[]) public void
     * java.io.ObjectInputStream.readFully(byte[]) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readFully(byte[]) public void
     * java.io.ObjectInputStream.readFully(byte[]) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#readFully(byte[]) public void java.io.ObjectInputStream.readFully(byte[]) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_readFully_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readFully(byte[], int, int) public void
     * java.io.ObjectInputStream.readFully(byte[],int,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readFully(byte[], int, int) public void
     * java.io.ObjectInputStream.readFully(byte[],int,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#readFully(byte[], int, int) public void
     *      java.io.ObjectInputStream.readFully(byte[],int,int) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_readFully_byteArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readDouble() public double
     * java.io.ObjectInputStream.readDouble() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.ObjectInputStream#readDouble() public double
     * java.io.ObjectInputStream.readDouble() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.ObjectInputStream#readDouble() public double java.io.ObjectInputStream.readDouble() throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_readDouble()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.io.InputStream#skip(long) class java.io.InputStream}</li>
     * <li>{@linkplain java.io.ObjectInput#skip(long) interface java.io.ObjectInput}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_skip_long()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.io.InputStream#read(byte[]) class java.io.InputStream}</li>
     * <li>{@linkplain java.io.ObjectInput#read(byte[]) interface java.io.ObjectInput}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_read_byteArray()
    throws Exception {
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.io.ObjectInputStream.GetField class
     * java.io.ObjectInputStream$GetField}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link ObjectInputStreamClassTests.GetFieldClassTests}.
     * </p>
     *
     * @see java.io.ObjectInputStream.GetField class java.io.ObjectInputStream$GetField (the hereby targeted
     *      class-under-test class)
     * @see ObjectInputStreamClassTests.GetFieldClassTests ObjectInputStreamClassTests.GetFieldClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface GetFieldTests<SUT extends java.io.ObjectInputStream.GetField>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.io.ObjectInputStream.GetField#getObjectStreamClass() public abstract
         * java.io.ObjectStreamClass java.io.ObjectInputStream$GetField.getObjectStreamClass()}.
         *
         * <p>
         * Test method for {@link java.io.ObjectInputStream.GetField#getObjectStreamClass() public abstract
         * java.io.ObjectStreamClass java.io.ObjectInputStream$GetField.getObjectStreamClass()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.io.ObjectInputStream.GetField#getObjectStreamClass() public abstract java.io.ObjectStreamClass
         *      java.io.ObjectInputStream$GetField.getObjectStreamClass() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getObjectStreamClass()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.io.ObjectInputStream.GetField#get(String, short) public abstract short
         * java.io.ObjectInputStream$GetField.get(java.lang.String,short) throws java.io.IOException}.
         *
         * <p>
         * Test method for {@link java.io.ObjectInputStream.GetField#get(String, short) public abstract short
         * java.io.ObjectInputStream$GetField.get(java.lang.String,short) throws java.io.IOException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.io.ObjectInputStream.GetField#get(String, short) public abstract short
         *      java.io.ObjectInputStream$GetField.get(java.lang.String,short) throws java.io.IOException (the hereby
         *      targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_get_String_short()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.io.ObjectInputStream.GetField#get(String, long) public abstract long
         * java.io.ObjectInputStream$GetField.get(java.lang.String,long) throws java.io.IOException}.
         *
         * <p>
         * Test method for {@link java.io.ObjectInputStream.GetField#get(String, long) public abstract long
         * java.io.ObjectInputStream$GetField.get(java.lang.String,long) throws java.io.IOException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.io.ObjectInputStream.GetField#get(String, long) public abstract long
         *      java.io.ObjectInputStream$GetField.get(java.lang.String,long) throws java.io.IOException (the hereby
         *      targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_get_String_long()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.io.ObjectInputStream.GetField#get(String, int) public abstract int
         * java.io.ObjectInputStream$GetField.get(java.lang.String,int) throws java.io.IOException}.
         *
         * <p>
         * Test method for {@link java.io.ObjectInputStream.GetField#get(String, int) public abstract int
         * java.io.ObjectInputStream$GetField.get(java.lang.String,int) throws java.io.IOException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.io.ObjectInputStream.GetField#get(String, int) public abstract int
         *      java.io.ObjectInputStream$GetField.get(java.lang.String,int) throws java.io.IOException (the hereby
         *      targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_get_String_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.io.ObjectInputStream.GetField#get(String, float) public abstract float
         * java.io.ObjectInputStream$GetField.get(java.lang.String,float) throws java.io.IOException}.
         *
         * <p>
         * Test method for {@link java.io.ObjectInputStream.GetField#get(String, float) public abstract float
         * java.io.ObjectInputStream$GetField.get(java.lang.String,float) throws java.io.IOException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.io.ObjectInputStream.GetField#get(String, float) public abstract float
         *      java.io.ObjectInputStream$GetField.get(java.lang.String,float) throws java.io.IOException (the hereby
         *      targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_get_String_float()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.io.ObjectInputStream.GetField#get(String, double) public abstract double
         * java.io.ObjectInputStream$GetField.get(java.lang.String,double) throws java.io.IOException}.
         *
         * <p>
         * Test method for {@link java.io.ObjectInputStream.GetField#get(String, double) public abstract double
         * java.io.ObjectInputStream$GetField.get(java.lang.String,double) throws java.io.IOException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.io.ObjectInputStream.GetField#get(String, double) public abstract double
         *      java.io.ObjectInputStream$GetField.get(java.lang.String,double) throws java.io.IOException (the hereby
         *      targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_get_String_double()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.io.ObjectInputStream.GetField#get(String, Object) public abstract
         * java.lang.Object java.io.ObjectInputStream$GetField.get(java.lang.String,java.lang.Object) throws
         * java.io.IOException}.
         *
         * <p>
         * Test method for {@link java.io.ObjectInputStream.GetField#get(String, Object) public abstract
         * java.lang.Object java.io.ObjectInputStream$GetField.get(java.lang.String,java.lang.Object) throws
         * java.io.IOException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.io.ObjectInputStream.GetField#get(String, Object) public abstract java.lang.Object
         *      java.io.ObjectInputStream$GetField.get(java.lang.String,java.lang.Object) throws java.io.IOException
         *      (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_get_String_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.io.ObjectInputStream.GetField#get(String, boolean) public abstract boolean
         * java.io.ObjectInputStream$GetField.get(java.lang.String,boolean) throws java.io.IOException}.
         *
         * <p>
         * Test method for {@link java.io.ObjectInputStream.GetField#get(String, boolean) public abstract boolean
         * java.io.ObjectInputStream$GetField.get(java.lang.String,boolean) throws java.io.IOException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.io.ObjectInputStream.GetField#get(String, boolean) public abstract boolean
         *      java.io.ObjectInputStream$GetField.get(java.lang.String,boolean) throws java.io.IOException (the hereby
         *      targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_get_String_boolean()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.io.ObjectInputStream.GetField#get(String, byte) public abstract byte
         * java.io.ObjectInputStream$GetField.get(java.lang.String,byte) throws java.io.IOException}.
         *
         * <p>
         * Test method for {@link java.io.ObjectInputStream.GetField#get(String, byte) public abstract byte
         * java.io.ObjectInputStream$GetField.get(java.lang.String,byte) throws java.io.IOException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.io.ObjectInputStream.GetField#get(String, byte) public abstract byte
         *      java.io.ObjectInputStream$GetField.get(java.lang.String,byte) throws java.io.IOException (the hereby
         *      targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_get_String_byte()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.io.ObjectInputStream.GetField#get(String, char) public abstract char
         * java.io.ObjectInputStream$GetField.get(java.lang.String,char) throws java.io.IOException}.
         *
         * <p>
         * Test method for {@link java.io.ObjectInputStream.GetField#get(String, char) public abstract char
         * java.io.ObjectInputStream$GetField.get(java.lang.String,char) throws java.io.IOException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.io.ObjectInputStream.GetField#get(String, char) public abstract char
         *      java.io.ObjectInputStream$GetField.get(java.lang.String,char) throws java.io.IOException (the hereby
         *      targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_get_String_char()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.io.ObjectInputStream.GetField#defaulted(String) public abstract boolean
         * java.io.ObjectInputStream$GetField.defaulted(java.lang.String) throws java.io.IOException}.
         *
         * <p>
         * Test method for {@link java.io.ObjectInputStream.GetField#defaulted(String) public abstract boolean
         * java.io.ObjectInputStream$GetField.defaulted(java.lang.String) throws java.io.IOException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.io.ObjectInputStream.GetField#defaulted(String) public abstract boolean
         *      java.io.ObjectInputStream$GetField.defaulted(java.lang.String) throws java.io.IOException (the hereby
         *      targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_defaulted_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
