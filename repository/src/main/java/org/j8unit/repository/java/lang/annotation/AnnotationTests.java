package org.j8unit.repository.java.lang.annotation;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.annotation.Annotation interface java.lang.annotation.Annotation}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link AnnotationClassTests}.
 * </p>
 *
 * @see java.lang.annotation.Annotation interface java.lang.annotation.Annotation (the hereby targeted class-under-test
 *      class)
 * @see AnnotationClassTests AnnotationClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AnnotationTests<SUT extends java.lang.annotation.Annotation>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.annotation.Annotation#annotationType() public abstract java.lang.Class<? extends
     * java.lang.annotation.Annotation> java.lang.annotation.Annotation.annotationType()}.
     *
     * <p>
     * Test method for {@link java.lang.annotation.Annotation#annotationType() public abstract java.lang.Class
     * java.lang.annotation.Annotation.annotationType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.annotation.Annotation#annotationType() public abstract java.lang.Class
     *      java.lang.annotation.Annotation.annotationType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_annotationType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.annotation.Annotation#toString() public abstract java.lang.String
     * java.lang.annotation.Annotation.toString()}.
     *
     * <p>
     * Test method for {@link java.lang.annotation.Annotation#toString() public abstract java.lang.String
     * java.lang.annotation.Annotation.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.annotation.Annotation#toString() public abstract java.lang.String
     *      java.lang.annotation.Annotation.toString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.lang.annotation.Annotation#hashCode() public abstract int
     * java.lang.annotation.Annotation.hashCode()}.
     *
     * <p>
     * Test method for {@link java.lang.annotation.Annotation#hashCode() public abstract int
     * java.lang.annotation.Annotation.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.annotation.Annotation#hashCode() public abstract int java.lang.annotation.Annotation.hashCode()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.lang.annotation.Annotation#equals(Object) public abstract boolean
     * java.lang.annotation.Annotation.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.lang.annotation.Annotation#equals(Object) public abstract boolean
     * java.lang.annotation.Annotation.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.annotation.Annotation#equals(Object) public abstract boolean
     *      java.lang.annotation.Annotation.equals(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
