package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.INVALID_TRANSACTION class org.omg.CORBA.INVALID_TRANSACTION}
 * . The complementary j8unit test interface containing the class relevant aspects is
 * {@link INVALID_TRANSACTIONClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.INVALID_TRANSACTION class org.omg.CORBA.INVALID_TRANSACTION (the hereby targeted class-under-test
 *      class)
 * @see INVALID_TRANSACTIONClassTests INVALID_TRANSACTIONClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface INVALID_TRANSACTIONTests<SUT extends org.omg.CORBA.INVALID_TRANSACTION>
extends SystemExceptionTests<SUT> {

}
