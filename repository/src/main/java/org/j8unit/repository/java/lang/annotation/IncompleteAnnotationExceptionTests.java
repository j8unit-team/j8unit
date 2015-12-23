package org.j8unit.repository.java.lang.annotation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.annotation.IncompleteAnnotationException class
 * java.lang.annotation.IncompleteAnnotationException}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.lang.annotation.IncompleteAnnotationExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.lang.annotation.IncompleteAnnotationExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.annotation.IncompleteAnnotationException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IncompleteAnnotationExceptionTests<SUT extends java.lang.annotation.IncompleteAnnotationException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.annotation.IncompleteAnnotationException#annotationType() public java.lang.Class
     * java.lang.annotation.IncompleteAnnotationException.annotationType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.annotation.IncompleteAnnotationException#annotationType()
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
     * Test method for {@link java.lang.annotation.IncompleteAnnotationException#elementName() public java.lang.String
     * java.lang.annotation.IncompleteAnnotationException.elementName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.annotation.IncompleteAnnotationException#elementName()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_elementName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
