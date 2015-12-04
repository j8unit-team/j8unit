package org.j8unit.repository.java.lang.reflect;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.lang.reflect.Array class java.lang.reflect.Array},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.lang.reflect.ArrayTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.reflect.ArrayTests
 */
@Category(J8UnitRepository.class)
public abstract interface ArrayClassTests<SUT extends Class<? extends java.lang.reflect.Array>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.lang.reflect.Array> sut = createNewSUT();
        // assert assignability
        assertTrue(java.lang.reflect.Array.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Array#getByte(java.lang.Object,int) public static native byte java.lang.reflect.Array.getByte(java.lang.Object,int) throws java.lang.IllegalArgumentException,java.lang.ArrayIndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getByte_Object_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Array#set(java.lang.Object,int,java.lang.Object) public static native void java.lang.reflect.Array.set(java.lang.Object,int,java.lang.Object) throws java.lang.IllegalArgumentException,java.lang.ArrayIndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_Object_int_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Array#setByte(java.lang.Object,int,byte) public static native void java.lang.reflect.Array.setByte(java.lang.Object,int,byte) throws java.lang.IllegalArgumentException,java.lang.ArrayIndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setByte_Object_int_byte() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Array#setFloat(java.lang.Object,int,float) public static native void java.lang.reflect.Array.setFloat(java.lang.Object,int,float) throws java.lang.IllegalArgumentException,java.lang.ArrayIndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setFloat_Object_int_float() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Array#getShort(java.lang.Object,int) public static native short java.lang.reflect.Array.getShort(java.lang.Object,int) throws java.lang.IllegalArgumentException,java.lang.ArrayIndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getShort_Object_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Array#getFloat(java.lang.Object,int) public static native float java.lang.reflect.Array.getFloat(java.lang.Object,int) throws java.lang.IllegalArgumentException,java.lang.ArrayIndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFloat_Object_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Array#setShort(java.lang.Object,int,short) public static native void java.lang.reflect.Array.setShort(java.lang.Object,int,short) throws java.lang.IllegalArgumentException,java.lang.ArrayIndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setShort_Object_int_short() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Array#newInstance(java.lang.Class,int) public static java.lang.Object java.lang.reflect.Array.newInstance(java.lang.Class,int) throws java.lang.NegativeArraySizeException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newInstance_Class_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Array#newInstance(java.lang.Class,int...) public static java.lang.Object java.lang.reflect.Array.newInstance(java.lang.Class,int...) throws java.lang.IllegalArgumentException,java.lang.NegativeArraySizeException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newInstance_Class_intArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Array#getDouble(java.lang.Object,int) public static native double java.lang.reflect.Array.getDouble(java.lang.Object,int) throws java.lang.IllegalArgumentException,java.lang.ArrayIndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDouble_Object_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Array#setInt(java.lang.Object,int,int) public static native void java.lang.reflect.Array.setInt(java.lang.Object,int,int) throws java.lang.IllegalArgumentException,java.lang.ArrayIndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setInt_Object_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Array#setLong(java.lang.Object,int,long) public static native void java.lang.reflect.Array.setLong(java.lang.Object,int,long) throws java.lang.IllegalArgumentException,java.lang.ArrayIndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLong_Object_int_long() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Array#getChar(java.lang.Object,int) public static native char java.lang.reflect.Array.getChar(java.lang.Object,int) throws java.lang.IllegalArgumentException,java.lang.ArrayIndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getChar_Object_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Array#getInt(java.lang.Object,int) public static native int java.lang.reflect.Array.getInt(java.lang.Object,int) throws java.lang.IllegalArgumentException,java.lang.ArrayIndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInt_Object_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Array#getLong(java.lang.Object,int) public static native long java.lang.reflect.Array.getLong(java.lang.Object,int) throws java.lang.IllegalArgumentException,java.lang.ArrayIndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLong_Object_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Array#setChar(java.lang.Object,int,char) public static native void java.lang.reflect.Array.setChar(java.lang.Object,int,char) throws java.lang.IllegalArgumentException,java.lang.ArrayIndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setChar_Object_int_char() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Array#setDouble(java.lang.Object,int,double) public static native void java.lang.reflect.Array.setDouble(java.lang.Object,int,double) throws java.lang.IllegalArgumentException,java.lang.ArrayIndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDouble_Object_int_double() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Array#get(java.lang.Object,int) public static native java.lang.Object java.lang.reflect.Array.get(java.lang.Object,int) throws java.lang.IllegalArgumentException,java.lang.ArrayIndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_Object_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Array#getBoolean(java.lang.Object,int) public static native boolean java.lang.reflect.Array.getBoolean(java.lang.Object,int) throws java.lang.IllegalArgumentException,java.lang.ArrayIndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBoolean_Object_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Array#getLength(java.lang.Object) public static native int java.lang.reflect.Array.getLength(java.lang.Object) throws java.lang.IllegalArgumentException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLength_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Array#setBoolean(java.lang.Object,int,boolean) public static native void java.lang.reflect.Array.setBoolean(java.lang.Object,int,boolean) throws java.lang.IllegalArgumentException,java.lang.ArrayIndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setBoolean_Object_int_boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
