package org.j8unit.repository.java.lang;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain Class class java.lang.Class}. The complementary j8unit test interface
 * containing the class relevant aspects is {@link ClassClassTests}.
 * </p>
 *
 * @see Class class java.lang.Class (the hereby targeted class-under-test class)
 * @see ClassClassTests ClassClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ClassTests<SUT extends Class<T>, T>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.reflect.GenericDeclarationTests<SUT>,
org.j8unit.repository.java.lang.reflect.TypeTests<SUT>, org.j8unit.repository.java.lang.reflect.AnnotatedElementTests<SUT>, ObjectTests<SUT> {

    /**
     * @see Class#getName() public java.lang.String java.lang.Class.getName() (the hereby targeted method-under-test)
     *
     * @since 0.9.2
     */
    @Test
    public default void getNameMustBeNotNull() {
        final Class<T> sut = this.createNewSUT();
        assert sut != null;
        assertNotNull(sut.getName());
    }

    /**
     * @see Class#getName() public java.lang.String java.lang.Class.getName() (the hereby targeted method-under-test)
     *
     * @since 0.9.2
     */
    @Test
    public default void getNameMustBeSyntacticallyValidIdentifier() {
        final Class<T> sut = this.createNewSUT();
        assert sut != null;
        assumeTrue("The given Class represents a primitive type; Thus, this test becomes useless.", sut.isPrimitive());
        assumeTrue("The given Class represents an array class; Thus, this test becomes useless.", sut.isArray());
        final String name = sut.getName();
        assertTrue(javax.lang.model.SourceVersion.isIdentifier(name));
    }

    /**
     * <p>
     * Test method for {@link Class#toString() public java.lang.String java.lang.Class.toString()}.
     *
     * <p>
     * Test method for {@link Class#toString() public java.lang.String java.lang.Class.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#toString() public java.lang.String java.lang.Class.toString() (the hereby targeted method-under-test)
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
     * Test method for {@link Class#getEnclosingClass() public java.lang.Class<?> java.lang.Class.getEnclosingClass()
     * throws java.lang.SecurityException}.
     *
     * <p>
     * Test method for {@link Class#getEnclosingClass() public java.lang.Class java.lang.Class.getEnclosingClass()
     * throws java.lang.SecurityException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getEnclosingClass() public java.lang.Class java.lang.Class.getEnclosingClass() throws
     *      java.lang.SecurityException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEnclosingClass()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getGenericSuperclass() public java.lang.reflect.Type
     * java.lang.Class.getGenericSuperclass()}.
     *
     * <p>
     * Test method for {@link Class#getGenericSuperclass() public java.lang.reflect.Type
     * java.lang.Class.getGenericSuperclass()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getGenericSuperclass() public java.lang.reflect.Type java.lang.Class.getGenericSuperclass() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getGenericSuperclass()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getDeclaredClasses() public java.lang.Class<?>[]
     * java.lang.Class.getDeclaredClasses() throws java.lang.SecurityException}.
     *
     * <p>
     * Test method for {@link Class#getDeclaredClasses() public java.lang.Class[] java.lang.Class.getDeclaredClasses()
     * throws java.lang.SecurityException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getDeclaredClasses() public java.lang.Class[] java.lang.Class.getDeclaredClasses() throws
     *      java.lang.SecurityException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDeclaredClasses()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#isAnonymousClass() public boolean java.lang.Class.isAnonymousClass()}.
     *
     * <p>
     * Test method for {@link Class#isAnonymousClass() public boolean java.lang.Class.isAnonymousClass()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#isAnonymousClass() public boolean java.lang.Class.isAnonymousClass() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isAnonymousClass()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getDeclaredAnnotationsByType(Class) public <A> A[]
     * java.lang.Class.getDeclaredAnnotationsByType(java.lang.Class<A>)}.
     *
     * <p>
     * Test method for {@link Class#getDeclaredAnnotationsByType(Class) public java.lang.annotation.Annotation[]
     * java.lang.Class.getDeclaredAnnotationsByType(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getDeclaredAnnotationsByType(Class) public java.lang.annotation.Annotation[]
     *      java.lang.Class.getDeclaredAnnotationsByType(java.lang.Class) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getDeclaredAnnotationsByType_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getDeclaredConstructor(Class...) public java.lang.reflect.Constructor
     * <T> java.lang.Class.getDeclaredConstructor(java.lang.Class<?>...) throws
     * java.lang.NoSuchMethodException,java.lang.SecurityException}.
     *
     * <p>
     * Test method for {@link Class#getDeclaredConstructor(Class...) public java.lang.reflect.Constructor
     * java.lang.Class.getDeclaredConstructor(java.lang.Class...) throws
     * java.lang.NoSuchMethodException,java.lang.SecurityException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getDeclaredConstructor(Class...) public java.lang.reflect.Constructor
     *      java.lang.Class.getDeclaredConstructor(java.lang.Class[]) throws
     *      java.lang.NoSuchMethodException,java.lang.SecurityException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDeclaredConstructor_ClassArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getDeclaredMethod(String, Class...) public java.lang.reflect.Method
     * java.lang.Class.getDeclaredMethod(java.lang.String,java.lang.Class<?>...) throws
     * java.lang.NoSuchMethodException,java.lang.SecurityException}.
     *
     * <p>
     * Test method for {@link Class#getDeclaredMethod(String, Class...) public java.lang.reflect.Method
     * java.lang.Class.getDeclaredMethod(java.lang.String,java.lang.Class...) throws
     * java.lang.NoSuchMethodException,java.lang.SecurityException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getDeclaredMethod(String, Class...) public java.lang.reflect.Method
     *      java.lang.Class.getDeclaredMethod(java.lang.String,java.lang.Class[]) throws
     *      java.lang.NoSuchMethodException,java.lang.SecurityException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDeclaredMethod_String_ClassArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#isEnum() public boolean java.lang.Class.isEnum()}.
     *
     * <p>
     * Test method for {@link Class#isEnum() public boolean java.lang.Class.isEnum()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#isEnum() public boolean java.lang.Class.isEnum() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isEnum()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getEnumConstants() public T[] java.lang.Class.getEnumConstants()}.
     *
     * <p>
     * Test method for {@link Class#getEnumConstants() public java.lang.Object[] java.lang.Class.getEnumConstants()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getEnumConstants() public java.lang.Object[] java.lang.Class.getEnumConstants() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEnumConstants()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getAnnotations() public java.lang.annotation.Annotation[]
     * java.lang.Class.getAnnotations()}.
     *
     * <p>
     * Test method for {@link Class#getAnnotations() public java.lang.annotation.Annotation[]
     * java.lang.Class.getAnnotations()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getAnnotations() public java.lang.annotation.Annotation[] java.lang.Class.getAnnotations() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAnnotations()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getConstructor(Class...) public java.lang.reflect.Constructor
     * <T> java.lang.Class.getConstructor(java.lang.Class<?>...) throws
     * java.lang.NoSuchMethodException,java.lang.SecurityException}.
     *
     * <p>
     * Test method for {@link Class#getConstructor(Class...) public java.lang.reflect.Constructor
     * java.lang.Class.getConstructor(java.lang.Class...) throws
     * java.lang.NoSuchMethodException,java.lang.SecurityException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getConstructor(Class...) public java.lang.reflect.Constructor
     *      java.lang.Class.getConstructor(java.lang.Class[]) throws
     *      java.lang.NoSuchMethodException,java.lang.SecurityException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getConstructor_ClassArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getDeclaredField(String) public java.lang.reflect.Field
     * java.lang.Class.getDeclaredField(java.lang.String) throws
     * java.lang.NoSuchFieldException,java.lang.SecurityException}.
     *
     * <p>
     * Test method for {@link Class#getDeclaredField(String) public java.lang.reflect.Field
     * java.lang.Class.getDeclaredField(java.lang.String) throws
     * java.lang.NoSuchFieldException,java.lang.SecurityException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getDeclaredField(String) public java.lang.reflect.Field
     *      java.lang.Class.getDeclaredField(java.lang.String) throws
     *      java.lang.NoSuchFieldException,java.lang.SecurityException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDeclaredField_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getResourceAsStream(String) public java.io.InputStream
     * java.lang.Class.getResourceAsStream(java.lang.String)}.
     *
     * <p>
     * Test method for {@link Class#getResourceAsStream(String) public java.io.InputStream
     * java.lang.Class.getResourceAsStream(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getResourceAsStream(String) public java.io.InputStream
     *      java.lang.Class.getResourceAsStream(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getResourceAsStream_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getModifiers() public native int java.lang.Class.getModifiers()}.
     *
     * <p>
     * Test method for {@link Class#getModifiers() public native int java.lang.Class.getModifiers()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getModifiers() public native int java.lang.Class.getModifiers() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link Class#getClasses() public java.lang.Class<?>[] java.lang.Class.getClasses()}.
     *
     * <p>
     * Test method for {@link Class#getClasses() public java.lang.Class[] java.lang.Class.getClasses()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getClasses() public java.lang.Class[] java.lang.Class.getClasses() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getClasses()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getSuperclass() public native java.lang.Class<? super T>
     * java.lang.Class.getSuperclass()}.
     *
     * <p>
     * Test method for {@link Class#getSuperclass() public native java.lang.Class java.lang.Class.getSuperclass()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getSuperclass() public native java.lang.Class java.lang.Class.getSuperclass() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSuperclass()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getTypeName() public java.lang.String java.lang.Class.getTypeName()}.
     *
     * <p>
     * Test method for {@link Class#getTypeName() public java.lang.String java.lang.Class.getTypeName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getTypeName() public java.lang.String java.lang.Class.getTypeName() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getTypeName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getEnclosingConstructor() public java.lang.reflect.Constructor
     * <?> java.lang.Class.getEnclosingConstructor() throws java.lang.SecurityException}.
     *
     * <p>
     * Test method for {@link Class#getEnclosingConstructor() public java.lang.reflect.Constructor
     * java.lang.Class.getEnclosingConstructor() throws java.lang.SecurityException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getEnclosingConstructor() public java.lang.reflect.Constructor
     *      java.lang.Class.getEnclosingConstructor() throws java.lang.SecurityException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEnclosingConstructor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getDeclaredMethods() public java.lang.reflect.Method[]
     * java.lang.Class.getDeclaredMethods() throws java.lang.SecurityException}.
     *
     * <p>
     * Test method for {@link Class#getDeclaredMethods() public java.lang.reflect.Method[]
     * java.lang.Class.getDeclaredMethods() throws java.lang.SecurityException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getDeclaredMethods() public java.lang.reflect.Method[] java.lang.Class.getDeclaredMethods() throws
     *      java.lang.SecurityException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDeclaredMethods()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getDeclaringClass() public java.lang.Class<?> java.lang.Class.getDeclaringClass()
     * throws java.lang.SecurityException}.
     *
     * <p>
     * Test method for {@link Class#getDeclaringClass() public java.lang.Class java.lang.Class.getDeclaringClass()
     * throws java.lang.SecurityException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getDeclaringClass() public java.lang.Class java.lang.Class.getDeclaringClass() throws
     *      java.lang.SecurityException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDeclaringClass()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getAnnotatedSuperclass() public java.lang.reflect.AnnotatedType
     * java.lang.Class.getAnnotatedSuperclass()}.
     *
     * <p>
     * Test method for {@link Class#getAnnotatedSuperclass() public java.lang.reflect.AnnotatedType
     * java.lang.Class.getAnnotatedSuperclass()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getAnnotatedSuperclass() public java.lang.reflect.AnnotatedType
     *      java.lang.Class.getAnnotatedSuperclass() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAnnotatedSuperclass()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#toGenericString() public java.lang.String java.lang.Class.toGenericString()}.
     *
     * <p>
     * Test method for {@link Class#toGenericString() public java.lang.String java.lang.Class.toGenericString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#toGenericString() public java.lang.String java.lang.Class.toGenericString() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link Class#getAnnotationsByType(Class) public <A> A[]
     * java.lang.Class.getAnnotationsByType(java.lang.Class<A>)}.
     *
     * <p>
     * Test method for {@link Class#getAnnotationsByType(Class) public java.lang.annotation.Annotation[]
     * java.lang.Class.getAnnotationsByType(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getAnnotationsByType(Class) public java.lang.annotation.Annotation[]
     *      java.lang.Class.getAnnotationsByType(java.lang.Class) (the hereby targeted method-under-test)
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
     * Test method for {@link Class#getConstructors() public java.lang.reflect.Constructor<?>[]
     * java.lang.Class.getConstructors() throws java.lang.SecurityException}.
     *
     * <p>
     * Test method for {@link Class#getConstructors() public java.lang.reflect.Constructor[]
     * java.lang.Class.getConstructors() throws java.lang.SecurityException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getConstructors() public java.lang.reflect.Constructor[] java.lang.Class.getConstructors() throws
     *      java.lang.SecurityException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getConstructors()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getClassLoader() public java.lang.ClassLoader java.lang.Class.getClassLoader()}.
     *
     * <p>
     * Test method for {@link Class#getClassLoader() public java.lang.ClassLoader java.lang.Class.getClassLoader()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getClassLoader() public java.lang.ClassLoader java.lang.Class.getClassLoader() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getClassLoader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getGenericInterfaces() public java.lang.reflect.Type[]
     * java.lang.Class.getGenericInterfaces()}.
     *
     * <p>
     * Test method for {@link Class#getGenericInterfaces() public java.lang.reflect.Type[]
     * java.lang.Class.getGenericInterfaces()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getGenericInterfaces() public java.lang.reflect.Type[] java.lang.Class.getGenericInterfaces() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getGenericInterfaces()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getDeclaredAnnotations() public java.lang.annotation.Annotation[]
     * java.lang.Class.getDeclaredAnnotations()}.
     *
     * <p>
     * Test method for {@link Class#getDeclaredAnnotations() public java.lang.annotation.Annotation[]
     * java.lang.Class.getDeclaredAnnotations()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getDeclaredAnnotations() public java.lang.annotation.Annotation[]
     *      java.lang.Class.getDeclaredAnnotations() (the hereby targeted method-under-test)
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
     * Test method for {@link Class#isAssignableFrom(Class) public native boolean
     * java.lang.Class.isAssignableFrom(java.lang.Class<?>)}.
     *
     * <p>
     * Test method for {@link Class#isAssignableFrom(Class) public native boolean
     * java.lang.Class.isAssignableFrom(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isAssignableFrom_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getProtectionDomain() public java.security.ProtectionDomain
     * java.lang.Class.getProtectionDomain()}.
     *
     * <p>
     * Test method for {@link Class#getProtectionDomain() public java.security.ProtectionDomain
     * java.lang.Class.getProtectionDomain()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getProtectionDomain() public java.security.ProtectionDomain java.lang.Class.getProtectionDomain() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getProtectionDomain()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#isAnnotation() public boolean java.lang.Class.isAnnotation()}.
     *
     * <p>
     * Test method for {@link Class#isAnnotation() public boolean java.lang.Class.isAnnotation()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#isAnnotation() public boolean java.lang.Class.isAnnotation() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isAnnotation()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#desiredAssertionStatus() public boolean java.lang.Class.desiredAssertionStatus()}.
     *
     * <p>
     * Test method for {@link Class#desiredAssertionStatus() public boolean java.lang.Class.desiredAssertionStatus()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#desiredAssertionStatus() public boolean java.lang.Class.desiredAssertionStatus() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_desiredAssertionStatus()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getDeclaredConstructors() public java.lang.reflect.Constructor<?>[]
     * java.lang.Class.getDeclaredConstructors() throws java.lang.SecurityException}.
     *
     * <p>
     * Test method for {@link Class#getDeclaredConstructors() public java.lang.reflect.Constructor[]
     * java.lang.Class.getDeclaredConstructors() throws java.lang.SecurityException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getDeclaredConstructors() public java.lang.reflect.Constructor[]
     *      java.lang.Class.getDeclaredConstructors() throws java.lang.SecurityException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDeclaredConstructors()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#isAnnotationPresent(Class) public boolean
     * java.lang.Class.isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation>)}.
     *
     * <p>
     * Test method for {@link Class#isAnnotationPresent(Class) public boolean
     * java.lang.Class.isAnnotationPresent(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#isAnnotationPresent(Class) public boolean java.lang.Class.isAnnotationPresent(java.lang.Class) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isAnnotationPresent_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#isArray() public native boolean java.lang.Class.isArray()}.
     *
     * <p>
     * Test method for {@link Class#isArray() public native boolean java.lang.Class.isArray()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#isArray() public native boolean java.lang.Class.isArray() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getSimpleName() public java.lang.String java.lang.Class.getSimpleName()}.
     *
     * <p>
     * Test method for {@link Class#getSimpleName() public java.lang.String java.lang.Class.getSimpleName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getSimpleName() public java.lang.String java.lang.Class.getSimpleName() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSimpleName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getDeclaredAnnotation(Class) public <A> A
     * java.lang.Class.getDeclaredAnnotation(java.lang.Class<A>)}.
     *
     * <p>
     * Test method for {@link Class#getDeclaredAnnotation(Class) public java.lang.annotation.Annotation
     * java.lang.Class.getDeclaredAnnotation(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getDeclaredAnnotation(Class) public java.lang.annotation.Annotation
     *      java.lang.Class.getDeclaredAnnotation(java.lang.Class) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getDeclaredAnnotation_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#isPrimitive() public native boolean java.lang.Class.isPrimitive()}.
     *
     * <p>
     * Test method for {@link Class#isPrimitive() public native boolean java.lang.Class.isPrimitive()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#isPrimitive() public native boolean java.lang.Class.isPrimitive() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isPrimitive()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getMethods() public java.lang.reflect.Method[] java.lang.Class.getMethods() throws
     * java.lang.SecurityException}.
     *
     * <p>
     * Test method for {@link Class#getMethods() public java.lang.reflect.Method[] java.lang.Class.getMethods() throws
     * java.lang.SecurityException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getMethods() public java.lang.reflect.Method[] java.lang.Class.getMethods() throws
     *      java.lang.SecurityException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMethods()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getFields() public java.lang.reflect.Field[] java.lang.Class.getFields() throws
     * java.lang.SecurityException}.
     *
     * <p>
     * Test method for {@link Class#getFields() public java.lang.reflect.Field[] java.lang.Class.getFields() throws
     * java.lang.SecurityException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getFields() public java.lang.reflect.Field[] java.lang.Class.getFields() throws
     *      java.lang.SecurityException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFields()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getComponentType() public native java.lang.Class
     * <?> java.lang.Class.getComponentType()}.
     *
     * <p>
     * Test method for {@link Class#getComponentType() public native java.lang.Class java.lang.Class.getComponentType()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getComponentType() public native java.lang.Class java.lang.Class.getComponentType() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getComponentType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getAnnotation(Class) public <A> A java.lang.Class.getAnnotation(java.lang.Class<A>)}
     * .
     *
     * <p>
     * Test method for {@link Class#getAnnotation(Class) public java.lang.annotation.Annotation
     * java.lang.Class.getAnnotation(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getAnnotation(Class) public java.lang.annotation.Annotation
     *      java.lang.Class.getAnnotation(java.lang.Class) (the hereby targeted method-under-test)
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
     * Test method for {@link Class#newInstance() public T java.lang.Class.newInstance() throws
     * java.lang.InstantiationException,java.lang.IllegalAccessException}.
     *
     * <p>
     * Test method for {@link Class#newInstance() public java.lang.Object java.lang.Class.newInstance() throws
     * java.lang.InstantiationException,java.lang.IllegalAccessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#newInstance() public java.lang.Object java.lang.Class.newInstance() throws
     *      java.lang.InstantiationException,java.lang.IllegalAccessException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newInstance()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getField(String) public java.lang.reflect.Field
     * java.lang.Class.getField(java.lang.String) throws java.lang.NoSuchFieldException,java.lang.SecurityException}.
     *
     * <p>
     * Test method for {@link Class#getField(String) public java.lang.reflect.Field
     * java.lang.Class.getField(java.lang.String) throws java.lang.NoSuchFieldException,java.lang.SecurityException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getField(String) public java.lang.reflect.Field java.lang.Class.getField(java.lang.String) throws
     *      java.lang.NoSuchFieldException,java.lang.SecurityException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getField_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getInterfaces() public java.lang.Class<?>[] java.lang.Class.getInterfaces()}.
     *
     * <p>
     * Test method for {@link Class#getInterfaces() public java.lang.Class[] java.lang.Class.getInterfaces()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getInterfaces() public java.lang.Class[] java.lang.Class.getInterfaces() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInterfaces()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getAnnotatedInterfaces() public java.lang.reflect.AnnotatedType[]
     * java.lang.Class.getAnnotatedInterfaces()}.
     *
     * <p>
     * Test method for {@link Class#getAnnotatedInterfaces() public java.lang.reflect.AnnotatedType[]
     * java.lang.Class.getAnnotatedInterfaces()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getAnnotatedInterfaces() public java.lang.reflect.AnnotatedType[]
     *      java.lang.Class.getAnnotatedInterfaces() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAnnotatedInterfaces()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getPackage() public java.lang.Package java.lang.Class.getPackage()}.
     *
     * <p>
     * Test method for {@link Class#getPackage() public java.lang.Package java.lang.Class.getPackage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getPackage() public java.lang.Package java.lang.Class.getPackage() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPackage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#asSubclass(Class) public <U> java.lang.Class<? extends U>
     * java.lang.Class.asSubclass(java.lang.Class<U>)}.
     *
     * <p>
     * Test method for {@link Class#asSubclass(Class) public java.lang.Class
     * java.lang.Class.asSubclass(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#asSubclass(Class) public java.lang.Class java.lang.Class.asSubclass(java.lang.Class) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_asSubclass_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getTypeParameters() public java.lang.reflect.TypeVariable<java.lang.Class<T>>[]
     * java.lang.Class.getTypeParameters()}.
     *
     * <p>
     * Test method for {@link Class#getTypeParameters() public java.lang.reflect.TypeVariable[]
     * java.lang.Class.getTypeParameters()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getTypeParameters() public java.lang.reflect.TypeVariable[] java.lang.Class.getTypeParameters() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getTypeParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#isInterface() public native boolean java.lang.Class.isInterface()}.
     *
     * <p>
     * Test method for {@link Class#isInterface() public native boolean java.lang.Class.isInterface()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#isInterface() public native boolean java.lang.Class.isInterface() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isInterface()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#isInstance(Object) public native boolean
     * java.lang.Class.isInstance(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link Class#isInstance(Object) public native boolean
     * java.lang.Class.isInstance(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#isInstance(Object) public native boolean java.lang.Class.isInstance(java.lang.Object) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isInstance_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#cast(Object) public T java.lang.Class.cast(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link Class#cast(Object) public java.lang.Object java.lang.Class.cast(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#cast(Object) public java.lang.Object java.lang.Class.cast(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_cast_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getDeclaredFields() public java.lang.reflect.Field[]
     * java.lang.Class.getDeclaredFields() throws java.lang.SecurityException}.
     *
     * <p>
     * Test method for {@link Class#getDeclaredFields() public java.lang.reflect.Field[]
     * java.lang.Class.getDeclaredFields() throws java.lang.SecurityException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getDeclaredFields() public java.lang.reflect.Field[] java.lang.Class.getDeclaredFields() throws
     *      java.lang.SecurityException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDeclaredFields()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#isMemberClass() public boolean java.lang.Class.isMemberClass()}.
     *
     * <p>
     * Test method for {@link Class#isMemberClass() public boolean java.lang.Class.isMemberClass()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#isMemberClass() public boolean java.lang.Class.isMemberClass() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isMemberClass()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getSigners() public native java.lang.Object[] java.lang.Class.getSigners()}.
     *
     * <p>
     * Test method for {@link Class#getSigners() public native java.lang.Object[] java.lang.Class.getSigners()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getSigners() public native java.lang.Object[] java.lang.Class.getSigners() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSigners()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getEnclosingMethod() public java.lang.reflect.Method
     * java.lang.Class.getEnclosingMethod() throws java.lang.SecurityException}.
     *
     * <p>
     * Test method for {@link Class#getEnclosingMethod() public java.lang.reflect.Method
     * java.lang.Class.getEnclosingMethod() throws java.lang.SecurityException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getEnclosingMethod() public java.lang.reflect.Method java.lang.Class.getEnclosingMethod() throws
     *      java.lang.SecurityException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEnclosingMethod()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getMethod(String, Class...) public java.lang.reflect.Method
     * java.lang.Class.getMethod(java.lang.String,java.lang.Class<?>...) throws
     * java.lang.NoSuchMethodException,java.lang.SecurityException}.
     *
     * <p>
     * Test method for {@link Class#getMethod(String, Class...) public java.lang.reflect.Method
     * java.lang.Class.getMethod(java.lang.String,java.lang.Class...) throws
     * java.lang.NoSuchMethodException,java.lang.SecurityException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getMethod(String, Class...) public java.lang.reflect.Method
     *      java.lang.Class.getMethod(java.lang.String,java.lang.Class[]) throws
     *      java.lang.NoSuchMethodException,java.lang.SecurityException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMethod_String_ClassArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getCanonicalName() public java.lang.String java.lang.Class.getCanonicalName()}.
     *
     * <p>
     * Test method for {@link Class#getCanonicalName() public java.lang.String java.lang.Class.getCanonicalName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getCanonicalName() public java.lang.String java.lang.Class.getCanonicalName() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCanonicalName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#isSynthetic() public boolean java.lang.Class.isSynthetic()}.
     *
     * <p>
     * Test method for {@link Class#isSynthetic() public boolean java.lang.Class.isSynthetic()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#isSynthetic() public boolean java.lang.Class.isSynthetic() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link Class#getResource(String) public java.net.URL
     * java.lang.Class.getResource(java.lang.String)}.
     *
     * <p>
     * Test method for {@link Class#getResource(String) public java.net.URL
     * java.lang.Class.getResource(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getResource(String) public java.net.URL java.lang.Class.getResource(java.lang.String) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getResource_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Class#getName() public java.lang.String java.lang.Class.getName()}.
     *
     * <p>
     * Test method for {@link Class#getName() public java.lang.String java.lang.Class.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#getName() public java.lang.String java.lang.Class.getName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link Class#isLocalClass() public boolean java.lang.Class.isLocalClass()}.
     *
     * <p>
     * Test method for {@link Class#isLocalClass() public boolean java.lang.Class.isLocalClass()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Class#isLocalClass() public boolean java.lang.Class.isLocalClass() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isLocalClass()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
