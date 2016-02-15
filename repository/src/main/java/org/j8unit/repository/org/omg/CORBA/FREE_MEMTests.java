package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.FREE_MEM class org.omg.CORBA.FREE_MEM}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link FREE_MEMClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.FREE_MEM class org.omg.CORBA.FREE_MEM (the hereby targeted class-under-test class)
 * @see FREE_MEMClassTests FREE_MEMClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FREE_MEMTests<SUT extends org.omg.CORBA.FREE_MEM>
extends SystemExceptionTests<SUT> {

}
