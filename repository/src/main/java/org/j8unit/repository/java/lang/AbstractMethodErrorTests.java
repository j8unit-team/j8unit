package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.AbstractMethodError class java.lang.AbstractMethodError},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.lang.AbstractMethodErrorTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.lang.AbstractMethodErrorClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.AbstractMethodError
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AbstractMethodErrorTests<SUT extends java.lang.AbstractMethodError>
extends org.j8unit.repository.java.lang.IncompatibleClassChangeErrorTests<SUT> {

}
