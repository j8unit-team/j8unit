package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.concurrent.Executors class java.util.concurrent.Executors},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.concurrent.ExecutorsTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.concurrent.ExecutorsClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.concurrent.Executors
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ExecutorsTests<SUT extends java.util.concurrent.Executors>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
