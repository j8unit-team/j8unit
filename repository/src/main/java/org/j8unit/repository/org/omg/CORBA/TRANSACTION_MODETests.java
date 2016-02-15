package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.TRANSACTION_MODE class org.omg.CORBA.TRANSACTION_MODE}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link TRANSACTION_MODEClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.TRANSACTION_MODE class org.omg.CORBA.TRANSACTION_MODE (the hereby targeted class-under-test class)
 * @see TRANSACTION_MODEClassTests TRANSACTION_MODEClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TRANSACTION_MODETests<SUT extends org.omg.CORBA.TRANSACTION_MODE>
extends SystemExceptionTests<SUT> {

}
