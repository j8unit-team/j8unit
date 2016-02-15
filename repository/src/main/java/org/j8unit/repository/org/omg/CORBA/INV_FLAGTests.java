package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.INV_FLAG class org.omg.CORBA.INV_FLAG}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link INV_FLAGClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.INV_FLAG class org.omg.CORBA.INV_FLAG (the hereby targeted class-under-test class)
 * @see INV_FLAGClassTests INV_FLAGClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface INV_FLAGTests<SUT extends org.omg.CORBA.INV_FLAG>
extends SystemExceptionTests<SUT> {

}
