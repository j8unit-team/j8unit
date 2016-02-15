package org.j8unit.repository.java.nio;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.CharBuffer class java.nio.CharBuffer}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link CharBufferClassTests}.
 * </p>
 *
 * @see java.nio.CharBuffer class java.nio.CharBuffer (the hereby targeted class-under-test class)
 * @see CharBufferClassTests CharBufferClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CharBufferTests<SUT extends java.nio.CharBuffer>
extends org.j8unit.repository.java.lang.ComparableTests<SUT, java.nio.CharBuffer>, org.j8unit.repository.java.lang.AppendableTests<SUT>,
org.j8unit.repository.java.lang.CharSequenceTests<SUT>, org.j8unit.repository.java.lang.ReadableTests<SUT>, BufferTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#read(java.nio.CharBuffer) public int
     * java.nio.CharBuffer.read(java.nio.CharBuffer) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#read(java.nio.CharBuffer) public int
     * java.nio.CharBuffer.read(java.nio.CharBuffer) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#read(java.nio.CharBuffer) public int java.nio.CharBuffer.read(java.nio.CharBuffer)
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_read_CharBuffer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#hasArray() public final boolean java.nio.CharBuffer.hasArray()}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#hasArray() public final boolean java.nio.CharBuffer.hasArray()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#hasArray() public final boolean java.nio.CharBuffer.hasArray() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hasArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#length() public final int java.nio.CharBuffer.length()}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#length() public final int java.nio.CharBuffer.length()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#length() public final int java.nio.CharBuffer.length() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_length()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#subSequence(int, int) public abstract java.nio.CharBuffer
     * java.nio.CharBuffer.subSequence(int,int)}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#subSequence(int, int) public abstract java.nio.CharBuffer
     * java.nio.CharBuffer.subSequence(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#subSequence(int, int) public abstract java.nio.CharBuffer
     *      java.nio.CharBuffer.subSequence(int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_subSequence_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#duplicate() public abstract java.nio.CharBuffer
     * java.nio.CharBuffer.duplicate()}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#duplicate() public abstract java.nio.CharBuffer
     * java.nio.CharBuffer.duplicate()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#duplicate() public abstract java.nio.CharBuffer java.nio.CharBuffer.duplicate() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_duplicate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#equals(Object) public boolean
     * java.nio.CharBuffer.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#equals(Object) public boolean
     * java.nio.CharBuffer.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#equals(Object) public boolean java.nio.CharBuffer.equals(java.lang.Object) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#isDirect() public abstract boolean java.nio.CharBuffer.isDirect()}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#isDirect() public abstract boolean java.nio.CharBuffer.isDirect()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#isDirect() public abstract boolean java.nio.CharBuffer.isDirect() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isDirect()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#append(char) public java.nio.CharBuffer
     * java.nio.CharBuffer.append(char)}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#append(char) public java.nio.CharBuffer
     * java.nio.CharBuffer.append(char)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#append(char) public java.nio.CharBuffer java.nio.CharBuffer.append(char) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_append_char()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#append(CharSequence) public java.nio.CharBuffer
     * java.nio.CharBuffer.append(java.lang.CharSequence)}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#append(CharSequence) public java.nio.CharBuffer
     * java.nio.CharBuffer.append(java.lang.CharSequence)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#append(CharSequence) public java.nio.CharBuffer
     *      java.nio.CharBuffer.append(java.lang.CharSequence) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_append_CharSequence()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#append(CharSequence, int, int) public java.nio.CharBuffer
     * java.nio.CharBuffer.append(java.lang.CharSequence,int,int)}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#append(CharSequence, int, int) public java.nio.CharBuffer
     * java.nio.CharBuffer.append(java.lang.CharSequence,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#append(CharSequence, int, int) public java.nio.CharBuffer
     *      java.nio.CharBuffer.append(java.lang.CharSequence,int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_append_CharSequence_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#charAt(int) public final char java.nio.CharBuffer.charAt(int)}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#charAt(int) public final char java.nio.CharBuffer.charAt(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#charAt(int) public final char java.nio.CharBuffer.charAt(int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_charAt_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#chars() public java.util.stream.IntStream java.nio.CharBuffer.chars()}
     * .
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#chars() public java.util.stream.IntStream java.nio.CharBuffer.chars()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#chars() public java.util.stream.IntStream java.nio.CharBuffer.chars() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_chars()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#toString() public java.lang.String java.nio.CharBuffer.toString()}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#toString() public java.lang.String java.nio.CharBuffer.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#toString() public java.lang.String java.nio.CharBuffer.toString() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.nio.CharBuffer#compact() public abstract java.nio.CharBuffer
     * java.nio.CharBuffer.compact()}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#compact() public abstract java.nio.CharBuffer
     * java.nio.CharBuffer.compact()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#compact() public abstract java.nio.CharBuffer java.nio.CharBuffer.compact() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compact()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#put(char) public abstract java.nio.CharBuffer
     * java.nio.CharBuffer.put(char)}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#put(char) public abstract java.nio.CharBuffer
     * java.nio.CharBuffer.put(char)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#put(char) public abstract java.nio.CharBuffer java.nio.CharBuffer.put(char) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_put_char()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#put(int, char) public abstract java.nio.CharBuffer
     * java.nio.CharBuffer.put(int,char)}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#put(int, char) public abstract java.nio.CharBuffer
     * java.nio.CharBuffer.put(int,char)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#put(int, char) public abstract java.nio.CharBuffer java.nio.CharBuffer.put(int,char)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_put_int_char()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#put(java.nio.CharBuffer) public java.nio.CharBuffer
     * java.nio.CharBuffer.put(java.nio.CharBuffer)}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#put(java.nio.CharBuffer) public java.nio.CharBuffer
     * java.nio.CharBuffer.put(java.nio.CharBuffer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#put(java.nio.CharBuffer) public java.nio.CharBuffer
     *      java.nio.CharBuffer.put(java.nio.CharBuffer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_put_CharBuffer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#put(char[]) public final java.nio.CharBuffer
     * java.nio.CharBuffer.put(char[])}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#put(char[]) public final java.nio.CharBuffer
     * java.nio.CharBuffer.put(char[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#put(char[]) public final java.nio.CharBuffer java.nio.CharBuffer.put(char[]) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_put_charArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#put(String, int, int) public java.nio.CharBuffer
     * java.nio.CharBuffer.put(java.lang.String,int,int)}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#put(String, int, int) public java.nio.CharBuffer
     * java.nio.CharBuffer.put(java.lang.String,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#put(String, int, int) public java.nio.CharBuffer
     *      java.nio.CharBuffer.put(java.lang.String,int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_put_String_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#put(String) public final java.nio.CharBuffer
     * java.nio.CharBuffer.put(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#put(String) public final java.nio.CharBuffer
     * java.nio.CharBuffer.put(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#put(String) public final java.nio.CharBuffer java.nio.CharBuffer.put(java.lang.String)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_put_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#put(char[], int, int) public java.nio.CharBuffer
     * java.nio.CharBuffer.put(char[],int,int)}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#put(char[], int, int) public java.nio.CharBuffer
     * java.nio.CharBuffer.put(char[],int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#put(char[], int, int) public java.nio.CharBuffer java.nio.CharBuffer.put(char[],int,int)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_put_charArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#asReadOnlyBuffer() public abstract java.nio.CharBuffer
     * java.nio.CharBuffer.asReadOnlyBuffer()}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#asReadOnlyBuffer() public abstract java.nio.CharBuffer
     * java.nio.CharBuffer.asReadOnlyBuffer()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#asReadOnlyBuffer() public abstract java.nio.CharBuffer
     *      java.nio.CharBuffer.asReadOnlyBuffer() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_asReadOnlyBuffer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#compareTo(java.nio.CharBuffer) public int
     * java.nio.CharBuffer.compareTo(java.nio.CharBuffer)}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#compareTo(java.nio.CharBuffer) public int
     * java.nio.CharBuffer.compareTo(java.nio.CharBuffer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#compareTo(java.nio.CharBuffer) public int
     *      java.nio.CharBuffer.compareTo(java.nio.CharBuffer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compareTo_CharBuffer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#array() public final char[] java.nio.CharBuffer.array()}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#array() public final char[] java.nio.CharBuffer.array()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#array() public final char[] java.nio.CharBuffer.array() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_array()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#slice() public abstract java.nio.CharBuffer
     * java.nio.CharBuffer.slice()}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#slice() public abstract java.nio.CharBuffer
     * java.nio.CharBuffer.slice()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#slice() public abstract java.nio.CharBuffer java.nio.CharBuffer.slice() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_slice()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#get(int) public abstract char java.nio.CharBuffer.get(int)}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#get(int) public abstract char java.nio.CharBuffer.get(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#get(int) public abstract char java.nio.CharBuffer.get(int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#get() public abstract char java.nio.CharBuffer.get()}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#get() public abstract char java.nio.CharBuffer.get()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#get() public abstract char java.nio.CharBuffer.get() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#get(char[], int, int) public java.nio.CharBuffer
     * java.nio.CharBuffer.get(char[],int,int)}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#get(char[], int, int) public java.nio.CharBuffer
     * java.nio.CharBuffer.get(char[],int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#get(char[], int, int) public java.nio.CharBuffer java.nio.CharBuffer.get(char[],int,int)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_charArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#get(char[]) public java.nio.CharBuffer
     * java.nio.CharBuffer.get(char[])}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#get(char[]) public java.nio.CharBuffer
     * java.nio.CharBuffer.get(char[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#get(char[]) public java.nio.CharBuffer java.nio.CharBuffer.get(char[]) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_charArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#hashCode() public int java.nio.CharBuffer.hashCode()}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#hashCode() public int java.nio.CharBuffer.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#hashCode() public int java.nio.CharBuffer.hashCode() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#order() public abstract java.nio.ByteOrder
     * java.nio.CharBuffer.order()}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#order() public abstract java.nio.ByteOrder
     * java.nio.CharBuffer.order()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#order() public abstract java.nio.ByteOrder java.nio.CharBuffer.order() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_order()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.CharBuffer#arrayOffset() public final int java.nio.CharBuffer.arrayOffset()}.
     *
     * <p>
     * Test method for {@link java.nio.CharBuffer#arrayOffset() public final int java.nio.CharBuffer.arrayOffset()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.CharBuffer#arrayOffset() public final int java.nio.CharBuffer.arrayOffset() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_arrayOffset()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
