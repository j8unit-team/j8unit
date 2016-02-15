package org.j8unit.repository.java.lang.reflect;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.reflect.AccessibleObject class
 * java.lang.reflect.AccessibleObject}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link AccessibleObjectClassTests}.
 * </p>
 *
 * @see java.lang.reflect.AccessibleObject class java.lang.reflect.AccessibleObject (the hereby targeted
 *      class-under-test class)
 * @see AccessibleObjectClassTests AccessibleObjectClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AccessibleObjectTests<SUT extends java.lang.reflect.AccessibleObject>
extends AnnotatedElementTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.reflect.AccessibleObject#isAccessible() public boolean
     * java.lang.reflect.AccessibleObject.isAccessible()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.AccessibleObject#isAccessible() public boolean
     * java.lang.reflect.AccessibleObject.isAccessible()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.AccessibleObject#isAccessible() public boolean
     *      java.lang.reflect.AccessibleObject.isAccessible() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isAccessible()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.AccessibleObject#getAnnotation(Class) public <T> T
     * java.lang.reflect.AccessibleObject.getAnnotation(java.lang.Class<T>)}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.AccessibleObject#getAnnotation(Class) public
     * java.lang.annotation.Annotation java.lang.reflect.AccessibleObject.getAnnotation(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.AccessibleObject#getAnnotation(Class) public java.lang.annotation.Annotation
     *      java.lang.reflect.AccessibleObject.getAnnotation(java.lang.Class) (the hereby targeted method-under-test)
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
     * Test method for {@link java.lang.reflect.AccessibleObject#getDeclaredAnnotationsByType(Class) public <T> T[]
     * java.lang.reflect.AccessibleObject.getDeclaredAnnotationsByType(java.lang.Class<T>)}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.AccessibleObject#getDeclaredAnnotationsByType(Class) public
     * java.lang.annotation.Annotation[]
     * java.lang.reflect.AccessibleObject.getDeclaredAnnotationsByType(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.AccessibleObject#getDeclaredAnnotationsByType(Class) public
     *      java.lang.annotation.Annotation[]
     *      java.lang.reflect.AccessibleObject.getDeclaredAnnotationsByType(java.lang.Class) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.lang.reflect.AccessibleObject#isAnnotationPresent(Class) public boolean
     * java.lang.reflect.AccessibleObject.isAnnotationPresent(java.lang.Class<? extends
     * java.lang.annotation.Annotation>)}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.AccessibleObject#isAnnotationPresent(Class) public boolean
     * java.lang.reflect.AccessibleObject.isAnnotationPresent(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.AccessibleObject#isAnnotationPresent(Class) public boolean
     *      java.lang.reflect.AccessibleObject.isAnnotationPresent(java.lang.Class) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.lang.reflect.AccessibleObject#getAnnotationsByType(Class) public <T> T[]
     * java.lang.reflect.AccessibleObject.getAnnotationsByType(java.lang.Class<T>)}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.AccessibleObject#getAnnotationsByType(Class) public
     * java.lang.annotation.Annotation[] java.lang.reflect.AccessibleObject.getAnnotationsByType(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.AccessibleObject#getAnnotationsByType(Class) public java.lang.annotation.Annotation[]
     *      java.lang.reflect.AccessibleObject.getAnnotationsByType(java.lang.Class) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.lang.reflect.AccessibleObject#setAccessible(boolean) public void
     * java.lang.reflect.AccessibleObject.setAccessible(boolean) throws java.lang.SecurityException}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.AccessibleObject#setAccessible(boolean) public void
     * java.lang.reflect.AccessibleObject.setAccessible(boolean) throws java.lang.SecurityException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.AccessibleObject#setAccessible(boolean) public void
     *      java.lang.reflect.AccessibleObject.setAccessible(boolean) throws java.lang.SecurityException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAccessible_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.AccessibleObject#getDeclaredAnnotation(Class) public <T> T
     * java.lang.reflect.AccessibleObject.getDeclaredAnnotation(java.lang.Class<T>)}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.AccessibleObject#getDeclaredAnnotation(Class) public
     * java.lang.annotation.Annotation java.lang.reflect.AccessibleObject.getDeclaredAnnotation(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.AccessibleObject#getDeclaredAnnotation(Class) public java.lang.annotation.Annotation
     *      java.lang.reflect.AccessibleObject.getDeclaredAnnotation(java.lang.Class) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.lang.reflect.AccessibleObject#getDeclaredAnnotations() public
     * java.lang.annotation.Annotation[] java.lang.reflect.AccessibleObject.getDeclaredAnnotations()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.AccessibleObject#getDeclaredAnnotations() public
     * java.lang.annotation.Annotation[] java.lang.reflect.AccessibleObject.getDeclaredAnnotations()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.AccessibleObject#getDeclaredAnnotations() public java.lang.annotation.Annotation[]
     *      java.lang.reflect.AccessibleObject.getDeclaredAnnotations() (the hereby targeted method-under-test)
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
     * Test method for {@link java.lang.reflect.AccessibleObject#getAnnotations() public
     * java.lang.annotation.Annotation[] java.lang.reflect.AccessibleObject.getAnnotations()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.AccessibleObject#getAnnotations() public
     * java.lang.annotation.Annotation[] java.lang.reflect.AccessibleObject.getAnnotations()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.AccessibleObject#getAnnotations() public java.lang.annotation.Annotation[]
     *      java.lang.reflect.AccessibleObject.getAnnotations() (the hereby targeted method-under-test)
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

}
