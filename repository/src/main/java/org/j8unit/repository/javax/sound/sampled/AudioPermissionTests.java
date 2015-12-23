package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sound.sampled.AudioPermission class
 * javax.sound.sampled.AudioPermission}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.sound.sampled.AudioPermissionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.sound.sampled.AudioPermissionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sound.sampled.AudioPermission
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AudioPermissionTests<SUT extends javax.sound.sampled.AudioPermission>
extends org.j8unit.repository.java.security.BasicPermissionTests<SUT> {

}
