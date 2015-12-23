package org.j8unit.repository.java.awt;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.AWTError class java.awt.AWTError}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test
 * interface containing the class relevant test methods is {@link org.j8unit.repository.java.awt.AWTErrorTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.awt.AWTErrorClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.AWTError
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AWTErrorTests<SUT extends java.awt.AWTError>
extends org.j8unit.repository.java.lang.ErrorTests<SUT> {

}
