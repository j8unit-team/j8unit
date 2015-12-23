package org.j8unit.repository.java.util;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.EventListener interface java.util.EventListener}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.EventListenerTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.EventListenerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.EventListener
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EventListenerTests<SUT extends java.util.EventListener>
extends RepositoryTests<SUT> {

}
