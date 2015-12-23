package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.MBeanRegistrationException class
 * javax.management.MBeanRegistrationException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.management.MBeanRegistrationExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.MBeanRegistrationExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.MBeanRegistrationException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MBeanRegistrationExceptionTests<SUT extends javax.management.MBeanRegistrationException>
extends org.j8unit.repository.javax.management.MBeanExceptionTests<SUT> {

}
