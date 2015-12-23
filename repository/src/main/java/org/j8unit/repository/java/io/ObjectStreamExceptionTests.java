package org.j8unit.repository.java.io;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.io.ObjectStreamException class java.io.ObjectStreamException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.io.ObjectStreamExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.io.ObjectStreamExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.io.ObjectStreamException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ObjectStreamExceptionTests<SUT extends java.io.ObjectStreamException>
extends org.j8unit.repository.java.io.IOExceptionTests<SUT> {

}
