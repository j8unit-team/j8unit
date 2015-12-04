package org.j8unit.repository.org.omg.SendingContext;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.SendingContext.RunTime interface org.omg.SendingContext.RunTime}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.SendingContext.RunTimeClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RunTimeTests<SUT extends org.omg.SendingContext.RunTime>
extends org.j8unit.repository.org.omg.SendingContext.RunTimeOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
