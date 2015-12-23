package org.j8unit.repository.javax.naming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.TimeLimitExceededException class
 * javax.naming.TimeLimitExceededException}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.naming.TimeLimitExceededExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.naming.TimeLimitExceededExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.TimeLimitExceededException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TimeLimitExceededExceptionTests<SUT extends javax.naming.TimeLimitExceededException>
extends org.j8unit.repository.javax.naming.LimitExceededExceptionTests<SUT> {

}
