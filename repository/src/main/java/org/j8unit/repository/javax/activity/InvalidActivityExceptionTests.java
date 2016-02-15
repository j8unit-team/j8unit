package org.j8unit.repository.javax.activity;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.activity.InvalidActivityException class
 * javax.activity.InvalidActivityException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link InvalidActivityExceptionClassTests}.
 * </p>
 *
 * @see javax.activity.InvalidActivityException class javax.activity.InvalidActivityException (the hereby targeted
 *      class-under-test class)
 * @see InvalidActivityExceptionClassTests InvalidActivityExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidActivityExceptionTests<SUT extends javax.activity.InvalidActivityException>
extends org.j8unit.repository.java.rmi.RemoteExceptionTests<SUT> {

}
