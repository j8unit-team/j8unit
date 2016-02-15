package org.j8unit.repository.javax.accessibility;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.accessibility.AccessibleTextSequence class
 * javax.accessibility.AccessibleTextSequence}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link AccessibleTextSequenceClassTests}.
 * </p>
 *
 * @see javax.accessibility.AccessibleTextSequence class javax.accessibility.AccessibleTextSequence (the hereby targeted
 *      class-under-test class)
 * @see AccessibleTextSequenceClassTests AccessibleTextSequenceClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AccessibleTextSequenceTests<SUT extends javax.accessibility.AccessibleTextSequence>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
