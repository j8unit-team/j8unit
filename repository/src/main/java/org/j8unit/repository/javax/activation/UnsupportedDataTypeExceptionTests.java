package org.j8unit.repository.javax.activation;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.activation.UnsupportedDataTypeException class
 * javax.activation.UnsupportedDataTypeException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.activation.UnsupportedDataTypeExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.activation.UnsupportedDataTypeExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.activation.UnsupportedDataTypeException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnsupportedDataTypeExceptionTests<SUT extends javax.activation.UnsupportedDataTypeException>
extends org.j8unit.repository.java.io.IOExceptionTests<SUT> {

}
