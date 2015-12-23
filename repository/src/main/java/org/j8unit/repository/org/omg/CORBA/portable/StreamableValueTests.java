package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CORBA.portable.StreamableValue interface
 * org.omg.CORBA.portable.StreamableValue}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.portable.StreamableValueTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CORBA.portable.StreamableValueClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CORBA.portable.StreamableValue
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StreamableValueTests<SUT extends org.omg.CORBA.portable.StreamableValue>
extends org.j8unit.repository.org.omg.CORBA.portable.StreamableTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.ValueBaseTests<SUT> {

}
