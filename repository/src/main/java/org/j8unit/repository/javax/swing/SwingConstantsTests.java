package org.j8unit.repository.javax.swing;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.SwingConstants interface javax.swing.SwingConstants}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SwingConstantsClassTests}.
 * </p>
 *
 * @see javax.swing.SwingConstants interface javax.swing.SwingConstants (the hereby targeted class-under-test class)
 * @see SwingConstantsClassTests SwingConstantsClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SwingConstantsTests<SUT extends javax.swing.SwingConstants>
extends RepositoryTests<SUT> {

}
