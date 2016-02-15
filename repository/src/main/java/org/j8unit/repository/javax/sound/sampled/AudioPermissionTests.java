package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.sampled.AudioPermission class
 * javax.sound.sampled.AudioPermission}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link AudioPermissionClassTests}.
 * </p>
 *
 * @see javax.sound.sampled.AudioPermission class javax.sound.sampled.AudioPermission (the hereby targeted
 *      class-under-test class)
 * @see AudioPermissionClassTests AudioPermissionClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AudioPermissionTests<SUT extends javax.sound.sampled.AudioPermission>
extends org.j8unit.repository.java.security.BasicPermissionTests<SUT> {

}
