package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.IllegalArgumentException class
 * java.lang.IllegalArgumentException}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.lang.IllegalArgumentExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.lang.IllegalArgumentExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.IllegalArgumentException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IllegalArgumentExceptionTests<SUT extends java.lang.IllegalArgumentException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
