package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.IndexOutOfBoundsException class
 * java.lang.IndexOutOfBoundsException}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.lang.IndexOutOfBoundsExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.lang.IndexOutOfBoundsExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.IndexOutOfBoundsException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IndexOutOfBoundsExceptionTests<SUT extends java.lang.IndexOutOfBoundsException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
