package org.j8unit.repository.javax.activation;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.activation.MimeTypeParseException class
 * javax.activation.MimeTypeParseException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link MimeTypeParseExceptionClassTests}.
 * </p>
 *
 * @see javax.activation.MimeTypeParseException class javax.activation.MimeTypeParseException (the hereby targeted
 *      class-under-test class)
 * @see MimeTypeParseExceptionClassTests MimeTypeParseExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MimeTypeParseExceptionTests<SUT extends javax.activation.MimeTypeParseException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
