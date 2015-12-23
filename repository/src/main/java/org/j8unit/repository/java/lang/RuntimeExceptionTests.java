package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.RuntimeException class java.lang.RuntimeException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.lang.RuntimeExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.lang.RuntimeExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.RuntimeException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RuntimeExceptionTests<SUT extends java.lang.RuntimeException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
