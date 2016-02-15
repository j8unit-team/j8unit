package org.j8unit.repository.java.lang.reflect;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.reflect.Field class java.lang.reflect.Field}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link FieldClassTests}.
 * </p>
 *
 * @see java.lang.reflect.Field class java.lang.reflect.Field (the hereby targeted class-under-test class)
 * @see FieldClassTests FieldClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FieldTests<SUT extends java.lang.reflect.Field>
extends MemberTests<SUT>, AccessibleObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#setInt(Object, int) public void
     * java.lang.reflect.Field.setInt(java.lang.Object,int) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#setInt(Object, int) public void
     * java.lang.reflect.Field.setInt(java.lang.Object,int) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#setInt(Object, int) public void java.lang.reflect.Field.setInt(java.lang.Object,int)
     *      throws java.lang.IllegalArgumentException,java.lang.IllegalAccessException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setInt_Object_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#getShort(Object) public short
     * java.lang.reflect.Field.getShort(java.lang.Object) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#getShort(Object) public short
     * java.lang.reflect.Field.getShort(java.lang.Object) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#getShort(Object) public short java.lang.reflect.Field.getShort(java.lang.Object)
     *      throws java.lang.IllegalArgumentException,java.lang.IllegalAccessException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getShort_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#setFloat(Object, float) public void
     * java.lang.reflect.Field.setFloat(java.lang.Object,float) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#setFloat(Object, float) public void
     * java.lang.reflect.Field.setFloat(java.lang.Object,float) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#setFloat(Object, float) public void
     *      java.lang.reflect.Field.setFloat(java.lang.Object,float) throws
     *      java.lang.IllegalArgumentException,java.lang.IllegalAccessException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setFloat_Object_float()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#set(Object, Object) public void
     * java.lang.reflect.Field.set(java.lang.Object,java.lang.Object) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#set(Object, Object) public void
     * java.lang.reflect.Field.set(java.lang.Object,java.lang.Object) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#set(Object, Object) public void
     *      java.lang.reflect.Field.set(java.lang.Object,java.lang.Object) throws
     *      java.lang.IllegalArgumentException,java.lang.IllegalAccessException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#isEnumConstant() public boolean
     * java.lang.reflect.Field.isEnumConstant()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#isEnumConstant() public boolean
     * java.lang.reflect.Field.isEnumConstant()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#isEnumConstant() public boolean java.lang.reflect.Field.isEnumConstant() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isEnumConstant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#setBoolean(Object, boolean) public void
     * java.lang.reflect.Field.setBoolean(java.lang.Object,boolean) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#setBoolean(Object, boolean) public void
     * java.lang.reflect.Field.setBoolean(java.lang.Object,boolean) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#setBoolean(Object, boolean) public void
     *      java.lang.reflect.Field.setBoolean(java.lang.Object,boolean) throws
     *      java.lang.IllegalArgumentException,java.lang.IllegalAccessException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setBoolean_Object_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#toString() public java.lang.String
     * java.lang.reflect.Field.toString()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#toString() public java.lang.String
     * java.lang.reflect.Field.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#toString() public java.lang.String java.lang.reflect.Field.toString() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.lang.reflect.Field#getAnnotation(Class) public <T> T
     * java.lang.reflect.Field.getAnnotation(java.lang.Class<T>)}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#getAnnotation(Class) public java.lang.annotation.Annotation
     * java.lang.reflect.Field.getAnnotation(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#getAnnotation(Class) public java.lang.annotation.Annotation
     *      java.lang.reflect.Field.getAnnotation(java.lang.Class) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAnnotation_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#getType() public java.lang.Class
     * <?> java.lang.reflect.Field.getType()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#getType() public java.lang.Class
     * java.lang.reflect.Field.getType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#getType() public java.lang.Class java.lang.reflect.Field.getType() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#equals(Object) public boolean
     * java.lang.reflect.Field.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#equals(Object) public boolean
     * java.lang.reflect.Field.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#equals(Object) public boolean java.lang.reflect.Field.equals(java.lang.Object) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.lang.reflect.Field#getLong(Object) public long
     * java.lang.reflect.Field.getLong(java.lang.Object) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#getLong(Object) public long
     * java.lang.reflect.Field.getLong(java.lang.Object) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#getLong(Object) public long java.lang.reflect.Field.getLong(java.lang.Object) throws
     *      java.lang.IllegalArgumentException,java.lang.IllegalAccessException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLong_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#getChar(Object) public char
     * java.lang.reflect.Field.getChar(java.lang.Object) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#getChar(Object) public char
     * java.lang.reflect.Field.getChar(java.lang.Object) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#getChar(Object) public char java.lang.reflect.Field.getChar(java.lang.Object) throws
     *      java.lang.IllegalArgumentException,java.lang.IllegalAccessException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getChar_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#getInt(Object) public int
     * java.lang.reflect.Field.getInt(java.lang.Object) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#getInt(Object) public int
     * java.lang.reflect.Field.getInt(java.lang.Object) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#getInt(Object) public int java.lang.reflect.Field.getInt(java.lang.Object) throws
     *      java.lang.IllegalArgumentException,java.lang.IllegalAccessException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInt_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#setLong(Object, long) public void
     * java.lang.reflect.Field.setLong(java.lang.Object,long) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#setLong(Object, long) public void
     * java.lang.reflect.Field.setLong(java.lang.Object,long) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#setLong(Object, long) public void
     *      java.lang.reflect.Field.setLong(java.lang.Object,long) throws
     *      java.lang.IllegalArgumentException,java.lang.IllegalAccessException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLong_Object_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#getDeclaredAnnotations() public java.lang.annotation.Annotation[]
     * java.lang.reflect.Field.getDeclaredAnnotations()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#getDeclaredAnnotations() public java.lang.annotation.Annotation[]
     * java.lang.reflect.Field.getDeclaredAnnotations()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#getDeclaredAnnotations() public java.lang.annotation.Annotation[]
     *      java.lang.reflect.Field.getDeclaredAnnotations() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getDeclaredAnnotations()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#getDouble(Object) public double
     * java.lang.reflect.Field.getDouble(java.lang.Object) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#getDouble(Object) public double
     * java.lang.reflect.Field.getDouble(java.lang.Object) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#getDouble(Object) public double java.lang.reflect.Field.getDouble(java.lang.Object)
     *      throws java.lang.IllegalArgumentException,java.lang.IllegalAccessException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDouble_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#isSynthetic() public boolean
     * java.lang.reflect.Field.isSynthetic()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#isSynthetic() public boolean
     * java.lang.reflect.Field.isSynthetic()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#isSynthetic() public boolean java.lang.reflect.Field.isSynthetic() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isSynthetic()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#getFloat(Object) public float
     * java.lang.reflect.Field.getFloat(java.lang.Object) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#getFloat(Object) public float
     * java.lang.reflect.Field.getFloat(java.lang.Object) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#getFloat(Object) public float java.lang.reflect.Field.getFloat(java.lang.Object)
     *      throws java.lang.IllegalArgumentException,java.lang.IllegalAccessException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFloat_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#setShort(Object, short) public void
     * java.lang.reflect.Field.setShort(java.lang.Object,short) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#setShort(Object, short) public void
     * java.lang.reflect.Field.setShort(java.lang.Object,short) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#setShort(Object, short) public void
     *      java.lang.reflect.Field.setShort(java.lang.Object,short) throws
     *      java.lang.IllegalArgumentException,java.lang.IllegalAccessException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setShort_Object_short()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#setByte(Object, byte) public void
     * java.lang.reflect.Field.setByte(java.lang.Object,byte) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#setByte(Object, byte) public void
     * java.lang.reflect.Field.setByte(java.lang.Object,byte) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#setByte(Object, byte) public void
     *      java.lang.reflect.Field.setByte(java.lang.Object,byte) throws
     *      java.lang.IllegalArgumentException,java.lang.IllegalAccessException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setByte_Object_byte()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#getByte(Object) public byte
     * java.lang.reflect.Field.getByte(java.lang.Object) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#getByte(Object) public byte
     * java.lang.reflect.Field.getByte(java.lang.Object) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#getByte(Object) public byte java.lang.reflect.Field.getByte(java.lang.Object) throws
     *      java.lang.IllegalArgumentException,java.lang.IllegalAccessException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getByte_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#getName() public java.lang.String
     * java.lang.reflect.Field.getName()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#getName() public java.lang.String
     * java.lang.reflect.Field.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#getName() public java.lang.String java.lang.reflect.Field.getName() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#getAnnotatedType() public java.lang.reflect.AnnotatedType
     * java.lang.reflect.Field.getAnnotatedType()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#getAnnotatedType() public java.lang.reflect.AnnotatedType
     * java.lang.reflect.Field.getAnnotatedType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#getAnnotatedType() public java.lang.reflect.AnnotatedType
     *      java.lang.reflect.Field.getAnnotatedType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAnnotatedType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#getBoolean(Object) public boolean
     * java.lang.reflect.Field.getBoolean(java.lang.Object) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#getBoolean(Object) public boolean
     * java.lang.reflect.Field.getBoolean(java.lang.Object) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#getBoolean(Object) public boolean
     *      java.lang.reflect.Field.getBoolean(java.lang.Object) throws
     *      java.lang.IllegalArgumentException,java.lang.IllegalAccessException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBoolean_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#getModifiers() public int java.lang.reflect.Field.getModifiers()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#getModifiers() public int java.lang.reflect.Field.getModifiers()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#getModifiers() public int java.lang.reflect.Field.getModifiers() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getModifiers()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#getGenericType() public java.lang.reflect.Type
     * java.lang.reflect.Field.getGenericType()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#getGenericType() public java.lang.reflect.Type
     * java.lang.reflect.Field.getGenericType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#getGenericType() public java.lang.reflect.Type
     *      java.lang.reflect.Field.getGenericType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getGenericType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#getAnnotationsByType(Class) public <T> T[]
     * java.lang.reflect.Field.getAnnotationsByType(java.lang.Class<T>)}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#getAnnotationsByType(Class) public
     * java.lang.annotation.Annotation[] java.lang.reflect.Field.getAnnotationsByType(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#getAnnotationsByType(Class) public java.lang.annotation.Annotation[]
     *      java.lang.reflect.Field.getAnnotationsByType(java.lang.Class) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAnnotationsByType_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#hashCode() public int java.lang.reflect.Field.hashCode()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#hashCode() public int java.lang.reflect.Field.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#hashCode() public int java.lang.reflect.Field.hashCode() (the hereby targeted
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
     * Test method for {@link java.lang.reflect.Field#get(Object) public java.lang.Object
     * java.lang.reflect.Field.get(java.lang.Object) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#get(Object) public java.lang.Object
     * java.lang.reflect.Field.get(java.lang.Object) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#get(Object) public java.lang.Object java.lang.reflect.Field.get(java.lang.Object)
     *      throws java.lang.IllegalArgumentException,java.lang.IllegalAccessException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#toGenericString() public java.lang.String
     * java.lang.reflect.Field.toGenericString()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#toGenericString() public java.lang.String
     * java.lang.reflect.Field.toGenericString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#toGenericString() public java.lang.String java.lang.reflect.Field.toGenericString()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toGenericString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#setChar(Object, char) public void
     * java.lang.reflect.Field.setChar(java.lang.Object,char) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#setChar(Object, char) public void
     * java.lang.reflect.Field.setChar(java.lang.Object,char) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#setChar(Object, char) public void
     *      java.lang.reflect.Field.setChar(java.lang.Object,char) throws
     *      java.lang.IllegalArgumentException,java.lang.IllegalAccessException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setChar_Object_char()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#setDouble(Object, double) public void
     * java.lang.reflect.Field.setDouble(java.lang.Object,double) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#setDouble(Object, double) public void
     * java.lang.reflect.Field.setDouble(java.lang.Object,double) throws
     * java.lang.IllegalArgumentException,java.lang.IllegalAccessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#setDouble(Object, double) public void
     *      java.lang.reflect.Field.setDouble(java.lang.Object,double) throws
     *      java.lang.IllegalArgumentException,java.lang.IllegalAccessException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDouble_Object_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Field#getDeclaringClass() public java.lang.Class
     * <?> java.lang.reflect.Field.getDeclaringClass()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Field#getDeclaringClass() public java.lang.Class
     * java.lang.reflect.Field.getDeclaringClass()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Field#getDeclaringClass() public java.lang.Class
     *      java.lang.reflect.Field.getDeclaringClass() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getDeclaringClass()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
