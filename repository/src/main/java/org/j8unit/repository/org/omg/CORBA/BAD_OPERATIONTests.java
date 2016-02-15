package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.BAD_OPERATION class org.omg.CORBA.BAD_OPERATION}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link BAD_OPERATIONClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.BAD_OPERATION class org.omg.CORBA.BAD_OPERATION (the hereby targeted class-under-test class)
 * @see BAD_OPERATIONClassTests BAD_OPERATIONClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BAD_OPERATIONTests<SUT extends org.omg.CORBA.BAD_OPERATION>
extends SystemExceptionTests<SUT> {

}
