package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.annotation.processing.SupportedAnnotationTypes interface
 * javax.annotation.processing.SupportedAnnotationTypes}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.annotation.processing.SupportedAnnotationTypesTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.annotation.processing.SupportedAnnotationTypesClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.annotation.processing.SupportedAnnotationTypes
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SupportedAnnotationTypesTests<SUT extends javax.annotation.processing.SupportedAnnotationTypes>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.annotation.processing.SupportedAnnotationTypes#value() public abstract
     * java.lang.String[] javax.annotation.processing.SupportedAnnotationTypes.value()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.annotation.processing.SupportedAnnotationTypes#value()
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
