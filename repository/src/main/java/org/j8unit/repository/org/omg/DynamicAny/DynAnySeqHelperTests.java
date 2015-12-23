package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.DynamicAny.DynAnySeqHelper class
 * org.omg.DynamicAny.DynAnySeqHelper}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.DynamicAny.DynAnySeqHelperTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.DynamicAny.DynAnySeqHelperClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.DynamicAny.DynAnySeqHelper
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynAnySeqHelperTests<SUT extends org.omg.DynamicAny.DynAnySeqHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
