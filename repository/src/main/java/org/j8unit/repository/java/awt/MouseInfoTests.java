package org.j8unit.repository.java.awt;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.MouseInfo class java.awt.MouseInfo}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link MouseInfoClassTests}.
 * </p>
 *
 * @see java.awt.MouseInfo class java.awt.MouseInfo (the hereby targeted class-under-test class)
 * @see MouseInfoClassTests MouseInfoClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MouseInfoTests<SUT extends java.awt.MouseInfo>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
