package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.InsetsUIResource class
 * javax.swing.plaf.InsetsUIResource}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.InsetsUIResourceTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.InsetsUIResourceClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.InsetsUIResource
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InsetsUIResourceTests<SUT extends javax.swing.plaf.InsetsUIResource>
extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.java.awt.InsetsTests<SUT> {

}
