package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.IllegalAccessException class
 * java.lang.IllegalAccessException}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.lang.IllegalAccessExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.lang.IllegalAccessExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.IllegalAccessException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IllegalAccessExceptionTests<SUT extends java.lang.IllegalAccessException>
extends org.j8unit.repository.java.lang.ReflectiveOperationExceptionTests<SUT> {

}
