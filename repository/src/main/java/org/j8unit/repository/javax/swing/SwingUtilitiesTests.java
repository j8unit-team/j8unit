package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.SwingUtilities class javax.swing.SwingUtilities},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.SwingUtilitiesTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.SwingUtilitiesClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.SwingUtilities
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SwingUtilitiesTests<SUT extends javax.swing.SwingUtilities>
extends org.j8unit.repository.javax.swing.SwingConstantsTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
