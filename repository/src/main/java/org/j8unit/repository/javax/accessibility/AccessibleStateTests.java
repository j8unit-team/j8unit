package org.j8unit.repository.javax.accessibility;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.accessibility.AccessibleState class
 * javax.accessibility.AccessibleState}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.accessibility.AccessibleStateTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.accessibility.AccessibleStateClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.accessibility.AccessibleState
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AccessibleStateTests<SUT extends javax.accessibility.AccessibleState>
extends org.j8unit.repository.javax.accessibility.AccessibleBundleTests<SUT> {

}
