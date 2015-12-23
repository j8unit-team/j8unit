package org.j8unit.repository.javax.naming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.SizeLimitExceededException class
 * javax.naming.SizeLimitExceededException}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.naming.SizeLimitExceededExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.naming.SizeLimitExceededExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.SizeLimitExceededException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SizeLimitExceededExceptionTests<SUT extends javax.naming.SizeLimitExceededException>
extends org.j8unit.repository.javax.naming.LimitExceededExceptionTests<SUT> {

}
