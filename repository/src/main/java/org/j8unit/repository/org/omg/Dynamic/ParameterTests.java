package org.j8unit.repository.org.omg.Dynamic;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.Dynamic.Parameter class org.omg.Dynamic.Parameter}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ParameterClassTests}.
 * </p>
 *
 * @see org.omg.Dynamic.Parameter class org.omg.Dynamic.Parameter (the hereby targeted class-under-test class)
 * @see ParameterClassTests ParameterClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ParameterTests<SUT extends org.omg.Dynamic.Parameter>
extends org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
