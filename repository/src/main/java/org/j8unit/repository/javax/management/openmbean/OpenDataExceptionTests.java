package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.openmbean.OpenDataException class
 * javax.management.openmbean.OpenDataException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.management.openmbean.OpenDataExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.openmbean.OpenDataExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.openmbean.OpenDataException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface OpenDataExceptionTests<SUT extends javax.management.openmbean.OpenDataException>
extends org.j8unit.repository.javax.management.JMExceptionTests<SUT> {

}
