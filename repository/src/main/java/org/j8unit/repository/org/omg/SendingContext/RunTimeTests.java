package org.j8unit.repository.org.omg.SendingContext;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.SendingContext.RunTime interface org.omg.SendingContext.RunTime}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link RunTimeClassTests}.
 * </p>
 *
 * @see org.omg.SendingContext.RunTime interface org.omg.SendingContext.RunTime (the hereby targeted class-under-test
 *      class)
 * @see RunTimeClassTests RunTimeClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RunTimeTests<SUT extends org.omg.SendingContext.RunTime>
extends RunTimeOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
