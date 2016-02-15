package org.j8unit.repository.javax.xml.bind;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.ValidationException class
 * javax.xml.bind.ValidationException}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link ValidationExceptionClassTests}.
 * </p>
 *
 * @see javax.xml.bind.ValidationException class javax.xml.bind.ValidationException (the hereby targeted
 *      class-under-test class)
 * @see ValidationExceptionClassTests ValidationExceptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ValidationExceptionTests<SUT extends javax.xml.bind.ValidationException>
extends JAXBExceptionTests<SUT> {

}
