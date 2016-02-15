package org.j8unit.repository.javax.lang.model;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.lang.model.AnnotatedConstruct interface
 * javax.lang.model.AnnotatedConstruct}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link AnnotatedConstructClassTests}.
 * </p>
 *
 * @see javax.lang.model.AnnotatedConstruct interface javax.lang.model.AnnotatedConstruct (the hereby targeted
 *      class-under-test class)
 * @see AnnotatedConstructClassTests AnnotatedConstructClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AnnotatedConstructTests<SUT extends javax.lang.model.AnnotatedConstruct>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.AnnotatedConstruct#getAnnotationsByType(Class) public abstract <A> A[]
     * javax.lang.model.AnnotatedConstruct.getAnnotationsByType(java.lang.Class<A>)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.AnnotatedConstruct#getAnnotationsByType(Class) public abstract
     * java.lang.annotation.Annotation[] javax.lang.model.AnnotatedConstruct.getAnnotationsByType(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.AnnotatedConstruct#getAnnotationsByType(Class) public abstract
     *      java.lang.annotation.Annotation[] javax.lang.model.AnnotatedConstruct.getAnnotationsByType(java.lang.Class)
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

    /**
     * <p>
     * Test method for {@link javax.lang.model.AnnotatedConstruct#getAnnotation(Class) public abstract <A> A
     * javax.lang.model.AnnotatedConstruct.getAnnotation(java.lang.Class<A>)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.AnnotatedConstruct#getAnnotation(Class) public abstract
     * java.lang.annotation.Annotation javax.lang.model.AnnotatedConstruct.getAnnotation(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.AnnotatedConstruct#getAnnotation(Class) public abstract java.lang.annotation.Annotation
     *      javax.lang.model.AnnotatedConstruct.getAnnotation(java.lang.Class) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.lang.model.AnnotatedConstruct#getAnnotationMirrors() public abstract
     * java.util.List<? extends javax.lang.model.element.AnnotationMirror>
     * javax.lang.model.AnnotatedConstruct.getAnnotationMirrors()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.AnnotatedConstruct#getAnnotationMirrors() public abstract java.util.List
     * javax.lang.model.AnnotatedConstruct.getAnnotationMirrors()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.AnnotatedConstruct#getAnnotationMirrors() public abstract java.util.List
     *      javax.lang.model.AnnotatedConstruct.getAnnotationMirrors() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAnnotationMirrors()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
