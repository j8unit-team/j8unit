package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.DynamicAny.DynAnyFactory interface
 * org.omg.DynamicAny.DynAnyFactory}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link DynAnyFactoryClassTests}.
 * </p>
 *
 * @see org.omg.DynamicAny.DynAnyFactory interface org.omg.DynamicAny.DynAnyFactory (the hereby targeted
 *      class-under-test class)
 * @see DynAnyFactoryClassTests DynAnyFactoryClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynAnyFactoryTests<SUT extends org.omg.DynamicAny.DynAnyFactory>
extends DynAnyFactoryOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
