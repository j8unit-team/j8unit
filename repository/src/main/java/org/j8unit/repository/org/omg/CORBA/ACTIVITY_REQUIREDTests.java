package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.ACTIVITY_REQUIRED class org.omg.CORBA.ACTIVITY_REQUIRED}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link ACTIVITY_REQUIREDClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.ACTIVITY_REQUIRED class org.omg.CORBA.ACTIVITY_REQUIRED (the hereby targeted class-under-test
 *      class)
 * @see ACTIVITY_REQUIREDClassTests ACTIVITY_REQUIREDClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ACTIVITY_REQUIREDTests<SUT extends org.omg.CORBA.ACTIVITY_REQUIRED>
extends SystemExceptionTests<SUT> {

}
