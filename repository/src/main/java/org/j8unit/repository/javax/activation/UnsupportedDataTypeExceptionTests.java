package org.j8unit.repository.javax.activation;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.activation.UnsupportedDataTypeException class
 * javax.activation.UnsupportedDataTypeException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link UnsupportedDataTypeExceptionClassTests}.
 * </p>
 *
 * @see javax.activation.UnsupportedDataTypeException class javax.activation.UnsupportedDataTypeException (the hereby
 *      targeted class-under-test class)
 * @see UnsupportedDataTypeExceptionClassTests UnsupportedDataTypeExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnsupportedDataTypeExceptionTests<SUT extends javax.activation.UnsupportedDataTypeException>
extends org.j8unit.repository.java.io.IOExceptionTests<SUT> {

}
