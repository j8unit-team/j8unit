package org.j8unit.repository.java.security.acl;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.acl.NotOwnerException class
 * java.security.acl.NotOwnerException}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.security.acl.NotOwnerExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.acl.NotOwnerExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.acl.NotOwnerException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NotOwnerExceptionTests<SUT extends java.security.acl.NotOwnerException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
