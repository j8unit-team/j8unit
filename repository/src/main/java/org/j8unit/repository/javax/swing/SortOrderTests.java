package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.SortOrder class javax.swing.SortOrder}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is {@link org.j8unit.repository.javax.swing.SortOrderTests}
 * .
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.SortOrderClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.SortOrder
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SortOrderTests<SUT extends javax.swing.SortOrder>
extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.swing.SortOrder> {

}
