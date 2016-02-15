package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.SetOverrideTypeHelper class
 * org.omg.CORBA.SetOverrideTypeHelper}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link SetOverrideTypeHelperClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.SetOverrideTypeHelper class org.omg.CORBA.SetOverrideTypeHelper (the hereby targeted
 *      class-under-test class)
 * @see SetOverrideTypeHelperClassTests SetOverrideTypeHelperClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SetOverrideTypeHelperTests<SUT extends org.omg.CORBA.SetOverrideTypeHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
