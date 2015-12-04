package org.j8unit.repository.java.lang.annotation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.annotation.AnnotationTypeMismatchException class
 * java.lang.annotation.AnnotationTypeMismatchException}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.annotation.AnnotationTypeMismatchExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AnnotationTypeMismatchExceptionTests<SUT extends java.lang.annotation.AnnotationTypeMismatchException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.annotation.AnnotationTypeMismatchException#foundType() public java.lang.String
     * java.lang.annotation.AnnotationTypeMismatchException.foundType()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_foundType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.annotation.AnnotationTypeMismatchException#element() public
     * java.lang.reflect.Method java.lang.annotation.AnnotationTypeMismatchException.element()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_element()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
