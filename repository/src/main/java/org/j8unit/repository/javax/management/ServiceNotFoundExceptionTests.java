package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.ServiceNotFoundException class
 * javax.management.ServiceNotFoundException}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.management.ServiceNotFoundExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.ServiceNotFoundExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.ServiceNotFoundException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServiceNotFoundExceptionTests<SUT extends javax.management.ServiceNotFoundException>
extends org.j8unit.repository.javax.management.OperationsExceptionTests<SUT> {

}
