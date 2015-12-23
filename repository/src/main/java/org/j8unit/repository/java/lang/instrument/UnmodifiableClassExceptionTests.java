package org.j8unit.repository.java.lang.instrument;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.instrument.UnmodifiableClassException class
 * java.lang.instrument.UnmodifiableClassException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.lang.instrument.UnmodifiableClassExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.lang.instrument.UnmodifiableClassExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.instrument.UnmodifiableClassException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnmodifiableClassExceptionTests<SUT extends java.lang.instrument.UnmodifiableClassException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
