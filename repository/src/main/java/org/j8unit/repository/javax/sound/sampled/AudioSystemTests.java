package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.sampled.AudioSystem class javax.sound.sampled.AudioSystem}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link AudioSystemClassTests}.
 * </p>
 *
 * @see javax.sound.sampled.AudioSystem class javax.sound.sampled.AudioSystem (the hereby targeted class-under-test
 *      class)
 * @see AudioSystemClassTests AudioSystemClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AudioSystemTests<SUT extends javax.sound.sampled.AudioSystem>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
