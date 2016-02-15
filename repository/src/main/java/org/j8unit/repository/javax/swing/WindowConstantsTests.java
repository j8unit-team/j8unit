package org.j8unit.repository.javax.swing;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.WindowConstants interface javax.swing.WindowConstants}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link WindowConstantsClassTests}.
 * </p>
 *
 * @see javax.swing.WindowConstants interface javax.swing.WindowConstants (the hereby targeted class-under-test class)
 * @see WindowConstantsClassTests WindowConstantsClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WindowConstantsTests<SUT extends javax.swing.WindowConstants>
extends RepositoryTests<SUT> {

}
