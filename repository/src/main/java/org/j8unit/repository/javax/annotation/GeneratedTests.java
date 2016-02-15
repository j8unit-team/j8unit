package org.j8unit.repository.javax.annotation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.annotation.Generated interface javax.annotation.Generated}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link GeneratedClassTests}.
 * </p>
 *
 * @see javax.annotation.Generated interface javax.annotation.Generated (the hereby targeted class-under-test class)
 * @see GeneratedClassTests GeneratedClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface GeneratedTests<SUT extends javax.annotation.Generated>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.annotation.Generated#comments() public abstract java.lang.String
     * javax.annotation.Generated.comments()}.
     *
     * <p>
     * Test method for {@link javax.annotation.Generated#comments() public abstract java.lang.String
     * javax.annotation.Generated.comments()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.Generated#comments() public abstract java.lang.String javax.annotation.Generated.comments()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_comments()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.annotation.Generated#date() public abstract java.lang.String
     * javax.annotation.Generated.date()}.
     *
     * <p>
     * Test method for {@link javax.annotation.Generated#date() public abstract java.lang.String
     * javax.annotation.Generated.date()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.Generated#date() public abstract java.lang.String javax.annotation.Generated.date() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_date()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.annotation.Generated#value() public abstract java.lang.String[]
     * javax.annotation.Generated.value()}.
     *
     * <p>
     * Test method for {@link javax.annotation.Generated#value() public abstract java.lang.String[]
     * javax.annotation.Generated.value()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.Generated#value() public abstract java.lang.String[] javax.annotation.Generated.value()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_value()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
