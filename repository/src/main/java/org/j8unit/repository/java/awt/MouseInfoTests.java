package org.j8unit.repository.java.awt;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.MouseInfo class java.awt.MouseInfo}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test
 * interface containing the class relevant test methods is {@link org.j8unit.repository.java.awt.MouseInfoTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.awt.MouseInfoClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.MouseInfo
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MouseInfoTests<SUT extends java.awt.MouseInfo>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
