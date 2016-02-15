package org.j8unit.repository.org.omg.CORBA.DynAnyPackage;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.DynAnyPackage.Invalid class
 * org.omg.CORBA.DynAnyPackage.Invalid}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link InvalidClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.DynAnyPackage.Invalid class org.omg.CORBA.DynAnyPackage.Invalid (the hereby targeted
 *      class-under-test class)
 * @see InvalidClassTests InvalidClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidTests<SUT extends org.omg.CORBA.DynAnyPackage.Invalid>
extends org.j8unit.repository.org.omg.CORBA.UserExceptionTests<SUT> {

}
