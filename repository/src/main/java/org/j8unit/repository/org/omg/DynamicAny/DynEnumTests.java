package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.DynamicAny.DynEnum interface org.omg.DynamicAny.DynEnum}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.DynamicAny.DynEnumClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DynEnumTests<SUT extends org.omg.DynamicAny.DynEnum>
extends org.j8unit.repository.org.omg.DynamicAny.DynEnumOperationsTests<SUT>, org.j8unit.repository.org.omg.DynamicAny.DynAnyTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
