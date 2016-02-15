package org.j8unit.repository.java.lang.reflect;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.reflect.Executable class java.lang.reflect.Executable}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ExecutableClassTests}.
 * </p>
 *
 * @see java.lang.reflect.Executable class java.lang.reflect.Executable (the hereby targeted class-under-test class)
 * @see ExecutableClassTests ExecutableClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ExecutableTests<SUT extends java.lang.reflect.Executable>
extends MemberTests<SUT>, GenericDeclarationTests<SUT>, AccessibleObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getParameters() public java.lang.reflect.Parameter[]
     * java.lang.reflect.Executable.getParameters()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getParameters() public java.lang.reflect.Parameter[]
     * java.lang.reflect.Executable.getParameters()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Executable#getParameters() public java.lang.reflect.Parameter[]
     *      java.lang.reflect.Executable.getParameters() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getModifiers() public abstract int
     * java.lang.reflect.Executable.getModifiers()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getModifiers() public abstract int
     * java.lang.reflect.Executable.getModifiers()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Executable#getModifiers() public abstract int java.lang.reflect.Executable.getModifiers()
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.lang.reflect.Executable#getTypeParameters() public abstract
     * java.lang.reflect.TypeVariable<?>[] java.lang.reflect.Executable.getTypeParameters()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getTypeParameters() public abstract
     * java.lang.reflect.TypeVariable[] java.lang.reflect.Executable.getTypeParameters()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Executable#getTypeParameters() public abstract java.lang.reflect.TypeVariable[]
     *      java.lang.reflect.Executable.getTypeParameters() (the hereby targeted method-under-test)
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
     * Test method for {@link java.lang.reflect.Executable#getParameterAnnotations() public abstract
     * java.lang.annotation.Annotation[][] java.lang.reflect.Executable.getParameterAnnotations()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getParameterAnnotations() public abstract
     * java.lang.annotation.Annotation[][] java.lang.reflect.Executable.getParameterAnnotations()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Executable#getParameterAnnotations() public abstract java.lang.annotation.Annotation[][]
     *      java.lang.reflect.Executable.getParameterAnnotations() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParameterAnnotations()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getAnnotatedReturnType() public abstract
     * java.lang.reflect.AnnotatedType java.lang.reflect.Executable.getAnnotatedReturnType()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getAnnotatedReturnType() public abstract
     * java.lang.reflect.AnnotatedType java.lang.reflect.Executable.getAnnotatedReturnType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Executable#getAnnotatedReturnType() public abstract java.lang.reflect.AnnotatedType
     *      java.lang.reflect.Executable.getAnnotatedReturnType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAnnotatedReturnType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getDeclaringClass() public abstract java.lang.Class
     * <?> java.lang.reflect.Executable.getDeclaringClass()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getDeclaringClass() public abstract java.lang.Class
     * java.lang.reflect.Executable.getDeclaringClass()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Executable#getDeclaringClass() public abstract java.lang.Class
     *      java.lang.reflect.Executable.getDeclaringClass() (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getExceptionTypes() public abstract java.lang.Class<?>[]
     * java.lang.reflect.Executable.getExceptionTypes()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getExceptionTypes() public abstract java.lang.Class[]
     * java.lang.reflect.Executable.getExceptionTypes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Executable#getExceptionTypes() public abstract java.lang.Class[]
     *      java.lang.reflect.Executable.getExceptionTypes() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getExceptionTypes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getAnnotatedExceptionTypes() public
     * java.lang.reflect.AnnotatedType[] java.lang.reflect.Executable.getAnnotatedExceptionTypes()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getAnnotatedExceptionTypes() public
     * java.lang.reflect.AnnotatedType[] java.lang.reflect.Executable.getAnnotatedExceptionTypes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Executable#getAnnotatedExceptionTypes() public java.lang.reflect.AnnotatedType[]
     *      java.lang.reflect.Executable.getAnnotatedExceptionTypes() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAnnotatedExceptionTypes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getGenericParameterTypes() public java.lang.reflect.Type[]
     * java.lang.reflect.Executable.getGenericParameterTypes()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getGenericParameterTypes() public java.lang.reflect.Type[]
     * java.lang.reflect.Executable.getGenericParameterTypes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Executable#getGenericParameterTypes() public java.lang.reflect.Type[]
     *      java.lang.reflect.Executable.getGenericParameterTypes() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getGenericParameterTypes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getAnnotation(Class) public <T> T
     * java.lang.reflect.Executable.getAnnotation(java.lang.Class<T>)}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getAnnotation(Class) public java.lang.annotation.Annotation
     * java.lang.reflect.Executable.getAnnotation(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Executable#getAnnotation(Class) public java.lang.annotation.Annotation
     *      java.lang.reflect.Executable.getAnnotation(java.lang.Class) (the hereby targeted method-under-test)
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
     * Test method for {@link java.lang.reflect.Executable#getAnnotationsByType(Class) public <T> T[]
     * java.lang.reflect.Executable.getAnnotationsByType(java.lang.Class<T>)}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getAnnotationsByType(Class) public
     * java.lang.annotation.Annotation[] java.lang.reflect.Executable.getAnnotationsByType(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Executable#getAnnotationsByType(Class) public java.lang.annotation.Annotation[]
     *      java.lang.reflect.Executable.getAnnotationsByType(java.lang.Class) (the hereby targeted method-under-test)
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
     * Test method for {@link java.lang.reflect.Executable#toGenericString() public abstract java.lang.String
     * java.lang.reflect.Executable.toGenericString()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Executable#toGenericString() public abstract java.lang.String
     * java.lang.reflect.Executable.toGenericString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Executable#toGenericString() public abstract java.lang.String
     *      java.lang.reflect.Executable.toGenericString() (the hereby targeted method-under-test)
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
     * Test method for {@link java.lang.reflect.Executable#isSynthetic() public boolean
     * java.lang.reflect.Executable.isSynthetic()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Executable#isSynthetic() public boolean
     * java.lang.reflect.Executable.isSynthetic()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Executable#isSynthetic() public boolean java.lang.reflect.Executable.isSynthetic() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.lang.reflect.Executable#getParameterTypes() public abstract java.lang.Class<?>[]
     * java.lang.reflect.Executable.getParameterTypes()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getParameterTypes() public abstract java.lang.Class[]
     * java.lang.reflect.Executable.getParameterTypes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Executable#getParameterTypes() public abstract java.lang.Class[]
     *      java.lang.reflect.Executable.getParameterTypes() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParameterTypes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getAnnotatedParameterTypes() public
     * java.lang.reflect.AnnotatedType[] java.lang.reflect.Executable.getAnnotatedParameterTypes()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getAnnotatedParameterTypes() public
     * java.lang.reflect.AnnotatedType[] java.lang.reflect.Executable.getAnnotatedParameterTypes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Executable#getAnnotatedParameterTypes() public java.lang.reflect.AnnotatedType[]
     *      java.lang.reflect.Executable.getAnnotatedParameterTypes() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAnnotatedParameterTypes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getGenericExceptionTypes() public java.lang.reflect.Type[]
     * java.lang.reflect.Executable.getGenericExceptionTypes()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getGenericExceptionTypes() public java.lang.reflect.Type[]
     * java.lang.reflect.Executable.getGenericExceptionTypes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Executable#getGenericExceptionTypes() public java.lang.reflect.Type[]
     *      java.lang.reflect.Executable.getGenericExceptionTypes() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getGenericExceptionTypes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getDeclaredAnnotations() public
     * java.lang.annotation.Annotation[] java.lang.reflect.Executable.getDeclaredAnnotations()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getDeclaredAnnotations() public
     * java.lang.annotation.Annotation[] java.lang.reflect.Executable.getDeclaredAnnotations()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Executable#getDeclaredAnnotations() public java.lang.annotation.Annotation[]
     *      java.lang.reflect.Executable.getDeclaredAnnotations() (the hereby targeted method-under-test)
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
     * Test method for {@link java.lang.reflect.Executable#getAnnotatedReceiverType() public
     * java.lang.reflect.AnnotatedType java.lang.reflect.Executable.getAnnotatedReceiverType()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getAnnotatedReceiverType() public
     * java.lang.reflect.AnnotatedType java.lang.reflect.Executable.getAnnotatedReceiverType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Executable#getAnnotatedReceiverType() public java.lang.reflect.AnnotatedType
     *      java.lang.reflect.Executable.getAnnotatedReceiverType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAnnotatedReceiverType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getName() public abstract java.lang.String
     * java.lang.reflect.Executable.getName()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getName() public abstract java.lang.String
     * java.lang.reflect.Executable.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Executable#getName() public abstract java.lang.String
     *      java.lang.reflect.Executable.getName() (the hereby targeted method-under-test)
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
     * Test method for {@link java.lang.reflect.Executable#getParameterCount() public int
     * java.lang.reflect.Executable.getParameterCount()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Executable#getParameterCount() public int
     * java.lang.reflect.Executable.getParameterCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Executable#getParameterCount() public int java.lang.reflect.Executable.getParameterCount()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParameterCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.Executable#isVarArgs() public boolean
     * java.lang.reflect.Executable.isVarArgs()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.Executable#isVarArgs() public boolean
     * java.lang.reflect.Executable.isVarArgs()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.Executable#isVarArgs() public boolean java.lang.reflect.Executable.isVarArgs() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isVarArgs()
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
     * <li>{@linkplain java.lang.reflect.AccessibleObject#getDeclaredAnnotationsByType(Class) class
     * java.lang.reflect.AccessibleObject}</li>
     * <li>{@linkplain java.lang.reflect.AnnotatedElement#getDeclaredAnnotationsByType(Class) interface
     * java.lang.reflect.AnnotatedElement}</li>
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
    public default void test_getDeclaredAnnotationsByType_Class()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.lang.reflect.AccessibleObject#isAnnotationPresent(Class) class
     * java.lang.reflect.AccessibleObject}</li>
     * <li>{@linkplain java.lang.reflect.AnnotatedElement#isAnnotationPresent(Class) interface
     * java.lang.reflect.AnnotatedElement}</li>
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
    public default void test_isAnnotationPresent_Class()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.lang.reflect.AccessibleObject#getDeclaredAnnotation(Class) class
     * java.lang.reflect.AccessibleObject}</li>
     * <li>{@linkplain java.lang.reflect.AnnotatedElement#getDeclaredAnnotation(Class) interface
     * java.lang.reflect.AnnotatedElement}</li>
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
    public default void test_getDeclaredAnnotation_Class()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.lang.reflect.AccessibleObject#getAnnotations() class java.lang.reflect.AccessibleObject}
     * </li>
     * <li>{@linkplain java.lang.reflect.AnnotatedElement#getAnnotations() interface java.lang.reflect.AnnotatedElement}
     * </li>
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
    public default void test_getAnnotations()
    throws Exception {
    }

}
