package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.DropMode class javax.swing.DropMode}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link DropModeClassTests}.
 * </p>
 *
 * @see javax.swing.DropMode class javax.swing.DropMode (the hereby targeted class-under-test class)
 * @see DropModeClassTests DropModeClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DropModeTests<SUT extends javax.swing.DropMode>
extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.swing.DropMode> {

}
