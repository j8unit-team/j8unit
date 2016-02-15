package org.j8unit.repository.org.omg.DynamicAny.DynAnyPackage;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.DynamicAny.DynAnyPackage.InvalidValue class
 * org.omg.DynamicAny.DynAnyPackage.InvalidValue}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link InvalidValueClassTests}.
 * </p>
 *
 * @see org.omg.DynamicAny.DynAnyPackage.InvalidValue class org.omg.DynamicAny.DynAnyPackage.InvalidValue (the hereby
 *      targeted class-under-test class)
 * @see InvalidValueClassTests InvalidValueClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidValueTests<SUT extends org.omg.DynamicAny.DynAnyPackage.InvalidValue>
extends org.j8unit.repository.org.omg.CORBA.UserExceptionTests<SUT> {

}
