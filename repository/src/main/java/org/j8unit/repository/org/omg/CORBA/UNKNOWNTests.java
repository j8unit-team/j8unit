package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.UNKNOWN class org.omg.CORBA.UNKNOWN}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link UNKNOWNClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.UNKNOWN class org.omg.CORBA.UNKNOWN (the hereby targeted class-under-test class)
 * @see UNKNOWNClassTests UNKNOWNClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UNKNOWNTests<SUT extends org.omg.CORBA.UNKNOWN>
extends SystemExceptionTests<SUT> {

}
