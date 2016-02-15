package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.sampled.UnsupportedAudioFileException class
 * javax.sound.sampled.UnsupportedAudioFileException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link UnsupportedAudioFileExceptionClassTests}.
 * </p>
 *
 * @see javax.sound.sampled.UnsupportedAudioFileException class javax.sound.sampled.UnsupportedAudioFileException (the
 *      hereby targeted class-under-test class)
 * @see UnsupportedAudioFileExceptionClassTests UnsupportedAudioFileExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnsupportedAudioFileExceptionTests<SUT extends javax.sound.sampled.UnsupportedAudioFileException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
