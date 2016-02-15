package org.j8unit.repository.java.lang.annotation;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.annotation.AnnotationFormatError class
 * java.lang.annotation.AnnotationFormatError}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link AnnotationFormatErrorClassTests}.
 * </p>
 *
 * @see java.lang.annotation.AnnotationFormatError class java.lang.annotation.AnnotationFormatError (the hereby targeted
 *      class-under-test class)
 * @see AnnotationFormatErrorClassTests AnnotationFormatErrorClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AnnotationFormatErrorTests<SUT extends java.lang.annotation.AnnotationFormatError>
extends org.j8unit.repository.java.lang.ErrorTests<SUT> {

}
