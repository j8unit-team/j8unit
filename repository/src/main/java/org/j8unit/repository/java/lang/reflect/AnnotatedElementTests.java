package org.j8unit.repository.java.lang.reflect;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.reflect.AnnotatedElement interface
 * java.lang.reflect.AnnotatedElement}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link AnnotatedElementClassTests}.
 * </p>
 *
 * @see java.lang.reflect.AnnotatedElement interface java.lang.reflect.AnnotatedElement (the hereby targeted
 *      class-under-test class)
 * @see AnnotatedElementClassTests AnnotatedElementClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AnnotatedElementTests<SUT extends java.lang.reflect.AnnotatedElement>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.reflect.AnnotatedElement#getDeclaredAnnotations() public abstract
     * java.lang.annotation.Annotation[] java.lang.reflect.AnnotatedElement.getDeclaredAnnotations()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.AnnotatedElement#getDeclaredAnnotations() public abstract
     * java.lang.annotation.Annotation[] java.lang.reflect.AnnotatedElement.getDeclaredAnnotations()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.AnnotatedElement#getDeclaredAnnotations() public abstract
     *      java.lang.annotation.Annotation[] java.lang.reflect.AnnotatedElement.getDeclaredAnnotations() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.lang.reflect.AnnotatedElement#getAnnotations() public abstract
     * java.lang.annotation.Annotation[] java.lang.reflect.AnnotatedElement.getAnnotations()}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.AnnotatedElement#getAnnotations() public abstract
     * java.lang.annotation.Annotation[] java.lang.reflect.AnnotatedElement.getAnnotations()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.AnnotatedElement#getAnnotations() public abstract java.lang.annotation.Annotation[]
     *      java.lang.reflect.AnnotatedElement.getAnnotations() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.lang.reflect.AnnotatedElement#getDeclaredAnnotation(Class) public default <T> T
     * java.lang.reflect.AnnotatedElement.getDeclaredAnnotation(java.lang.Class<T>)}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.AnnotatedElement#getDeclaredAnnotation(Class) public default
     * java.lang.annotation.Annotation java.lang.reflect.AnnotatedElement.getDeclaredAnnotation(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.AnnotatedElement#getDeclaredAnnotation(Class) public default
     *      java.lang.annotation.Annotation java.lang.reflect.AnnotatedElement.getDeclaredAnnotation(java.lang.Class)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.lang.reflect.AnnotatedElement#getAnnotation(Class) public abstract <T> T
     * java.lang.reflect.AnnotatedElement.getAnnotation(java.lang.Class<T>)}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.AnnotatedElement#getAnnotation(Class) public abstract
     * java.lang.annotation.Annotation java.lang.reflect.AnnotatedElement.getAnnotation(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.AnnotatedElement#getAnnotation(Class) public abstract java.lang.annotation.Annotation
     *      java.lang.reflect.AnnotatedElement.getAnnotation(java.lang.Class) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.lang.reflect.AnnotatedElement#getDeclaredAnnotationsByType(Class) public default
     * <T> T[] java.lang.reflect.AnnotatedElement.getDeclaredAnnotationsByType(java.lang.Class<T>)}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.AnnotatedElement#getDeclaredAnnotationsByType(Class) public default
     * java.lang.annotation.Annotation[]
     * java.lang.reflect.AnnotatedElement.getDeclaredAnnotationsByType(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.AnnotatedElement#getDeclaredAnnotationsByType(Class) public default
     *      java.lang.annotation.Annotation[]
     *      java.lang.reflect.AnnotatedElement.getDeclaredAnnotationsByType(java.lang.Class) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.lang.reflect.AnnotatedElement#isAnnotationPresent(Class) public default boolean
     * java.lang.reflect.AnnotatedElement.isAnnotationPresent(java.lang.Class<? extends
     * java.lang.annotation.Annotation>)}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.AnnotatedElement#isAnnotationPresent(Class) public default boolean
     * java.lang.reflect.AnnotatedElement.isAnnotationPresent(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.AnnotatedElement#isAnnotationPresent(Class) public default boolean
     *      java.lang.reflect.AnnotatedElement.isAnnotationPresent(java.lang.Class) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.lang.reflect.AnnotatedElement#getAnnotationsByType(Class) public default <T> T[]
     * java.lang.reflect.AnnotatedElement.getAnnotationsByType(java.lang.Class<T>)}.
     *
     * <p>
     * Test method for {@link java.lang.reflect.AnnotatedElement#getAnnotationsByType(Class) public default
     * java.lang.annotation.Annotation[] java.lang.reflect.AnnotatedElement.getAnnotationsByType(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.reflect.AnnotatedElement#getAnnotationsByType(Class) public default
     *      java.lang.annotation.Annotation[] java.lang.reflect.AnnotatedElement.getAnnotationsByType(java.lang.Class)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAnnotationsByType_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
