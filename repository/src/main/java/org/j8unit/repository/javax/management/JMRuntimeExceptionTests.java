package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.JMRuntimeException class
 * javax.management.JMRuntimeException}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.management.JMRuntimeExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.JMRuntimeExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.JMRuntimeException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JMRuntimeExceptionTests<SUT extends javax.management.JMRuntimeException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
