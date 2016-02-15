package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.INTF_REPOS class org.omg.CORBA.INTF_REPOS}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link INTF_REPOSClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.INTF_REPOS class org.omg.CORBA.INTF_REPOS (the hereby targeted class-under-test class)
 * @see INTF_REPOSClassTests INTF_REPOSClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface INTF_REPOSTests<SUT extends org.omg.CORBA.INTF_REPOS>
extends SystemExceptionTests<SUT> {

}
