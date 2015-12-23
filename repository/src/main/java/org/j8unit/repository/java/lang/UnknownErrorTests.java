package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.UnknownError class java.lang.UnknownError}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.lang.UnknownErrorTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.lang.UnknownErrorClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.UnknownError
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnknownErrorTests<SUT extends java.lang.UnknownError>
extends org.j8unit.repository.java.lang.VirtualMachineErrorTests<SUT> {

}
