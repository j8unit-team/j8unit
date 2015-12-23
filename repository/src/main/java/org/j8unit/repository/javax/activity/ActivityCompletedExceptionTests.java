package org.j8unit.repository.javax.activity;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.activity.ActivityCompletedException class
 * javax.activity.ActivityCompletedException}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.activity.ActivityCompletedExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.activity.ActivityCompletedExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.activity.ActivityCompletedException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ActivityCompletedExceptionTests<SUT extends javax.activity.ActivityCompletedException>
extends org.j8unit.repository.java.rmi.RemoteExceptionTests<SUT> {

}
