package org.j8unit.repository.javax.activity;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.activity.ActivityCompletedException class
 * javax.activity.ActivityCompletedException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ActivityCompletedExceptionClassTests}.
 * </p>
 *
 * @see javax.activity.ActivityCompletedException class javax.activity.ActivityCompletedException (the hereby targeted
 *      class-under-test class)
 * @see ActivityCompletedExceptionClassTests ActivityCompletedExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ActivityCompletedExceptionTests<SUT extends javax.activity.ActivityCompletedException>
extends org.j8unit.repository.java.rmi.RemoteExceptionTests<SUT> {

}
