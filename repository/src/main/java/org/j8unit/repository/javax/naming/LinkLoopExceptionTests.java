package org.j8unit.repository.javax.naming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.LinkLoopException class javax.naming.LinkLoopException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.naming.LinkLoopExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.naming.LinkLoopExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.LinkLoopException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LinkLoopExceptionTests<SUT extends javax.naming.LinkLoopException>
extends org.j8unit.repository.javax.naming.LinkExceptionTests<SUT> {

}
