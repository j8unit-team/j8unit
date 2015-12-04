package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.DynamicAny.DynSequence interface org.omg.DynamicAny.DynSequence}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.DynamicAny.DynSequenceClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DynSequenceTests<SUT extends org.omg.DynamicAny.DynSequence>
extends org.j8unit.repository.org.omg.DynamicAny.DynSequenceOperationsTests<SUT>, org.j8unit.repository.org.omg.DynamicAny.DynAnyTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
