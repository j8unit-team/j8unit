package org.j8unit.repository.javax.swing;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.ScrollPaneConstants interface javax.swing.ScrollPaneConstants}
 * . The complementary j8unit test interface containing the class relevant aspects is
 * {@link ScrollPaneConstantsClassTests}.
 * </p>
 *
 * @see javax.swing.ScrollPaneConstants interface javax.swing.ScrollPaneConstants (the hereby targeted class-under-test
 *      class)
 * @see ScrollPaneConstantsClassTests ScrollPaneConstantsClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ScrollPaneConstantsTests<SUT extends javax.swing.ScrollPaneConstants>
extends RepositoryTests<SUT> {

}
