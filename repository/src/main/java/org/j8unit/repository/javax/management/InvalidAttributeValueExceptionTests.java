package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.InvalidAttributeValueException class
 * javax.management.InvalidAttributeValueException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.management.InvalidAttributeValueExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.InvalidAttributeValueExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.InvalidAttributeValueException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidAttributeValueExceptionTests<SUT extends javax.management.InvalidAttributeValueException>
extends org.j8unit.repository.javax.management.OperationsExceptionTests<SUT> {

}
