package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.IOP.IORHelper class org.omg.IOP.IORHelper}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is {@link org.j8unit.repository.org.omg.IOP.IORHelperTests}
 * .
 * </p>
 *
 * @see org.j8unit.repository.org.omg.IOP.IORHelperClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.IOP.IORHelper
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IORHelperTests<SUT extends org.omg.IOP.IORHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
