package org.j8unit.repository.java.lang.instrument;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.instrument.IllegalClassFormatException class
 * java.lang.instrument.IllegalClassFormatException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.lang.instrument.IllegalClassFormatExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.lang.instrument.IllegalClassFormatExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.instrument.IllegalClassFormatException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IllegalClassFormatExceptionTests<SUT extends java.lang.instrument.IllegalClassFormatException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
